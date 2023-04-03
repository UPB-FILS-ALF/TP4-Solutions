// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx6.parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, NEWLINE=6, SEMICOLON=7, L_PARENTHESIS=8, 
		R_PARENTHESIS=9, EQUALS=10, INT=11, MUL=12, DIV=13, PLUS=14, MINUS=15, 
		MOD=16, BOOLEAN_VALUE=17, INT_VALUE=18, FLOAT_VALUE=19, STRING_VALUE=20, 
		VARIABLE_NAME=21;
	public static final int
		RULE_start = 0, RULE_declaration = 1, RULE_type = 2, RULE_value = 3, RULE_expression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaration", "type", "value", "expression"
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
		public List<TerminalNode> SEMICOLON() { return getTokens(AlfParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AlfParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AlfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AlfParser.NEWLINE, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_PARENTHESIS:
				case INT:
				case VARIABLE_NAME:
					{
					setState(10);
					expression(0);
					}
					break;
				case T__0:
				case T__1:
				case T__2:
				case T__3:
					{
					setState(11);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(14);
				match(SEMICOLON);
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(15);
					match(NEWLINE);
					}
				}

				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2099486L) != 0 );
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(AlfParser.VARIABLE_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(AlfParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			type();
			setState(23);
			match(VARIABLE_NAME);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(24);
				match(EQUALS);
				setState(25);
				value();
				}
			}

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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(AlfParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(AlfParser.INT_VALUE, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(AlfParser.FLOAT_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(AlfParser.BOOLEAN_VALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(STRING_VALUE);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(INT_VALUE);
				}
				break;
			case FLOAT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(FLOAT_VALUE);
				}
				break;
			case BOOLEAN_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(BOOLEAN_VALUE);
				}
				break;
			case L_PARENTHESIS:
			case INT:
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTHESIS:
				{
				setState(38);
				match(L_PARENTHESIS);
				setState(39);
				expression(0);
				setState(40);
				match(R_PARENTHESIS);
				}
				break;
			case VARIABLE_NAME:
				{
				setState(42);
				match(VARIABLE_NAME);
				}
				break;
			case INT:
				{
				setState(43);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(47);
						((ExpressionContext)_localctx).op = match(MUL);
						setState(48);
						((ExpressionContext)_localctx).right = expression(8);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(52);
						((ExpressionContext)_localctx).op = match(DIV);
						setState(53);
						((ExpressionContext)_localctx).right = expression(7);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						((ExpressionContext)_localctx).op = match(PLUS);
						setState(58);
						((ExpressionContext)_localctx).right = expression(6);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(62);
						((ExpressionContext)_localctx).op = match(MINUS);
						setState(63);
						((ExpressionContext)_localctx).right = expression(5);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(67);
						((ExpressionContext)_localctx).op = match(MINUS);
						setState(68);
						((ExpressionContext)_localctx).right = expression(4);
						if(!(((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null).isEmpty() && !(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).isEmpty() && !(((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null).isEmpty()) System.out.println((((ExpressionContext)_localctx).left!=null?_input.getText(((ExpressionContext)_localctx).left.start,((ExpressionContext)_localctx).left.stop):null) + " " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null) + " " + (((ExpressionContext)_localctx).right!=null?_input.getText(((ExpressionContext)_localctx).right.start,((ExpressionContext)_localctx).right.stop):null) + " ");
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 4:
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
		"\u0004\u0001\u0015M\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000\u0014"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003$\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004-\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004H\b\u0004\n\u0004\f\u0004K\t\u0004\u0001\u0004"+
		"\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000"+
		"\u0001\u0004V\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000"+
		"\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000"+
		"\u0000\b,\u0001\u0000\u0000\u0000\n\r\u0003\b\u0004\u0000\u000b\r\u0003"+
		"\u0002\u0001\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0005\u0007\u0000\u0000"+
		"\u000f\u0011\u0005\u0006\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000"+
		"\u0012\f\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015"+
		"\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017"+
		"\u001a\u0005\u0015\u0000\u0000\u0018\u0019\u0005\n\u0000\u0000\u0019\u001b"+
		"\u0003\u0006\u0003\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0007\u0000\u0000\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e$\u0005"+
		"\u0014\u0000\u0000\u001f$\u0005\u0012\u0000\u0000 $\u0005\u0013\u0000"+
		"\u0000!$\u0005\u0011\u0000\u0000\"$\u0003\b\u0004\u0000#\u001e\u0001\u0000"+
		"\u0000\u0000#\u001f\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0007\u0001\u0000"+
		"\u0000\u0000%&\u0006\u0004\uffff\uffff\u0000&\'\u0005\b\u0000\u0000\'"+
		"(\u0003\b\u0004\u0000()\u0005\t\u0000\u0000)-\u0001\u0000\u0000\u0000"+
		"*-\u0005\u0015\u0000\u0000+-\u0005\u000b\u0000\u0000,%\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-I\u0001\u0000"+
		"\u0000\u0000./\n\u0007\u0000\u0000/0\u0005\f\u0000\u000001\u0003\b\u0004"+
		"\b12\u0006\u0004\uffff\uffff\u00002H\u0001\u0000\u0000\u000034\n\u0006"+
		"\u0000\u000045\u0005\r\u0000\u000056\u0003\b\u0004\u000767\u0006\u0004"+
		"\uffff\uffff\u00007H\u0001\u0000\u0000\u000089\n\u0005\u0000\u00009:\u0005"+
		"\u000e\u0000\u0000:;\u0003\b\u0004\u0006;<\u0006\u0004\uffff\uffff\u0000"+
		"<H\u0001\u0000\u0000\u0000=>\n\u0004\u0000\u0000>?\u0005\u000f\u0000\u0000"+
		"?@\u0003\b\u0004\u0005@A\u0006\u0004\uffff\uffff\u0000AH\u0001\u0000\u0000"+
		"\u0000BC\n\u0003\u0000\u0000CD\u0005\u000f\u0000\u0000DE\u0003\b\u0004"+
		"\u0004EF\u0006\u0004\uffff\uffff\u0000FH\u0001\u0000\u0000\u0000G.\u0001"+
		"\u0000\u0000\u0000G3\u0001\u0000\u0000\u0000G8\u0001\u0000\u0000\u0000"+
		"G=\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\t\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000\b\f\u0010\u0014\u001a#,GI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}