/*
 
 File: OSXAdapter.java
 
 Abstract: Hooks existing preferences/about/quit functionality from an
 existing Java app into handlers for the Mac OS X application menu.
 Uses a Proxy object to dynamically implement the 
 com.apple.eawt.ApplicationListener interface and register it with the
 com.apple.eawt.Application object.  This allows the complete project
 to be both built and run on any platform without any stubs or 
 placeholders. Useful for developers looking to implement Mac OS X 
 features while supporting multiple platforms with minimal impact.
 
 Version: 2.0
 
 Disclaimer: IMPORTANT:  This Apple software is supplied to you by 
 Apple Inc. ("Apple") in consideration of your agreement to the
 following terms, and your use, installation, modification or
 redistribution of this Apple software constitutes acceptance of these
 terms.  If you do not agree with these terms, please do not use,
 install, modify or redistribute this Apple software.
 
 In consideration of your agreement to abide by the following terms, and
 subject to these terms, Apple grants you a personal, non-exclusive
 license, under Apple's copyrights in this original Apple software (the
 "Apple Software"), to use, reproduce, modify and redistribute the Apple
 Software, with or without modifications, in source and/or binary forms;
 provided that if you redistribute the Apple Software in its entirety and
 without modifications, you must retain this notice and the following
 text and disclaimers in all such redistributions of the Apple Software. 
 Neither the name, trademarks, service marks or logos of Apple Inc. 
 may be used to endorse or promote products derived from the Apple
 Software without specific prior written permission from Apple.  Except
 as expressly stated in this notice, no other rights or licenses, express
 or implied, are granted by Apple herein, including but not limited to
 any patent rights that may be infringed by your derivative works or by
 other works in which the Apple Software may be incorporated.
 
 The Apple Software is provided by Apple on an "AS IS" basis.  APPLE
 MAKES NO WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION
 THE IMPLIED WARRANTIES OF NON-INFRINGEMENT, MERCHANTABILITY AND FITNESS
 FOR A PARTICULAR PURPOSE, REGARDING THE APPLE SOFTWARE OR ITS USE AND
 OPERATION ALONE OR IN COMBINATION WITH YOUR PRODUCTS.
 
 IN NO EVENT SHALL APPLE BE LIABLE FOR ANY SPECIAL, INDIRECT, INCIDENTAL
 OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 INTERRUPTION) ARISING IN ANY WAY OUT OF THE USE, REPRODUCTION,
 MODIFICATION AND/OR DISTRIBUTION OF THE APPLE SOFTWARE, HOWEVER CAUSED
 AND WHETHER UNDER THEORY OF CONTRACT, TORT (INCLUDING NEGLIGENCE),
 STRICT LIABILITY OR OTHERWISE, EVEN IF APPLE HAS BEEN ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.
 
 Copyright  2003-2007 Apple, Inc., All Rights Reserved
 
 2020-01-22: Updated for Java 9. Code for setting the dock icon added.
 */

package ui.gui;

import java.awt.Image;
import java.awt.Window;
import java.lang.reflect.*;
import java.util.HashMap;


class OSXAdapter implements InvocationHandler {
  
  protected Object targetObject;
  protected Method targetMethod;
  protected String proxySignature;
  
  static Object macOSXApplication;
  private static final int JAVA_VERSION;
  static {
    String version = System.getProperty("java.version");
    String[] bits = version.split("\\.");
    if(bits[0].equals("1")) {
      // e.g. 1.8.0 - old version numbers
      JAVA_VERSION = Integer.parseInt(bits[1]);
    } else {
      // e.g. 11.0.1 - new version numbers
      JAVA_VERSION = Integer.parseInt(bits[0]);
    }
  }

