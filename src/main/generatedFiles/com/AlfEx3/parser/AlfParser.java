// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx3.parser;
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
		WS=1, NEWLINE=2, SEMICOLON=3, INT=4, MUL=5, DIV=6, PLUS=7, MINUS=8, MOD=9, 
		VARIABLE_NAME=10;
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
			null, "WS", "NEWLINE", "SEMICOLON", "INT", "MUL", "DIV", "PLUS", "MINUS", 
			"MOD", "VARIABLE_NAME"
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
		public TerminalNode SEMICOLON() { return getToken(AlfParser.SEMICOLON, 0); }
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
			setState(5);
			match(SEMICOLON);
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
		public TerminalNode VARIABLE_NAME() { return getToken(AlfParser.VARIABLE_NAME, 0); }
		public TerminalNode INT() { return getToken(AlfParser.INT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
			setState(10);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_NAME:
				{
				setState(8);
				match(VARIABLE_NAME);
				}
				break;
			case INT:
				{
				setState(9);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(12);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(13);
						((ExpressionContext)_localctx).op = match(MUL);
						setState(14);
						((ExpressionContext)_localctx).right = expression(8);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(17);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(18);
						((ExpressionContext)_localctx).op = match(DIV);
						setState(19);
						((ExpressionContext)_localctx).right = expression(7);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(22);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(23);
						((ExpressionContext)_localctx).op = match(PLUS);
						setState(24);
						((ExpressionContext)_localctx).right = expression(6);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(27);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(28);
						((ExpressionContext)_localctx).op = match(MINUS);
						setState(29);
						((ExpressionContext)_localctx).right = expression(5);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						((ExpressionContext)_localctx).op = match(MINUS);
						setState(34);
						((ExpressionContext)_localctx).right = expression(4);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					}
					} 
				}
				setState(41);
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
		"\u0004\u0001\n+\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u000b\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t"+
		"\u0001\u0001\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0000.\u0000"+
		"\u0004\u0001\u0000\u0000\u0000\u0002\n\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0003\u0000\u0000\u0006\u0001"+
		"\u0001\u0000\u0000\u0000\u0007\b\u0006\u0001\uffff\uffff\u0000\b\u000b"+
		"\u0005\n\u0000\u0000\t\u000b\u0005\u0004\u0000\u0000\n\u0007\u0001\u0000"+
		"\u0000\u0000\n\t\u0001\u0000\u0000\u0000\u000b\'\u0001\u0000\u0000\u0000"+
		"\f\r\n\u0007\u0000\u0000\r\u000e\u0005\u0005\u0000\u0000\u000e\u000f\u0003"+
		"\u0002\u0001\b\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010&\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\n\u0006\u0000\u0000\u0012\u0013\u0005\u0006"+
		"\u0000\u0000\u0013\u0014\u0003\u0002\u0001\u0007\u0014\u0015\u0006\u0001"+
		"\uffff\uffff\u0000\u0015&\u0001\u0000\u0000\u0000\u0016\u0017\n\u0005"+
		"\u0000\u0000\u0017\u0018\u0005\u0007\u0000\u0000\u0018\u0019\u0003\u0002"+
		"\u0001\u0006\u0019\u001a\u0006\u0001\uffff\uffff\u0000\u001a&\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\n\u0004\u0000\u0000\u001c\u001d\u0005\b\u0000"+
		"\u0000\u001d\u001e\u0003\u0002\u0001\u0005\u001e\u001f\u0006\u0001\uffff"+
		"\uffff\u0000\u001f&\u0001\u0000\u0000\u0000 !\n\u0003\u0000\u0000!\"\u0005"+
		"\b\u0000\u0000\"#\u0003\u0002\u0001\u0004#$\u0006\u0001\uffff\uffff\u0000"+
		"$&\u0001\u0000\u0000\u0000%\f\u0001\u0000\u0000\u0000%\u0011\u0001\u0000"+
		"\u0000\u0000%\u0016\u0001\u0000\u0000\u0000%\u001b\u0001\u0000\u0000\u0000"+
		"% \u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000\u0003\n%\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}