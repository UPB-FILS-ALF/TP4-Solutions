// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx1.parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, VARIABLE=7, EQUALS=8, BOOLEAN_VALUE=9, 
		INT_VALUE=10, FLOAT_VALUE=11, STRING_VALUE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "VARIABLE", "EQUALS", "BOOLEAN_VALUE", 
			"INT_VALUE", "FLOAT_VALUE", "STRING_VALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'String '", "'boolean '", "'int'", "'float'", null, null, 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "VARIABLE", "EQUALS", "BOOLEAN_VALUE", 
			"INT_VALUE", "FLOAT_VALUE", "STRING_VALUE"
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
		"\u0004\u0000\fk\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0004\u00058\b\u0005\u000b\u0005\f\u00059\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0003\u0006?\b\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006C\b\u0006\u000b\u0006\f\u0006D\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bR\b"+
		"\b\u0001\t\u0004\tU\b\t\u000b\t\f\tV\u0001\n\u0004\nZ\b\n\u000b\n\f\n"+
		"[\u0001\n\u0001\n\u0004\n`\b\n\u000b\n\f\na\u0001\u000b\u0001\u000b\u0004"+
		"\u000bf\b\u000b\u000b\u000b\f\u000bg\u0001\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0004"+
		"\u0003\u0000\n\n  \'\'\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u00000"+
		"9r\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019"+
		"\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005#\u0001"+
		"\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000"+
		"\u0000\u000b7\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000\u0000\u000f"+
		"F\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013T\u0001"+
		"\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005;\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005S\u0000\u0000\u001c\u001d\u0005t\u0000\u0000\u001d\u001e"+
		"\u0005r\u0000\u0000\u001e\u001f\u0005i\u0000\u0000\u001f \u0005n\u0000"+
		"\u0000 !\u0005g\u0000\u0000!\"\u0005 \u0000\u0000\"\u0004\u0001\u0000"+
		"\u0000\u0000#$\u0005b\u0000\u0000$%\u0005o\u0000\u0000%&\u0005o\u0000"+
		"\u0000&\'\u0005l\u0000\u0000\'(\u0005e\u0000\u0000()\u0005a\u0000\u0000"+
		")*\u0005n\u0000\u0000*+\u0005 \u0000\u0000+\u0006\u0001\u0000\u0000\u0000"+
		",-\u0005i\u0000\u0000-.\u0005n\u0000\u0000./\u0005t\u0000\u0000/\b\u0001"+
		"\u0000\u0000\u000001\u0005f\u0000\u000012\u0005l\u0000\u000023\u0005o"+
		"\u0000\u000034\u0005a\u0000\u000045\u0005t\u0000\u00005\n\u0001\u0000"+
		"\u0000\u000068\u0007\u0000\u0000\u000076\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0006\u0005\u0000\u0000<\f\u0001\u0000\u0000"+
		"\u0000=?\u0005_\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@B\u0007\u0001\u0000\u0000AC\u0007\u0002"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u000e\u0001\u0000\u0000"+
		"\u0000FG\u0005=\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005t\u0000"+
		"\u0000IJ\u0005r\u0000\u0000JK\u0005u\u0000\u0000KR\u0005e\u0000\u0000"+
		"LM\u0005f\u0000\u0000MN\u0005a\u0000\u0000NO\u0005l\u0000\u0000OP\u0005"+
		"s\u0000\u0000PR\u0005e\u0000\u0000QH\u0001\u0000\u0000\u0000QL\u0001\u0000"+
		"\u0000\u0000R\u0012\u0001\u0000\u0000\u0000SU\u0007\u0003\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XZ\u0007"+
		"\u0003\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]_\u0005.\u0000\u0000^`\u0007\u0003\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0016\u0001\u0000\u0000\u0000ce\u0005\"\u0000\u0000df\u0007"+
		"\u0002\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0005\"\u0000\u0000j\u0018\u0001\u0000\u0000\u0000\t\u00009>"+
		"DQV[ag\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}