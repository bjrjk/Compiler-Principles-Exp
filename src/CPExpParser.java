// Generated from CPExp.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Identifier=11, Int10=12, Int8=13, Int16=14, ADD=15, SUB=16, MUL=17, 
		DIV=18, GT=19, LT=20, EQ=21, WhiteSpace=22;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_condition = 2, RULE_expression = 3, 
		RULE_integer = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "condition", "expression", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'then'", "'else'", "'while'", "'do'", "'{'", "'}'", 
			"'('", "')'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'>'", 
			"'<'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "Identifier", 
			"Int10", "Int8", "Int16", "ADD", "SUB", "MUL", "DIV", "GT", "LT", "EQ", 
			"WhiteSpace"
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
	public String getGrammarFileName() { return "CPExp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << Identifier))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockContext extends StatementContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public BlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(CPExpParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(CPExpParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(Identifier);
				setState(16);
				match(EQ);
				setState(17);
				expression(0);
				setState(18);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T__1);
				setState(21);
				condition();
				setState(22);
				match(T__2);
				setState(23);
				statement();
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(24);
					match(T__3);
					setState(25);
					statement();
					}
					break;
				}
				}
				break;
			case T__4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(T__4);
				setState(29);
				condition();
				setState(30);
				match(T__5);
				setState(31);
				statement();
				}
				break;
			case T__6:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(T__6);
				setState(34);
				program();
				setState(35);
				match(T__7);
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

	public static class ConditionContext extends ParserRuleContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(CPExpParser.GT, 0); }
		public TerminalNode LT() { return getToken(CPExpParser.LT, 0); }
		public TerminalNode EQ() { return getToken(CPExpParser.EQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			expression(0);
			setState(40);
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IDNExprContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(CPExpParser.Identifier, 0); }
		public IDNExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitIDNExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LowArithExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CPExpParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CPExpParser.SUB, 0); }
		public LowArithExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitLowArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExprContext extends ExpressionContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HighArithExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CPExpParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CPExpParser.DIV, 0); }
		public HighArithExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitHighArithExpr(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int10:
			case Int8:
			case Int16:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				integer();
				}
				break;
			case Identifier:
				{
				_localctx = new IDNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(Identifier);
				}
				break;
			case T__8:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(T__8);
				setState(47);
				expression(0);
				setState(48);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new HighArithExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(53);
						((HighArithExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((HighArithExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(54);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new LowArithExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(56);
						((LowArithExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((LowArithExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(57);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class IntegerContext extends ParserRuleContext {
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	 
		public IntegerContext() { }
		public void copyFrom(IntegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Int10PContext extends IntegerContext {
		public TerminalNode Int10() { return getToken(CPExpParser.Int10, 0); }
		public Int10PContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitInt10P(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int16PContext extends IntegerContext {
		public TerminalNode Int16() { return getToken(CPExpParser.Int16, 0); }
		public Int16PContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitInt16P(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int8PContext extends IntegerContext {
		public TerminalNode Int8() { return getToken(CPExpParser.Int8, 0); }
		public Int8PContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPExpVisitor ) return ((CPExpVisitor<? extends T>)visitor).visitInt8P(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int10:
				_localctx = new Int10PContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(Int10);
				}
				break;
			case Int8:
				_localctx = new Int8PContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(Int8);
				}
				break;
			case Int16:
				_localctx = new Int16PContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(Int16);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\65\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3\6\5\6E\n\6"+
		"\3\6\2\3\b\7\2\4\6\b\n\2\5\3\2\25\27\3\2\23\24\3\2\21\22\2L\2\r\3\2\2"+
		"\2\4\'\3\2\2\2\6)\3\2\2\2\b\64\3\2\2\2\nD\3\2\2\2\f\16\5\4\3\2\r\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\r\2"+
		"\2\22\23\7\27\2\2\23\24\5\b\5\2\24\25\7\3\2\2\25(\3\2\2\2\26\27\7\4\2"+
		"\2\27\30\5\6\4\2\30\31\7\5\2\2\31\34\5\4\3\2\32\33\7\6\2\2\33\35\5\4\3"+
		"\2\34\32\3\2\2\2\34\35\3\2\2\2\35(\3\2\2\2\36\37\7\7\2\2\37 \5\6\4\2 "+
		"!\7\b\2\2!\"\5\4\3\2\"(\3\2\2\2#$\7\t\2\2$%\5\2\2\2%&\7\n\2\2&(\3\2\2"+
		"\2\'\21\3\2\2\2\'\26\3\2\2\2\'\36\3\2\2\2\'#\3\2\2\2(\5\3\2\2\2)*\5\b"+
		"\5\2*+\t\2\2\2+,\5\b\5\2,\7\3\2\2\2-.\b\5\1\2.\65\5\n\6\2/\65\7\r\2\2"+
		"\60\61\7\13\2\2\61\62\5\b\5\2\62\63\7\f\2\2\63\65\3\2\2\2\64-\3\2\2\2"+
		"\64/\3\2\2\2\64\60\3\2\2\2\65>\3\2\2\2\66\67\f\4\2\2\678\t\3\2\28=\5\b"+
		"\5\59:\f\3\2\2:;\t\4\2\2;=\5\b\5\4<\66\3\2\2\2<9\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?\t\3\2\2\2@>\3\2\2\2AE\7\16\2\2BE\7\17\2\2CE\7\20\2\2"+
		"DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2\t\17\34\'\64<>D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}