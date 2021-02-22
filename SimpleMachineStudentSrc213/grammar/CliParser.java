// $ANTLR 3.5.2 ../../Source/Cli.g 2019-07-22 15:59:14

package grammar;

import ui.cli.UI;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CliParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Character", "Comment", "CpuReg", 
		"Decimal", "Digit", "EscapeSpace", "Hex", "HexDigit", "Identifier", "NewLine", 
		"Register", "String", "WS", "'*'", "'+'", "'-'", "':'", "'='", "'=='", 
		"'a'", "'assert'", "'b'", "'break'", "'clear'", "'cpu'", "'dat'", "'e'", 
		"'e/x'", "'examine'", "'examine/x'", "'g'", "'goto'", "'help'", "'i'", 
		"'i/x'", "'info'", "'info/x'", "'ins'", "'l'", "'load'", "'m'", "'mem'", 
		"'nob'", "'nobreak'", "'not'", "'notrace'", "'prog'", "'quit'", "'r'", 
		"'reg'", "'run'", "'s'", "'step'", "'t'", "'test'", "'trace'", "'w'", 
		"'where'", "'x'"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CliParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CliParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CliParser.tokenNames; }
	@Override public String getGrammarFileName() { return "../../Source/Cli.g"; }



	public class QuitException extends RuntimeException {}
	public class SyntaxErrorException extends RuntimeException {}

	@Override
	public void reportError (RecognitionException re) {
	  throw new SyntaxErrorException ();
	}

	public interface CommandHandler {
	  public enum MemFormat  {ASM,HEX};
	  public enum MemRegion  {INS, DAT, ALL};
	  public enum InsOper    {REPLACE,INSERT,DELETE};
	  public enum DebugType  {BREAK,TRACE};
	  public enum DebugPoint {INSTRUCTION, MEMORY_READ, MEMORY_WRITE, MEMORY_ACCESS, REGISTER_READ, REGISTER_WRITE, REGISTER_ACCESS};
	  void load              (String filename);
	  void test              (String filename, String bnchArch, String bnchVariant);
	  void run               ();
	  void step              ();
	  void showWhere         ();
	  void gotoPC            (int pc);
	  void examineMem        (int count, MemFormat format, int addr);
	  void examineReg        (int count, int addr);
	  void examineMemAll     (MemFormat format, MemRegion region);
	  void examineRegAll     ();
	  void examineProc       (String state);
	  void assertReg         (int regNum, int value, String desc);
	  void assertProc        (String state, int value, String desc);
	  void assertMem         (int addr, int value, String desc);
	  void assertDesc        (String desc);
	  void setReg            (int regNum, int value);
	  void setMem            (int addr, int value);
	  void setIns            (int addr, InsOper oper, String value);
	  void debugPoint        (DebugType type, DebugPoint point, boolean isEnabled, int value);
	  void traceProg         (boolean isEnabled);
	  void clearDebugPoints  (DebugType type);
	  void showDebugPoints   (DebugType type);
	  void help              ();
	  int  getRegisterNumber (String registerName);
	  int  getLabelValue     (String label);
	  int  getMemValue       (int addr);
	}

	CommandHandler cmd;

	public void setCommandHandler (CommandHandler aCmd) { 
	  cmd = aCmd; 
	}
	boolean dpIsEnabled;



	// $ANTLR start "command"
	// ../../Source/Cli.g:74:1: command : ( load | test | run | step | where | gotoPC | examine | assertCmd | info | set | debug | infoDebug | quit | help ) EOF ;
	public final void command() throws RecognitionException {
		try {
			// ../../Source/Cli.g:74:9: ( ( load | test | run | step | where | gotoPC | examine | assertCmd | info | set | debug | infoDebug | quit | help ) EOF )
			// ../../Source/Cli.g:74:11: ( load | test | run | step | where | gotoPC | examine | assertCmd | info | set | debug | infoDebug | quit | help ) EOF
			{
			// ../../Source/Cli.g:74:11: ( load | test | run | step | where | gotoPC | examine | assertCmd | info | set | debug | infoDebug | quit | help )
			int alt1=14;
			switch ( input.LA(1) ) {
			case 42:
			case 43:
				{
				alt1=1;
				}
				break;
			case 58:
				{
				alt1=2;
				}
				break;
			case 52:
			case 54:
				{
				alt1=3;
				}
				break;
			case 55:
			case 56:
				{
				alt1=4;
				}
				break;
			case 60:
			case 61:
				{
				alt1=5;
				}
				break;
			case 34:
			case 35:
				{
				alt1=6;
				}
				break;
			case 30:
			case 31:
			case 32:
			case 33:
				{
				alt1=7;
				}
				break;
			case 23:
			case 24:
				{
				alt1=8;
				}
				break;
			case 37:
				{
				switch ( input.LA(2) ) {
				case 45:
					{
					int LA1_16 = input.LA(3);
					if ( (LA1_16==EOF) ) {
						alt1=9;
					}
					else if ( ((LA1_16 >= 18 && LA1_16 <= 19)||LA1_16==21) ) {
						alt1=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 41:
					{
					int LA1_17 = input.LA(3);
					if ( (LA1_17==EOF) ) {
						alt1=9;
					}
					else if ( ((LA1_17 >= 18 && LA1_17 <= 19)||LA1_17==21) ) {
						alt1=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 29:
					{
					int LA1_18 = input.LA(3);
					if ( (LA1_18==EOF) ) {
						alt1=9;
					}
					else if ( ((LA1_18 >= 18 && LA1_18 <= 19)||LA1_18==21) ) {
						alt1=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 53:
					{
					int LA1_19 = input.LA(3);
					if ( (LA1_19==EOF) ) {
						alt1=9;
					}
					else if ( ((LA1_19 >= 18 && LA1_19 <= 19)||LA1_19==21) ) {
						alt1=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 28:
					{
					int LA1_20 = input.LA(3);
					if ( (LA1_20==EOF||LA1_20==Identifier||LA1_20==23||(LA1_20 >= 25 && LA1_20 <= 30)||LA1_20==32||(LA1_20 >= 34 && LA1_20 <= 37)||LA1_20==39||(LA1_20 >= 41 && LA1_20 <= 45)||(LA1_20 >= 50 && LA1_20 <= 62)) ) {
						alt1=9;
					}
					else if ( ((LA1_20 >= 18 && LA1_20 <= 19)||LA1_20==21) ) {
						alt1=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case Decimal:
				case Hex:
				case Identifier:
				case 17:
				case 23:
				case 27:
				case 30:
				case 32:
				case 34:
				case 35:
				case 36:
				case 37:
				case 39:
				case 42:
				case 43:
				case 44:
				case 50:
				case 51:
				case 52:
				case 54:
				case 55:
				case 56:
				case 58:
				case 60:
				case 61:
				case 62:
					{
					alt1=10;
					}
					break;
				case 25:
				case 26:
					{
					int LA1_21 = input.LA(3);
					if ( ((LA1_21 >= 18 && LA1_21 <= 19)||LA1_21==21) ) {
						alt1=10;
					}
					else if ( (LA1_21==EOF) ) {
						alt1=12;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 57:
				case 59:
					{
					int LA1_22 = input.LA(3);
					if ( ((LA1_22 >= 18 && LA1_22 <= 19)||LA1_22==21) ) {
						alt1=10;
					}
					else if ( (LA1_22==EOF) ) {
						alt1=12;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 22, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 39:
				{
				int LA1_10 = input.LA(2);
				if ( ((LA1_10 >= 28 && LA1_10 <= 29)||LA1_10==41||LA1_10==45||LA1_10==53) ) {
					alt1=9;
				}
				else if ( ((LA1_10 >= 25 && LA1_10 <= 26)||LA1_10==57||LA1_10==59) ) {
					alt1=12;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 38:
			case 40:
				{
				alt1=9;
				}
				break;
			case Register:
			case 44:
				{
				alt1=10;
				}
				break;
			case 25:
			case 26:
			case 27:
			case 46:
			case 47:
			case 48:
			case 49:
			case 57:
			case 59:
				{
				alt1=11;
				}
				break;
			case 51:
				{
				alt1=13;
				}
				break;
			case 36:
				{
				alt1=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// ../../Source/Cli.g:74:12: load
					{
					pushFollow(FOLLOW_load_in_command41);
					load();
					state._fsp--;

					}
					break;
				case 2 :
					// ../../Source/Cli.g:74:19: test
					{
					pushFollow(FOLLOW_test_in_command45);
					test();
					state._fsp--;

					}
					break;
				case 3 :
					// ../../Source/Cli.g:74:26: run
					{
					pushFollow(FOLLOW_run_in_command49);
					run();
					state._fsp--;

					}
					break;
				case 4 :
					// ../../Source/Cli.g:74:32: step
					{
					pushFollow(FOLLOW_step_in_command53);
					step();
					state._fsp--;

					}
					break;
				case 5 :
					// ../../Source/Cli.g:74:39: where
					{
					pushFollow(FOLLOW_where_in_command57);
					where();
					state._fsp--;

					}
					break;
				case 6 :
					// ../../Source/Cli.g:74:47: gotoPC
					{
					pushFollow(FOLLOW_gotoPC_in_command61);
					gotoPC();
					state._fsp--;

					}
					break;
				case 7 :
					// ../../Source/Cli.g:74:56: examine
					{
					pushFollow(FOLLOW_examine_in_command65);
					examine();
					state._fsp--;

					}
					break;
				case 8 :
					// ../../Source/Cli.g:74:66: assertCmd
					{
					pushFollow(FOLLOW_assertCmd_in_command69);
					assertCmd();
					state._fsp--;

					}
					break;
				case 9 :
					// ../../Source/Cli.g:74:78: info
					{
					pushFollow(FOLLOW_info_in_command73);
					info();
					state._fsp--;

					}
					break;
				case 10 :
					// ../../Source/Cli.g:74:85: set
					{
					pushFollow(FOLLOW_set_in_command77);
					set();
					state._fsp--;

					}
					break;
				case 11 :
					// ../../Source/Cli.g:74:91: debug
					{
					pushFollow(FOLLOW_debug_in_command81);
					debug();
					state._fsp--;

					}
					break;
				case 12 :
					// ../../Source/Cli.g:74:99: infoDebug
					{
					pushFollow(FOLLOW_infoDebug_in_command85);
					infoDebug();
					state._fsp--;

					}
					break;
				case 13 :
					// ../../Source/Cli.g:74:111: quit
					{
					pushFollow(FOLLOW_quit_in_command89);
					quit();
					state._fsp--;

					}
					break;
				case 14 :
					// ../../Source/Cli.g:74:118: help
					{
					pushFollow(FOLLOW_help_in_command93);
					help();
					state._fsp--;

					}
					break;

			}

			match(input,EOF,FOLLOW_EOF_in_command96); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command"



	// $ANTLR start "keyword"
	// ../../Source/Cli.g:76:1: keyword : ( 'a' | 'm' | 'i' | 'l' | 'x' | 'load' | 'test' | 'e' | 'examine' | 'r' | 'run' | 's' | 'step' | 'w' | 'where' | 'g' | 'goto' | 't' | 'trace' | 'b' | 'break' | 'info' | 'help' | 'quit' | 'mem' | 'ins' | 'dat' | 'reg' | 'cpu' | 'clear' | 'prog' ) ;
	public final void keyword() throws RecognitionException {
		try {
			// ../../Source/Cli.g:76:9: ( ( 'a' | 'm' | 'i' | 'l' | 'x' | 'load' | 'test' | 'e' | 'examine' | 'r' | 'run' | 's' | 'step' | 'w' | 'where' | 'g' | 'goto' | 't' | 'trace' | 'b' | 'break' | 'info' | 'help' | 'quit' | 'mem' | 'ins' | 'dat' | 'reg' | 'cpu' | 'clear' | 'prog' ) )
			// ../../Source/Cli.g:
			{
			if ( input.LA(1)==23||(input.LA(1) >= 25 && input.LA(1) <= 30)||input.LA(1)==32||(input.LA(1) >= 34 && input.LA(1) <= 37)||input.LA(1)==39||(input.LA(1) >= 41 && input.LA(1) <= 45)||(input.LA(1) >= 50 && input.LA(1) <= 62) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "keyword"



	// $ANTLR start "load"
	// ../../Source/Cli.g:78:1: load : ( 'l' | 'load' ) f= filename ;
	public final void load() throws RecognitionException {
		ParserRuleReturnScope f =null;

		try {
			// ../../Source/Cli.g:78:6: ( ( 'l' | 'load' ) f= filename )
			// ../../Source/Cli.g:78:8: ( 'l' | 'load' ) f= filename
			{
			if ( (input.LA(1) >= 42 && input.LA(1) <= 43) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_filename_in_load182);
			f=filename();
			state._fsp--;

			cmd.load ((f!=null?((CliParser.filename_return)f).value:null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "load"



	// $ANTLR start "test"
	// ../../Source/Cli.g:80:1: test : ( 'test' ) filename (arch= identifier (variant= identifier )? )? ;
	public final void test() throws RecognitionException {
		ParserRuleReturnScope arch =null;
		ParserRuleReturnScope variant =null;
		ParserRuleReturnScope filename1 =null;

		try {
			// ../../Source/Cli.g:80:9: ( ( 'test' ) filename (arch= identifier (variant= identifier )? )? )
			// ../../Source/Cli.g:80:17: ( 'test' ) filename (arch= identifier (variant= identifier )? )?
			{
			// ../../Source/Cli.g:80:17: ( 'test' )
			// ../../Source/Cli.g:80:18: 'test'
			{
			match(input,58,FOLLOW_58_in_test205); 
			}

			pushFollow(FOLLOW_filename_in_test208);
			filename1=filename();
			state._fsp--;

			// ../../Source/Cli.g:80:35: (arch= identifier (variant= identifier )? )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Identifier||LA3_0==23||(LA3_0 >= 25 && LA3_0 <= 30)||LA3_0==32||(LA3_0 >= 34 && LA3_0 <= 37)||LA3_0==39||(LA3_0 >= 41 && LA3_0 <= 45)||(LA3_0 >= 50 && LA3_0 <= 62)) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ../../Source/Cli.g:80:36: arch= identifier (variant= identifier )?
					{
					pushFollow(FOLLOW_identifier_in_test213);
					arch=identifier();
					state._fsp--;

					// ../../Source/Cli.g:80:59: (variant= identifier )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==Identifier||LA2_0==23||(LA2_0 >= 25 && LA2_0 <= 30)||LA2_0==32||(LA2_0 >= 34 && LA2_0 <= 37)||LA2_0==39||(LA2_0 >= 41 && LA2_0 <= 45)||(LA2_0 >= 50 && LA2_0 <= 62)) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// ../../Source/Cli.g:80:59: variant= identifier
							{
							pushFollow(FOLLOW_identifier_in_test217);
							variant=identifier();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			cmd.test ((filename1!=null?input.toString(filename1.start,filename1.stop):null), (arch!=null?input.toString(arch.start,arch.stop):null), (variant!=null?input.toString(variant.start,variant.stop):null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "test"



	// $ANTLR start "run"
	// ../../Source/Cli.g:82:1: run : ( 'r' | 'run' ) ;
	public final void run() throws RecognitionException {
		try {
			// ../../Source/Cli.g:82:5: ( ( 'r' | 'run' ) )
			// ../../Source/Cli.g:82:7: ( 'r' | 'run' )
			{
			if ( input.LA(1)==52||input.LA(1)==54 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 cmd.run (); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "run"



	// $ANTLR start "step"
	// ../../Source/Cli.g:84:1: step : ( 's' | 'step' ) ;
	public final void step() throws RecognitionException {
		try {
			// ../../Source/Cli.g:84:6: ( ( 's' | 'step' ) )
			// ../../Source/Cli.g:84:8: ( 's' | 'step' )
			{
			if ( (input.LA(1) >= 55 && input.LA(1) <= 56) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 cmd.step (); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "step"



	// $ANTLR start "where"
	// ../../Source/Cli.g:86:1: where : ( 'w' | 'where' ) ;
	public final void where() throws RecognitionException {
		try {
			// ../../Source/Cli.g:86:8: ( ( 'w' | 'where' ) )
			// ../../Source/Cli.g:86:10: ( 'w' | 'where' )
			{
			if ( (input.LA(1) >= 60 && input.LA(1) <= 61) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 cmd.showWhere (); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "where"



	// $ANTLR start "gotoPC"
	// ../../Source/Cli.g:88:1: gotoPC : ( 'g' | 'goto' ) pc= address ;
	public final void gotoPC() throws RecognitionException {
		int pc =0;

		try {
			// ../../Source/Cli.g:88:8: ( ( 'g' | 'goto' ) pc= address )
			// ../../Source/Cli.g:88:10: ( 'g' | 'goto' ) pc= address
			{
			if ( (input.LA(1) >= 34 && input.LA(1) <= 35) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_address_in_gotoPC316);
			pc=address();
			state._fsp--;

			 cmd.gotoPC (pc); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gotoPC"



	// $ANTLR start "examine"
	// ../../Source/Cli.g:90:1: examine : ( ( ( 'e' | 'examine' | ( ( 'e/x' | 'examine/x' ) ) ) ( (addr= address ( ':' count= number )? ) ) ) | ( ( 'e' | 'examine' ) ( ( register ( ':' count= number )? ) ) ) | ( ( 'e' | 'examine' ) ( ( cpuReg ) ) ) );
	public final void examine() throws RecognitionException {
		int addr =0;
		int count =0;
		int register2 =0;
		String cpuReg3 =null;

		CommandHandler.MemFormat format=CommandHandler.MemFormat.ASM;
		try {
			// ../../Source/Cli.g:91:9: ( ( ( 'e' | 'examine' | ( ( 'e/x' | 'examine/x' ) ) ) ( (addr= address ( ':' count= number )? ) ) ) | ( ( 'e' | 'examine' ) ( ( register ( ':' count= number )? ) ) ) | ( ( 'e' | 'examine' ) ( ( cpuReg ) ) ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case 30:
				{
				switch ( input.LA(2) ) {
				case Decimal:
				case Hex:
				case Identifier:
				case 17:
				case 23:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
				case 32:
				case 34:
				case 35:
				case 36:
				case 37:
				case 39:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
					{
					alt7=1;
					}
					break;
				case Register:
					{
					alt7=2;
					}
					break;
				case CpuReg:
					{
					alt7=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 32:
				{
				switch ( input.LA(2) ) {
				case Decimal:
				case Hex:
				case Identifier:
				case 17:
				case 23:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
				case 32:
				case 34:
				case 35:
				case 36:
				case 37:
				case 39:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
					{
					alt7=1;
					}
					break;
				case Register:
					{
					alt7=2;
					}
					break;
				case CpuReg:
					{
					alt7=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 31:
			case 33:
				{
				alt7=1;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ../../Source/Cli.g:91:11: ( ( 'e' | 'examine' | ( ( 'e/x' | 'examine/x' ) ) ) ( (addr= address ( ':' count= number )? ) ) )
					{
					// ../../Source/Cli.g:91:11: ( ( 'e' | 'examine' | ( ( 'e/x' | 'examine/x' ) ) ) ( (addr= address ( ':' count= number )? ) ) )
					// ../../Source/Cli.g:91:12: ( 'e' | 'examine' | ( ( 'e/x' | 'examine/x' ) ) ) ( (addr= address ( ':' count= number )? ) )
					{
					// ../../Source/Cli.g:91:12: ( 'e' | 'examine' | ( ( 'e/x' | 'examine/x' ) ) )
					int alt4=3;
					switch ( input.LA(1) ) {
					case 30:
						{
						alt4=1;
						}
						break;
					case 32:
						{
						alt4=2;
						}
						break;
					case 31:
					case 33:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// ../../Source/Cli.g:91:13: 'e'
							{
							match(input,30,FOLLOW_30_in_examine354); 
							}
							break;
						case 2 :
							// ../../Source/Cli.g:91:17: 'examine'
							{
							match(input,32,FOLLOW_32_in_examine356); 
							}
							break;
						case 3 :
							// ../../Source/Cli.g:91:27: ( ( 'e/x' | 'examine/x' ) )
							{
							// ../../Source/Cli.g:91:27: ( ( 'e/x' | 'examine/x' ) )
							// ../../Source/Cli.g:91:28: ( 'e/x' | 'examine/x' )
							{
							if ( input.LA(1)==31||input.LA(1)==33 ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							format=CommandHandler.MemFormat.HEX;
							}

							}
							break;

					}

					// ../../Source/Cli.g:92:19: ( (addr= address ( ':' count= number )? ) )
					// ../../Source/Cli.g:92:20: (addr= address ( ':' count= number )? )
					{
					// ../../Source/Cli.g:92:20: (addr= address ( ':' count= number )? )
					// ../../Source/Cli.g:92:21: addr= address ( ':' count= number )?
					{
					pushFollow(FOLLOW_address_in_examine392);
					addr=address();
					state._fsp--;

					// ../../Source/Cli.g:92:34: ( ':' count= number )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==20) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ../../Source/Cli.g:92:35: ':' count= number
							{
							match(input,20,FOLLOW_20_in_examine395); 
							pushFollow(FOLLOW_number_in_examine399);
							count=number();
							state._fsp--;

							}
							break;

					}

					cmd.examineMem (count, format, addr);
					}

					}

					}

					}
					break;
				case 2 :
					// ../../Source/Cli.g:94:17: ( ( 'e' | 'examine' ) ( ( register ( ':' count= number )? ) ) )
					{
					// ../../Source/Cli.g:94:17: ( ( 'e' | 'examine' ) ( ( register ( ':' count= number )? ) ) )
					// ../../Source/Cli.g:94:18: ( 'e' | 'examine' ) ( ( register ( ':' count= number )? ) )
					{
					if ( input.LA(1)==30||input.LA(1)==32 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// ../../Source/Cli.g:95:19: ( ( register ( ':' count= number )? ) )
					// ../../Source/Cli.g:95:20: ( register ( ':' count= number )? )
					{
					// ../../Source/Cli.g:95:20: ( register ( ':' count= number )? )
					// ../../Source/Cli.g:95:21: register ( ':' count= number )?
					{
					pushFollow(FOLLOW_register_in_examine456);
					register2=register();
					state._fsp--;

					// ../../Source/Cli.g:95:30: ( ':' count= number )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==20) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ../../Source/Cli.g:95:31: ':' count= number
							{
							match(input,20,FOLLOW_20_in_examine459); 
							pushFollow(FOLLOW_number_in_examine463);
							count=number();
							state._fsp--;

							}
							break;

					}

					cmd.examineReg (count, register2);
					}

					}

					}

					}
					break;
				case 3 :
					// ../../Source/Cli.g:97:3: ( ( 'e' | 'examine' ) ( ( cpuReg ) ) )
					{
					// ../../Source/Cli.g:97:3: ( ( 'e' | 'examine' ) ( ( cpuReg ) ) )
					// ../../Source/Cli.g:97:4: ( 'e' | 'examine' ) ( ( cpuReg ) )
					{
					if ( input.LA(1)==30||input.LA(1)==32 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// ../../Source/Cli.g:98:5: ( ( cpuReg ) )
					// ../../Source/Cli.g:98:6: ( cpuReg )
					{
					// ../../Source/Cli.g:98:6: ( cpuReg )
					// ../../Source/Cli.g:98:7: cpuReg
					{
					pushFollow(FOLLOW_cpuReg_in_examine492);
					cpuReg3=cpuReg();
					state._fsp--;

					cmd.examineProc (cpuReg3);
					}

					}

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "examine"



	// $ANTLR start "assertCmd"
	// ../../Source/Cli.g:100:1: assertCmd : ( ( ( 'a' | 'assert' ) addr= address '==' value= address (desc= string )? ) | ( ( 'a' | 'assert' ) register '==' value= address (desc= string )? ) | ( ( 'a' | 'assert' ) cpuReg '==' value= address (desc= string )? ) | ( ( 'a' | 'assert' ) desc= string ) );
	public final void assertCmd() throws RecognitionException {
		int addr =0;
		int value =0;
		String desc =null;
		int register4 =0;
		String cpuReg5 =null;

		try {
			// ../../Source/Cli.g:101:2: ( ( ( 'a' | 'assert' ) addr= address '==' value= address (desc= string )? ) | ( ( 'a' | 'assert' ) register '==' value= address (desc= string )? ) | ( ( 'a' | 'assert' ) cpuReg '==' value= address (desc= string )? ) | ( ( 'a' | 'assert' ) desc= string ) )
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= 23 && LA11_0 <= 24)) ) {
				switch ( input.LA(2) ) {
				case Decimal:
				case Hex:
				case Identifier:
				case 17:
				case 23:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
				case 32:
				case 34:
				case 35:
				case 36:
				case 37:
				case 39:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
					{
					alt11=1;
					}
					break;
				case Register:
					{
					alt11=2;
					}
					break;
				case CpuReg:
					{
					alt11=3;
					}
					break;
				case String:
					{
					alt11=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// ../../Source/Cli.g:101:4: ( ( 'a' | 'assert' ) addr= address '==' value= address (desc= string )? )
					{
					// ../../Source/Cli.g:101:4: ( ( 'a' | 'assert' ) addr= address '==' value= address (desc= string )? )
					// ../../Source/Cli.g:101:5: ( 'a' | 'assert' ) addr= address '==' value= address (desc= string )?
					{
					if ( (input.LA(1) >= 23 && input.LA(1) <= 24) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_address_in_assertCmd522);
					addr=address();
					state._fsp--;

					match(input,22,FOLLOW_22_in_assertCmd524); 
					pushFollow(FOLLOW_address_in_assertCmd528);
					value=address();
					state._fsp--;

					// ../../Source/Cli.g:101:58: (desc= string )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==String) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// ../../Source/Cli.g:101:58: desc= string
							{
							pushFollow(FOLLOW_string_in_assertCmd532);
							desc=string();
							state._fsp--;

							}
							break;

					}

					}

					cmd.assertMem (addr, value, desc);
					}
					break;
				case 2 :
					// ../../Source/Cli.g:102:17: ( ( 'a' | 'assert' ) register '==' value= address (desc= string )? )
					{
					// ../../Source/Cli.g:102:17: ( ( 'a' | 'assert' ) register '==' value= address (desc= string )? )
					// ../../Source/Cli.g:102:18: ( 'a' | 'assert' ) register '==' value= address (desc= string )?
					{
					if ( (input.LA(1) >= 23 && input.LA(1) <= 24) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_register_in_assertCmd565);
					register4=register();
					state._fsp--;

					match(input,22,FOLLOW_22_in_assertCmd567); 
					pushFollow(FOLLOW_address_in_assertCmd571);
					value=address();
					state._fsp--;

					// ../../Source/Cli.g:102:67: (desc= string )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==String) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// ../../Source/Cli.g:102:67: desc= string
							{
							pushFollow(FOLLOW_string_in_assertCmd575);
							desc=string();
							state._fsp--;

							}
							break;

					}

					}

					cmd.assertReg (register4, value, desc);
					}
					break;
				case 3 :
					// ../../Source/Cli.g:103:17: ( ( 'a' | 'assert' ) cpuReg '==' value= address (desc= string )? )
					{
					// ../../Source/Cli.g:103:17: ( ( 'a' | 'assert' ) cpuReg '==' value= address (desc= string )? )
					// ../../Source/Cli.g:103:18: ( 'a' | 'assert' ) cpuReg '==' value= address (desc= string )?
					{
					if ( (input.LA(1) >= 23 && input.LA(1) <= 24) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_cpuReg_in_assertCmd608);
					cpuReg5=cpuReg();
					state._fsp--;

					match(input,22,FOLLOW_22_in_assertCmd610); 
					pushFollow(FOLLOW_address_in_assertCmd614);
					value=address();
					state._fsp--;

					// ../../Source/Cli.g:103:65: (desc= string )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==String) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// ../../Source/Cli.g:103:65: desc= string
							{
							pushFollow(FOLLOW_string_in_assertCmd618);
							desc=string();
							state._fsp--;

							}
							break;

					}

					}

					cmd.assertProc(cpuReg5, value, desc);
					}
					break;
				case 4 :
					// ../../Source/Cli.g:104:17: ( ( 'a' | 'assert' ) desc= string )
					{
					// ../../Source/Cli.g:104:17: ( ( 'a' | 'assert' ) desc= string )
					// ../../Source/Cli.g:104:18: ( 'a' | 'assert' ) desc= string
					{
					if ( (input.LA(1) >= 23 && input.LA(1) <= 24) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_string_in_assertCmd653);
					desc=string();
					state._fsp--;

					}

					cmd.assertDesc (desc);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assertCmd"



	// $ANTLR start "info"
	// ../../Source/Cli.g:105:1: info : ( ( ( 'i' | 'info' | ( ( 'i/x' | 'info/x' ) ) ) ( ( 'mem' ) | ( 'ins' ) | ( 'dat' ) ) ) | ( ( 'i' | 'info' ) ( ( 'reg' ) | ( 'cpu' (ps= identifier )? ) ) ) );
	public final void info() throws RecognitionException {
		ParserRuleReturnScope ps =null;

		CommandHandler.MemFormat format=CommandHandler.MemFormat.ASM;
		try {
			// ../../Source/Cli.g:106:9: ( ( ( 'i' | 'info' | ( ( 'i/x' | 'info/x' ) ) ) ( ( 'mem' ) | ( 'ins' ) | ( 'dat' ) ) ) | ( ( 'i' | 'info' ) ( ( 'reg' ) | ( 'cpu' (ps= identifier )? ) ) ) )
			int alt16=2;
			switch ( input.LA(1) ) {
			case 37:
				{
				int LA16_1 = input.LA(2);
				if ( (LA16_1==29||LA16_1==41||LA16_1==45) ) {
					alt16=1;
				}
				else if ( (LA16_1==28||LA16_1==53) ) {
					alt16=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 39:
				{
				int LA16_2 = input.LA(2);
				if ( (LA16_2==29||LA16_2==41||LA16_2==45) ) {
					alt16=1;
				}
				else if ( (LA16_2==28||LA16_2==53) ) {
					alt16=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 38:
			case 40:
				{
				alt16=1;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// ../../Source/Cli.g:106:11: ( ( 'i' | 'info' | ( ( 'i/x' | 'info/x' ) ) ) ( ( 'mem' ) | ( 'ins' ) | ( 'dat' ) ) )
					{
					// ../../Source/Cli.g:106:11: ( ( 'i' | 'info' | ( ( 'i/x' | 'info/x' ) ) ) ( ( 'mem' ) | ( 'ins' ) | ( 'dat' ) ) )
					// ../../Source/Cli.g:106:12: ( 'i' | 'info' | ( ( 'i/x' | 'info/x' ) ) ) ( ( 'mem' ) | ( 'ins' ) | ( 'dat' ) )
					{
					// ../../Source/Cli.g:106:12: ( 'i' | 'info' | ( ( 'i/x' | 'info/x' ) ) )
					int alt12=3;
					switch ( input.LA(1) ) {
					case 37:
						{
						alt12=1;
						}
						break;
					case 39:
						{
						alt12=2;
						}
						break;
					case 38:
					case 40:
						{
						alt12=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}
					switch (alt12) {
						case 1 :
							// ../../Source/Cli.g:106:13: 'i'
							{
							match(input,37,FOLLOW_37_in_info688); 
							}
							break;
						case 2 :
							// ../../Source/Cli.g:106:17: 'info'
							{
							match(input,39,FOLLOW_39_in_info690); 
							}
							break;
						case 3 :
							// ../../Source/Cli.g:106:24: ( ( 'i/x' | 'info/x' ) )
							{
							// ../../Source/Cli.g:106:24: ( ( 'i/x' | 'info/x' ) )
							// ../../Source/Cli.g:106:25: ( 'i/x' | 'info/x' )
							{
							if ( input.LA(1)==38||input.LA(1)==40 ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							format=CommandHandler.MemFormat.HEX;
							}

							}
							break;

					}

					// ../../Source/Cli.g:107:19: ( ( 'mem' ) | ( 'ins' ) | ( 'dat' ) )
					int alt13=3;
					switch ( input.LA(1) ) {
					case 45:
						{
						alt13=1;
						}
						break;
					case 41:
						{
						alt13=2;
						}
						break;
					case 29:
						{
						alt13=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// ../../Source/Cli.g:107:20: ( 'mem' )
							{
							// ../../Source/Cli.g:107:20: ( 'mem' )
							// ../../Source/Cli.g:107:21: 'mem'
							{
							match(input,45,FOLLOW_45_in_info724); 
							cmd.examineMemAll (format, CommandHandler.MemRegion.ALL);
							}

							}
							break;
						case 2 :
							// ../../Source/Cli.g:109:20: ( 'ins' )
							{
							// ../../Source/Cli.g:109:20: ( 'ins' )
							// ../../Source/Cli.g:109:21: 'ins'
							{
							match(input,41,FOLLOW_41_in_info776); 
							cmd.examineMemAll (format, CommandHandler.MemRegion.INS);
							}

							}
							break;
						case 3 :
							// ../../Source/Cli.g:111:20: ( 'dat' )
							{
							// ../../Source/Cli.g:111:20: ( 'dat' )
							// ../../Source/Cli.g:111:21: 'dat'
							{
							match(input,29,FOLLOW_29_in_info827); 
							cmd.examineMemAll (format, CommandHandler.MemRegion.DAT);
							}

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// ../../Source/Cli.g:113:17: ( ( 'i' | 'info' ) ( ( 'reg' ) | ( 'cpu' (ps= identifier )? ) ) )
					{
					// ../../Source/Cli.g:113:17: ( ( 'i' | 'info' ) ( ( 'reg' ) | ( 'cpu' (ps= identifier )? ) ) )
					// ../../Source/Cli.g:113:18: ( 'i' | 'info' ) ( ( 'reg' ) | ( 'cpu' (ps= identifier )? ) )
					{
					if ( input.LA(1)==37||input.LA(1)==39 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// ../../Source/Cli.g:114:19: ( ( 'reg' ) | ( 'cpu' (ps= identifier )? ) )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==53) ) {
						alt15=1;
					}
					else if ( (LA15_0==28) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// ../../Source/Cli.g:114:20: ( 'reg' )
							{
							// ../../Source/Cli.g:114:20: ( 'reg' )
							// ../../Source/Cli.g:114:21: 'reg'
							{
							match(input,53,FOLLOW_53_in_info903); 
							cmd.examineRegAll ();
							}

							}
							break;
						case 2 :
							// ../../Source/Cli.g:115:20: ( 'cpu' (ps= identifier )? )
							{
							// ../../Source/Cli.g:115:20: ( 'cpu' (ps= identifier )? )
							// ../../Source/Cli.g:115:21: 'cpu' (ps= identifier )?
							{
							match(input,28,FOLLOW_28_in_info930); 
							// ../../Source/Cli.g:115:29: (ps= identifier )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==Identifier||LA14_0==23||(LA14_0 >= 25 && LA14_0 <= 30)||LA14_0==32||(LA14_0 >= 34 && LA14_0 <= 37)||LA14_0==39||(LA14_0 >= 41 && LA14_0 <= 45)||(LA14_0 >= 50 && LA14_0 <= 62)) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// ../../Source/Cli.g:115:29: ps= identifier
									{
									pushFollow(FOLLOW_identifier_in_info934);
									ps=identifier();
									state._fsp--;

									}
									break;

							}

							cmd.examineProc ((ps!=null?input.toString(ps.start,ps.stop):null));
							}

							}
							break;

					}

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "info"



	// $ANTLR start "set"
	// ../../Source/Cli.g:116:1: set : ( ( register '=' val= address ) | ( 'm' addr= address '=' val= address ) | ( ( 'i' addr= address ) ( ( '=' instr0= instr ) | ( '+' instr1= instr ) | ( '-' ) ) ) );
	public final void set() throws RecognitionException {
		int val =0;
		int addr =0;
		String instr0 =null;
		String instr1 =null;
		int register6 =0;

		try {
			// ../../Source/Cli.g:116:5: ( ( register '=' val= address ) | ( 'm' addr= address '=' val= address ) | ( ( 'i' addr= address ) ( ( '=' instr0= instr ) | ( '+' instr1= instr ) | ( '-' ) ) ) )
			int alt18=3;
			switch ( input.LA(1) ) {
			case Register:
				{
				alt18=1;
				}
				break;
			case 44:
				{
				alt18=2;
				}
				break;
			case 37:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// ../../Source/Cli.g:116:7: ( register '=' val= address )
					{
					// ../../Source/Cli.g:116:7: ( register '=' val= address )
					// ../../Source/Cli.g:116:8: register '=' val= address
					{
					pushFollow(FOLLOW_register_in_set948);
					register6=register();
					state._fsp--;

					match(input,21,FOLLOW_21_in_set950); 
					pushFollow(FOLLOW_address_in_set954);
					val=address();
					state._fsp--;

					}

					 cmd.setReg (register6, val); 
					}
					break;
				case 2 :
					// ../../Source/Cli.g:118:3: ( 'm' addr= address '=' val= address )
					{
					// ../../Source/Cli.g:118:3: ( 'm' addr= address '=' val= address )
					// ../../Source/Cli.g:118:4: 'm' addr= address '=' val= address
					{
					match(input,44,FOLLOW_44_in_set968); 
					pushFollow(FOLLOW_address_in_set972);
					addr=address();
					state._fsp--;

					match(input,21,FOLLOW_21_in_set974); 
					pushFollow(FOLLOW_address_in_set978);
					val=address();
					state._fsp--;

					}

					 cmd.setMem (addr, val); 
					}
					break;
				case 3 :
					// ../../Source/Cli.g:120:3: ( ( 'i' addr= address ) ( ( '=' instr0= instr ) | ( '+' instr1= instr ) | ( '-' ) ) )
					{
					// ../../Source/Cli.g:120:3: ( ( 'i' addr= address ) ( ( '=' instr0= instr ) | ( '+' instr1= instr ) | ( '-' ) ) )
					// ../../Source/Cli.g:120:4: ( 'i' addr= address ) ( ( '=' instr0= instr ) | ( '+' instr1= instr ) | ( '-' ) )
					{
					// ../../Source/Cli.g:120:4: ( 'i' addr= address )
					// ../../Source/Cli.g:120:5: 'i' addr= address
					{
					match(input,37,FOLLOW_37_in_set993); 
					pushFollow(FOLLOW_address_in_set997);
					addr=address();
					state._fsp--;

					}

					// ../../Source/Cli.g:121:19: ( ( '=' instr0= instr ) | ( '+' instr1= instr ) | ( '-' ) )
					int alt17=3;
					switch ( input.LA(1) ) {
					case 21:
						{
						alt17=1;
						}
						break;
					case 18:
						{
						alt17=2;
						}
						break;
					case 19:
						{
						alt17=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}
					switch (alt17) {
						case 1 :
							// ../../Source/Cli.g:121:20: ( '=' instr0= instr )
							{
							// ../../Source/Cli.g:121:20: ( '=' instr0= instr )
							// ../../Source/Cli.g:121:21: '=' instr0= instr
							{
							match(input,21,FOLLOW_21_in_set1021); 
							pushFollow(FOLLOW_instr_in_set1025);
							instr0=instr();
							state._fsp--;

							cmd.setIns (addr, CommandHandler.InsOper.REPLACE, instr0);
							}

							}
							break;
						case 2 :
							// ../../Source/Cli.g:123:20: ( '+' instr1= instr )
							{
							// ../../Source/Cli.g:123:20: ( '+' instr1= instr )
							// ../../Source/Cli.g:123:21: '+' instr1= instr
							{
							match(input,18,FOLLOW_18_in_set1076); 
							pushFollow(FOLLOW_instr_in_set1080);
							instr1=instr();
							state._fsp--;

							cmd.setIns (addr, CommandHandler.InsOper.INSERT, instr1);
							}

							}
							break;
						case 3 :
							// ../../Source/Cli.g:125:20: ( '-' )
							{
							// ../../Source/Cli.g:125:20: ( '-' )
							// ../../Source/Cli.g:125:21: '-'
							{
							match(input,19,FOLLOW_19_in_set1131); 
							cmd.setIns (addr, CommandHandler.InsOper.DELETE, "");
							}

							}
							break;

					}

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "set"



	// $ANTLR start "debug"
	// ../../Source/Cli.g:127:1: debug : ( debugPoint | traceProg | clear );
	public final void debug() throws RecognitionException {
		try {
			// ../../Source/Cli.g:127:9: ( debugPoint | traceProg | clear )
			int alt19=3;
			switch ( input.LA(1) ) {
			case 25:
			case 26:
			case 46:
			case 47:
				{
				alt19=1;
				}
				break;
			case 57:
			case 59:
				{
				int LA19_2 = input.LA(2);
				if ( (LA19_2==23||LA19_2==52||LA19_2==60||LA19_2==62) ) {
					alt19=1;
				}
				else if ( (LA19_2==50) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 48:
				{
				int LA19_3 = input.LA(2);
				if ( (LA19_3==23||LA19_3==52||LA19_3==60||LA19_3==62) ) {
					alt19=1;
				}
				else if ( (LA19_3==50) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 49:
				{
				int LA19_4 = input.LA(2);
				if ( (LA19_4==23||LA19_4==52||LA19_4==60||LA19_4==62) ) {
					alt19=1;
				}
				else if ( (LA19_4==50) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 27:
				{
				alt19=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// ../../Source/Cli.g:127:17: debugPoint
					{
					pushFollow(FOLLOW_debugPoint_in_debug1176);
					debugPoint();
					state._fsp--;

					}
					break;
				case 2 :
					// ../../Source/Cli.g:127:30: traceProg
					{
					pushFollow(FOLLOW_traceProg_in_debug1180);
					traceProg();
					state._fsp--;

					}
					break;
				case 3 :
					// ../../Source/Cli.g:127:42: clear
					{
					pushFollow(FOLLOW_clear_in_debug1184);
					clear();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "debug"



	// $ANTLR start "debugPoint"
	// ../../Source/Cli.g:128:1: debugPoint : ( ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) | ( ( ( 'nob' | 'nobreak' ) ) | ( ( 'not' | 'notrace' ) ) ) ) ( 'x' (a0= address ) | ( ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) ) ) ) ;
	public final void debugPoint() throws RecognitionException {
		int a0 =0;
		int a1 =0;
		int register7 =0;

		boolean                   isEnabled=false; 
		                       CommandHandler.DebugType  type=null; 
		                       CommandHandler.DebugPoint point=null; 
		                       int                       value=0;
		try {
			// ../../Source/Cli.g:132:9: ( ( ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) | ( ( ( 'nob' | 'nobreak' ) ) | ( ( 'not' | 'notrace' ) ) ) ) ( 'x' (a0= address ) | ( ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) ) ) ) )
			// ../../Source/Cli.g:132:17: ( ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) | ( ( ( 'nob' | 'nobreak' ) ) | ( ( 'not' | 'notrace' ) ) ) ) ( 'x' (a0= address ) | ( ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) ) ) )
			{
			// ../../Source/Cli.g:132:17: ( ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) | ( ( ( 'nob' | 'nobreak' ) ) | ( ( 'not' | 'notrace' ) ) ) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= 25 && LA22_0 <= 26)||LA22_0==57||LA22_0==59) ) {
				alt22=1;
			}
			else if ( ((LA22_0 >= 46 && LA22_0 <= 49)) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// ../../Source/Cli.g:132:18: ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) )
					{
					// ../../Source/Cli.g:132:18: ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( ((LA20_0 >= 25 && LA20_0 <= 26)) ) {
						alt20=1;
					}
					else if ( (LA20_0==57||LA20_0==59) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// ../../Source/Cli.g:132:19: ( ( 'b' | 'break' ) )
							{
							// ../../Source/Cli.g:132:19: ( ( 'b' | 'break' ) )
							// ../../Source/Cli.g:132:20: ( 'b' | 'break' )
							{
							if ( (input.LA(1) >= 25 && input.LA(1) <= 26) ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							type=CommandHandler.DebugType.BREAK;
							}

							}
							break;
						case 2 :
							// ../../Source/Cli.g:133:18: ( ( 't' | 'trace' ) )
							{
							// ../../Source/Cli.g:133:18: ( ( 't' | 'trace' ) )
							// ../../Source/Cli.g:133:19: ( 't' | 'trace' )
							{
							if ( input.LA(1)==57||input.LA(1)==59 ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							type=CommandHandler.DebugType.TRACE;
							}

							}
							break;

					}

					isEnabled=true;
					}
					break;
				case 2 :
					// ../../Source/Cli.g:134:17: ( ( ( 'nob' | 'nobreak' ) ) | ( ( 'not' | 'notrace' ) ) )
					{
					// ../../Source/Cli.g:134:17: ( ( ( 'nob' | 'nobreak' ) ) | ( ( 'not' | 'notrace' ) ) )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( ((LA21_0 >= 46 && LA21_0 <= 47)) ) {
						alt21=1;
					}
					else if ( ((LA21_0 >= 48 && LA21_0 <= 49)) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// ../../Source/Cli.g:134:18: ( ( 'nob' | 'nobreak' ) )
							{
							// ../../Source/Cli.g:134:18: ( ( 'nob' | 'nobreak' ) )
							// ../../Source/Cli.g:134:19: ( 'nob' | 'nobreak' )
							{
							if ( (input.LA(1) >= 46 && input.LA(1) <= 47) ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							type=CommandHandler.DebugType.BREAK;
							}

							}
							break;
						case 2 :
							// ../../Source/Cli.g:135:18: ( ( 'not' | 'notrace' ) )
							{
							// ../../Source/Cli.g:135:18: ( ( 'not' | 'notrace' ) )
							// ../../Source/Cli.g:135:19: ( 'not' | 'notrace' )
							{
							if ( (input.LA(1) >= 48 && input.LA(1) <= 49) ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							type=CommandHandler.DebugType.TRACE;
							}

							}
							break;

					}

					isEnabled=false;
					}
					break;

			}

			// ../../Source/Cli.g:136:17: ( 'x' (a0= address ) | ( ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) ) ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==62) ) {
				alt26=1;
			}
			else if ( (LA26_0==23||LA26_0==52||LA26_0==60) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// ../../Source/Cli.g:136:18: 'x' (a0= address )
					{
					match(input,62,FOLLOW_62_in_debugPoint1345); 
					// ../../Source/Cli.g:136:22: (a0= address )
					// ../../Source/Cli.g:136:23: a0= address
					{
					pushFollow(FOLLOW_address_in_debugPoint1350);
					a0=address();
					state._fsp--;

					cmd.debugPoint (type, CommandHandler.DebugPoint.INSTRUCTION, isEnabled, a0);
					}

					}
					break;
				case 2 :
					// ../../Source/Cli.g:138:17: ( ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) ) )
					{
					// ../../Source/Cli.g:138:17: ( ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) ) )
					// ../../Source/Cli.g:138:18: ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) )
					{
					// ../../Source/Cli.g:138:18: ( ( ( 'r' | 'w' | 'a' ) (a1= address ) ) | ( ( 'r' | 'w' | 'a' ) ( register ) ) )
					int alt25=2;
					switch ( input.LA(1) ) {
					case 52:
						{
						int LA25_1 = input.LA(2);
						if ( (LA25_1==Decimal||LA25_1==Hex||LA25_1==Identifier||LA25_1==17||LA25_1==23||(LA25_1 >= 25 && LA25_1 <= 30)||LA25_1==32||(LA25_1 >= 34 && LA25_1 <= 37)||LA25_1==39||(LA25_1 >= 41 && LA25_1 <= 45)||(LA25_1 >= 50 && LA25_1 <= 62)) ) {
							alt25=1;
						}
						else if ( (LA25_1==Register) ) {
							alt25=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 25, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 60:
						{
						int LA25_2 = input.LA(2);
						if ( (LA25_2==Decimal||LA25_2==Hex||LA25_2==Identifier||LA25_2==17||LA25_2==23||(LA25_2 >= 25 && LA25_2 <= 30)||LA25_2==32||(LA25_2 >= 34 && LA25_2 <= 37)||LA25_2==39||(LA25_2 >= 41 && LA25_2 <= 45)||(LA25_2 >= 50 && LA25_2 <= 62)) ) {
							alt25=1;
						}
						else if ( (LA25_2==Register) ) {
							alt25=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 25, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 23:
						{
						int LA25_3 = input.LA(2);
						if ( (LA25_3==Decimal||LA25_3==Hex||LA25_3==Identifier||LA25_3==17||LA25_3==23||(LA25_3 >= 25 && LA25_3 <= 30)||LA25_3==32||(LA25_3 >= 34 && LA25_3 <= 37)||LA25_3==39||(LA25_3 >= 41 && LA25_3 <= 45)||(LA25_3 >= 50 && LA25_3 <= 62)) ) {
							alt25=1;
						}
						else if ( (LA25_3==Register) ) {
							alt25=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 25, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}
					switch (alt25) {
						case 1 :
							// ../../Source/Cli.g:138:19: ( ( 'r' | 'w' | 'a' ) (a1= address ) )
							{
							// ../../Source/Cli.g:138:19: ( ( 'r' | 'w' | 'a' ) (a1= address ) )
							// ../../Source/Cli.g:138:20: ( 'r' | 'w' | 'a' ) (a1= address )
							{
							// ../../Source/Cli.g:138:20: ( 'r' | 'w' | 'a' )
							int alt23=3;
							switch ( input.LA(1) ) {
							case 52:
								{
								alt23=1;
								}
								break;
							case 60:
								{
								alt23=2;
								}
								break;
							case 23:
								{
								alt23=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 23, 0, input);
								throw nvae;
							}
							switch (alt23) {
								case 1 :
									// ../../Source/Cli.g:138:21: 'r'
									{
									match(input,52,FOLLOW_52_in_debugPoint1396); 
									point=CommandHandler.DebugPoint.MEMORY_READ;
									}
									break;
								case 2 :
									// ../../Source/Cli.g:139:21: 'w'
									{
									match(input,60,FOLLOW_60_in_debugPoint1423); 
									point=CommandHandler.DebugPoint.MEMORY_WRITE;
									}
									break;
								case 3 :
									// ../../Source/Cli.g:140:21: 'a'
									{
									match(input,23,FOLLOW_23_in_debugPoint1450); 
									point=CommandHandler.DebugPoint.MEMORY_ACCESS;
									}
									break;

							}

							// ../../Source/Cli.g:140:76: (a1= address )
							// ../../Source/Cli.g:140:77: a1= address
							{
							pushFollow(FOLLOW_address_in_debugPoint1459);
							a1=address();
							state._fsp--;

							value=a1;
							}

							}

							}
							break;
						case 2 :
							// ../../Source/Cli.g:141:19: ( ( 'r' | 'w' | 'a' ) ( register ) )
							{
							// ../../Source/Cli.g:141:19: ( ( 'r' | 'w' | 'a' ) ( register ) )
							// ../../Source/Cli.g:141:20: ( 'r' | 'w' | 'a' ) ( register )
							{
							// ../../Source/Cli.g:141:20: ( 'r' | 'w' | 'a' )
							int alt24=3;
							switch ( input.LA(1) ) {
							case 52:
								{
								alt24=1;
								}
								break;
							case 60:
								{
								alt24=2;
								}
								break;
							case 23:
								{
								alt24=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 24, 0, input);
								throw nvae;
							}
							switch (alt24) {
								case 1 :
									// ../../Source/Cli.g:141:21: 'r'
									{
									match(input,52,FOLLOW_52_in_debugPoint1489); 
									point=CommandHandler.DebugPoint.REGISTER_READ;
									}
									break;
								case 2 :
									// ../../Source/Cli.g:142:21: 'w'
									{
									match(input,60,FOLLOW_60_in_debugPoint1516); 
									point=CommandHandler.DebugPoint.REGISTER_WRITE;
									}
									break;
								case 3 :
									// ../../Source/Cli.g:143:21: 'a'
									{
									match(input,23,FOLLOW_23_in_debugPoint1543); 
									point=CommandHandler.DebugPoint.REGISTER_ACCESS;
									}
									break;

							}

							// ../../Source/Cli.g:143:77: ( register )
							// ../../Source/Cli.g:143:78: register
							{
							pushFollow(FOLLOW_register_in_debugPoint1549);
							register7=register();
							state._fsp--;

							value=register7;
							}

							}

							}
							break;

					}

					cmd.debugPoint (type, point, isEnabled, value);
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "debugPoint"



	// $ANTLR start "traceProg"
	// ../../Source/Cli.g:145:1: traceProg : ( ( ( 't' | 'trace' ) ) | ( 'not' | 'notrace' ) ) 'prog' ;
	public final void traceProg() throws RecognitionException {
		boolean isEnabled=false;
		try {
			// ../../Source/Cli.g:146:9: ( ( ( ( 't' | 'trace' ) ) | ( 'not' | 'notrace' ) ) 'prog' )
			// ../../Source/Cli.g:146:17: ( ( ( 't' | 'trace' ) ) | ( 'not' | 'notrace' ) ) 'prog'
			{
			// ../../Source/Cli.g:146:17: ( ( ( 't' | 'trace' ) ) | ( 'not' | 'notrace' ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==57||LA28_0==59) ) {
				alt28=1;
			}
			else if ( ((LA28_0 >= 48 && LA28_0 <= 49)) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// ../../Source/Cli.g:146:18: ( ( 't' | 'trace' ) )
					{
					// ../../Source/Cli.g:146:18: ( ( 't' | 'trace' ) )
					// ../../Source/Cli.g:146:19: ( 't' | 'trace' )
					{
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					isEnabled=true;
					}

					}
					break;
				case 2 :
					// ../../Source/Cli.g:146:54: ( 'not' | 'notrace' )
					{
					// ../../Source/Cli.g:146:54: ( 'not' | 'notrace' )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==48) ) {
						alt27=1;
					}
					else if ( (LA27_0==49) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// ../../Source/Cli.g:146:55: 'not'
							{
							match(input,48,FOLLOW_48_in_traceProg1621); 
							}
							break;
						case 2 :
							// ../../Source/Cli.g:146:61: 'notrace'
							{
							match(input,49,FOLLOW_49_in_traceProg1623); 
							isEnabled=false;
							}
							break;

					}

					}
					break;

			}

			match(input,50,FOLLOW_50_in_traceProg1629); 
			cmd.traceProg (isEnabled);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "traceProg"



	// $ANTLR start "clear"
	// ../../Source/Cli.g:148:1: clear : 'clear' ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) ;
	public final void clear() throws RecognitionException {
		CommandHandler.DebugType type=null;
		try {
			// ../../Source/Cli.g:149:9: ( 'clear' ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) )
			// ../../Source/Cli.g:149:17: 'clear' ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) )
			{
			match(input,27,FOLLOW_27_in_clear1684); 
			// ../../Source/Cli.g:150:17: ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= 25 && LA29_0 <= 26)) ) {
				alt29=1;
			}
			else if ( (LA29_0==57||LA29_0==59) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// ../../Source/Cli.g:150:18: ( ( 'b' | 'break' ) )
					{
					// ../../Source/Cli.g:150:18: ( ( 'b' | 'break' ) )
					// ../../Source/Cli.g:150:19: ( 'b' | 'break' )
					{
					if ( (input.LA(1) >= 25 && input.LA(1) <= 26) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					type=CommandHandler.DebugType.BREAK;
					}

					}
					break;
				case 2 :
					// ../../Source/Cli.g:151:18: ( ( 't' | 'trace' ) )
					{
					// ../../Source/Cli.g:151:18: ( ( 't' | 'trace' ) )
					// ../../Source/Cli.g:151:19: ( 't' | 'trace' )
					{
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					type=CommandHandler.DebugType.TRACE;
					}

					}
					break;

			}

			cmd.clearDebugPoints (type);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "clear"



	// $ANTLR start "infoDebug"
	// ../../Source/Cli.g:153:1: infoDebug : ( 'i' | 'info' ) ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) ;
	public final void infoDebug() throws RecognitionException {
		CommandHandler.DebugType type=null;
		try {
			// ../../Source/Cli.g:154:9: ( ( 'i' | 'info' ) ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) ) )
			// ../../Source/Cli.g:154:17: ( 'i' | 'info' ) ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) )
			{
			if ( input.LA(1)==37||input.LA(1)==39 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// ../../Source/Cli.g:155:10: ( ( ( 'b' | 'break' ) ) | ( ( 't' | 'trace' ) ) )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( ((LA30_0 >= 25 && LA30_0 <= 26)) ) {
				alt30=1;
			}
			else if ( (LA30_0==57||LA30_0==59) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// ../../Source/Cli.g:155:11: ( ( 'b' | 'break' ) )
					{
					// ../../Source/Cli.g:155:11: ( ( 'b' | 'break' ) )
					// ../../Source/Cli.g:155:12: ( 'b' | 'break' )
					{
					if ( (input.LA(1) >= 25 && input.LA(1) <= 26) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					type=CommandHandler.DebugType.BREAK;
					}

					}
					break;
				case 2 :
					// ../../Source/Cli.g:156:18: ( ( 't' | 'trace' ) )
					{
					// ../../Source/Cli.g:156:18: ( ( 't' | 'trace' ) )
					// ../../Source/Cli.g:156:19: ( 't' | 'trace' )
					{
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					type=CommandHandler.DebugType.TRACE;
					}

					}
					break;

			}

			cmd.showDebugPoints (type);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "infoDebug"



	// $ANTLR start "help"
	// ../../Source/Cli.g:158:1: help : 'help' ;
	public final void help() throws RecognitionException {
		try {
			// ../../Source/Cli.g:158:7: ( 'help' )
			// ../../Source/Cli.g:158:9: 'help'
			{
			match(input,36,FOLLOW_36_in_help1866); 
			cmd.help ();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "help"



	// $ANTLR start "quit"
	// ../../Source/Cli.g:159:1: quit : 'quit' ;
	public final void quit() throws RecognitionException {
		try {
			// ../../Source/Cli.g:159:6: ( 'quit' )
			// ../../Source/Cli.g:159:8: 'quit'
			{
			match(input,51,FOLLOW_51_in_quit1876); 
			throw new QuitException ();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "quit"



	// $ANTLR start "address"
	// ../../Source/Cli.g:160:1: address returns [int value] : (a= adrAtm |b= adrAtm '+' c= address );
	public final int address() throws RecognitionException {
		int value = 0;


		int a =0;
		int b =0;
		int c =0;

		try {
			// ../../Source/Cli.g:161:9: (a= adrAtm |b= adrAtm '+' c= address )
			int alt31=2;
			switch ( input.LA(1) ) {
			case Hex:
				{
				int LA31_1 = input.LA(2);
				if ( (LA31_1==EOF||LA31_1==String||(LA31_1 >= 19 && LA31_1 <= 22)) ) {
					alt31=1;
				}
				else if ( (LA31_1==18) ) {
					int LA31_7 = input.LA(3);
					if ( (LA31_7==String) ) {
						alt31=1;
					}
					else if ( (LA31_7==Decimal||LA31_7==Hex||LA31_7==Identifier||LA31_7==17||LA31_7==23||(LA31_7 >= 25 && LA31_7 <= 30)||LA31_7==32||(LA31_7 >= 34 && LA31_7 <= 37)||LA31_7==39||(LA31_7 >= 41 && LA31_7 <= 45)||(LA31_7 >= 50 && LA31_7 <= 62)) ) {
						alt31=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Decimal:
				{
				int LA31_2 = input.LA(2);
				if ( (LA31_2==EOF||LA31_2==String||(LA31_2 >= 19 && LA31_2 <= 22)) ) {
					alt31=1;
				}
				else if ( (LA31_2==18) ) {
					int LA31_7 = input.LA(3);
					if ( (LA31_7==String) ) {
						alt31=1;
					}
					else if ( (LA31_7==Decimal||LA31_7==Hex||LA31_7==Identifier||LA31_7==17||LA31_7==23||(LA31_7 >= 25 && LA31_7 <= 30)||LA31_7==32||(LA31_7 >= 34 && LA31_7 <= 37)||LA31_7==39||(LA31_7 >= 41 && LA31_7 <= 45)||(LA31_7 >= 50 && LA31_7 <= 62)) ) {
						alt31=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA31_3 = input.LA(2);
				if ( (LA31_3==EOF||LA31_3==String||(LA31_3 >= 19 && LA31_3 <= 22)) ) {
					alt31=1;
				}
				else if ( (LA31_3==18) ) {
					int LA31_7 = input.LA(3);
					if ( (LA31_7==String) ) {
						alt31=1;
					}
					else if ( (LA31_7==Decimal||LA31_7==Hex||LA31_7==Identifier||LA31_7==17||LA31_7==23||(LA31_7 >= 25 && LA31_7 <= 30)||LA31_7==32||(LA31_7 >= 34 && LA31_7 <= 37)||LA31_7==39||(LA31_7 >= 41 && LA31_7 <= 45)||(LA31_7 >= 50 && LA31_7 <= 62)) ) {
						alt31=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 23:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 32:
			case 34:
			case 35:
			case 36:
			case 37:
			case 39:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
				{
				int LA31_4 = input.LA(2);
				if ( (LA31_4==EOF||LA31_4==String||(LA31_4 >= 19 && LA31_4 <= 22)) ) {
					alt31=1;
				}
				else if ( (LA31_4==18) ) {
					int LA31_7 = input.LA(3);
					if ( (LA31_7==String) ) {
						alt31=1;
					}
					else if ( (LA31_7==Decimal||LA31_7==Hex||LA31_7==Identifier||LA31_7==17||LA31_7==23||(LA31_7 >= 25 && LA31_7 <= 30)||LA31_7==32||(LA31_7 >= 34 && LA31_7 <= 37)||LA31_7==39||(LA31_7 >= 41 && LA31_7 <= 45)||(LA31_7 >= 50 && LA31_7 <= 62)) ) {
						alt31=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 17:
				{
				int LA31_5 = input.LA(2);
				if ( (LA31_5==Identifier) ) {
					int LA31_8 = input.LA(3);
					if ( (LA31_8==EOF||LA31_8==String||(LA31_8 >= 19 && LA31_8 <= 22)) ) {
						alt31=1;
					}
					else if ( (LA31_8==18) ) {
						int LA31_7 = input.LA(4);
						if ( (LA31_7==String) ) {
							alt31=1;
						}
						else if ( (LA31_7==Decimal||LA31_7==Hex||LA31_7==Identifier||LA31_7==17||LA31_7==23||(LA31_7 >= 25 && LA31_7 <= 30)||LA31_7==32||(LA31_7 >= 34 && LA31_7 <= 37)||LA31_7==39||(LA31_7 >= 41 && LA31_7 <= 45)||(LA31_7 >= 50 && LA31_7 <= 62)) ) {
							alt31=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA31_5==23||(LA31_5 >= 25 && LA31_5 <= 30)||LA31_5==32||(LA31_5 >= 34 && LA31_5 <= 37)||LA31_5==39||(LA31_5 >= 41 && LA31_5 <= 45)||(LA31_5 >= 50 && LA31_5 <= 62)) ) {
					int LA31_9 = input.LA(3);
					if ( (LA31_9==EOF||LA31_9==String||(LA31_9 >= 19 && LA31_9 <= 22)) ) {
						alt31=1;
					}
					else if ( (LA31_9==18) ) {
						int LA31_7 = input.LA(4);
						if ( (LA31_7==String) ) {
							alt31=1;
						}
						else if ( (LA31_7==Decimal||LA31_7==Hex||LA31_7==Identifier||LA31_7==17||LA31_7==23||(LA31_7 >= 25 && LA31_7 <= 30)||LA31_7==32||(LA31_7 >= 34 && LA31_7 <= 37)||LA31_7==39||(LA31_7 >= 41 && LA31_7 <= 45)||(LA31_7 >= 50 && LA31_7 <= 62)) ) {
							alt31=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// ../../Source/Cli.g:161:15: a= adrAtm
					{
					pushFollow(FOLLOW_adrAtm_in_address1904);
					a=adrAtm();
					state._fsp--;

					value =a;
					}
					break;
				case 2 :
					// ../../Source/Cli.g:163:15: b= adrAtm '+' c= address
					{
					pushFollow(FOLLOW_adrAtm_in_address1952);
					b=adrAtm();
					state._fsp--;

					match(input,18,FOLLOW_18_in_address1954); 
					pushFollow(FOLLOW_address_in_address1958);
					c=address();
					state._fsp--;

					value =b+c;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "address"



	// $ANTLR start "adrAtm"
	// ../../Source/Cli.g:165:1: adrAtm returns [int value] : ( number | identifier | '*' identifier );
	public final int adrAtm() throws RecognitionException {
		int value = 0;


		int number8 =0;
		ParserRuleReturnScope identifier9 =null;
		ParserRuleReturnScope identifier10 =null;

		try {
			// ../../Source/Cli.g:166:9: ( number | identifier | '*' identifier )
			int alt32=3;
			switch ( input.LA(1) ) {
			case Decimal:
			case Hex:
				{
				alt32=1;
				}
				break;
			case Identifier:
			case 23:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 32:
			case 34:
			case 35:
			case 36:
			case 37:
			case 39:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
				{
				alt32=2;
				}
				break;
			case 17:
				{
				alt32=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// ../../Source/Cli.g:166:17: number
					{
					pushFollow(FOLLOW_number_in_adrAtm2010);
					number8=number();
					state._fsp--;

					value =number8;
					}
					break;
				case 2 :
					// ../../Source/Cli.g:167:10: identifier
					{
					pushFollow(FOLLOW_identifier_in_adrAtm2026);
					identifier9=identifier();
					state._fsp--;

					value =cmd.getLabelValue ((identifier9!=null?input.toString(identifier9.start,identifier9.stop):null));
					}
					break;
				case 3 :
					// ../../Source/Cli.g:168:10: '*' identifier
					{
					match(input,17,FOLLOW_17_in_adrAtm2042); 
					pushFollow(FOLLOW_identifier_in_adrAtm2044);
					identifier10=identifier();
					state._fsp--;

					value =cmd.getMemValue (cmd.getLabelValue ((identifier10!=null?input.toString(identifier10.start,identifier10.stop):null)));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "adrAtm"



	// $ANTLR start "number"
	// ../../Source/Cli.g:169:1: number returns [int value] : ( Hex | Decimal );
	public final int number() throws RecognitionException {
		int value = 0;


		Token Hex11=null;
		Token Decimal12=null;

		try {
			// ../../Source/Cli.g:170:2: ( Hex | Decimal )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==Hex) ) {
				alt33=1;
			}
			else if ( (LA33_0==Decimal) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// ../../Source/Cli.g:170:4: Hex
					{
					Hex11=(Token)match(input,Hex,FOLLOW_Hex_in_number2058); 
					 value =(int)(Long.parseLong((Hex11!=null?Hex11.getText():null).substring(2),16)); 
					}
					break;
				case 2 :
					// ../../Source/Cli.g:172:3: Decimal
					{
					Decimal12=(Token)match(input,Decimal,FOLLOW_Decimal_in_number2071); 
					 value =Integer.parseInt((Decimal12!=null?Decimal12.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "number"



	// $ANTLR start "instr"
	// ../../Source/Cli.g:174:1: instr returns [String value] : string ;
	public final String instr() throws RecognitionException {
		String value = null;


		String string13 =null;

		try {
			// ../../Source/Cli.g:175:9: ( string )
			// ../../Source/Cli.g:175:11: string
			{
			pushFollow(FOLLOW_string_in_instr2096);
			string13=string();
			state._fsp--;

			value =string13;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "instr"



	// $ANTLR start "register"
	// ../../Source/Cli.g:177:1: register returns [int value] : r= Register ;
	public final int register() throws RecognitionException {
		int value = 0;


		Token r=null;

		try {
			// ../../Source/Cli.g:178:2: (r= Register )
			// ../../Source/Cli.g:178:4: r= Register
			{
			r=(Token)match(input,Register,FOLLOW_Register_in_register2136); 
			value = cmd.getRegisterNumber ((r!=null?r.getText():null)!=null?(r!=null?r.getText():null).substring(1,(r!=null?r.getText():null).length()):null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "register"



	// $ANTLR start "cpuReg"
	// ../../Source/Cli.g:179:1: cpuReg returns [String value] : r= CpuReg ;
	public final String cpuReg() throws RecognitionException {
		String value = null;


		Token r=null;

		try {
			// ../../Source/Cli.g:180:2: (r= CpuReg )
			// ../../Source/Cli.g:180:10: r= CpuReg
			{
			r=(Token)match(input,CpuReg,FOLLOW_CpuReg_in_cpuReg2158); 
			value = (r!=null?r.getText():null)!=null?(r!=null?r.getText():null).substring(1,(r!=null?r.getText():null).length()):null;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "cpuReg"


	public static class filename_return extends ParserRuleReturnScope {
		public String value;
	};


	// $ANTLR start "filename"
	// ../../Source/Cli.g:181:1: filename returns [String value] : (a= string |b= identifier );
	public final CliParser.filename_return filename() throws RecognitionException {
		CliParser.filename_return retval = new CliParser.filename_return();
		retval.start = input.LT(1);

		String a =null;
		ParserRuleReturnScope b =null;

		try {
			// ../../Source/Cli.g:182:2: (a= string |b= identifier )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==String) ) {
				alt34=1;
			}
			else if ( (LA34_0==Identifier||LA34_0==23||(LA34_0 >= 25 && LA34_0 <= 30)||LA34_0==32||(LA34_0 >= 34 && LA34_0 <= 37)||LA34_0==39||(LA34_0 >= 41 && LA34_0 <= 45)||(LA34_0 >= 50 && LA34_0 <= 62)) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// ../../Source/Cli.g:182:4: a= string
					{
					pushFollow(FOLLOW_string_in_filename2174);
					a=string();
					state._fsp--;

					retval.value =a;
					}
					break;
				case 2 :
					// ../../Source/Cli.g:182:34: b= identifier
					{
					pushFollow(FOLLOW_identifier_in_filename2182);
					b=identifier();
					state._fsp--;

					retval.value =(b!=null?input.toString(b.start,b.stop):null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filename"


	public static class identifier_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "identifier"
	// ../../Source/Cli.g:183:1: identifier : ( Identifier | keyword );
	public final CliParser.identifier_return identifier() throws RecognitionException {
		CliParser.identifier_return retval = new CliParser.identifier_return();
		retval.start = input.LT(1);

		try {
			// ../../Source/Cli.g:184:2: ( Identifier | keyword )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Identifier) ) {
				alt35=1;
			}
			else if ( (LA35_0==23||(LA35_0 >= 25 && LA35_0 <= 30)||LA35_0==32||(LA35_0 >= 34 && LA35_0 <= 37)||LA35_0==39||(LA35_0 >= 41 && LA35_0 <= 45)||(LA35_0 >= 50 && LA35_0 <= 62)) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// ../../Source/Cli.g:184:4: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_identifier2192); 
					}
					break;
				case 2 :
					// ../../Source/Cli.g:184:17: keyword
					{
					pushFollow(FOLLOW_keyword_in_identifier2196);
					keyword();
					state._fsp--;

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"



	// $ANTLR start "string"
	// ../../Source/Cli.g:185:1: string returns [String value] : String ;
	public final String string() throws RecognitionException {
		String value = null;


		Token String14=null;

		try {
			// ../../Source/Cli.g:186:9: ( String )
			// ../../Source/Cli.g:186:17: String
			{
			String14=(Token)match(input,String,FOLLOW_String_in_string2221); 
			value =(String14!=null?String14.getText():null).substring (1, (String14!=null?String14.getText():null).length()-1);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "string"

	// Delegated rules



	public static final BitSet FOLLOW_load_in_command41 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_test_in_command45 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_run_in_command49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_step_in_command53 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_where_in_command57 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_gotoPC_in_command61 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_examine_in_command65 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_assertCmd_in_command69 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_info_in_command73 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_set_in_command77 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_debug_in_command81 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_infoDebug_in_command85 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_quit_in_command89 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_help_in_command93 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_command96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_load174 = new BitSet(new long[]{0x7FFC3EBD7E809000L});
	public static final BitSet FOLLOW_filename_in_load182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_test205 = new BitSet(new long[]{0x7FFC3EBD7E809000L});
	public static final BitSet FOLLOW_filename_in_test208 = new BitSet(new long[]{0x7FFC3EBD7E801002L});
	public static final BitSet FOLLOW_identifier_in_test213 = new BitSet(new long[]{0x7FFC3EBD7E801002L});
	public static final BitSet FOLLOW_identifier_in_test217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_run253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_step270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_where290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_gotoPC308 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_gotoPC316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_examine354 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_32_in_examine356 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_set_in_examine359 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_examine392 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_examine395 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_number_in_examine399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_examine430 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_register_in_examine456 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_examine459 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_number_in_examine463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_examine480 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_cpuReg_in_examine492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_assertCmd512 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_assertCmd522 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_assertCmd524 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_assertCmd528 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_string_in_assertCmd532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_assertCmd557 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_register_in_assertCmd565 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_assertCmd567 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_assertCmd571 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_string_in_assertCmd575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_assertCmd600 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_cpuReg_in_assertCmd608 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_assertCmd610 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_assertCmd614 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_string_in_assertCmd618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_assertCmd643 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_string_in_assertCmd653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_info688 = new BitSet(new long[]{0x0000220020000000L});
	public static final BitSet FOLLOW_39_in_info690 = new BitSet(new long[]{0x0000220020000000L});
	public static final BitSet FOLLOW_set_in_info693 = new BitSet(new long[]{0x0000220020000000L});
	public static final BitSet FOLLOW_45_in_info724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_info776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_info827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_info877 = new BitSet(new long[]{0x0020000010000000L});
	public static final BitSet FOLLOW_53_in_info903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_info930 = new BitSet(new long[]{0x7FFC3EBD7E801002L});
	public static final BitSet FOLLOW_identifier_in_info934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_register_in_set948 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_set950 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_set954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_set968 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_set972 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_set974 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_set978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_set993 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_set997 = new BitSet(new long[]{0x00000000002C0000L});
	public static final BitSet FOLLOW_21_in_set1021 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_instr_in_set1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_set1076 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_instr_in_set1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_set1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_debugPoint_in_debug1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_traceProg_in_debug1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_clear_in_debug1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_debugPoint1218 = new BitSet(new long[]{0x5010000000800000L});
	public static final BitSet FOLLOW_set_in_debugPoint1250 = new BitSet(new long[]{0x5010000000800000L});
	public static final BitSet FOLLOW_set_in_debugPoint1286 = new BitSet(new long[]{0x5010000000800000L});
	public static final BitSet FOLLOW_set_in_debugPoint1315 = new BitSet(new long[]{0x5010000000800000L});
	public static final BitSet FOLLOW_62_in_debugPoint1345 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_debugPoint1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_debugPoint1396 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_60_in_debugPoint1423 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_23_in_debugPoint1450 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_debugPoint1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_debugPoint1489 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_60_in_debugPoint1516 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_23_in_debugPoint1543 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_register_in_debugPoint1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_traceProg1609 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_48_in_traceProg1621 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_49_in_traceProg1623 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_traceProg1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_clear1684 = new BitSet(new long[]{0x0A00000006000000L});
	public static final BitSet FOLLOW_set_in_clear1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_clear1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_infoDebug1786 = new BitSet(new long[]{0x0A00000006000000L});
	public static final BitSet FOLLOW_set_in_infoDebug1803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_infoDebug1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_help1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_quit1876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_adrAtm_in_address1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_adrAtm_in_address1952 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_address1954 = new BitSet(new long[]{0x7FFC3EBD7E821480L});
	public static final BitSet FOLLOW_address_in_address1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_adrAtm2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_adrAtm2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_adrAtm2042 = new BitSet(new long[]{0x7FFC3EBD7E801000L});
	public static final BitSet FOLLOW_identifier_in_adrAtm2044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hex_in_number2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Decimal_in_number2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_instr2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Register_in_register2136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CpuReg_in_cpuReg2158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_filename2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_filename2182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifier2192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyword_in_identifier2196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_string2221 = new BitSet(new long[]{0x0000000000000002L});
}
