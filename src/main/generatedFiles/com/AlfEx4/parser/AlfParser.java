// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx4.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, SEMICOLON=3, L_PARENTHESIS=4, R_PARENTHESIS=5, INT=6, 
		MUL=7, DIV=8, PLUS=9, MINUS=10, MOD=11, VARIABLE_NAME=12;
	public static final int
		RULE_start = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "SEMICOLON", "L_PARENTHESIS", "R_PARENTHESIS", 
			"INT", "MUL", "DIV", "PLUS", "MINUS", "MOD", "VARIABLE_NAME"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public TerminalNode L_PARENTHESIS() { return getToken(AlfParser.L_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(AlfParser.R_PARENTHESIS, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(AlfParser.VARIABLE_NAME, 0); }
		public TerminalNode INT() { return getToken(AlfParser.INT, 0); }
		public TerminalNode MUL() { return getToken(AlfParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AlfParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(AlfParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AlfParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTHESIS:
				{
				setState(7);
				match(L_PARENTHESIS);
				setState(8);
				expression(0);
				setState(9);
				match(R_PARENTHESIS);
				}
				break;
			case VARIABLE_NAME:
				{
				setState(11);
				match(VARIABLE_NAME);
				}
				break;
			case INT:
				{
				setState(12);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(15);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(16);
						((ExpressionContext)_localctx).op = match(MUL);
						setState(17);
						((ExpressionContext)_localctx).right = expression(8);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(20);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(21);
						((ExpressionContext)_localctx).op = match(DIV);
						setState(22);
						((ExpressionContext)_localctx).right = expression(7);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(25);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(26);
						((ExpressionContext)_localctx).op = match(PLUS);
						setState(27);
						((ExpressionContext)_localctx).right = expression(6);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(30);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(31);
						((ExpressionContext)_localctx).op = match(MINUS);
						setState(32);
						((ExpressionContext)_localctx).right = expression(5);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						((ExpressionContext)_localctx).op = match(MINUS);
						setState(37);
						((ExpressionContext)_localctx).right = expression(4);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u000e\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001\u0001\u0000\u0001\u0002"+
		"\u0002\u0000\u0002\u0000\u00002\u0000\u0004\u0001\u0000\u0000\u0000\u0002"+
		"\r\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0001"+
		"\u0001\u0000\u0000\u0000\u0006\u0007\u0006\u0001\uffff\uffff\u0000\u0007"+
		"\b\u0005\u0004\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0005"+
		"\u0000\u0000\n\u000e\u0001\u0000\u0000\u0000\u000b\u000e\u0005\f\u0000"+
		"\u0000\f\u000e\u0005\u0006\u0000\u0000\r\u0006\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\r\f\u0001\u0000\u0000\u0000\u000e*\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\n\u0007\u0000\u0000\u0010\u0011\u0005\u0007"+
		"\u0000\u0000\u0011\u0012\u0003\u0002\u0001\b\u0012\u0013\u0006\u0001\uffff"+
		"\uffff\u0000\u0013)\u0001\u0000\u0000\u0000\u0014\u0015\n\u0006\u0000"+
		"\u0000\u0015\u0016\u0005\b\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0007"+
		"\u0017\u0018\u0006\u0001\uffff\uffff\u0000\u0018)\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\n\u0005\u0000\u0000\u001a\u001b\u0005\t\u0000\u0000\u001b"+
		"\u001c\u0003\u0002\u0001\u0006\u001c\u001d\u0006\u0001\uffff\uffff\u0000"+
		"\u001d)\u0001\u0000\u0000\u0000\u001e\u001f\n\u0004\u0000\u0000\u001f"+
		" \u0005\n\u0000\u0000 !\u0003\u0002\u0001\u0005!\"\u0006\u0001\uffff\uffff"+
		"\u0000\")\u0001\u0000\u0000\u0000#$\n\u0003\u0000\u0000$%\u0005\n\u0000"+
		"\u0000%&\u0003\u0002\u0001\u0004&\'\u0006\u0001\uffff\uffff\u0000\')\u0001"+
		"\u0000\u0000\u0000(\u000f\u0001\u0000\u0000\u0000(\u0014\u0001\u0000\u0000"+
		"\u0000(\u0019\u0001\u0000\u0000\u0000(\u001e\u0001\u0000\u0000\u0000("+
		"#\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000\u0003\r(*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}