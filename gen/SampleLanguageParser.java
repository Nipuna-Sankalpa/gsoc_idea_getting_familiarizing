// Generated from /home/yellowflash/Downloads/jetbrains-plugin-sample-master/src/grammars/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SampleLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, COLON=3, COMMA=4, LBRACK=5, RBRACK=6, LBRACE=7, RBRACE=8, 
		IF=9, ELSE=10, WHILE=11, VAR=12, EQUAL=13, RETURN=14, PRINT=15, FUNC=16, 
		TYPEINT=17, TYPEFLOAT=18, TYPESTRING=19, TYPEBOOLEAN=20, TRUE=21, FALSE=22, 
		SUB=23, BANG=24, MUL=25, DIV=26, ADD=27, LT=28, LE=29, EQUAL_EQUAL=30, 
		NOT_EQUAL=31, GT=32, GE=33, OR=34, AND=35, DOT=36, LINE_COMMENT=37, COMMENT=38, 
		ID=39, INT=40, FLOAT=41, STRING=42, WS=43, ERRCHAR=44;
	public static final int
		RULE_script = 0, RULE_function = 1, RULE_formal_args = 2, RULE_formal_arg = 3, 
		RULE_type = 4, RULE_block = 5, RULE_statement = 6, RULE_vardef = 7, RULE_expr = 8, 
		RULE_operator = 9, RULE_call_expr = 10, RULE_expr_list = 11, RULE_primary = 12;
	public static final String[] ruleNames = {
		"script", "function", "formal_args", "formal_arg", "type", "block", "statement", 
		"vardef", "expr", "operator", "call_expr", "expr_list", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "','", "'['", "']'", "'{'", "'}'", "'if'", 
		"'else'", "'while'", "'var'", "'='", "'return'", "'print'", "'func'", 
		"'int'", "'float'", "'string'", "'boolean'", "'true'", "'false'", "'-'", 
		"'!'", "'*'", "'/'", "'+'", "'<'", "'<='", "'=='", "'!='", "'>'", "'>='", 
		"'||'", "'&&'", "' . '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "COLON", "COMMA", "LBRACK", "RBRACK", "LBRACE", 
		"RBRACE", "IF", "ELSE", "WHILE", "VAR", "EQUAL", "RETURN", "PRINT", "FUNC", 
		"TYPEINT", "TYPEFLOAT", "TYPESTRING", "TYPEBOOLEAN", "TRUE", "FALSE", 
		"SUB", "BANG", "MUL", "DIV", "ADD", "LT", "LE", "EQUAL_EQUAL", "NOT_EQUAL", 
		"GT", "GE", "OR", "AND", "DOT", "LINE_COMMENT", "COMMENT", "ID", "INT", 
		"FLOAT", "STRING", "WS", "ERRCHAR"
	};
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
	public String getGrammarFileName() { return "SampleLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SampleLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(26);
				vardef();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(32);
				function();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Formal_argsContext formal_args() {
			return getRuleContext(Formal_argsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(FUNC);
			setState(47);
			match(ID);
			setState(48);
			match(LPAREN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(49);
				formal_args();
				}
			}

			setState(52);
			match(RPAREN);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(53);
				match(COLON);
				setState(54);
				type();
				}
			}

			setState(57);
			block();
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

	public static class Formal_argsContext extends ParserRuleContext {
		public List<Formal_argContext> formal_arg() {
			return getRuleContexts(Formal_argContext.class);
		}
		public Formal_argContext formal_arg(int i) {
			return getRuleContext(Formal_argContext.class,i);
		}
		public Formal_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFormal_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFormal_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFormal_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_argsContext formal_args() throws RecognitionException {
		Formal_argsContext _localctx = new Formal_argsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			formal_arg();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				formal_arg();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Formal_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Formal_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFormal_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFormal_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFormal_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_argContext formal_arg() throws RecognitionException {
		Formal_argContext _localctx = new Formal_argContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(COLON);
			setState(69);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanTypeSpecContext extends TypeContext {
		public BooleanTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBooleanTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBooleanTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBooleanTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeSpecContext extends TypeContext {
		public IntTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterIntTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitIntTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitIntTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeSpecContext extends TypeContext {
		public StringTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStringTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStringTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitStringTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorTypeSpecContext extends TypeContext {
		public VectorTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterVectorTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitVectorTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitVectorTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatTypeSpecContext extends TypeContext {
		public FloatTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFloatTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFloatTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFloatTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEINT:
				_localctx = new IntTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(TYPEINT);
				}
				break;
			case TYPEFLOAT:
				_localctx = new FloatTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(TYPEFLOAT);
				}
				break;
			case TYPESTRING:
				_localctx = new StringTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(TYPESTRING);
				}
				break;
			case TYPEBOOLEAN:
				_localctx = new BooleanTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(TYPEBOOLEAN);
				}
				break;
			case LBRACK:
				_localctx = new VectorTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(LBRACK);
				setState(76);
				match(RBRACK);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << RETURN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
				case IF:
				case WHILE:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(80);
					statement();
					}
					break;
				case VAR:
					{
					setState(81);
					vardef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(RBRACE);
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
	public static class ElementAssignContext extends StatementContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ElementAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterElementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitElementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitElementAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStatementContext extends StatementContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public CallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(IF);
				setState(90);
				match(LPAREN);
				setState(91);
				expr(0);
				setState(92);
				match(RPAREN);
				setState(93);
				statement();
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(94);
					match(ELSE);
					setState(95);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(WHILE);
				setState(99);
				match(LPAREN);
				setState(100);
				expr(0);
				setState(101);
				match(RPAREN);
				setState(102);
				statement();
				}
				break;
			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(ID);
				setState(105);
				match(EQUAL);
				setState(106);
				expr(0);
				}
				break;
			case 4:
				_localctx = new ElementAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(ID);
				setState(108);
				match(LBRACK);
				setState(109);
				expr(0);
				setState(110);
				match(RBRACK);
				setState(111);
				match(EQUAL);
				setState(112);
				expr(0);
				}
				break;
			case 5:
				_localctx = new CallStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				call_expr();
				}
				break;
			case 6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(PRINT);
				setState(116);
				match(LPAREN);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACK) | (1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << BANG) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(117);
					expr(0);
					}
				}

				setState(120);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(RETURN);
				setState(122);
				expr(0);
				}
				break;
			case 8:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				block();
				}
				break;
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

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(VAR);
			setState(127);
			match(ID);
			setState(128);
			match(EQUAL);
			setState(129);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomContext extends ExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AtomContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(SUB);
				setState(133);
				expr(6);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(BANG);
				setState(135);
				expr(5);
				}
				break;
			case 3:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				call_expr();
				}
				break;
			case 4:
				{
				_localctx = new IndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(ID);
				setState(138);
				match(LBRACK);
				setState(139);
				expr(0);
				setState(140);
				match(RBRACK);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(LPAREN);
				setState(143);
				expr(0);
				setState(144);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(149);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(150);
					operator();
					setState(151);
					expr(8);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SampleLanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SampleLanguageParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(SampleLanguageParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SampleLanguageParser.SUB, 0); }
		public TerminalNode GT() { return getToken(SampleLanguageParser.GT, 0); }
		public TerminalNode GE() { return getToken(SampleLanguageParser.GE, 0); }
		public TerminalNode LT() { return getToken(SampleLanguageParser.LT, 0); }
		public TerminalNode LE() { return getToken(SampleLanguageParser.LE, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(SampleLanguageParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SampleLanguageParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(SampleLanguageParser.OR, 0); }
		public TerminalNode AND() { return getToken(SampleLanguageParser.AND, 0); }
		public TerminalNode DOT() { return getToken(SampleLanguageParser.DOT, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << LT) | (1L << LE) | (1L << EQUAL_EQUAL) | (1L << NOT_EQUAL) | (1L << GT) | (1L << GE) | (1L << OR) | (1L << AND) | (1L << DOT))) != 0)) ) {
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

	public static class Call_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitCall_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(LPAREN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACK) | (1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << BANG) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(162);
				expr_list();
				}
			}

			setState(165);
			match(RPAREN);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expr(0);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168);
				match(COMMA);
				setState(169);
				expr(0);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends PrimaryContext {
		public TerminalNode INT() { return getToken(SampleLanguageParser.INT, 0); }
		public IntegerContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends PrimaryContext {
		public TerminalNode FLOAT() { return getToken(SampleLanguageParser.FLOAT, 0); }
		public FloatContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends PrimaryContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public IdentifierContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralContext extends PrimaryContext {
		public TrueLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends PrimaryContext {
		public TerminalNode STRING() { return getToken(SampleLanguageParser.STRING, 0); }
		public StringContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorContext extends PrimaryContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public VectorContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLiteralContext extends PrimaryContext {
		public FalseLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(ID);
				}
				break;
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(STRING);
				}
				break;
			case LBRACK:
				_localctx = new VectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(LBRACK);
				setState(180);
				expr_list();
				setState(181);
				match(RBRACK);
				}
				break;
			case TRUE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(FALSE);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\4\3\4\3\4\7\4A\n\4\f\4\16\4"+
		"D\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\7"+
		"\7U\n\7\f\7\16\7X\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\by\n\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096"+
		"\n\n\3\n\3\n\3\n\3\n\7\n\u009c\n\n\f\n\16\n\u009f\13\n\3\13\3\13\3\f\3"+
		"\f\3\f\5\f\u00a6\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bc\n\16"+
		"\3\16\2\3\22\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2\31\31\33&\u00d3"+
		"\2\37\3\2\2\2\4\60\3\2\2\2\6=\3\2\2\2\bE\3\2\2\2\nO\3\2\2\2\fQ\3\2\2\2"+
		"\16~\3\2\2\2\20\u0080\3\2\2\2\22\u0095\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2"+
		"\3\2\2\2\30\u00a9\3\2\2\2\32\u00bb\3\2\2\2\34\36\5\20\t\2\35\34\3\2\2"+
		"\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5\4"+
		"\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*"+
		"\5\16\b\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2"+
		"./\7\2\2\3/\3\3\2\2\2\60\61\7\22\2\2\61\62\7)\2\2\62\64\7\3\2\2\63\65"+
		"\5\6\4\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\669\7\4\2\2\678\7\5"+
		"\2\28:\5\n\6\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\f\7\2<\5\3\2\2\2=B"+
		"\5\b\5\2>?\7\6\2\2?A\5\b\5\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C"+
		"\7\3\2\2\2DB\3\2\2\2EF\7)\2\2FG\7\5\2\2GH\5\n\6\2H\t\3\2\2\2IP\7\23\2"+
		"\2JP\7\24\2\2KP\7\25\2\2LP\7\26\2\2MN\7\7\2\2NP\7\b\2\2OI\3\2\2\2OJ\3"+
		"\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2P\13\3\2\2\2QV\7\t\2\2RU\5\16\b\2"+
		"SU\5\20\t\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2"+
		"\2XV\3\2\2\2YZ\7\n\2\2Z\r\3\2\2\2[\\\7\13\2\2\\]\7\3\2\2]^\5\22\n\2^_"+
		"\7\4\2\2_b\5\16\b\2`a\7\f\2\2ac\5\16\b\2b`\3\2\2\2bc\3\2\2\2c\177\3\2"+
		"\2\2de\7\r\2\2ef\7\3\2\2fg\5\22\n\2gh\7\4\2\2hi\5\16\b\2i\177\3\2\2\2"+
		"jk\7)\2\2kl\7\17\2\2l\177\5\22\n\2mn\7)\2\2no\7\7\2\2op\5\22\n\2pq\7\b"+
		"\2\2qr\7\17\2\2rs\5\22\n\2s\177\3\2\2\2t\177\5\26\f\2uv\7\21\2\2vx\7\3"+
		"\2\2wy\5\22\n\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z\177\7\4\2\2{|\7\20\2\2"+
		"|\177\5\22\n\2}\177\5\f\7\2~[\3\2\2\2~d\3\2\2\2~j\3\2\2\2~m\3\2\2\2~t"+
		"\3\2\2\2~u\3\2\2\2~{\3\2\2\2~}\3\2\2\2\177\17\3\2\2\2\u0080\u0081\7\16"+
		"\2\2\u0081\u0082\7)\2\2\u0082\u0083\7\17\2\2\u0083\u0084\5\22\n\2\u0084"+
		"\21\3\2\2\2\u0085\u0086\b\n\1\2\u0086\u0087\7\31\2\2\u0087\u0096\5\22"+
		"\n\b\u0088\u0089\7\32\2\2\u0089\u0096\5\22\n\7\u008a\u0096\5\26\f\2\u008b"+
		"\u008c\7)\2\2\u008c\u008d\7\7\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\b"+
		"\2\2\u008f\u0096\3\2\2\2\u0090\u0091\7\3\2\2\u0091\u0092\5\22\n\2\u0092"+
		"\u0093\7\4\2\2\u0093\u0096\3\2\2\2\u0094\u0096\5\32\16\2\u0095\u0085\3"+
		"\2\2\2\u0095\u0088\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008b\3\2\2\2\u0095"+
		"\u0090\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u009d\3\2\2\2\u0097\u0098\f\t"+
		"\2\2\u0098\u0099\5\24\13\2\u0099\u009a\5\22\n\n\u009a\u009c\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\23\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\25"+
		"\3\2\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a5\7\3\2\2\u00a4\u00a6\5\30\r\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\4"+
		"\2\2\u00a8\27\3\2\2\2\u00a9\u00ae\5\22\n\2\u00aa\u00ab\7\6\2\2\u00ab\u00ad"+
		"\5\22\n\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00bc"+
		"\7)\2\2\u00b2\u00bc\7*\2\2\u00b3\u00bc\7+\2\2\u00b4\u00bc\7,\2\2\u00b5"+
		"\u00b6\7\7\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\7\b\2\2\u00b8\u00bc\3"+
		"\2\2\2\u00b9\u00bc\7\27\2\2\u00ba\u00bc\7\30\2\2\u00bb\u00b1\3\2\2\2\u00bb"+
		"\u00b2\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\33\3\2\2\2\23\37%+"+
		"\649BOTVbx~\u0095\u009d\u00a5\u00ae\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}