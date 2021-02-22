package ui.gui;

import java.util.List;
import java.util.Arrays;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

class ViewPane extends JPanel implements View.SizeChangedListener {
  final View            view;
  private final int     extraHeight;
  private final int     extraWidth;
  private final boolean isWidthVariable;
  
  public ViewPane (String title, ViewModel model, MessageBoard messageBoard, List<ViewFormat> formats) {
    super (new BorderLayout ());
    JLabel tl = new JLabel (title, SwingConstants.CENTER);
    tl.setFont (UI.TITLE_FONT);
    add (tl, BorderLayout.NORTH);
    /* XXX HACK: JDK-8235170 reports an off-by-one error in BasicTableUI.paint, which causes
    the final row of a partial repaint to be blanked out in certain circumstances. This was
    introduced as a regression into JDK 9+ (by the fix to JDK-8081491) and is still an open
    bug in JDK 13.
    The buggy fix will not truncate the last row if the grandparent of the JTable is a
    JViewport (or JScrollPane), so as a workaround we simply wrap our inner bordered JPanel
    in a JViewport.
     */
    JViewport jv = new JViewport();
    JPanel bd = new JPanel (new BorderLayout ());
    bd.setBorder (new CompoundBorder (new EmptyBorder (1,1,1,1), new LineBorder (UI.PANE_BORDER_COLOR,1)));
    view = new View (model, messageBoard, formats);
    view.addSizeChangedListener (this);
    view.setBackground (UI.BACKGROUND_COLOR);
    bd.add (view.getTableHeader (), BorderLayout.NORTH);
    bd.add (view, BorderLayout.CENTER);
    jv.setView(bd);
    add (jv, BorderLayout.CENTER);
    boolean iwv = false;
    for (ViewFormat format : formats)
      if (format.isWidthVariable()) {
        iwv = true;
        break;
      }
    isWidthVariable = iwv;
    extraWidth  = 3;
    int eh = tl.getPreferredSize ().height += 8;
    if (! ((String) view.getColumnModel ().getColumns ().nextElement ().getHeaderValue ()).trim ().equals (""))
      eh += 12;
    if (!UI.IS_MAC_OS_X) {
      if (UI.IS_MS_WINDOWS)
        eh += 4;
      else
        eh += 2;
    }
    extraHeight = eh;
    Dimension sz = view.getPreferredSize ();
    sz.height += extraHeight;
    sz.width  += extraWidth;
    setPreferredSize (sz);
    if (isWidthVariable)
      setMaximumSize (new Dimension (view.getMaximumSize().width, sz.height));
    else
      setMaximumSize (sz);
  }

  void adjustHighlights (boolean clear) {
    view.adjustHighlights (clear);
  }
  
  void adjustFontSize (int increment) {
    view.adjustFontSize (increment);
    adjustSize ();
  }
  
  void adjustSize () {
    Dimension sz = view.getPreferredSize ();
    sz.height += extraHeight;
    sz.width  += extraWidth;
    setPreferredSize (sz);
    if (isWidthVariable)
      setMaximumSize (new Dimension (view.getMaximumSize().width, sz.height));
    else
      setMaximumSize (sz);
  }
  
  public void sizeChanged () {
    adjustSize ();
  }
  
  /**
   * May be ignored by some view panes, but exists for those that will adjust their
   * width on command.
   */
  public void setWidth (int width) {
    ;
  }
}