  // Pass this method an Object and Method equipped to perform application shutdown logic
  // The method passed should return a boolean stating whether or not the quit should occur
  public static void setQuitHandler(Object target, Method quitHandler) {
    setHandler("setQuitHandler", "QuitHandler", new OSXAdapter("handleQuitRequestWith", target, quitHandler) {
      public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
        Object result = targetMethod.invoke(targetObject, (Object[])null);
        Class <?> responseClass;
        if(JAVA_VERSION < 9) {
          responseClass = Class.forName("com.apple.eawt.QuitResponse");
        } else {
          responseClass = Class.forName("java.awt.desktop.QuitResponse");
        }
        Method responseMethod;
        if (result == null || Boolean.valueOf(result.toString()).booleanValue()) {
          responseMethod = responseClass.getDeclaredMethod("performQuit", (Class[])null);
        } else {
          responseMethod = responseClass.getDeclaredMethod("cancelQuit", (Class[])null);
        }
        responseMethod.invoke(args[1], (Object[])null);
        // All of the ApplicationListener methods are void; return null regardless of what happens
        return null;
      }
    });
  }
  
  // Pass this method an Object and Method equipped to display application info
  // They will be called when the About menu item is selected from the application menu
  public static void setAboutHandler(Object target, Method aboutHandler) {
    setHandler("setAboutHandler", "AboutHandler", new OSXAdapter("handleAbout", target, aboutHandler));
  }
  
  // Pass this method an Object and a Method equipped to display application options
  // They will be called when the Preferences menu item is selected from the application menu
  public static void setPreferencesHandler(Object target, Method prefsHandler) {
    setHandler("setPreferencesHandler", "PreferencesHandler", new OSXAdapter("handlePreferences", target, prefsHandler));
  }
  
  // Pass this method an Object and a Method equipped to handle document events from the Finder
  // Documents are registered with the Finder via the CFBundleDocumentTypes dictionary in the 
  // application bundle's Info.plist
  public static void setFileHandler(Object target, Method fileHandler) {
    setHandler("setOpenFileHandler", "OpenFilesHandler", new OSXAdapter("openFiles", target, fileHandler) {
      // Override OSXAdapter.callTarget to send information on the
      // file to be opened
      public boolean callTarget(Object appleEvent) {
        if (appleEvent != null) {
          try {
            Method getFilenameMethod = appleEvent.getClass().getDeclaredMethod("getFilename", (Class[])null);
            String filename = (String) getFilenameMethod.invoke(appleEvent, (Object[])null);
            this.targetMethod.invoke(this.targetObject, new Object[] { filename });
          } catch (Exception ex) {
            
          }
        }
        return true;
      }
    });
  }
  
  // setHandler creates a Proxy object from the passed OSXAdapter and adds it as an ApplicationListener
  private static void setHandler(String setHandlerMethodName, String handlerClassName, OSXAdapter adapter) {
    try {
      if (JAVA_VERSION < 9) {
        Class <?> applicationClass = Class.forName("com.apple.eawt.Application");
        if (macOSXApplication == null) {
          macOSXApplication = applicationClass.getConstructor((Class[])null).newInstance((Object[])null);
        }
        Class <?> handlerClass = Class.forName("com.apple.eawt." + handlerClassName);
        Method setHandlerMethod = applicationClass.getDeclaredMethod(setHandlerMethodName, new Class<?>[] { handlerClass });
        // Create a proxy object around this handler that can be reflectively added as an Apple ApplicationListener
        Object osxAdapterProxy = (adapter == null) ? null : Proxy.newProxyInstance(OSXAdapter.class.getClassLoader(), new Class<?>[] { handlerClass }, adapter);
        setHandlerMethod.invoke(macOSXApplication, new Object[] { osxAdapterProxy });
      } else {
        Class <?> desktopClass = Class.forName("java.awt.Desktop");
        if (macOSXApplication == null) {
          macOSXApplication = desktopClass.getDeclaredMethod("getDesktop").invoke(null);
        }
        Class <?> handlerClass = Class.forName("java.awt.desktop." + handlerClassName);
        Method setHandlerMethod = desktopClass.getDeclaredMethod(setHandlerMethodName, new Class<?>[] { handlerClass });
        // Create a proxy object around this handler that can be reflectively added as an Apple ApplicationListener
        Object osxAdapterProxy = (adapter == null) ? null : Proxy.newProxyInstance(OSXAdapter.class.getClassLoader(), new Class<?>[] { handlerClass }, adapter);
        setHandlerMethod.invoke(macOSXApplication, new Object[] { osxAdapterProxy });
      }
    } catch (ClassNotFoundException cnfe) {
      System.err.println("This version of Mac OS X does not support the Apple EAWT.  ApplicationEvent handling has been disabled (" + cnfe + ")");
    } catch (Exception ex) {  // Likely a NoSuchMethodException or an IllegalAccessException loading/invoking eawt.Application methods
      System.err.println("Mac OS X Adapter could not talk to EAWT:");
      ex.printStackTrace();
    }
  }
  
  // Each OSXAdapter has the name of the EAWT method it intends to listen for (handleAbout, for example),
  // the Object that will ultimately perform the task, and the Method to be called on that Object
  protected OSXAdapter(String proxySignature, Object target, Method handler) {
    this.proxySignature = proxySignature;
    this.targetObject = target;
    this.targetMethod = handler;
  }
  
  // Override this method to perform any operations on the event 
  // that comes with the various callbacks
  // See setFileHandler above for an example
  public boolean callTarget(Object appleEvent) throws InvocationTargetException, IllegalAccessException {
    Object result = targetMethod.invoke(targetObject, (Object[])null);
    if (result == null) {
      return true;
    }
    return Boolean.valueOf(result.toString()).booleanValue();
  }
  
  // InvocationHandler implementation
  // This is the entry point for our proxy object; it is called every time an ApplicationListener method is invoked
  public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
    if (isCorrectMethod(method, args)) {
      callTarget(args[0]);
    } else {
      System.err.println("Can't invoke " + method.getName());
    }
    // All of the ApplicationListener methods are void; return null regardless of what happens
    return null;
  }
  
  // Compare the method that was called to the intended method when the OSXAdapter instance was created
  // (e.g. handleAbout, handleQuit, handleOpenFile, etc.)
  protected boolean isCorrectMethod(Method method, Object[] args) {
    return (targetMethod != null && proxySignature.equals(method.getName()) && args.length == 1);
  }
  
  public static void setDockIcon(Image image) {
    try {
      if (JAVA_VERSION < 9) {
        Class <?> appClass         = Class.forName ("com.apple.eawt.Application");
        Method    getApplication   = appClass.getDeclaredMethod ("getApplication");
        Method    setDockIconImage = appClass.getDeclaredMethod ("setDockIconImage", Image.class);
        Object    app              = getApplication.invoke (null);
        setDockIconImage.invoke (app, image);
      } else {
        Class <?> taskbarClass     = Class.forName ("java.awt.Taskbar");
        Method    getTaskbar       = taskbarClass.getDeclaredMethod ("getTaskbar");
        Method    setIconImage     = taskbarClass.getDeclaredMethod ("setIconImage", Image.class);
        Object    taskbar          = getTaskbar.invoke (null);
        setIconImage.invoke (taskbar, image);
      }
    } catch (ClassNotFoundException cnfe) {
    } catch (Exception ex) {
      System.err.println("OSXAdapter was unable to set the dock icon");
      ex.printStackTrace();
    }
  }

  public static void enableFullScreen(Window window) {
    if (JAVA_VERSION >= 9) {
      /* In Java 9+, macOS already enables full screen mode for windows by default (JDK-8143914). */
      return;
    }
    try {
      Class <?> util = Class.forName("com.apple.eawt.FullScreenUtilities");
      Method method = util.getMethod("setWindowCanFullScreen", new Class<?>[] { Window.class, boolean.class });
      method.invoke(util, window, true);
    } catch (ClassNotFoundException cnfe) {
    } catch (Exception ex) {
      System.err.println("OSXAdapter was unable to enable full-screen mode");
      ex.printStackTrace();
    }
  }
}
