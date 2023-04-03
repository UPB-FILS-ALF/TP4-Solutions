// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx6.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, NEWLINE=6, SEMICOLON=7, L_PARENTHESIS=8, 
		R_PARENTHESIS=9, EQUALS=10, INT=11, MUL=12, DIV=13, PLUS=14, MINUS=15, 
		MOD=16, BOOLEAN_VALUE=17, INT_VALUE=18, FLOAT_VALUE=19, STRING_VALUE=20, 
		VARIABLE_NAME=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "WS", "NEWLINE", "SEMICOLON", "L_PARENTHESIS", 
			"R_PARENTHESIS", "EQUALS", "INT", "MUL", "DIV", "PLUS", "MINUS", "MOD", 
			"BOOLEAN_VALUE", "INT_VALUE", "FLOAT_VALUE", "STRING_VALUE", "VARIABLE_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'String '", "'boolean '", "'int'", "'float'", null, null, null, 
			null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WS", "NEWLINE", "SEMICOLON", "L_PARENTHESIS", 
			"R_PARENTHESIS", "EQUALS", "INT", "MUL", "DIV", "PLUS", "MINUS", "MOD", 
			"BOOLEAN_VALUE", "INT_VALUE", "FLOAT_VALUE", "STRING_VALUE", "VARIABLE_NAME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004H\b\u0004"+
		"\u000b\u0004\f\u0004I\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005"+
		"O\b\u0005\u000b\u0005\f\u0005P\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n\\\b\n\u000b\n\f"+
		"\n]\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010s\b\u0010\u0001\u0011\u0004\u0011v\b\u0011\u000b\u0011\f\u0011"+
		"w\u0001\u0012\u0004\u0012{\b\u0012\u000b\u0012\f\u0012|\u0001\u0012\u0001"+
		"\u0012\u0004\u0012\u0081\b\u0012\u000b\u0012\f\u0012\u0082\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u0087\b\u0013\u000b\u0013\f\u0013\u0088\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u008e\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u0092\b\u0014\u000b\u0014\f\u0014\u0093\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0005\u0002\u0000  \'\'\u0002\u0000\n\n\r\r\u0001\u000009\u0003\u0000"+
		"09AZaz\u0002\u0000AZaz\u009e\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u00033"+
		"\u0001\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000\u0007@\u0001\u0000"+
		"\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bN\u0001\u0000\u0000\u0000"+
		"\rR\u0001\u0000\u0000\u0000\u000fT\u0001\u0000\u0000\u0000\u0011V\u0001"+
		"\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000"+
		"\u0000\u0017_\u0001\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001b"+
		"c\u0001\u0000\u0000\u0000\u001de\u0001\u0000\u0000\u0000\u001fg\u0001"+
		"\u0000\u0000\u0000!r\u0001\u0000\u0000\u0000#u\u0001\u0000\u0000\u0000"+
		"%z\u0001\u0000\u0000\u0000\'\u0084\u0001\u0000\u0000\u0000)\u008d\u0001"+
		"\u0000\u0000\u0000+,\u0005S\u0000\u0000,-\u0005t\u0000\u0000-.\u0005r"+
		"\u0000\u0000./\u0005i\u0000\u0000/0\u0005n\u0000\u000001\u0005g\u0000"+
		"\u000012\u0005 \u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005b\u0000"+
		"\u000045\u0005o\u0000\u000056\u0005o\u0000\u000067\u0005l\u0000\u0000"+
		"78\u0005e\u0000\u000089\u0005a\u0000\u00009:\u0005n\u0000\u0000:;\u0005"+
		" \u0000\u0000;\u0004\u0001\u0000\u0000\u0000<=\u0005i\u0000\u0000=>\u0005"+
		"n\u0000\u0000>?\u0005t\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005"+
		"f\u0000\u0000AB\u0005l\u0000\u0000BC\u0005o\u0000\u0000CD\u0005a\u0000"+
		"\u0000DE\u0005t\u0000\u0000E\b\u0001\u0000\u0000\u0000FH\u0007\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0006"+
		"\u0004\u0000\u0000L\n\u0001\u0000\u0000\u0000MO\u0007\u0001\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005;\u0000"+
		"\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005(\u0000\u0000U\u0010\u0001"+
		"\u0000\u0000\u0000VW\u0005)\u0000\u0000W\u0012\u0001\u0000\u0000\u0000"+
		"XY\u0005=\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z\\\u0007\u0002\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0016\u0001\u0000\u0000\u0000"+
		"_`\u0005*\u0000\u0000`\u0018\u0001\u0000\u0000\u0000ab\u0005/\u0000\u0000"+
		"b\u001a\u0001\u0000\u0000\u0000cd\u0005+\u0000\u0000d\u001c\u0001\u0000"+
		"\u0000\u0000ef\u0005-\u0000\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0005"+
		"%\u0000\u0000h \u0001\u0000\u0000\u0000ij\u0005t\u0000\u0000jk\u0005r"+
		"\u0000\u0000kl\u0005u\u0000\u0000ls\u0005e\u0000\u0000mn\u0005f\u0000"+
		"\u0000no\u0005a\u0000\u0000op\u0005l\u0000\u0000pq\u0005s\u0000\u0000"+
		"qs\u0005e\u0000\u0000ri\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000"+
		"s\"\u0001\u0000\u0000\u0000tv\u0007\u0002\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x$\u0001\u0000\u0000\u0000y{\u0007\u0002\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0005.\u0000"+
		"\u0000\u007f\u0081\u0007\u0002\u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083&\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0005\"\u0000\u0000\u0085\u0087\u0007\u0003\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\"\u0000\u0000\u008b("+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0005_\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0007\u0004\u0000\u0000\u0090\u0092\u0007"+
		"\u0003\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094*\u0001\u0000\u0000\u0000\u000b\u0000IP]rw|\u0082"+
		"\u0088\u008d\u0093\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}