// $ANTLR 3.5.2 ../../Source/Cli.g 2019-07-22 15:59:15

package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CliLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int Character=4;
	public static final int Comment=5;
	public static final int CpuReg=6;
	public static final int Decimal=7;
	public static final int Digit=8;
	public static final int EscapeSpace=9;
	public static final int Hex=10;
	public static final int HexDigit=11;
	public static final int Identifier=12;
	public static final int NewLine=13;
	public static final int Register=14;
	public static final int String=15;
	public static final int WS=16;


	public class SyntaxErrorException extends RuntimeException {}

	public void emitErrorMessage (String msg) {
	  throw new SyntaxErrorException ();
	}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CliLexer() {} 
	public CliLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CliLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "../../Source/Cli.g"; }

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:14:7: ( '*' )
			// ../../Source/Cli.g:14:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:15:7: ( '+' )
			// ../../Source/Cli.g:15:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:16:7: ( '-' )
			// ../../Source/Cli.g:16:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:17:7: ( ':' )
			// ../../Source/Cli.g:17:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:18:7: ( '=' )
			// ../../Source/Cli.g:18:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:19:7: ( '==' )
			// ../../Source/Cli.g:19:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:20:7: ( 'a' )
			// ../../Source/Cli.g:20:9: 'a'
			{
			match('a'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:21:7: ( 'assert' )
			// ../../Source/Cli.g:21:9: 'assert'
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:22:7: ( 'b' )
			// ../../Source/Cli.g:22:9: 'b'
			{
			match('b'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:23:7: ( 'break' )
			// ../../Source/Cli.g:23:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:24:7: ( 'clear' )
			// ../../Source/Cli.g:24:9: 'clear'
			{
			match("clear"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:25:7: ( 'cpu' )
			// ../../Source/Cli.g:25:9: 'cpu'
			{
			match("cpu"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:26:7: ( 'dat' )
			// ../../Source/Cli.g:26:9: 'dat'
			{
			match("dat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:27:7: ( 'e' )
			// ../../Source/Cli.g:27:9: 'e'
			{
			match('e'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:28:7: ( 'e/x' )
			// ../../Source/Cli.g:28:9: 'e/x'
			{
			match("e/x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:29:7: ( 'examine' )
			// ../../Source/Cli.g:29:9: 'examine'
			{
			match("examine"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:30:7: ( 'examine/x' )
			// ../../Source/Cli.g:30:9: 'examine/x'
			{
			match("examine/x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:31:7: ( 'g' )
			// ../../Source/Cli.g:31:9: 'g'
			{
			match('g'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:32:7: ( 'goto' )
			// ../../Source/Cli.g:32:9: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:33:7: ( 'help' )
			// ../../Source/Cli.g:33:9: 'help'
			{
			match("help"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:34:7: ( 'i' )
			// ../../Source/Cli.g:34:9: 'i'
			{
			match('i'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:35:7: ( 'i/x' )
			// ../../Source/Cli.g:35:9: 'i/x'
			{
			match("i/x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:36:7: ( 'info' )
			// ../../Source/Cli.g:36:9: 'info'
			{
			match("info"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:37:7: ( 'info/x' )
			// ../../Source/Cli.g:37:9: 'info/x'
			{
			match("info/x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:38:7: ( 'ins' )
			// ../../Source/Cli.g:38:9: 'ins'
			{
			match("ins"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:39:7: ( 'l' )
			// ../../Source/Cli.g:39:9: 'l'
			{
			match('l'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:40:7: ( 'load' )
			// ../../Source/Cli.g:40:9: 'load'
			{
			match("load"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:41:7: ( 'm' )
			// ../../Source/Cli.g:41:9: 'm'
			{
			match('m'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:42:7: ( 'mem' )
			// ../../Source/Cli.g:42:9: 'mem'
			{
			match("mem"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:43:7: ( 'nob' )
			// ../../Source/Cli.g:43:9: 'nob'
			{
			match("nob"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:44:7: ( 'nobreak' )
			// ../../Source/Cli.g:44:9: 'nobreak'
			{
			match("nobreak"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:45:7: ( 'not' )
			// ../../Source/Cli.g:45:9: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:46:7: ( 'notrace' )
			// ../../Source/Cli.g:46:9: 'notrace'
			{
			match("notrace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:47:7: ( 'prog' )
			// ../../Source/Cli.g:47:9: 'prog'
			{
			match("prog"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:48:7: ( 'quit' )
			// ../../Source/Cli.g:48:9: 'quit'
			{
			match("quit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:49:7: ( 'r' )
			// ../../Source/Cli.g:49:9: 'r'
			{
			match('r'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:50:7: ( 'reg' )
			// ../../Source/Cli.g:50:9: 'reg'
			{
			match("reg"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:51:7: ( 'run' )
			// ../../Source/Cli.g:51:9: 'run'
			{
			match("run"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:52:7: ( 's' )
			// ../../Source/Cli.g:52:9: 's'
			{
			match('s'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:53:7: ( 'step' )
			// ../../Source/Cli.g:53:9: 'step'
			{
			match("step"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:54:7: ( 't' )
			// ../../Source/Cli.g:54:9: 't'
			{
			match('t'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:55:7: ( 'test' )
			// ../../Source/Cli.g:55:9: 'test'
			{
			match("test"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:56:7: ( 'trace' )
			// ../../Source/Cli.g:56:9: 'trace'
			{
			match("trace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:57:7: ( 'w' )
			// ../../Source/Cli.g:57:9: 'w'
			{
			match('w'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:58:7: ( 'where' )
			// ../../Source/Cli.g:58:9: 'where'
			{
			match("where"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:59:7: ( 'x' )
			// ../../Source/Cli.g:59:9: 'x'
			{
			match('x'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int a;

			// ../../Source/Cli.g:190:9: ( '\"' a= ( (~ '\"' )+ ) '\"' )
			// ../../Source/Cli.g:190:11: '\"' a= ( (~ '\"' )+ ) '\"'
			{
			match('\"'); 
			// ../../Source/Cli.g:190:17: ( (~ '\"' )+ )
			// ../../Source/Cli.g:190:18: (~ '\"' )+
			{
			// ../../Source/Cli.g:190:18: (~ '\"' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ../../Source/Cli.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "Register"
	public final void mRegister() throws RecognitionException {
		try {
			int _type = Register;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:191:9: ( '%' Identifier )
			// ../../Source/Cli.g:191:11: '%' Identifier
			{
			match('%'); 
			mIdentifier(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Register"

	// $ANTLR start "CpuReg"
	public final void mCpuReg() throws RecognitionException {
		try {
			int _type = CpuReg;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:192:8: ( '@' Identifier )
			// ../../Source/Cli.g:192:10: '@' Identifier
			{
			match('@'); 
			mIdentifier(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CpuReg"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:194:2: ( Character ( Character | Digit )* )
			// ../../Source/Cli.g:194:4: Character ( Character | Digit )*
			{
			mCharacter(); 

			// ../../Source/Cli.g:194:14: ( Character | Digit )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '#' && LA2_0 <= '$')||(LA2_0 >= '-' && LA2_0 <= '/')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='\\'||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}
				else if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// ../../Source/Cli.g:194:15: Character
					{
					mCharacter(); 

					}
					break;
				case 2 :
					// ../../Source/Cli.g:194:25: Digit
					{
					mDigit(); 

					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Decimal"
	public final void mDecimal() throws RecognitionException {
		try {
			int _type = Decimal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:195:9: ( ( Digit )+ )
			// ../../Source/Cli.g:195:11: ( Digit )+
			{
			// ../../Source/Cli.g:195:11: ( Digit )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ../../Source/Cli.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Decimal"

	// $ANTLR start "Hex"
	public final void mHex() throws RecognitionException {
		try {
			int _type = Hex;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:196:5: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
			// ../../Source/Cli.g:196:7: '0' ( 'x' | 'X' ) ( HexDigit )+
			{
			match('0'); 
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// ../../Source/Cli.g:196:21: ( HexDigit )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'F')||(LA4_0 >= 'a' && LA4_0 <= 'f')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ../../Source/Cli.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hex"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// ../../Source/Cli.g:199:9: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// ../../Source/Cli.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// ../../Source/Cli.g:201:7: ( ( '0' .. '9' ) )
			// ../../Source/Cli.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Character"
	public final void mCharacter() throws RecognitionException {
		try {
			// ../../Source/Cli.g:204:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '/' | '#' | '$' | '-' | '.' | EscapeSpace )
			int alt5=9;
			switch ( input.LA(1) ) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				{
				alt5=1;
				}
				break;
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt5=2;
				}
				break;
			case '_':
				{
				alt5=3;
				}
				break;
			case '/':
				{
				alt5=4;
				}
				break;
			case '#':
				{
				alt5=5;
				}
				break;
			case '$':
				{
				alt5=6;
				}
				break;
			case '-':
				{
				alt5=7;
				}
				break;
			case '.':
				{
				alt5=8;
				}
				break;
			case '\\':
				{
				alt5=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ../../Source/Cli.g:204:4: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 2 :
					// ../../Source/Cli.g:204:15: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 3 :
					// ../../Source/Cli.g:204:26: '_'
					{
					match('_'); 
					}
					break;
				case 4 :
					// ../../Source/Cli.g:204:32: '/'
					{
					match('/'); 
					}
					break;
				case 5 :
					// ../../Source/Cli.g:204:38: '#'
					{
					match('#'); 
					}
					break;
				case 6 :
					// ../../Source/Cli.g:204:44: '$'
					{
					match('$'); 
					}
					break;
				case 7 :
					// ../../Source/Cli.g:204:50: '-'
					{
					match('-'); 
					}
					break;
				case 8 :
					// ../../Source/Cli.g:204:56: '.'
					{
					match('.'); 
					}
					break;
				case 9 :
					// ../../Source/Cli.g:204:62: EscapeSpace
					{
					mEscapeSpace(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Character"

	// $ANTLR start "EscapeSpace"
	public final void mEscapeSpace() throws RecognitionException {
		try {
			// ../../Source/Cli.g:207:9: ( '\\\\ ' )
			// ../../Source/Cli.g:207:17: '\\\\ '
			{
			match("\\ "); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSpace"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:207:9: ( '#' ( (~ ( '\\n' | '\\r' ) )* NewLine ) )
			// ../../Source/Cli.g:207:11: '#' ( (~ ( '\\n' | '\\r' ) )* NewLine )
			{
			match('#'); 
			// ../../Source/Cli.g:207:15: ( (~ ( '\\n' | '\\r' ) )* NewLine )
			// ../../Source/Cli.g:207:17: (~ ( '\\n' | '\\r' ) )* NewLine
			{
			// ../../Source/Cli.g:207:17: (~ ( '\\n' | '\\r' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ../../Source/Cli.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			mNewLine(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	// $ANTLR start "NewLine"
	public final void mNewLine() throws RecognitionException {
		try {
			int _type = NewLine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:208:9: ( ( '\\r' )? '\\n' )
			// ../../Source/Cli.g:208:11: ( '\\r' )? '\\n'
			{
			// ../../Source/Cli.g:208:11: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ../../Source/Cli.g:208:11: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NewLine"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../../Source/Cli.g:209:6: ( ( ' ' | '\\t' )+ )
			// ../../Source/Cli.g:209:11: ( ' ' | '\\t' )+
			{
			// ../../Source/Cli.g:209:11: ( ' ' | '\\t' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\t'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ../../Source/Cli.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// ../../Source/Cli.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | String | Register | CpuReg | Identifier | Decimal | Hex | Comment | NewLine | WS )
		int alt9=55;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// ../../Source/Cli.g:1:10: T__17
				{
				mT__17(); 

				}
				break;
			case 2 :
				// ../../Source/Cli.g:1:16: T__18
				{
				mT__18(); 

				}
				break;
			case 3 :
				// ../../Source/Cli.g:1:22: T__19
				{
				mT__19(); 

				}
				break;
			case 4 :
				// ../../Source/Cli.g:1:28: T__20
				{
				mT__20(); 

				}
				break;
			case 5 :
				// ../../Source/Cli.g:1:34: T__21
				{
				mT__21(); 

				}
				break;
			case 6 :
				// ../../Source/Cli.g:1:40: T__22
				{
				mT__22(); 

				}
				break;
			case 7 :
				// ../../Source/Cli.g:1:46: T__23
				{
				mT__23(); 

				}
				break;
			case 8 :
				// ../../Source/Cli.g:1:52: T__24
				{
				mT__24(); 

				}
				break;
			case 9 :
				// ../../Source/Cli.g:1:58: T__25
				{
				mT__25(); 

				}
				break;
			case 10 :
				// ../../Source/Cli.g:1:64: T__26
				{
				mT__26(); 

				}
				break;
			case 11 :
				// ../../Source/Cli.g:1:70: T__27
				{
				mT__27(); 

				}
				break;
			case 12 :
				// ../../Source/Cli.g:1:76: T__28
				{
				mT__28(); 

				}
				break;
			case 13 :
				// ../../Source/Cli.g:1:82: T__29
				{
				mT__29(); 

				}
				break;
			case 14 :
				// ../../Source/Cli.g:1:88: T__30
				{
				mT__30(); 

				}
				break;
			case 15 :
				// ../../Source/Cli.g:1:94: T__31
				{
				mT__31(); 

				}
				break;
			case 16 :
				// ../../Source/Cli.g:1:100: T__32
				{
				mT__32(); 

				}
				break;
			case 17 :
				// ../../Source/Cli.g:1:106: T__33
				{
				mT__33(); 

				}
				break;
			case 18 :
				// ../../Source/Cli.g:1:112: T__34
				{
				mT__34(); 

				}
				break;
			case 19 :
				// ../../Source/Cli.g:1:118: T__35
				{
				mT__35(); 

				}
				break;
			case 20 :
				// ../../Source/Cli.g:1:124: T__36
				{
				mT__36(); 

				}
				break;
			case 21 :
				// ../../Source/Cli.g:1:130: T__37
				{
				mT__37(); 

				}
				break;
			case 22 :
				// ../../Source/Cli.g:1:136: T__38
				{
				mT__38(); 

				}
				break;
			case 23 :
				// ../../Source/Cli.g:1:142: T__39
				{
				mT__39(); 

				}
				break;
			case 24 :
				// ../../Source/Cli.g:1:148: T__40
				{
				mT__40(); 

				}
				break;
			case 25 :
				// ../../Source/Cli.g:1:154: T__41
				{
				mT__41(); 

				}
				break;
			case 26 :
				// ../../Source/Cli.g:1:160: T__42
				{
				mT__42(); 

				}
				break;
			case 27 :
				// ../../Source/Cli.g:1:166: T__43
				{
				mT__43(); 

				}
				break;
			case 28 :
				// ../../Source/Cli.g:1:172: T__44
				{
				mT__44(); 

				}
				break;
			case 29 :
				// ../../Source/Cli.g:1:178: T__45
				{
				mT__45(); 

				}
				break;
			case 30 :
				// ../../Source/Cli.g:1:184: T__46
				{
				mT__46(); 

				}
				break;
			case 31 :
				// ../../Source/Cli.g:1:190: T__47
				{
				mT__47(); 

				}
				break;
			case 32 :
				// ../../Source/Cli.g:1:196: T__48
				{
				mT__48(); 

				}
				break;
			case 33 :
				// ../../Source/Cli.g:1:202: T__49
				{
				mT__49(); 

				}
				break;
			case 34 :
				// ../../Source/Cli.g:1:208: T__50
				{
				mT__50(); 

				}
				break;
			case 35 :
				// ../../Source/Cli.g:1:214: T__51
				{
				mT__51(); 

				}
				break;
			case 36 :
				// ../../Source/Cli.g:1:220: T__52
				{
				mT__52(); 

				}
				break;
			case 37 :
				// ../../Source/Cli.g:1:226: T__53
				{
				mT__53(); 

				}
				break;
			case 38 :
				// ../../Source/Cli.g:1:232: T__54
				{
				mT__54(); 

				}
				break;
			case 39 :
				// ../../Source/Cli.g:1:238: T__55
				{
				mT__55(); 

				}
				break;
			case 40 :
				// ../../Source/Cli.g:1:244: T__56
				{
				mT__56(); 

				}
				break;
			case 41 :
				// ../../Source/Cli.g:1:250: T__57
				{
				mT__57(); 

				}
				break;
			case 42 :
				// ../../Source/Cli.g:1:256: T__58
				{
				mT__58(); 

				}
				break;
			case 43 :
				// ../../Source/Cli.g:1:262: T__59
				{
				mT__59(); 

				}
				break;
			case 44 :
				// ../../Source/Cli.g:1:268: T__60
				{
				mT__60(); 

				}
				break;
			case 45 :
				// ../../Source/Cli.g:1:274: T__61
				{
				mT__61(); 

				}
				break;
			case 46 :
				// ../../Source/Cli.g:1:280: T__62
				{
				mT__62(); 

				}
				break;
			case 47 :
				// ../../Source/Cli.g:1:286: String
				{
				mString(); 

				}
				break;
			case 48 :
				// ../../Source/Cli.g:1:293: Register
				{
				mRegister(); 

				}
				break;
			case 49 :
				// ../../Source/Cli.g:1:302: CpuReg
				{
				mCpuReg(); 

				}
				break;
			case 50 :
				// ../../Source/Cli.g:1:309: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 51 :
				// ../../Source/Cli.g:1:320: Decimal
				{
				mDecimal(); 

				}
				break;
			case 52 :
				// ../../Source/Cli.g:1:328: Hex
				{
				mHex(); 

				}
				break;
			case 53 :
				// ../../Source/Cli.g:1:332: Comment
				{
				mComment(); 

				}
				break;
			case 54 :
				// ../../Source/Cli.g:1:340: NewLine
				{
				mNewLine(); 

				}
				break;
			case 55 :
				// ../../Source/Cli.g:1:348: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\3\uffff\1\41\1\uffff\1\43\1\45\1\47\2\33\1\55\1\57\1\33\1\63\1\65\1\67"+
		"\3\33\1\75\1\77\1\102\1\104\1\105\4\uffff\1\33\1\36\6\uffff\1\33\1\uffff"+
		"\1\33\1\uffff\5\33\1\uffff\1\33\1\uffff\3\33\1\uffff\1\33\1\uffff\1\33"+
		"\1\uffff\5\33\1\uffff\1\33\1\uffff\2\33\1\uffff\1\33\2\uffff\10\33\1\uffff"+
		"\1\33\2\uffff\3\33\1\156\1\157\1\160\3\33\1\164\1\33\1\166\1\33\1\170"+
		"\1\172\1\174\2\33\1\177\1\u0080\10\33\3\uffff\1\33\1\u0089\1\u008a\1\uffff"+
		"\1\u008c\1\uffff\1\u008d\1\uffff\1\33\1\uffff\1\33\1\uffff\1\u0090\1\u0091"+
		"\2\uffff\1\u0092\1\u0093\3\33\1\u0097\1\u0098\1\33\2\uffff\1\33\2\uffff"+
		"\2\33\4\uffff\1\u009d\1\u009e\1\u009f\2\uffff\1\33\1\u00a1\2\33\3\uffff"+
		"\1\u00a5\1\uffff\1\u00a6\1\u00a7\1\33\3\uffff\1\u00a9\1\uffff";
	static final String DFA9_eofS =
		"\u00aa\uffff";
	static final String DFA9_minS =
		"\1\11\2\uffff\1\43\1\uffff\1\75\2\43\1\154\1\141\2\43\1\145\3\43\1\157"+
		"\1\162\1\165\5\43\4\uffff\1\0\1\130\6\uffff\1\163\1\uffff\1\145\1\uffff"+
		"\1\145\1\165\1\164\1\170\1\141\1\uffff\1\164\1\uffff\1\154\1\170\1\146"+
		"\1\uffff\1\141\1\uffff\1\155\1\uffff\1\142\1\157\1\151\1\147\1\156\1\uffff"+
		"\1\145\1\uffff\1\163\1\141\1\uffff\1\145\2\uffff\12\0\2\uffff\1\145\2"+
		"\141\3\43\1\155\1\157\1\160\1\43\1\157\1\43\1\144\3\43\1\147\1\164\2\43"+
		"\1\160\1\164\1\143\1\162\1\0\1\162\1\153\1\162\3\uffff\1\151\2\43\1\uffff"+
		"\1\43\1\uffff\1\43\1\uffff\1\145\1\uffff\1\141\1\uffff\2\43\2\uffff\2"+
		"\43\2\145\1\164\2\43\1\156\2\uffff\1\170\2\uffff\1\141\1\143\4\uffff\3"+
		"\43\2\uffff\1\145\1\43\1\153\1\145\3\uffff\1\43\1\uffff\2\43\1\170\3\uffff"+
		"\1\43\1\uffff";
	static final String DFA9_maxS =
		"\1\172\2\uffff\1\172\1\uffff\1\75\2\172\1\160\1\141\2\172\1\145\3\172"+
		"\1\157\1\162\1\165\5\172\4\uffff\1\uffff\1\170\6\uffff\1\163\1\uffff\1"+
		"\145\1\uffff\1\145\1\165\1\164\1\170\1\141\1\uffff\1\164\1\uffff\1\154"+
		"\1\170\1\163\1\uffff\1\141\1\uffff\1\155\1\uffff\1\164\1\157\1\151\1\147"+
		"\1\156\1\uffff\1\145\1\uffff\1\163\1\141\1\uffff\1\145\2\uffff\12\uffff"+
		"\2\uffff\1\145\2\141\3\172\1\155\1\157\1\160\1\172\1\157\1\172\1\144\3"+
		"\172\1\147\1\164\2\172\1\160\1\164\1\143\1\162\1\uffff\1\162\1\153\1\162"+
		"\3\uffff\1\151\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\145\1\uffff"+
		"\1\141\1\uffff\2\172\2\uffff\2\172\2\145\1\164\2\172\1\156\2\uffff\1\170"+
		"\2\uffff\1\141\1\143\4\uffff\3\172\2\uffff\1\145\1\172\1\153\1\145\3\uffff"+
		"\1\172\1\uffff\2\172\1\170\3\uffff\1\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\23\uffff\1\57\1\60\1\61\1\62\2\uffff\1\63"+
		"\1\66\1\67\1\3\1\6\1\5\1\uffff\1\7\1\uffff\1\11\5\uffff\1\16\1\uffff\1"+
		"\22\3\uffff\1\25\1\uffff\1\32\1\uffff\1\34\5\uffff\1\44\1\uffff\1\47\2"+
		"\uffff\1\51\1\uffff\1\54\1\56\12\uffff\1\65\1\64\34\uffff\1\14\1\15\1"+
		"\17\3\uffff\1\26\1\uffff\1\31\1\uffff\1\35\1\uffff\1\36\1\uffff\1\40\2"+
		"\uffff\1\45\1\46\10\uffff\1\23\1\24\1\uffff\1\27\1\33\2\uffff\1\42\1\43"+
		"\1\50\1\52\3\uffff\1\12\1\13\4\uffff\1\53\1\55\1\10\1\uffff\1\30\3\uffff"+
		"\1\20\1\37\1\41\1\uffff\1\21";
	static final String DFA9_specialS =
		"\34\uffff\1\1\51\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\12\32"+
		"\uffff\1\0\77\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\40\1\37\2\uffff\1\37\22\uffff\1\40\1\uffff\1\30\1\34\1\33\1\31\4\uffff"+
			"\1\1\1\2\1\uffff\1\3\2\33\1\35\11\36\1\4\2\uffff\1\5\2\uffff\1\32\32"+
			"\33\1\uffff\1\33\2\uffff\1\33\1\uffff\1\6\1\7\1\10\1\11\1\12\1\33\1\13"+
			"\1\14\1\15\2\33\1\16\1\17\1\20\1\33\1\21\1\22\1\23\1\24\1\25\2\33\1\26"+
			"\1\27\2\33",
			"",
			"",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"",
			"\1\42",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\22\33\1\44\7\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\21\33\1\46\10\33",
			"\1\50\3\uffff\1\51",
			"\1\52",
			"\2\33\10\uffff\2\33\1\53\12\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1"+
			"\33\1\uffff\27\33\1\54\2\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\16\33\1\56\13\33",
			"\1\60",
			"\2\33\10\uffff\2\33\1\61\12\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1"+
			"\33\1\uffff\15\33\1\62\14\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\16\33\1\64\13\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\4\33\1\66\25\33",
			"\1\70",
			"\1\71",
			"\1\72",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\4\33\1\73\17\33\1\74\5\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\23\33\1\76\6\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\4\33\1\100\14\33\1\101\10\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\7\33\1\103\22\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"",
			"",
			"",
			"",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\1\121\37\uffff\1\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122",
			"",
			"\1\123",
			"",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"\1\131",
			"",
			"\1\132",
			"\1\133",
			"\1\134\14\uffff\1\135",
			"",
			"\1\136",
			"",
			"\1\137",
			"",
			"\1\140\21\uffff\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"",
			"\1\146",
			"",
			"\1\147",
			"\1\150",
			"",
			"\1\151",
			"",
			"",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\40\120\1\152\uffdf\120",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"",
			"",
			"\1\153",
			"\1\154",
			"\1\155",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\161",
			"\1\162",
			"\1\163",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\165",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\167",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\21\33\1\171\10\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\21\33\1\173\10\33",
			"\1\175",
			"\1\176",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\43\120\1\112\1\113\10\120\1\114\1\115\1\111\12\117\7\120\32\106\1\120"+
			"\1\116\2\120\1\110\1\120\32\107\uff85\120",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"",
			"",
			"",
			"\1\u0088",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"",
			"\2\33\10\uffff\2\33\1\u008b\12\33\7\uffff\32\33\1\uffff\1\33\2\uffff"+
			"\1\33\1\uffff\32\33",
			"",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"",
			"\1\u008e",
			"",
			"\1\u008f",
			"",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"",
			"",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\u0099",
			"",
			"",
			"\1\u009a",
			"",
			"",
			"\1\u009b",
			"\1\u009c",
			"",
			"",
			"",
			"",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"",
			"",
			"\1\u00a0",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"",
			"",
			"\2\33\10\uffff\2\33\1\u00a4\12\33\7\uffff\32\33\1\uffff\1\33\2\uffff"+
			"\1\33\1\uffff\32\33",
			"",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			"\1\u00a8",
			"",
			"",
			"",
			"\2\33\10\uffff\15\33\7\uffff\32\33\1\uffff\1\33\2\uffff\1\33\1\uffff"+
			"\32\33",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | String | Register | CpuReg | Identifier | Decimal | Hex | Comment | NewLine | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA9_106 = input.LA(1);
						s = -1;
						if ( ((LA9_106 >= 'A' && LA9_106 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_106 >= 'a' && LA9_106 <= 'z')) ) {s = 71;}
						else if ( (LA9_106=='_') ) {s = 72;}
						else if ( (LA9_106=='/') ) {s = 73;}
						else if ( (LA9_106=='#') ) {s = 74;}
						else if ( (LA9_106=='$') ) {s = 75;}
						else if ( (LA9_106=='-') ) {s = 76;}
						else if ( (LA9_106=='.') ) {s = 77;}
						else if ( (LA9_106=='\\') ) {s = 78;}
						else if ( ((LA9_106 >= '0' && LA9_106 <= '9')) ) {s = 79;}
						else if ( ((LA9_106 >= '\u0000' && LA9_106 <= '\"')||(LA9_106 >= '%' && LA9_106 <= ',')||(LA9_106 >= ':' && LA9_106 <= '@')||LA9_106=='['||(LA9_106 >= ']' && LA9_106 <= '^')||LA9_106=='`'||(LA9_106 >= '{' && LA9_106 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA9_28 = input.LA(1);
						s = -1;
						if ( ((LA9_28 >= 'A' && LA9_28 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_28 >= 'a' && LA9_28 <= 'z')) ) {s = 71;}
						else if ( (LA9_28=='_') ) {s = 72;}
						else if ( (LA9_28=='/') ) {s = 73;}
						else if ( (LA9_28=='#') ) {s = 74;}
						else if ( (LA9_28=='$') ) {s = 75;}
						else if ( (LA9_28=='-') ) {s = 76;}
						else if ( (LA9_28=='.') ) {s = 77;}
						else if ( (LA9_28=='\\') ) {s = 78;}
						else if ( ((LA9_28 >= '0' && LA9_28 <= '9')) ) {s = 79;}
						else if ( ((LA9_28 >= '\u0000' && LA9_28 <= '\"')||(LA9_28 >= '%' && LA9_28 <= ',')||(LA9_28 >= ':' && LA9_28 <= '@')||LA9_28=='['||(LA9_28 >= ']' && LA9_28 <= '^')||LA9_28=='`'||(LA9_28 >= '{' && LA9_28 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA9_70 = input.LA(1);
						s = -1;
						if ( ((LA9_70 >= 'A' && LA9_70 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_70 >= 'a' && LA9_70 <= 'z')) ) {s = 71;}
						else if ( (LA9_70=='_') ) {s = 72;}
						else if ( (LA9_70=='/') ) {s = 73;}
						else if ( (LA9_70=='#') ) {s = 74;}
						else if ( (LA9_70=='$') ) {s = 75;}
						else if ( (LA9_70=='-') ) {s = 76;}
						else if ( (LA9_70=='.') ) {s = 77;}
						else if ( (LA9_70=='\\') ) {s = 78;}
						else if ( ((LA9_70 >= '0' && LA9_70 <= '9')) ) {s = 79;}
						else if ( ((LA9_70 >= '\u0000' && LA9_70 <= '\"')||(LA9_70 >= '%' && LA9_70 <= ',')||(LA9_70 >= ':' && LA9_70 <= '@')||LA9_70=='['||(LA9_70 >= ']' && LA9_70 <= '^')||LA9_70=='`'||(LA9_70 >= '{' && LA9_70 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA9_71 = input.LA(1);
						s = -1;
						if ( ((LA9_71 >= 'A' && LA9_71 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_71 >= 'a' && LA9_71 <= 'z')) ) {s = 71;}
						else if ( (LA9_71=='_') ) {s = 72;}
						else if ( (LA9_71=='/') ) {s = 73;}
						else if ( (LA9_71=='#') ) {s = 74;}
						else if ( (LA9_71=='$') ) {s = 75;}
						else if ( (LA9_71=='-') ) {s = 76;}
						else if ( (LA9_71=='.') ) {s = 77;}
						else if ( (LA9_71=='\\') ) {s = 78;}
						else if ( ((LA9_71 >= '0' && LA9_71 <= '9')) ) {s = 79;}
						else if ( ((LA9_71 >= '\u0000' && LA9_71 <= '\"')||(LA9_71 >= '%' && LA9_71 <= ',')||(LA9_71 >= ':' && LA9_71 <= '@')||LA9_71=='['||(LA9_71 >= ']' && LA9_71 <= '^')||LA9_71=='`'||(LA9_71 >= '{' && LA9_71 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA9_72 = input.LA(1);
						s = -1;
						if ( ((LA9_72 >= 'A' && LA9_72 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_72 >= 'a' && LA9_72 <= 'z')) ) {s = 71;}
						else if ( (LA9_72=='_') ) {s = 72;}
						else if ( (LA9_72=='/') ) {s = 73;}
						else if ( (LA9_72=='#') ) {s = 74;}
						else if ( (LA9_72=='$') ) {s = 75;}
						else if ( (LA9_72=='-') ) {s = 76;}
						else if ( (LA9_72=='.') ) {s = 77;}
						else if ( (LA9_72=='\\') ) {s = 78;}
						else if ( ((LA9_72 >= '0' && LA9_72 <= '9')) ) {s = 79;}
						else if ( ((LA9_72 >= '\u0000' && LA9_72 <= '\"')||(LA9_72 >= '%' && LA9_72 <= ',')||(LA9_72 >= ':' && LA9_72 <= '@')||LA9_72=='['||(LA9_72 >= ']' && LA9_72 <= '^')||LA9_72=='`'||(LA9_72 >= '{' && LA9_72 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA9_73 = input.LA(1);
						s = -1;
						if ( ((LA9_73 >= 'A' && LA9_73 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_73 >= 'a' && LA9_73 <= 'z')) ) {s = 71;}
						else if ( (LA9_73=='_') ) {s = 72;}
						else if ( (LA9_73=='/') ) {s = 73;}
						else if ( (LA9_73=='#') ) {s = 74;}
						else if ( (LA9_73=='$') ) {s = 75;}
						else if ( (LA9_73=='-') ) {s = 76;}
						else if ( (LA9_73=='.') ) {s = 77;}
						else if ( (LA9_73=='\\') ) {s = 78;}
						else if ( ((LA9_73 >= '0' && LA9_73 <= '9')) ) {s = 79;}
						else if ( ((LA9_73 >= '\u0000' && LA9_73 <= '\"')||(LA9_73 >= '%' && LA9_73 <= ',')||(LA9_73 >= ':' && LA9_73 <= '@')||LA9_73=='['||(LA9_73 >= ']' && LA9_73 <= '^')||LA9_73=='`'||(LA9_73 >= '{' && LA9_73 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA9_74 = input.LA(1);
						s = -1;
						if ( ((LA9_74 >= 'A' && LA9_74 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_74 >= 'a' && LA9_74 <= 'z')) ) {s = 71;}
						else if ( (LA9_74=='_') ) {s = 72;}
						else if ( (LA9_74=='/') ) {s = 73;}
						else if ( (LA9_74=='#') ) {s = 74;}
						else if ( (LA9_74=='$') ) {s = 75;}
						else if ( (LA9_74=='-') ) {s = 76;}
						else if ( (LA9_74=='.') ) {s = 77;}
						else if ( (LA9_74=='\\') ) {s = 78;}
						else if ( ((LA9_74 >= '0' && LA9_74 <= '9')) ) {s = 79;}
						else if ( ((LA9_74 >= '\u0000' && LA9_74 <= '\"')||(LA9_74 >= '%' && LA9_74 <= ',')||(LA9_74 >= ':' && LA9_74 <= '@')||LA9_74=='['||(LA9_74 >= ']' && LA9_74 <= '^')||LA9_74=='`'||(LA9_74 >= '{' && LA9_74 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA9_75 = input.LA(1);
						s = -1;
						if ( ((LA9_75 >= 'A' && LA9_75 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_75 >= 'a' && LA9_75 <= 'z')) ) {s = 71;}
						else if ( (LA9_75=='_') ) {s = 72;}
						else if ( (LA9_75=='/') ) {s = 73;}
						else if ( (LA9_75=='#') ) {s = 74;}
						else if ( (LA9_75=='$') ) {s = 75;}
						else if ( (LA9_75=='-') ) {s = 76;}
						else if ( (LA9_75=='.') ) {s = 77;}
						else if ( (LA9_75=='\\') ) {s = 78;}
						else if ( ((LA9_75 >= '0' && LA9_75 <= '9')) ) {s = 79;}
						else if ( ((LA9_75 >= '\u0000' && LA9_75 <= '\"')||(LA9_75 >= '%' && LA9_75 <= ',')||(LA9_75 >= ':' && LA9_75 <= '@')||LA9_75=='['||(LA9_75 >= ']' && LA9_75 <= '^')||LA9_75=='`'||(LA9_75 >= '{' && LA9_75 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA9_76 = input.LA(1);
						s = -1;
						if ( ((LA9_76 >= 'A' && LA9_76 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_76 >= 'a' && LA9_76 <= 'z')) ) {s = 71;}
						else if ( (LA9_76=='_') ) {s = 72;}
						else if ( (LA9_76=='/') ) {s = 73;}
						else if ( (LA9_76=='#') ) {s = 74;}
						else if ( (LA9_76=='$') ) {s = 75;}
						else if ( (LA9_76=='-') ) {s = 76;}
						else if ( (LA9_76=='.') ) {s = 77;}
						else if ( (LA9_76=='\\') ) {s = 78;}
						else if ( ((LA9_76 >= '0' && LA9_76 <= '9')) ) {s = 79;}
						else if ( ((LA9_76 >= '\u0000' && LA9_76 <= '\"')||(LA9_76 >= '%' && LA9_76 <= ',')||(LA9_76 >= ':' && LA9_76 <= '@')||LA9_76=='['||(LA9_76 >= ']' && LA9_76 <= '^')||LA9_76=='`'||(LA9_76 >= '{' && LA9_76 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA9_77 = input.LA(1);
						s = -1;
						if ( ((LA9_77 >= 'A' && LA9_77 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_77 >= 'a' && LA9_77 <= 'z')) ) {s = 71;}
						else if ( (LA9_77=='_') ) {s = 72;}
						else if ( (LA9_77=='/') ) {s = 73;}
						else if ( (LA9_77=='#') ) {s = 74;}
						else if ( (LA9_77=='$') ) {s = 75;}
						else if ( (LA9_77=='-') ) {s = 76;}
						else if ( (LA9_77=='.') ) {s = 77;}
						else if ( (LA9_77=='\\') ) {s = 78;}
						else if ( ((LA9_77 >= '0' && LA9_77 <= '9')) ) {s = 79;}
						else if ( ((LA9_77 >= '\u0000' && LA9_77 <= '\"')||(LA9_77 >= '%' && LA9_77 <= ',')||(LA9_77 >= ':' && LA9_77 <= '@')||LA9_77=='['||(LA9_77 >= ']' && LA9_77 <= '^')||LA9_77=='`'||(LA9_77 >= '{' && LA9_77 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA9_79 = input.LA(1);
						s = -1;
						if ( ((LA9_79 >= 'A' && LA9_79 <= 'Z')) ) {s = 70;}
						else if ( ((LA9_79 >= 'a' && LA9_79 <= 'z')) ) {s = 71;}
						else if ( (LA9_79=='_') ) {s = 72;}
						else if ( (LA9_79=='/') ) {s = 73;}
						else if ( (LA9_79=='#') ) {s = 74;}
						else if ( (LA9_79=='$') ) {s = 75;}
						else if ( (LA9_79=='-') ) {s = 76;}
						else if ( (LA9_79=='.') ) {s = 77;}
						else if ( (LA9_79=='\\') ) {s = 78;}
						else if ( ((LA9_79 >= '0' && LA9_79 <= '9')) ) {s = 79;}
						else if ( ((LA9_79 >= '\u0000' && LA9_79 <= '\"')||(LA9_79 >= '%' && LA9_79 <= ',')||(LA9_79 >= ':' && LA9_79 <= '@')||LA9_79=='['||(LA9_79 >= ']' && LA9_79 <= '^')||LA9_79=='`'||(LA9_79 >= '{' && LA9_79 <= '\uFFFF')) ) {s = 80;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA9_78 = input.LA(1);
						s = -1;
						if ( (LA9_78==' ') ) {s = 106;}
						else if ( ((LA9_78 >= '\u0000' && LA9_78 <= '\u001F')||(LA9_78 >= '!' && LA9_78 <= '\uFFFF')) ) {s = 80;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
