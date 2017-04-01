// Generated from /home/yellowflash/Downloads/jetbrains-plugin-sample-master/src/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.6
package org.antlr.jetbrains.sample.parser;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

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
		INT_LITERAL=1, LONG_LITERAL=2, FLOAT_LITERAL=3, DOUBLE_LITERAL=4, COL=5, 
		SCOL=6, DOT=7, OPEN_PAR=8, CLOSE_PAR=9, OPEN_SQARE_BRACKETS=10, CLOASE_SQARE_BRACKETS=11, 
		COMMA=12, ASSIGN=13, STAR=14, PLUS=15, QUESTION=16, MINUS=17, DIV=18, 
		MOD=19, LT=20, LT_EQ=21, GT=22, GT_EQ=23, EQ=24, NOT_EQ=25, AT_SYMBOL=26, 
		FOLLOWED_BY=27, HASH=28, STREAM=29, DEFINE=30, FUNCTION=31, TRIGGER=32, 
		TABLE=33, PLAN=34, FROM=35, PARTITION=36, WINDOW=37, SELECT=38, GROUP=39, 
		BY=40, HAVING=41, INSERT=42, OVERWRITE=43, DELETE=44, UPDATE=45, RETURN=46, 
		EVENTS=47, INTO=48, OUTPUT=49, EXPIRED=50, CURRENT=51, SNAPSHOT=52, FOR=53, 
		RAW=54, OF=55, AS=56, AT=57, OR=58, AND=59, IN=60, ON=61, IS=62, NOT=63, 
		WITHIN=64, WITH=65, BEGIN=66, END=67, NULL=68, EVERY=69, LAST=70, ALL=71, 
		FIRST=72, JOIN=73, INNER=74, OUTER=75, RIGHT=76, LEFT=77, FULL=78, UNIDIRECTIONAL=79, 
		YEARS=80, MONTHS=81, WEEKS=82, DAYS=83, HOURS=84, MINUTES=85, SECONDS=86, 
		MILLISECONDS=87, FALSE=88, TRUE=89, STRING=90, INT=91, LONG=92, FLOAT=93, 
		DOUBLE=94, BOOL=95, OBJECT=96, ID_QUOTES=97, ID=98, STRING_LITERAL=99, 
		SINGLE_LINE_COMMENT=100, MULTILINE_COMMENT=101, SPACES=102, UNEXPECTED_CHAR=103, 
		SCRIPT=104;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_execution_plan = 2, RULE_execution_element = 3, 
		RULE_definition_stream_final = 4, RULE_definition_stream = 5, RULE_definition_table_final = 6, 
		RULE_definition_table = 7, RULE_definition_window_final = 8, RULE_definition_window = 9, 
		RULE_definition_function_final = 10, RULE_definition_function = 11, RULE_function_name = 12, 
		RULE_language_name = 13, RULE_function_body = 14, RULE_definition_trigger_final = 15, 
		RULE_definition_trigger = 16, RULE_trigger_name = 17, RULE_annotation = 18, 
		RULE_plan_annotation = 19, RULE_annotation_element = 20, RULE_partition = 21, 
		RULE_partition_final = 22, RULE_partition_with_stream = 23, RULE_condition_ranges = 24, 
		RULE_condition_range = 25, RULE_query_final = 26, RULE_query = 27, RULE_query_input = 28, 
		RULE_standard_stream = 29, RULE_join_stream = 30, RULE_join_source = 31, 
		RULE_pattern_stream = 32, RULE_every_pattern_source_chain = 33, RULE_pattern_source_chain = 34, 
		RULE_pattern_source = 35, RULE_logical_stateful_source = 36, RULE_pattern_collection_stateful_source = 37, 
		RULE_standard_stateful_source = 38, RULE_basic_source = 39, RULE_basic_source_stream_handlers = 40, 
		RULE_basic_source_stream_handler = 41, RULE_sequence_stream = 42, RULE_sequence_source_chain = 43, 
		RULE_sequence_source = 44, RULE_sequence_collection_stateful_source = 45, 
		RULE_anonymous_stream = 46, RULE_filter = 47, RULE_stream_function = 48, 
		RULE_window = 49, RULE_query_section = 50, RULE_group_by = 51, RULE_having = 52, 
		RULE_query_output = 53, RULE_output_event_type = 54, RULE_output_rate = 55, 
		RULE_output_rate_type = 56, RULE_within_time = 57, RULE_output_attribute = 58, 
		RULE_attribute = 59, RULE_expression = 60, RULE_math_operation = 61, RULE_function_operation = 62, 
		RULE_attribute_list = 63, RULE_null_check = 64, RULE_stream_reference = 65, 
		RULE_attribute_reference = 66, RULE_attribute_index = 67, RULE_function_id = 68, 
		RULE_function_namespace = 69, RULE_stream_id = 70, RULE_stream_alias = 71, 
		RULE_property_name = 72, RULE_attribute_name = 73, RULE_type = 74, RULE_property_value = 75, 
		RULE_property_separator = 76, RULE_source = 77, RULE_target = 78, RULE_event = 79, 
		RULE_name = 80, RULE_collect = 81, RULE_attribute_type = 82, RULE_join = 83, 
		RULE_constant_value = 84, RULE_id = 85, RULE_keyword = 86, RULE_time_value = 87, 
		RULE_year_value = 88, RULE_month_value = 89, RULE_week_value = 90, RULE_day_value = 91, 
		RULE_hour_value = 92, RULE_minute_value = 93, RULE_second_value = 94, 
		RULE_millisecond_value = 95, RULE_signed_double_value = 96, RULE_signed_long_value = 97, 
		RULE_signed_float_value = 98, RULE_signed_int_value = 99, RULE_bool_value = 100, 
		RULE_string_value = 101;
	public static final String[] ruleNames = {
		"parse", "error", "execution_plan", "execution_element", "definition_stream_final", 
		"definition_stream", "definition_table_final", "definition_table", "definition_window_final", 
		"definition_window", "definition_function_final", "definition_function", 
		"function_name", "language_name", "function_body", "definition_trigger_final", 
		"definition_trigger", "trigger_name", "annotation", "plan_annotation", 
		"annotation_element", "partition", "partition_final", "partition_with_stream", 
		"condition_ranges", "condition_range", "query_final", "query", "query_input", 
		"standard_stream", "join_stream", "join_source", "pattern_stream", "every_pattern_source_chain", 
		"pattern_source_chain", "pattern_source", "logical_stateful_source", "pattern_collection_stateful_source", 
		"standard_stateful_source", "basic_source", "basic_source_stream_handlers", 
		"basic_source_stream_handler", "sequence_stream", "sequence_source_chain", 
		"sequence_source", "sequence_collection_stateful_source", "anonymous_stream", 
		"filter", "stream_function", "window", "query_section", "group_by", "having", 
		"query_output", "output_event_type", "output_rate", "output_rate_type", 
		"within_time", "output_attribute", "attribute", "expression", "math_operation", 
		"function_operation", "attribute_list", "null_check", "stream_reference", 
		"attribute_reference", "attribute_index", "function_id", "function_namespace", 
		"stream_id", "stream_alias", "property_name", "attribute_name", "type", 
		"property_value", "property_separator", "source", "target", "event", "name", 
		"collect", "attribute_type", "join", "constant_value", "id", "keyword", 
		"time_value", "year_value", "month_value", "week_value", "day_value", 
		"hour_value", "minute_value", "second_value", "millisecond_value", "signed_double_value", 
		"signed_long_value", "signed_float_value", "signed_int_value", "bool_value", 
		"string_value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "':'", "';'", "'.'", "'('", "')'", "'['", 
		"']'", "','", "'='", "'*'", "'+'", "'?'", "'-'", "'/'", "'%'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'@'", "'->'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT_LITERAL", "LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"COL", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_SQARE_BRACKETS", 
		"CLOASE_SQARE_BRACKETS", "COMMA", "ASSIGN", "STAR", "PLUS", "QUESTION", 
		"MINUS", "DIV", "MOD", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ", "AT_SYMBOL", 
		"FOLLOWED_BY", "HASH", "STREAM", "DEFINE", "FUNCTION", "TRIGGER", "TABLE", 
		"PLAN", "FROM", "PARTITION", "WINDOW", "SELECT", "GROUP", "BY", "HAVING", 
		"INSERT", "OVERWRITE", "DELETE", "UPDATE", "RETURN", "EVENTS", "INTO", 
		"OUTPUT", "EXPIRED", "CURRENT", "SNAPSHOT", "FOR", "RAW", "OF", "AS", 
		"AT", "OR", "AND", "IN", "ON", "IS", "NOT", "WITHIN", "WITH", "BEGIN", 
		"END", "NULL", "EVERY", "LAST", "ALL", "FIRST", "JOIN", "INNER", "OUTER", 
		"RIGHT", "LEFT", "FULL", "UNIDIRECTIONAL", "YEARS", "MONTHS", "WEEKS", 
		"DAYS", "HOURS", "MINUTES", "SECONDS", "MILLISECONDS", "FALSE", "TRUE", 
		"STRING", "INT", "LONG", "FLOAT", "DOUBLE", "BOOL", "OBJECT", "ID_QUOTES", 
		"ID", "STRING_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR", "SCRIPT"
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
	public static class ParseContext extends ParserRuleContext {
		public Execution_planContext execution_plan() {
			return getRuleContext(Execution_planContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			execution_plan();
			setState(205);
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

	public static class ErrorContext extends ParserRuleContext {
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SampleLanguageParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(UNEXPECTED_CHAR);
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

	public static class Execution_planContext extends ParserRuleContext {
		public List<Plan_annotationContext> plan_annotation() {
			return getRuleContexts(Plan_annotationContext.class);
		}
		public Plan_annotationContext plan_annotation(int i) {
			return getRuleContext(Plan_annotationContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<Definition_streamContext> definition_stream() {
			return getRuleContexts(Definition_streamContext.class);
		}
		public Definition_streamContext definition_stream(int i) {
			return getRuleContext(Definition_streamContext.class,i);
		}
		public List<Definition_tableContext> definition_table() {
			return getRuleContexts(Definition_tableContext.class);
		}
		public Definition_tableContext definition_table(int i) {
			return getRuleContext(Definition_tableContext.class,i);
		}
		public List<Definition_triggerContext> definition_trigger() {
			return getRuleContexts(Definition_triggerContext.class);
		}
		public Definition_triggerContext definition_trigger(int i) {
			return getRuleContext(Definition_triggerContext.class,i);
		}
		public List<Definition_functionContext> definition_function() {
			return getRuleContexts(Definition_functionContext.class);
		}
		public Definition_functionContext definition_function(int i) {
			return getRuleContext(Definition_functionContext.class,i);
		}
		public List<Definition_windowContext> definition_window() {
			return getRuleContexts(Definition_windowContext.class);
		}
		public Definition_windowContext definition_window(int i) {
			return getRuleContext(Definition_windowContext.class,i);
		}
		public List<Execution_elementContext> execution_element() {
			return getRuleContexts(Execution_elementContext.class);
		}
		public Execution_elementContext execution_element(int i) {
			return getRuleContext(Execution_elementContext.class,i);
		}
		public Execution_planContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterExecution_plan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitExecution_plan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitExecution_plan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execution_planContext execution_plan() throws RecognitionException {
		Execution_planContext _localctx = new Execution_planContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_execution_plan);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(211);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT_SYMBOL:
						{
						setState(209);
						plan_annotation();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(210);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(216);
					definition_stream();
					}
					break;
				case 2:
					{
					setState(217);
					definition_table();
					}
					break;
				case 3:
					{
					setState(218);
					definition_trigger();
					}
					break;
				case 4:
					{
					setState(219);
					definition_function();
					}
					break;
				case 5:
					{
					setState(220);
					definition_window();
					}
					break;
				case 6:
					{
					setState(221);
					error();
					}
					break;
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						match(SCOL);
						setState(231);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(225);
							definition_stream();
							}
							break;
						case 2:
							{
							setState(226);
							definition_table();
							}
							break;
						case 3:
							{
							setState(227);
							definition_trigger();
							}
							break;
						case 4:
							{
							setState(228);
							definition_function();
							}
							break;
						case 5:
							{
							setState(229);
							definition_window();
							}
							break;
						case 6:
							{
							setState(230);
							error();
							}
							break;
						}
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(238);
					match(SCOL);
					}
				}

				}
				break;
			case 2:
				{
				}
				break;
			case 3:
				{
				setState(244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AT_SYMBOL:
				case FROM:
				case PARTITION:
					{
					setState(242);
					execution_element();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(243);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						match(SCOL);
						setState(249);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case AT_SYMBOL:
						case FROM:
						case PARTITION:
							{
							setState(247);
							execution_element();
							}
							break;
						case UNEXPECTED_CHAR:
							{
							setState(248);
							error();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(256);
					match(SCOL);
					}
				}

				}
				break;
			case 4:
				{
				}
				break;
			case 5:
				{
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(260);
					definition_stream();
					}
					break;
				case 2:
					{
					setState(261);
					definition_table();
					}
					break;
				case 3:
					{
					setState(262);
					definition_trigger();
					}
					break;
				case 4:
					{
					setState(263);
					definition_function();
					}
					break;
				case 5:
					{
					setState(264);
					definition_window();
					}
					break;
				case 6:
					{
					setState(265);
					error();
					}
					break;
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(268);
						match(SCOL);
						setState(275);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(269);
							definition_stream();
							}
							break;
						case 2:
							{
							setState(270);
							definition_table();
							}
							break;
						case 3:
							{
							setState(271);
							definition_trigger();
							}
							break;
						case 4:
							{
							setState(272);
							definition_function();
							}
							break;
						case 5:
							{
							setState(273);
							definition_window();
							}
							break;
						case 6:
							{
							setState(274);
							error();
							}
							break;
						}
						}
						} 
					}
					setState(281);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						match(SCOL);
						setState(285);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case AT_SYMBOL:
						case FROM:
						case PARTITION:
							{
							setState(283);
							execution_element();
							}
							break;
						case UNEXPECTED_CHAR:
							{
							setState(284);
							error();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(292);
					match(SCOL);
					}
				}

				}
				break;
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

	public static class Execution_elementContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PartitionContext partition() {
			return getRuleContext(PartitionContext.class,0);
		}
		public Execution_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterExecution_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitExecution_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitExecution_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execution_elementContext execution_element() throws RecognitionException {
		Execution_elementContext _localctx = new Execution_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_execution_element);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				query();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				partition();
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

	public static class Definition_stream_finalContext extends ParserRuleContext {
		public Definition_streamContext definition_stream() {
			return getRuleContext(Definition_streamContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public Definition_stream_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_stream_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_stream_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_stream_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_stream_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_stream_finalContext definition_stream_final() throws RecognitionException {
		Definition_stream_finalContext _localctx = new Definition_stream_finalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition_stream_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			definition_stream();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(302);
				match(SCOL);
				}
			}

			setState(305);
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

	public static class Definition_streamContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SampleLanguageParser.DEFINE, 0); }
		public TerminalNode STREAM() { return getToken(SampleLanguageParser.STREAM, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Definition_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_streamContext definition_stream() throws RecognitionException {
		Definition_streamContext _localctx = new Definition_streamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(307);
				annotation();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(DEFINE);
			setState(314);
			match(STREAM);
			setState(315);
			source();
			setState(316);
			match(OPEN_PAR);
			setState(317);
			attribute_name();
			setState(318);
			attribute_type();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(319);
				match(COMMA);
				setState(320);
				attribute_name();
				setState(321);
				attribute_type();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(CLOSE_PAR);
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

	public static class Definition_table_finalContext extends ParserRuleContext {
		public Definition_tableContext definition_table() {
			return getRuleContext(Definition_tableContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public Definition_table_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_table_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_table_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_table_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_table_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_table_finalContext definition_table_final() throws RecognitionException {
		Definition_table_finalContext _localctx = new Definition_table_finalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definition_table_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			definition_table();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(331);
				match(SCOL);
				}
			}

			setState(334);
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

	public static class Definition_tableContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SampleLanguageParser.DEFINE, 0); }
		public TerminalNode TABLE() { return getToken(SampleLanguageParser.TABLE, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Definition_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_tableContext definition_table() throws RecognitionException {
		Definition_tableContext _localctx = new Definition_tableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definition_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(336);
				annotation();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(DEFINE);
			setState(343);
			match(TABLE);
			setState(344);
			source();
			setState(345);
			match(OPEN_PAR);
			setState(346);
			attribute_name();
			setState(347);
			attribute_type();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				attribute_name();
				setState(350);
				attribute_type();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(CLOSE_PAR);
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

	public static class Definition_window_finalContext extends ParserRuleContext {
		public Definition_windowContext definition_window() {
			return getRuleContext(Definition_windowContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public Definition_window_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_window_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_window_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_window_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_window_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_window_finalContext definition_window_final() throws RecognitionException {
		Definition_window_finalContext _localctx = new Definition_window_finalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definition_window_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			definition_window();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(360);
				match(SCOL);
				}
			}

			setState(363);
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

	public static class Definition_windowContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SampleLanguageParser.DEFINE, 0); }
		public TerminalNode WINDOW() { return getToken(SampleLanguageParser.WINDOW, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OUTPUT() { return getToken(SampleLanguageParser.OUTPUT, 0); }
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public Definition_windowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_window; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_window(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_window(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_window(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_windowContext definition_window() throws RecognitionException {
		Definition_windowContext _localctx = new Definition_windowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definition_window);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(365);
				annotation();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(DEFINE);
			setState(372);
			match(WINDOW);
			setState(373);
			source();
			setState(374);
			match(OPEN_PAR);
			setState(375);
			attribute_name();
			setState(376);
			attribute_type();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377);
				match(COMMA);
				setState(378);
				attribute_name();
				setState(379);
				attribute_type();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(CLOSE_PAR);
			setState(387);
			function_operation();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(388);
				match(OUTPUT);
				setState(389);
				output_event_type();
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

	public static class Definition_function_finalContext extends ParserRuleContext {
		public Definition_functionContext definition_function() {
			return getRuleContext(Definition_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public Definition_function_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_function_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_function_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_function_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_function_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_function_finalContext definition_function_final() throws RecognitionException {
		Definition_function_finalContext _localctx = new Definition_function_finalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_definition_function_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			definition_function();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(393);
				match(SCOL);
				}
			}

			setState(396);
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

	public static class Definition_functionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SampleLanguageParser.DEFINE, 0); }
		public TerminalNode FUNCTION() { return getToken(SampleLanguageParser.FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Language_nameContext language_name() {
			return getRuleContext(Language_nameContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SampleLanguageParser.RETURN, 0); }
		public Attribute_typeContext attribute_type() {
			return getRuleContext(Attribute_typeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Definition_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_functionContext definition_function() throws RecognitionException {
		Definition_functionContext _localctx = new Definition_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_definition_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(DEFINE);
			setState(399);
			match(FUNCTION);
			setState(400);
			function_name();
			setState(401);
			match(OPEN_SQARE_BRACKETS);
			setState(402);
			language_name();
			setState(403);
			match(CLOASE_SQARE_BRACKETS);
			setState(404);
			match(RETURN);
			setState(405);
			attribute_type();
			setState(406);
			function_body();
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

	public static class Function_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			id();
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

	public static class Language_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Language_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterLanguage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitLanguage_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitLanguage_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Language_nameContext language_name() throws RecognitionException {
		Language_nameContext _localctx = new Language_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_language_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			id();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode SCRIPT() { return getToken(SampleLanguageParser.SCRIPT, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(SCRIPT);
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

	public static class Definition_trigger_finalContext extends ParserRuleContext {
		public Definition_triggerContext definition_trigger() {
			return getRuleContext(Definition_triggerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public Definition_trigger_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_trigger_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_trigger_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_trigger_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_trigger_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_trigger_finalContext definition_trigger_final() throws RecognitionException {
		Definition_trigger_finalContext _localctx = new Definition_trigger_finalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_definition_trigger_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			definition_trigger();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(415);
				match(SCOL);
				}
			}

			setState(418);
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

	public static class Definition_triggerContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SampleLanguageParser.DEFINE, 0); }
		public TerminalNode TRIGGER() { return getToken(SampleLanguageParser.TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode AT() { return getToken(SampleLanguageParser.AT, 0); }
		public TerminalNode EVERY() { return getToken(SampleLanguageParser.EVERY, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Definition_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDefinition_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDefinition_trigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDefinition_trigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_triggerContext definition_trigger() throws RecognitionException {
		Definition_triggerContext _localctx = new Definition_triggerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definition_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(DEFINE);
			setState(421);
			match(TRIGGER);
			setState(422);
			trigger_name();
			setState(423);
			match(AT);
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVERY:
				{
				setState(424);
				match(EVERY);
				setState(425);
				time_value();
				}
				break;
			case STRING_LITERAL:
				{
				setState(426);
				string_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			id();
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

	public static class AnnotationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(AT_SYMBOL);
			setState(432);
			name();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(433);
				match(OPEN_PAR);
				setState(436);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STREAM:
				case DEFINE:
				case TABLE:
				case FROM:
				case PARTITION:
				case WINDOW:
				case SELECT:
				case GROUP:
				case BY:
				case HAVING:
				case INSERT:
				case OVERWRITE:
				case DELETE:
				case UPDATE:
				case RETURN:
				case EVENTS:
				case INTO:
				case OUTPUT:
				case EXPIRED:
				case CURRENT:
				case SNAPSHOT:
				case FOR:
				case RAW:
				case OF:
				case AS:
				case OR:
				case AND:
				case ON:
				case IS:
				case NOT:
				case WITHIN:
				case WITH:
				case BEGIN:
				case END:
				case NULL:
				case EVERY:
				case LAST:
				case ALL:
				case FIRST:
				case JOIN:
				case INNER:
				case OUTER:
				case RIGHT:
				case LEFT:
				case FULL:
				case UNIDIRECTIONAL:
				case YEARS:
				case MONTHS:
				case WEEKS:
				case DAYS:
				case HOURS:
				case MINUTES:
				case SECONDS:
				case MILLISECONDS:
				case FALSE:
				case TRUE:
				case STRING:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case BOOL:
				case OBJECT:
				case ID_QUOTES:
				case ID:
				case STRING_LITERAL:
					{
					setState(434);
					annotation_element();
					}
					break;
				case AT_SYMBOL:
					{
					setState(435);
					annotation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(438);
					match(COMMA);
					setState(441);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STREAM:
					case DEFINE:
					case TABLE:
					case FROM:
					case PARTITION:
					case WINDOW:
					case SELECT:
					case GROUP:
					case BY:
					case HAVING:
					case INSERT:
					case OVERWRITE:
					case DELETE:
					case UPDATE:
					case RETURN:
					case EVENTS:
					case INTO:
					case OUTPUT:
					case EXPIRED:
					case CURRENT:
					case SNAPSHOT:
					case FOR:
					case RAW:
					case OF:
					case AS:
					case OR:
					case AND:
					case ON:
					case IS:
					case NOT:
					case WITHIN:
					case WITH:
					case BEGIN:
					case END:
					case NULL:
					case EVERY:
					case LAST:
					case ALL:
					case FIRST:
					case JOIN:
					case INNER:
					case OUTER:
					case RIGHT:
					case LEFT:
					case FULL:
					case UNIDIRECTIONAL:
					case YEARS:
					case MONTHS:
					case WEEKS:
					case DAYS:
					case HOURS:
					case MINUTES:
					case SECONDS:
					case MILLISECONDS:
					case FALSE:
					case TRUE:
					case STRING:
					case INT:
					case LONG:
					case FLOAT:
					case DOUBLE:
					case BOOL:
					case OBJECT:
					case ID_QUOTES:
					case ID:
					case STRING_LITERAL:
						{
						setState(439);
						annotation_element();
						}
						break;
					case AT_SYMBOL:
						{
						setState(440);
						annotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				match(CLOSE_PAR);
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

	public static class Plan_annotationContext extends ParserRuleContext {
		public TerminalNode PLAN() { return getToken(SampleLanguageParser.PLAN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public Plan_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPlan_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPlan_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPlan_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plan_annotationContext plan_annotation() throws RecognitionException {
		Plan_annotationContext _localctx = new Plan_annotationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_plan_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(AT_SYMBOL);
			setState(453);
			match(PLAN);
			setState(454);
			match(COL);
			setState(455);
			name();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(456);
				match(OPEN_PAR);
				setState(457);
				annotation_element();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(458);
					match(COMMA);
					setState(459);
					annotation_element();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(465);
				match(CLOSE_PAR);
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

	public static class Annotation_elementContext extends ParserRuleContext {
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public Annotation_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAnnotation_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAnnotation_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAnnotation_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_elementContext annotation_element() throws RecognitionException {
		Annotation_elementContext _localctx = new Annotation_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_annotation_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << INSERT) | (1L << OVERWRITE) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS) | (1L << OR) | (1L << AND) | (1L << ON) | (1L << IS) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WITHIN - 64)) | (1L << (WITH - 64)) | (1L << (BEGIN - 64)) | (1L << (END - 64)) | (1L << (NULL - 64)) | (1L << (EVERY - 64)) | (1L << (LAST - 64)) | (1L << (ALL - 64)) | (1L << (FIRST - 64)) | (1L << (JOIN - 64)) | (1L << (INNER - 64)) | (1L << (OUTER - 64)) | (1L << (RIGHT - 64)) | (1L << (LEFT - 64)) | (1L << (FULL - 64)) | (1L << (UNIDIRECTIONAL - 64)) | (1L << (YEARS - 64)) | (1L << (MONTHS - 64)) | (1L << (WEEKS - 64)) | (1L << (DAYS - 64)) | (1L << (HOURS - 64)) | (1L << (MINUTES - 64)) | (1L << (SECONDS - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (FALSE - 64)) | (1L << (TRUE - 64)) | (1L << (STRING - 64)) | (1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (BOOL - 64)) | (1L << (OBJECT - 64)) | (1L << (ID_QUOTES - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(469);
				property_name();
				setState(470);
				match(ASSIGN);
				}
			}

			setState(474);
			property_value();
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

	public static class PartitionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SampleLanguageParser.PARTITION, 0); }
		public TerminalNode WITH() { return getToken(SampleLanguageParser.WITH, 0); }
		public List<Partition_with_streamContext> partition_with_stream() {
			return getRuleContexts(Partition_with_streamContext.class);
		}
		public Partition_with_streamContext partition_with_stream(int i) {
			return getRuleContext(Partition_with_streamContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(SampleLanguageParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SampleLanguageParser.END, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionContext partition() throws RecognitionException {
		PartitionContext _localctx = new PartitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(476);
				annotation();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(PARTITION);
			setState(483);
			match(WITH);
			setState(484);
			match(OPEN_PAR);
			setState(485);
			partition_with_stream();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(486);
				match(COMMA);
				setState(487);
				partition_with_stream();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(CLOSE_PAR);
			setState(494);
			match(BEGIN);
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_SYMBOL:
			case FROM:
				{
				setState(495);
				query();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(496);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(499);
					match(SCOL);
					setState(502);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT_SYMBOL:
					case FROM:
						{
						setState(500);
						query();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(501);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(509);
				match(SCOL);
				}
			}

			setState(512);
			match(END);
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

	public static class Partition_finalContext extends ParserRuleContext {
		public PartitionContext partition() {
			return getRuleContext(PartitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public Partition_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPartition_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPartition_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPartition_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_finalContext partition_final() throws RecognitionException {
		Partition_finalContext _localctx = new Partition_finalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_partition_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			partition();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(515);
				match(SCOL);
				}
			}

			setState(518);
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

	public static class Partition_with_streamContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode OF() { return getToken(SampleLanguageParser.OF, 0); }
		public Stream_idContext stream_id() {
			return getRuleContext(Stream_idContext.class,0);
		}
		public Condition_rangesContext condition_ranges() {
			return getRuleContext(Condition_rangesContext.class,0);
		}
		public Partition_with_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_with_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPartition_with_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPartition_with_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPartition_with_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_with_streamContext partition_with_stream() throws RecognitionException {
		Partition_with_streamContext _localctx = new Partition_with_streamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_partition_with_stream);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				attribute();
				setState(521);
				match(OF);
				setState(522);
				stream_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				condition_ranges();
				setState(525);
				match(OF);
				setState(526);
				stream_id();
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

	public static class Condition_rangesContext extends ParserRuleContext {
		public List<Condition_rangeContext> condition_range() {
			return getRuleContexts(Condition_rangeContext.class);
		}
		public Condition_rangeContext condition_range(int i) {
			return getRuleContext(Condition_rangeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SampleLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SampleLanguageParser.OR, i);
		}
		public Condition_rangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_ranges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterCondition_ranges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitCondition_ranges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitCondition_ranges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_rangesContext condition_ranges() throws RecognitionException {
		Condition_rangesContext _localctx = new Condition_rangesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition_ranges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			condition_range();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(531);
				match(OR);
				setState(532);
				condition_range();
				}
				}
				setState(537);
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

	public static class Condition_rangeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SampleLanguageParser.AS, 0); }
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Condition_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterCondition_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitCondition_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitCondition_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_rangeContext condition_range() throws RecognitionException {
		Condition_rangeContext _localctx = new Condition_rangeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			expression();
			setState(539);
			match(AS);
			setState(540);
			string_value();
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

	public static class Query_finalContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public Query_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterQuery_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitQuery_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitQuery_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_finalContext query_final() throws RecognitionException {
		Query_finalContext _localctx = new Query_finalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_query_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			query();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(543);
				match(SCOL);
				}
			}

			setState(546);
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SampleLanguageParser.FROM, 0); }
		public Query_inputContext query_input() {
			return getRuleContext(Query_inputContext.class,0);
		}
		public Query_outputContext query_output() {
			return getRuleContext(Query_outputContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public Output_rateContext output_rate() {
			return getRuleContext(Output_rateContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(548);
				annotation();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(FROM);
			setState(555);
			query_input();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(556);
				query_section();
				}
			}

			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(559);
				output_rate();
				}
			}

			setState(562);
			query_output();
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

	public static class Query_inputContext extends ParserRuleContext {
		public Standard_streamContext standard_stream() {
			return getRuleContext(Standard_streamContext.class,0);
		}
		public Join_streamContext join_stream() {
			return getRuleContext(Join_streamContext.class,0);
		}
		public Pattern_streamContext pattern_stream() {
			return getRuleContext(Pattern_streamContext.class,0);
		}
		public Sequence_streamContext sequence_stream() {
			return getRuleContext(Sequence_streamContext.class,0);
		}
		public Anonymous_streamContext anonymous_stream() {
			return getRuleContext(Anonymous_streamContext.class,0);
		}
		public Query_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterQuery_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitQuery_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitQuery_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_inputContext query_input() throws RecognitionException {
		Query_inputContext _localctx = new Query_inputContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_query_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(564);
				standard_stream();
				}
				break;
			case 2:
				{
				setState(565);
				join_stream();
				}
				break;
			case 3:
				{
				setState(566);
				pattern_stream();
				}
				break;
			case 4:
				{
				setState(567);
				sequence_stream();
				}
				break;
			case 5:
				{
				setState(568);
				anonymous_stream();
				}
				break;
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

	public static class Standard_streamContext extends ParserRuleContext {
		public Basic_source_stream_handlersContext pre_window_handlers;
		public Basic_source_stream_handlersContext post_window_handlers;
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public List<Basic_source_stream_handlersContext> basic_source_stream_handlers() {
			return getRuleContexts(Basic_source_stream_handlersContext.class);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers(int i) {
			return getRuleContext(Basic_source_stream_handlersContext.class,i);
		}
		public Standard_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStandard_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStandard_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitStandard_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_streamContext standard_stream() throws RecognitionException {
		Standard_streamContext _localctx = new Standard_streamContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_standard_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			source();
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(572);
				((Standard_streamContext)_localctx).pre_window_handlers = basic_source_stream_handlers();
				}
				break;
			}
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(575);
				window();
				}
				break;
			}
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SQARE_BRACKETS || _la==HASH) {
				{
				setState(578);
				((Standard_streamContext)_localctx).post_window_handlers = basic_source_stream_handlers();
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

	public static class Join_streamContext extends ParserRuleContext {
		public Join_sourceContext left_source;
		public Join_sourceContext right_source;
		public Token right_unidirectional;
		public Token left_unidirectional;
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public List<Join_sourceContext> join_source() {
			return getRuleContexts(Join_sourceContext.class);
		}
		public Join_sourceContext join_source(int i) {
			return getRuleContext(Join_sourceContext.class,i);
		}
		public TerminalNode UNIDIRECTIONAL() { return getToken(SampleLanguageParser.UNIDIRECTIONAL, 0); }
		public TerminalNode ON() { return getToken(SampleLanguageParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Join_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterJoin_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitJoin_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitJoin_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_streamContext join_stream() throws RecognitionException {
		Join_streamContext _localctx = new Join_streamContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_stream);
		int _la;
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				((Join_streamContext)_localctx).left_source = join_source();
				setState(582);
				join();
				setState(583);
				((Join_streamContext)_localctx).right_source = join_source();
				setState(584);
				((Join_streamContext)_localctx).right_unidirectional = match(UNIDIRECTIONAL);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(585);
					match(ON);
					setState(586);
					expression();
					}
				}

				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(589);
					within_time();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				((Join_streamContext)_localctx).left_source = join_source();
				setState(593);
				join();
				setState(594);
				((Join_streamContext)_localctx).right_source = join_source();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(595);
					match(ON);
					setState(596);
					expression();
					}
				}

				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(599);
					within_time();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				((Join_streamContext)_localctx).left_source = join_source();
				setState(603);
				((Join_streamContext)_localctx).left_unidirectional = match(UNIDIRECTIONAL);
				setState(604);
				join();
				setState(605);
				((Join_streamContext)_localctx).right_source = join_source();
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(606);
					match(ON);
					setState(607);
					expression();
					}
				}

				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(610);
					within_time();
					}
				}

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

	public static class Join_sourceContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers() {
			return getRuleContext(Basic_source_stream_handlersContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public TerminalNode AS() { return getToken(SampleLanguageParser.AS, 0); }
		public Stream_aliasContext stream_alias() {
			return getRuleContext(Stream_aliasContext.class,0);
		}
		public Join_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterJoin_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitJoin_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitJoin_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_sourceContext join_source() throws RecognitionException {
		Join_sourceContext _localctx = new Join_sourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_join_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			source();
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(616);
				basic_source_stream_handlers();
				}
				break;
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(619);
				window();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(622);
				match(AS);
				setState(623);
				stream_alias();
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

	public static class Pattern_streamContext extends ParserRuleContext {
		public Every_pattern_source_chainContext every_pattern_source_chain() {
			return getRuleContext(Every_pattern_source_chainContext.class,0);
		}
		public Pattern_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPattern_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPattern_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPattern_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_streamContext pattern_stream() throws RecognitionException {
		Pattern_streamContext _localctx = new Pattern_streamContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pattern_stream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			every_pattern_source_chain(0);
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

	public static class Every_pattern_source_chainContext extends ParserRuleContext {
		public List<Every_pattern_source_chainContext> every_pattern_source_chain() {
			return getRuleContexts(Every_pattern_source_chainContext.class);
		}
		public Every_pattern_source_chainContext every_pattern_source_chain(int i) {
			return getRuleContext(Every_pattern_source_chainContext.class,i);
		}
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SampleLanguageParser.EVERY, 0); }
		public Pattern_source_chainContext pattern_source_chain() {
			return getRuleContext(Pattern_source_chainContext.class,0);
		}
		public Pattern_sourceContext pattern_source() {
			return getRuleContext(Pattern_sourceContext.class,0);
		}
		public Every_pattern_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_pattern_source_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterEvery_pattern_source_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitEvery_pattern_source_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitEvery_pattern_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Every_pattern_source_chainContext every_pattern_source_chain() throws RecognitionException {
		return every_pattern_source_chain(0);
	}

	private Every_pattern_source_chainContext every_pattern_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Every_pattern_source_chainContext _localctx = new Every_pattern_source_chainContext(_ctx, _parentState);
		Every_pattern_source_chainContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_every_pattern_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(629);
				match(OPEN_PAR);
				setState(630);
				every_pattern_source_chain(0);
				setState(631);
				match(CLOSE_PAR);
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(632);
					within_time();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(635);
				match(EVERY);
				setState(636);
				match(OPEN_PAR);
				setState(637);
				pattern_source_chain(0);
				setState(638);
				match(CLOSE_PAR);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(639);
					within_time();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(642);
				pattern_source_chain(0);
				}
				break;
			case 4:
				{
				setState(643);
				match(EVERY);
				setState(644);
				pattern_source();
				setState(646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(645);
					within_time();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Every_pattern_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_every_pattern_source_chain);
					setState(650);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(651);
					match(FOLLOWED_BY);
					setState(652);
					every_pattern_source_chain(4);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class Pattern_source_chainContext extends ParserRuleContext {
		public List<Pattern_source_chainContext> pattern_source_chain() {
			return getRuleContexts(Pattern_source_chainContext.class);
		}
		public Pattern_source_chainContext pattern_source_chain(int i) {
			return getRuleContext(Pattern_source_chainContext.class,i);
		}
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Pattern_sourceContext pattern_source() {
			return getRuleContext(Pattern_sourceContext.class,0);
		}
		public Pattern_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_source_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPattern_source_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPattern_source_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPattern_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_source_chainContext pattern_source_chain() throws RecognitionException {
		return pattern_source_chain(0);
	}

	private Pattern_source_chainContext pattern_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Pattern_source_chainContext _localctx = new Pattern_source_chainContext(_ctx, _parentState);
		Pattern_source_chainContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_pattern_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(659);
				match(OPEN_PAR);
				setState(660);
				pattern_source_chain(0);
				setState(661);
				match(CLOSE_PAR);
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(662);
					within_time();
					}
					break;
				}
				}
				break;
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case OVERWRITE:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
				{
				setState(665);
				pattern_source();
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(666);
					within_time();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Pattern_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern_source_chain);
					setState(671);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(672);
					match(FOLLOWED_BY);
					setState(673);
					pattern_source_chain(3);
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class Pattern_sourceContext extends ParserRuleContext {
		public Logical_stateful_sourceContext logical_stateful_source() {
			return getRuleContext(Logical_stateful_sourceContext.class,0);
		}
		public Pattern_collection_stateful_sourceContext pattern_collection_stateful_source() {
			return getRuleContext(Pattern_collection_stateful_sourceContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Pattern_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPattern_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPattern_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPattern_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_sourceContext pattern_source() throws RecognitionException {
		Pattern_sourceContext _localctx = new Pattern_sourceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pattern_source);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				logical_stateful_source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				pattern_collection_stateful_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				standard_stateful_source();
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

	public static class Logical_stateful_sourceContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SampleLanguageParser.NOT, 0); }
		public List<Standard_stateful_sourceContext> standard_stateful_source() {
			return getRuleContexts(Standard_stateful_sourceContext.class);
		}
		public Standard_stateful_sourceContext standard_stateful_source(int i) {
			return getRuleContext(Standard_stateful_sourceContext.class,i);
		}
		public TerminalNode AND() { return getToken(SampleLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(SampleLanguageParser.OR, 0); }
		public Logical_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterLogical_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitLogical_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitLogical_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_stateful_sourceContext logical_stateful_source() throws RecognitionException {
		Logical_stateful_sourceContext _localctx = new Logical_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logical_stateful_source);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(NOT);
				setState(685);
				standard_stateful_source();
				setState(688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(686);
					match(AND);
					setState(687);
					standard_stateful_source();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				standard_stateful_source();
				setState(691);
				match(AND);
				setState(692);
				standard_stateful_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				standard_stateful_source();
				setState(695);
				match(OR);
				setState(696);
				standard_stateful_source();
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

	public static class Pattern_collection_stateful_sourceContext extends ParserRuleContext {
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public CollectContext collect() {
			return getRuleContext(CollectContext.class,0);
		}
		public Pattern_collection_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_collection_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPattern_collection_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPattern_collection_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitPattern_collection_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_collection_stateful_sourceContext pattern_collection_stateful_source() throws RecognitionException {
		Pattern_collection_stateful_sourceContext _localctx = new Pattern_collection_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_pattern_collection_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			standard_stateful_source();
			setState(701);
			match(LT);
			setState(702);
			collect();
			setState(703);
			match(GT);
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

	public static class Standard_stateful_sourceContext extends ParserRuleContext {
		public Basic_sourceContext basic_source() {
			return getRuleContext(Basic_sourceContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public Standard_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStandard_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStandard_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitStandard_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_stateful_sourceContext standard_stateful_source() throws RecognitionException {
		Standard_stateful_sourceContext _localctx = new Standard_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_standard_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(705);
				event();
				setState(706);
				match(ASSIGN);
				}
				break;
			}
			setState(710);
			basic_source();
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

	public static class Basic_sourceContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers() {
			return getRuleContext(Basic_source_stream_handlersContext.class,0);
		}
		public Basic_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBasic_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBasic_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBasic_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_sourceContext basic_source() throws RecognitionException {
		Basic_sourceContext _localctx = new Basic_sourceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_basic_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			source();
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(713);
				basic_source_stream_handlers();
				}
				break;
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

	public static class Basic_source_stream_handlersContext extends ParserRuleContext {
		public List<Basic_source_stream_handlerContext> basic_source_stream_handler() {
			return getRuleContexts(Basic_source_stream_handlerContext.class);
		}
		public Basic_source_stream_handlerContext basic_source_stream_handler(int i) {
			return getRuleContext(Basic_source_stream_handlerContext.class,i);
		}
		public Basic_source_stream_handlersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source_stream_handlers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBasic_source_stream_handlers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBasic_source_stream_handlers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBasic_source_stream_handlers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_source_stream_handlersContext basic_source_stream_handlers() throws RecognitionException {
		Basic_source_stream_handlersContext _localctx = new Basic_source_stream_handlersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_basic_source_stream_handlers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(716);
					basic_source_stream_handler();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(719); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Basic_source_stream_handlerContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Stream_functionContext stream_function() {
			return getRuleContext(Stream_functionContext.class,0);
		}
		public Basic_source_stream_handlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source_stream_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBasic_source_stream_handler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBasic_source_stream_handler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBasic_source_stream_handler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_source_stream_handlerContext basic_source_stream_handler() throws RecognitionException {
		Basic_source_stream_handlerContext _localctx = new Basic_source_stream_handlerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_basic_source_stream_handler);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				filter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				stream_function();
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

	public static class Sequence_streamContext extends ParserRuleContext {
		public Sequence_sourceContext sequence_source() {
			return getRuleContext(Sequence_sourceContext.class,0);
		}
		public Sequence_source_chainContext sequence_source_chain() {
			return getRuleContext(Sequence_source_chainContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SampleLanguageParser.EVERY, 0); }
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Sequence_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSequence_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSequence_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSequence_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_streamContext sequence_stream() throws RecognitionException {
		Sequence_streamContext _localctx = new Sequence_streamContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sequence_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(725);
				match(EVERY);
				}
				break;
			}
			setState(728);
			sequence_source();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(729);
				within_time();
				}
			}

			setState(732);
			match(COMMA);
			setState(733);
			sequence_source_chain(0);
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

	public static class Sequence_source_chainContext extends ParserRuleContext {
		public List<Sequence_source_chainContext> sequence_source_chain() {
			return getRuleContexts(Sequence_source_chainContext.class);
		}
		public Sequence_source_chainContext sequence_source_chain(int i) {
			return getRuleContext(Sequence_source_chainContext.class,i);
		}
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Sequence_sourceContext sequence_source() {
			return getRuleContext(Sequence_sourceContext.class,0);
		}
		public Sequence_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_source_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSequence_source_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSequence_source_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSequence_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_source_chainContext sequence_source_chain() throws RecognitionException {
		return sequence_source_chain(0);
	}

	private Sequence_source_chainContext sequence_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sequence_source_chainContext _localctx = new Sequence_source_chainContext(_ctx, _parentState);
		Sequence_source_chainContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_sequence_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(736);
				match(OPEN_PAR);
				setState(737);
				sequence_source_chain(0);
				setState(738);
				match(CLOSE_PAR);
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(739);
					within_time();
					}
					break;
				}
				}
				break;
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case OVERWRITE:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
				{
				setState(742);
				sequence_source();
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(743);
					within_time();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sequence_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sequence_source_chain);
					setState(748);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(749);
					match(COMMA);
					setState(750);
					sequence_source_chain(3);
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class Sequence_sourceContext extends ParserRuleContext {
		public Logical_stateful_sourceContext logical_stateful_source() {
			return getRuleContext(Logical_stateful_sourceContext.class,0);
		}
		public Sequence_collection_stateful_sourceContext sequence_collection_stateful_source() {
			return getRuleContext(Sequence_collection_stateful_sourceContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Sequence_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSequence_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSequence_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSequence_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_sourceContext sequence_source() throws RecognitionException {
		Sequence_sourceContext _localctx = new Sequence_sourceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sequence_source);
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				logical_stateful_source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				sequence_collection_stateful_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				standard_stateful_source();
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

	public static class Sequence_collection_stateful_sourceContext extends ParserRuleContext {
		public Token zero_or_more;
		public Token zero_or_one;
		public Token one_or_more;
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public CollectContext collect() {
			return getRuleContext(CollectContext.class,0);
		}
		public Sequence_collection_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_collection_stateful_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSequence_collection_stateful_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSequence_collection_stateful_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSequence_collection_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_collection_stateful_sourceContext sequence_collection_stateful_source() throws RecognitionException {
		Sequence_collection_stateful_sourceContext _localctx = new Sequence_collection_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sequence_collection_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			standard_stateful_source();
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(762);
				match(LT);
				setState(763);
				collect();
				setState(764);
				match(GT);
				}
				break;
			case STAR:
				{
				setState(766);
				((Sequence_collection_stateful_sourceContext)_localctx).zero_or_more = match(STAR);
				}
				break;
			case QUESTION:
				{
				setState(767);
				((Sequence_collection_stateful_sourceContext)_localctx).zero_or_one = match(QUESTION);
				}
				break;
			case PLUS:
				{
				setState(768);
				((Sequence_collection_stateful_sourceContext)_localctx).one_or_more = match(PLUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Anonymous_streamContext extends ParserRuleContext {
		public Anonymous_streamContext anonymous_stream() {
			return getRuleContext(Anonymous_streamContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SampleLanguageParser.FROM, 0); }
		public Query_inputContext query_input() {
			return getRuleContext(Query_inputContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SampleLanguageParser.RETURN, 0); }
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public Output_rateContext output_rate() {
			return getRuleContext(Output_rateContext.class,0);
		}
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public Anonymous_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAnonymous_stream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAnonymous_stream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAnonymous_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_streamContext anonymous_stream() throws RecognitionException {
		Anonymous_streamContext _localctx = new Anonymous_streamContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_anonymous_stream);
		int _la;
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(OPEN_PAR);
				setState(772);
				anonymous_stream();
				setState(773);
				match(CLOSE_PAR);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(FROM);
				setState(776);
				query_input();
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECT) {
					{
					setState(777);
					query_section();
					}
				}

				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTPUT) {
					{
					setState(780);
					output_rate();
					}
				}

				setState(783);
				match(RETURN);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (EVENTS - 47)) | (1L << (EXPIRED - 47)) | (1L << (CURRENT - 47)) | (1L << (ALL - 47)))) != 0)) {
					{
					setState(784);
					output_event_type();
					}
				}

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

	public static class FilterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(789);
				match(HASH);
				}
			}

			setState(792);
			match(OPEN_SQARE_BRACKETS);
			setState(793);
			expression();
			setState(794);
			match(CLOASE_SQARE_BRACKETS);
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

	public static class Stream_functionContext extends ParserRuleContext {
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Stream_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStream_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStream_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitStream_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_functionContext stream_function() throws RecognitionException {
		Stream_functionContext _localctx = new Stream_functionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_stream_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(HASH);
			setState(797);
			function_operation();
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

	public static class WindowContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SampleLanguageParser.WINDOW, 0); }
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public WindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowContext window() throws RecognitionException {
		WindowContext _localctx = new WindowContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(HASH);
			setState(800);
			match(WINDOW);
			setState(801);
			match(DOT);
			setState(802);
			function_operation();
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

	public static class Query_sectionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SampleLanguageParser.SELECT, 0); }
		public Group_byContext group_by() {
			return getRuleContext(Group_byContext.class,0);
		}
		public HavingContext having() {
			return getRuleContext(HavingContext.class,0);
		}
		public List<Output_attributeContext> output_attribute() {
			return getRuleContexts(Output_attributeContext.class);
		}
		public Output_attributeContext output_attribute(int i) {
			return getRuleContext(Output_attributeContext.class,i);
		}
		public Query_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterQuery_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitQuery_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitQuery_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_sectionContext query_section() throws RecognitionException {
		Query_sectionContext _localctx = new Query_sectionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_query_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(804);
			match(SELECT);
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(805);
				match(STAR);
				}
				break;
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case OVERWRITE:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
			case STRING_LITERAL:
				{
				{
				setState(806);
				output_attribute();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(807);
					match(COMMA);
					setState(808);
					output_attribute();
					}
					}
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(816);
				group_by();
				}
			}

			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(819);
				having();
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

	public static class Group_byContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SampleLanguageParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SampleLanguageParser.BY, 0); }
		public List<Attribute_referenceContext> attribute_reference() {
			return getRuleContexts(Attribute_referenceContext.class);
		}
		public Attribute_referenceContext attribute_reference(int i) {
			return getRuleContext(Attribute_referenceContext.class,i);
		}
		public Group_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterGroup_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitGroup_by(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitGroup_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_byContext group_by() throws RecognitionException {
		Group_byContext _localctx = new Group_byContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_group_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(GROUP);
			setState(823);
			match(BY);
			setState(824);
			attribute_reference();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(825);
				match(COMMA);
				setState(826);
				attribute_reference();
				}
				}
				setState(831);
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

	public static class HavingContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SampleLanguageParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterHaving(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitHaving(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitHaving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingContext having() throws RecognitionException {
		HavingContext _localctx = new HavingContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_having);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(HAVING);
			setState(833);
			expression();
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

	public static class Query_outputContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SampleLanguageParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SampleLanguageParser.INTO, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SampleLanguageParser.DELETE, 0); }
		public TerminalNode ON() { return getToken(SampleLanguageParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SampleLanguageParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(SampleLanguageParser.UPDATE, 0); }
		public TerminalNode OVERWRITE() { return getToken(SampleLanguageParser.OVERWRITE, 0); }
		public TerminalNode RETURN() { return getToken(SampleLanguageParser.RETURN, 0); }
		public Query_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterQuery_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitQuery_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitQuery_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_outputContext query_output() throws RecognitionException {
		Query_outputContext _localctx = new Query_outputContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_query_output);
		int _la;
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				match(INSERT);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (EVENTS - 47)) | (1L << (EXPIRED - 47)) | (1L << (CURRENT - 47)) | (1L << (ALL - 47)))) != 0)) {
					{
					setState(836);
					output_event_type();
					}
				}

				setState(839);
				match(INTO);
				setState(840);
				target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(DELETE);
				setState(842);
				target();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(843);
					match(FOR);
					setState(844);
					output_event_type();
					}
				}

				setState(847);
				match(ON);
				setState(848);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				match(UPDATE);
				setState(851);
				target();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(852);
					match(FOR);
					setState(853);
					output_event_type();
					}
				}

				setState(856);
				match(ON);
				setState(857);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(859);
				match(INSERT);
				setState(860);
				match(OVERWRITE);
				setState(861);
				target();
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(862);
					match(FOR);
					setState(863);
					output_event_type();
					}
				}

				setState(866);
				match(ON);
				setState(867);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(869);
				match(RETURN);
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (EVENTS - 47)) | (1L << (EXPIRED - 47)) | (1L << (CURRENT - 47)) | (1L << (ALL - 47)))) != 0)) {
					{
					setState(870);
					output_event_type();
					}
				}

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

	public static class Output_event_typeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SampleLanguageParser.ALL, 0); }
		public TerminalNode EVENTS() { return getToken(SampleLanguageParser.EVENTS, 0); }
		public TerminalNode RAW() { return getToken(SampleLanguageParser.RAW, 0); }
		public TerminalNode EXPIRED() { return getToken(SampleLanguageParser.EXPIRED, 0); }
		public TerminalNode CURRENT() { return getToken(SampleLanguageParser.CURRENT, 0); }
		public Output_event_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_event_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOutput_event_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOutput_event_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitOutput_event_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_event_typeContext output_event_type() throws RecognitionException {
		Output_event_typeContext _localctx = new Output_event_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_output_event_type);
		int _la;
		try {
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				match(ALL);
				setState(876);
				match(EVENTS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(ALL);
				setState(878);
				match(RAW);
				setState(879);
				match(EVENTS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				match(EXPIRED);
				setState(881);
				match(EVENTS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				match(EXPIRED);
				setState(883);
				match(RAW);
				setState(884);
				match(EVENTS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(885);
					match(CURRENT);
					}
				}

				setState(888);
				match(EVENTS);
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

	public static class Output_rateContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(SampleLanguageParser.OUTPUT, 0); }
		public TerminalNode EVERY() { return getToken(SampleLanguageParser.EVERY, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode EVENTS() { return getToken(SampleLanguageParser.EVENTS, 0); }
		public Output_rate_typeContext output_rate_type() {
			return getRuleContext(Output_rate_typeContext.class,0);
		}
		public TerminalNode SNAPSHOT() { return getToken(SampleLanguageParser.SNAPSHOT, 0); }
		public Output_rateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_rate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOutput_rate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOutput_rate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitOutput_rate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_rateContext output_rate() throws RecognitionException {
		Output_rateContext _localctx = new Output_rateContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_output_rate);
		int _la;
		try {
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				match(OUTPUT);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LAST - 70)) | (1L << (ALL - 70)) | (1L << (FIRST - 70)))) != 0)) {
					{
					setState(892);
					output_rate_type();
					}
				}

				setState(895);
				match(EVERY);
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(896);
					time_value();
					}
					break;
				case 2:
					{
					setState(897);
					match(INT_LITERAL);
					setState(898);
					match(EVENTS);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(OUTPUT);
				setState(902);
				match(SNAPSHOT);
				setState(903);
				match(EVERY);
				setState(904);
				time_value();
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

	public static class Output_rate_typeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SampleLanguageParser.ALL, 0); }
		public TerminalNode LAST() { return getToken(SampleLanguageParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SampleLanguageParser.FIRST, 0); }
		public Output_rate_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_rate_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOutput_rate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOutput_rate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitOutput_rate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_rate_typeContext output_rate_type() throws RecognitionException {
		Output_rate_typeContext _localctx = new Output_rate_typeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_output_rate_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LAST - 70)) | (1L << (ALL - 70)) | (1L << (FIRST - 70)))) != 0)) ) {
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

	public static class Within_timeContext extends ParserRuleContext {
		public TerminalNode WITHIN() { return getToken(SampleLanguageParser.WITHIN, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public Within_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterWithin_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitWithin_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitWithin_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Within_timeContext within_time() throws RecognitionException {
		Within_timeContext _localctx = new Within_timeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_within_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(WITHIN);
			setState(910);
			time_value();
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

	public static class Output_attributeContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode AS() { return getToken(SampleLanguageParser.AS, 0); }
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Output_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOutput_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOutput_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitOutput_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_attributeContext output_attribute() throws RecognitionException {
		Output_attributeContext _localctx = new Output_attributeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_output_attribute);
		try {
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				attribute();
				setState(913);
				match(AS);
				setState(914);
				attribute_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				attribute_reference();
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

	public static class AttributeContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			math_operation(0);
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
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			math_operation(0);
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

	public static class Math_operationContext extends ParserRuleContext {
		public Math_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operation; }
	 
		public Math_operationContext() { }
		public void copyFrom(Math_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Multiplication_math_operationContext extends Math_operationContext {
		public Token multiply;
		public Token devide;
		public Token mod;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Multiplication_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterMultiplication_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitMultiplication_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitMultiplication_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Greaterthan_lessthan_math_operationContext extends Math_operationContext {
		public Token gt_eq;
		public Token lt_eq;
		public Token gt;
		public Token lt;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Greaterthan_lessthan_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterGreaterthan_lessthan_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitGreaterthan_lessthan_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitGreaterthan_lessthan_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Basic_math_operationContext extends Math_operationContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Null_checkContext null_check() {
			return getRuleContext(Null_checkContext.class,0);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Basic_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBasic_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBasic_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBasic_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class In_math_operationContext extends Math_operationContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public TerminalNode IN() { return getToken(SampleLanguageParser.IN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public In_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterIn_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitIn_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitIn_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Addition_math_operationContext extends Math_operationContext {
		public Token add;
		public Token substract;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Addition_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAddition_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAddition_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAddition_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_math_operationContext extends Math_operationContext {
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public TerminalNode AND() { return getToken(SampleLanguageParser.AND, 0); }
		public And_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAnd_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAnd_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAnd_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_math_operationContext extends Math_operationContext {
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public TerminalNode OR() { return getToken(SampleLanguageParser.OR, 0); }
		public Or_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOr_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOr_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitOr_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Equality_math_operationContext extends Math_operationContext {
		public Token eq;
		public Token not_eq;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Equality_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterEquality_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitEquality_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitEquality_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_math_operationContext extends Math_operationContext {
		public TerminalNode NOT() { return getToken(SampleLanguageParser.NOT, 0); }
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Not_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterNot_math_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitNot_math_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitNot_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operationContext math_operation() throws RecognitionException {
		return math_operation(0);
	}

	private Math_operationContext math_operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_operationContext _localctx = new Math_operationContext(_ctx, _parentState);
		Math_operationContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_math_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(924);
				match(OPEN_PAR);
				setState(925);
				math_operation(0);
				setState(926);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(928);
				null_check();
				}
				break;
			case 3:
				{
				_localctx = new Not_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(929);
				match(NOT);
				setState(930);
				math_operation(11);
				}
				break;
			case 4:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(931);
				function_operation();
				}
				break;
			case 5:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(932);
				constant_value();
				}
				break;
			case 6:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(933);
				attribute_reference();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(972);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplication_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(936);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(940);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
							{
							setState(937);
							((Multiplication_math_operationContext)_localctx).multiply = match(STAR);
							}
							break;
						case DIV:
							{
							setState(938);
							((Multiplication_math_operationContext)_localctx).devide = match(DIV);
							}
							break;
						case MOD:
							{
							setState(939);
							((Multiplication_math_operationContext)_localctx).mod = match(MOD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(942);
						math_operation(11);
						}
						break;
					case 2:
						{
						_localctx = new Addition_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(943);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(946);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(944);
							((Addition_math_operationContext)_localctx).add = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(945);
							((Addition_math_operationContext)_localctx).substract = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(948);
						math_operation(10);
						}
						break;
					case 3:
						{
						_localctx = new Greaterthan_lessthan_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(949);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(954);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GT_EQ:
							{
							setState(950);
							((Greaterthan_lessthan_math_operationContext)_localctx).gt_eq = match(GT_EQ);
							}
							break;
						case LT_EQ:
							{
							setState(951);
							((Greaterthan_lessthan_math_operationContext)_localctx).lt_eq = match(LT_EQ);
							}
							break;
						case GT:
							{
							setState(952);
							((Greaterthan_lessthan_math_operationContext)_localctx).gt = match(GT);
							}
							break;
						case LT:
							{
							setState(953);
							((Greaterthan_lessthan_math_operationContext)_localctx).lt = match(LT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(956);
						math_operation(9);
						}
						break;
					case 4:
						{
						_localctx = new Equality_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(957);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(960);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(958);
							((Equality_math_operationContext)_localctx).eq = match(EQ);
							}
							break;
						case NOT_EQ:
							{
							setState(959);
							((Equality_math_operationContext)_localctx).not_eq = match(NOT_EQ);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(962);
						math_operation(8);
						}
						break;
					case 5:
						{
						_localctx = new And_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(963);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(964);
						match(AND);
						setState(965);
						math_operation(6);
						}
						break;
					case 6:
						{
						_localctx = new Or_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(966);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(967);
						match(OR);
						setState(968);
						math_operation(5);
						}
						break;
					case 7:
						{
						_localctx = new In_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(969);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(970);
						match(IN);
						setState(971);
						name();
						}
						break;
					}
					} 
				}
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class Function_operationContext extends ParserRuleContext {
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public Function_namespaceContext function_namespace() {
			return getRuleContext(Function_namespaceContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Function_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFunction_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFunction_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFunction_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_operationContext function_operation() throws RecognitionException {
		Function_operationContext _localctx = new Function_operationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_function_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(977);
				function_namespace();
				setState(978);
				match(COL);
				}
				break;
			}
			setState(982);
			function_id();
			setState(983);
			match(OPEN_PAR);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << OPEN_PAR) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << HASH) | (1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << INSERT) | (1L << OVERWRITE) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS) | (1L << OR) | (1L << AND) | (1L << ON) | (1L << IS) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WITHIN - 64)) | (1L << (WITH - 64)) | (1L << (BEGIN - 64)) | (1L << (END - 64)) | (1L << (NULL - 64)) | (1L << (EVERY - 64)) | (1L << (LAST - 64)) | (1L << (ALL - 64)) | (1L << (FIRST - 64)) | (1L << (JOIN - 64)) | (1L << (INNER - 64)) | (1L << (OUTER - 64)) | (1L << (RIGHT - 64)) | (1L << (LEFT - 64)) | (1L << (FULL - 64)) | (1L << (UNIDIRECTIONAL - 64)) | (1L << (YEARS - 64)) | (1L << (MONTHS - 64)) | (1L << (WEEKS - 64)) | (1L << (DAYS - 64)) | (1L << (HOURS - 64)) | (1L << (MINUTES - 64)) | (1L << (SECONDS - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (FALSE - 64)) | (1L << (TRUE - 64)) | (1L << (STRING - 64)) | (1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (BOOL - 64)) | (1L << (OBJECT - 64)) | (1L << (ID_QUOTES - 64)) | (1L << (ID - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				setState(984);
				attribute_list();
				}
			}

			setState(987);
			match(CLOSE_PAR);
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

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attribute_list);
		int _la;
		try {
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case OVERWRITE:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(989);
				attribute();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(990);
					match(COMMA);
					setState(991);
					attribute();
					}
					}
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(STAR);
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

	public static class Null_checkContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(SampleLanguageParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SampleLanguageParser.NULL, 0); }
		public Stream_referenceContext stream_reference() {
			return getRuleContext(Stream_referenceContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Null_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterNull_check(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitNull_check(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitNull_check(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_checkContext null_check() throws RecognitionException {
		Null_checkContext _localctx = new Null_checkContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_null_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1000);
				stream_reference();
				}
				break;
			case 2:
				{
				setState(1001);
				attribute_reference();
				}
				break;
			case 3:
				{
				setState(1002);
				function_operation();
				}
				break;
			}
			setState(1005);
			match(IS);
			setState(1006);
			match(NULL);
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

	public static class Stream_referenceContext extends ParserRuleContext {
		public Token hash;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Attribute_indexContext attribute_index() {
			return getRuleContext(Attribute_indexContext.class,0);
		}
		public Stream_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStream_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStream_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitStream_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_referenceContext stream_reference() throws RecognitionException {
		Stream_referenceContext _localctx = new Stream_referenceContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_stream_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1008);
				((Stream_referenceContext)_localctx).hash = match(HASH);
				}
			}

			setState(1011);
			name();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SQARE_BRACKETS) {
				{
				setState(1012);
				match(OPEN_SQARE_BRACKETS);
				setState(1013);
				attribute_index();
				setState(1014);
				match(CLOASE_SQARE_BRACKETS);
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

	public static class Attribute_referenceContext extends ParserRuleContext {
		public Token hash1;
		public NameContext name1;
		public Attribute_indexContext attribute_index1;
		public Token hash2;
		public NameContext name2;
		public Attribute_indexContext attribute_index2;
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Attribute_indexContext> attribute_index() {
			return getRuleContexts(Attribute_indexContext.class);
		}
		public Attribute_indexContext attribute_index(int i) {
			return getRuleContext(Attribute_indexContext.class,i);
		}
		public Attribute_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAttribute_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAttribute_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAttribute_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_referenceContext attribute_reference() throws RecognitionException {
		Attribute_referenceContext _localctx = new Attribute_referenceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_attribute_reference);
		int _la;
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(1018);
					((Attribute_referenceContext)_localctx).hash1 = match(HASH);
					}
				}

				setState(1021);
				((Attribute_referenceContext)_localctx).name1 = name();
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQARE_BRACKETS) {
					{
					setState(1022);
					match(OPEN_SQARE_BRACKETS);
					setState(1023);
					((Attribute_referenceContext)_localctx).attribute_index1 = attribute_index();
					setState(1024);
					match(CLOASE_SQARE_BRACKETS);
					}
				}

				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(1028);
					((Attribute_referenceContext)_localctx).hash2 = match(HASH);
					setState(1029);
					((Attribute_referenceContext)_localctx).name2 = name();
					setState(1034);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_SQARE_BRACKETS) {
						{
						setState(1030);
						match(OPEN_SQARE_BRACKETS);
						setState(1031);
						((Attribute_referenceContext)_localctx).attribute_index2 = attribute_index();
						setState(1032);
						match(CLOASE_SQARE_BRACKETS);
						}
					}

					}
				}

				setState(1038);
				match(DOT);
				setState(1039);
				attribute_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				attribute_name();
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

	public static class Attribute_indexContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode LAST() { return getToken(SampleLanguageParser.LAST, 0); }
		public Attribute_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAttribute_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAttribute_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAttribute_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_indexContext attribute_index() throws RecognitionException {
		Attribute_indexContext _localctx = new Attribute_indexContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attribute_index);
		int _la;
		try {
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				match(INT_LITERAL);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				match(LAST);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1046);
					match(MINUS);
					setState(1047);
					match(INT_LITERAL);
					}
				}

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

	public static class Function_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFunction_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFunction_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFunction_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_idContext function_id() throws RecognitionException {
		Function_idContext _localctx = new Function_idContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			name();
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

	public static class Function_namespaceContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_namespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFunction_namespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFunction_namespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitFunction_namespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_namespaceContext function_namespace() throws RecognitionException {
		Function_namespaceContext _localctx = new Function_namespaceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_function_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			name();
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

	public static class Stream_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Stream_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStream_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStream_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitStream_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_idContext stream_id() throws RecognitionException {
		Stream_idContext _localctx = new Stream_idContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_stream_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			name();
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

	public static class Stream_aliasContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Stream_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStream_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStream_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitStream_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_aliasContext stream_alias() throws RecognitionException {
		Stream_aliasContext _localctx = new Stream_aliasContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_stream_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			name();
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

	public static class Property_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Property_separatorContext> property_separator() {
			return getRuleContexts(Property_separatorContext.class);
		}
		public Property_separatorContext property_separator(int i) {
			return getRuleContext(Property_separatorContext.class,i);
		}
		public Property_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterProperty_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitProperty_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitProperty_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_nameContext property_name() throws RecognitionException {
		Property_nameContext _localctx = new Property_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_property_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			name();
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COL) | (1L << DOT) | (1L << MINUS))) != 0)) {
				{
				{
				setState(1061);
				property_separator();
				setState(1062);
				name();
				}
				}
				setState(1068);
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

	public static class Attribute_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			name();
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			name();
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

	public static class Property_valueContext extends ParserRuleContext {
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterProperty_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitProperty_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitProperty_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_property_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			string_value();
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

	public static class Property_separatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SampleLanguageParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(SampleLanguageParser.MINUS, 0); }
		public TerminalNode COL() { return getToken(SampleLanguageParser.COL, 0); }
		public Property_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterProperty_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitProperty_separator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitProperty_separator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_separatorContext property_separator() throws RecognitionException {
		Property_separatorContext _localctx = new Property_separatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_property_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COL) | (1L << DOT) | (1L << MINUS))) != 0)) ) {
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

	public static class SourceContext extends ParserRuleContext {
		public Token inner;
		public Stream_idContext stream_id() {
			return getRuleContext(Stream_idContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1077);
				((SourceContext)_localctx).inner = match(HASH);
				}
			}

			setState(1080);
			stream_id();
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

	public static class TargetContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			source();
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

	public static class EventContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			name();
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

	public static class NameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_name);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_QUOTES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				id();
				}
				break;
			case STREAM:
			case DEFINE:
			case TABLE:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case HAVING:
			case INSERT:
			case OVERWRITE:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				keyword();
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

	public static class CollectContext extends ParserRuleContext {
		public Token start;
		public Token end;
		public List<TerminalNode> INT_LITERAL() { return getTokens(SampleLanguageParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(SampleLanguageParser.INT_LITERAL, i);
		}
		public CollectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterCollect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitCollect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitCollect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectContext collect() throws RecognitionException {
		CollectContext _localctx = new CollectContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_collect);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				((CollectContext)_localctx).start = match(INT_LITERAL);
				setState(1091);
				match(COL);
				setState(1092);
				((CollectContext)_localctx).end = match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				((CollectContext)_localctx).start = match(INT_LITERAL);
				setState(1094);
				match(COL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1095);
				match(COL);
				setState(1096);
				((CollectContext)_localctx).end = match(INT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1097);
				match(INT_LITERAL);
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

	public static class Attribute_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SampleLanguageParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SampleLanguageParser.INT, 0); }
		public TerminalNode LONG() { return getToken(SampleLanguageParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(SampleLanguageParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SampleLanguageParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(SampleLanguageParser.BOOL, 0); }
		public TerminalNode OBJECT() { return getToken(SampleLanguageParser.OBJECT, 0); }
		public Attribute_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterAttribute_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitAttribute_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitAttribute_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_typeContext attribute_type() throws RecognitionException {
		Attribute_typeContext _localctx = new Attribute_typeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_attribute_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (STRING - 90)) | (1L << (INT - 90)) | (1L << (LONG - 90)) | (1L << (FLOAT - 90)) | (1L << (DOUBLE - 90)) | (1L << (BOOL - 90)) | (1L << (OBJECT - 90)))) != 0)) ) {
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

	public static class JoinContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(SampleLanguageParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SampleLanguageParser.OUTER, 0); }
		public TerminalNode JOIN() { return getToken(SampleLanguageParser.JOIN, 0); }
		public TerminalNode RIGHT() { return getToken(SampleLanguageParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SampleLanguageParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SampleLanguageParser.INNER, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_join);
		int _la;
		try {
			setState(1117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				match(LEFT);
				setState(1103);
				match(OUTER);
				setState(1104);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				match(RIGHT);
				setState(1106);
				match(OUTER);
				setState(1107);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				match(FULL);
				setState(1109);
				match(OUTER);
				setState(1110);
				match(JOIN);
				}
				break;
			case OUTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1111);
				match(OUTER);
				setState(1112);
				match(JOIN);
				}
				break;
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1113);
					match(INNER);
					}
				}

				setState(1116);
				match(JOIN);
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

	public static class Constant_valueContext extends ParserRuleContext {
		public Bool_valueContext bool_value() {
			return getRuleContext(Bool_valueContext.class,0);
		}
		public Signed_double_valueContext signed_double_value() {
			return getRuleContext(Signed_double_valueContext.class,0);
		}
		public Signed_float_valueContext signed_float_value() {
			return getRuleContext(Signed_float_valueContext.class,0);
		}
		public Signed_long_valueContext signed_long_value() {
			return getRuleContext(Signed_long_valueContext.class,0);
		}
		public Signed_int_valueContext signed_int_value() {
			return getRuleContext(Signed_int_valueContext.class,0);
		}
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Constant_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterConstant_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitConstant_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitConstant_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_valueContext constant_value() throws RecognitionException {
		Constant_valueContext _localctx = new Constant_valueContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constant_value);
		try {
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				bool_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				signed_double_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1121);
				signed_float_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1122);
				signed_long_value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1123);
				signed_int_value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1124);
				time_value();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1125);
				string_value();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID_QUOTES() { return getToken(SampleLanguageParser.ID_QUOTES, 0); }
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_la = _input.LA(1);
			if ( !(_la==ID_QUOTES || _la==ID) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode STREAM() { return getToken(SampleLanguageParser.STREAM, 0); }
		public TerminalNode DEFINE() { return getToken(SampleLanguageParser.DEFINE, 0); }
		public TerminalNode TABLE() { return getToken(SampleLanguageParser.TABLE, 0); }
		public TerminalNode FROM() { return getToken(SampleLanguageParser.FROM, 0); }
		public TerminalNode PARTITION() { return getToken(SampleLanguageParser.PARTITION, 0); }
		public TerminalNode WINDOW() { return getToken(SampleLanguageParser.WINDOW, 0); }
		public TerminalNode SELECT() { return getToken(SampleLanguageParser.SELECT, 0); }
		public TerminalNode GROUP() { return getToken(SampleLanguageParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SampleLanguageParser.BY, 0); }
		public TerminalNode HAVING() { return getToken(SampleLanguageParser.HAVING, 0); }
		public TerminalNode INSERT() { return getToken(SampleLanguageParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SampleLanguageParser.OVERWRITE, 0); }
		public TerminalNode DELETE() { return getToken(SampleLanguageParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SampleLanguageParser.UPDATE, 0); }
		public TerminalNode RETURN() { return getToken(SampleLanguageParser.RETURN, 0); }
		public TerminalNode EVENTS() { return getToken(SampleLanguageParser.EVENTS, 0); }
		public TerminalNode INTO() { return getToken(SampleLanguageParser.INTO, 0); }
		public TerminalNode OUTPUT() { return getToken(SampleLanguageParser.OUTPUT, 0); }
		public TerminalNode EXPIRED() { return getToken(SampleLanguageParser.EXPIRED, 0); }
		public TerminalNode CURRENT() { return getToken(SampleLanguageParser.CURRENT, 0); }
		public TerminalNode SNAPSHOT() { return getToken(SampleLanguageParser.SNAPSHOT, 0); }
		public TerminalNode FOR() { return getToken(SampleLanguageParser.FOR, 0); }
		public TerminalNode RAW() { return getToken(SampleLanguageParser.RAW, 0); }
		public TerminalNode OF() { return getToken(SampleLanguageParser.OF, 0); }
		public TerminalNode AS() { return getToken(SampleLanguageParser.AS, 0); }
		public TerminalNode OR() { return getToken(SampleLanguageParser.OR, 0); }
		public TerminalNode AND() { return getToken(SampleLanguageParser.AND, 0); }
		public TerminalNode ON() { return getToken(SampleLanguageParser.ON, 0); }
		public TerminalNode IS() { return getToken(SampleLanguageParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SampleLanguageParser.NOT, 0); }
		public TerminalNode WITHIN() { return getToken(SampleLanguageParser.WITHIN, 0); }
		public TerminalNode WITH() { return getToken(SampleLanguageParser.WITH, 0); }
		public TerminalNode BEGIN() { return getToken(SampleLanguageParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SampleLanguageParser.END, 0); }
		public TerminalNode NULL() { return getToken(SampleLanguageParser.NULL, 0); }
		public TerminalNode EVERY() { return getToken(SampleLanguageParser.EVERY, 0); }
		public TerminalNode LAST() { return getToken(SampleLanguageParser.LAST, 0); }
		public TerminalNode ALL() { return getToken(SampleLanguageParser.ALL, 0); }
		public TerminalNode FIRST() { return getToken(SampleLanguageParser.FIRST, 0); }
		public TerminalNode JOIN() { return getToken(SampleLanguageParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(SampleLanguageParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(SampleLanguageParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SampleLanguageParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(SampleLanguageParser.LEFT, 0); }
		public TerminalNode FULL() { return getToken(SampleLanguageParser.FULL, 0); }
		public TerminalNode UNIDIRECTIONAL() { return getToken(SampleLanguageParser.UNIDIRECTIONAL, 0); }
		public TerminalNode YEARS() { return getToken(SampleLanguageParser.YEARS, 0); }
		public TerminalNode MONTHS() { return getToken(SampleLanguageParser.MONTHS, 0); }
		public TerminalNode WEEKS() { return getToken(SampleLanguageParser.WEEKS, 0); }
		public TerminalNode DAYS() { return getToken(SampleLanguageParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(SampleLanguageParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(SampleLanguageParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(SampleLanguageParser.SECONDS, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SampleLanguageParser.MILLISECONDS, 0); }
		public TerminalNode FALSE() { return getToken(SampleLanguageParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(SampleLanguageParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(SampleLanguageParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SampleLanguageParser.INT, 0); }
		public TerminalNode LONG() { return getToken(SampleLanguageParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(SampleLanguageParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SampleLanguageParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(SampleLanguageParser.BOOL, 0); }
		public TerminalNode OBJECT() { return getToken(SampleLanguageParser.OBJECT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << INSERT) | (1L << OVERWRITE) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS) | (1L << OR) | (1L << AND) | (1L << ON) | (1L << IS) | (1L << NOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WITHIN - 64)) | (1L << (WITH - 64)) | (1L << (BEGIN - 64)) | (1L << (END - 64)) | (1L << (NULL - 64)) | (1L << (EVERY - 64)) | (1L << (LAST - 64)) | (1L << (ALL - 64)) | (1L << (FIRST - 64)) | (1L << (JOIN - 64)) | (1L << (INNER - 64)) | (1L << (OUTER - 64)) | (1L << (RIGHT - 64)) | (1L << (LEFT - 64)) | (1L << (FULL - 64)) | (1L << (UNIDIRECTIONAL - 64)) | (1L << (YEARS - 64)) | (1L << (MONTHS - 64)) | (1L << (WEEKS - 64)) | (1L << (DAYS - 64)) | (1L << (HOURS - 64)) | (1L << (MINUTES - 64)) | (1L << (SECONDS - 64)) | (1L << (MILLISECONDS - 64)) | (1L << (FALSE - 64)) | (1L << (TRUE - 64)) | (1L << (STRING - 64)) | (1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (BOOL - 64)) | (1L << (OBJECT - 64)))) != 0)) ) {
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

	public static class Time_valueContext extends ParserRuleContext {
		public Year_valueContext year_value() {
			return getRuleContext(Year_valueContext.class,0);
		}
		public Month_valueContext month_value() {
			return getRuleContext(Month_valueContext.class,0);
		}
		public Week_valueContext week_value() {
			return getRuleContext(Week_valueContext.class,0);
		}
		public Day_valueContext day_value() {
			return getRuleContext(Day_valueContext.class,0);
		}
		public Hour_valueContext hour_value() {
			return getRuleContext(Hour_valueContext.class,0);
		}
		public Minute_valueContext minute_value() {
			return getRuleContext(Minute_valueContext.class,0);
		}
		public Second_valueContext second_value() {
			return getRuleContext(Second_valueContext.class,0);
		}
		public Millisecond_valueContext millisecond_value() {
			return getRuleContext(Millisecond_valueContext.class,0);
		}
		public Time_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterTime_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitTime_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitTime_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_valueContext time_value() throws RecognitionException {
		Time_valueContext _localctx = new Time_valueContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_time_value);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				year_value();
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1133);
					month_value();
					}
					break;
				}
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1136);
					week_value();
					}
					break;
				}
				setState(1140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1139);
					day_value();
					}
					break;
				}
				setState(1143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1142);
					hour_value();
					}
					break;
				}
				setState(1146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1145);
					minute_value();
					}
					break;
				}
				setState(1149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1148);
					second_value();
					}
					break;
				}
				setState(1152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1151);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				month_value();
				setState(1156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1155);
					week_value();
					}
					break;
				}
				setState(1159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1158);
					day_value();
					}
					break;
				}
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1161);
					hour_value();
					}
					break;
				}
				setState(1165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1164);
					minute_value();
					}
					break;
				}
				setState(1168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1167);
					second_value();
					}
					break;
				}
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1170);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173);
				week_value();
				setState(1175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1174);
					day_value();
					}
					break;
				}
				setState(1178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1177);
					hour_value();
					}
					break;
				}
				setState(1181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1180);
					minute_value();
					}
					break;
				}
				setState(1184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1183);
					second_value();
					}
					break;
				}
				setState(1187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1186);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				day_value();
				setState(1191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1190);
					hour_value();
					}
					break;
				}
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1193);
					minute_value();
					}
					break;
				}
				setState(1197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1196);
					second_value();
					}
					break;
				}
				setState(1200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1199);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1202);
				hour_value();
				setState(1204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1203);
					minute_value();
					}
					break;
				}
				setState(1207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1206);
					second_value();
					}
					break;
				}
				setState(1210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1209);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1212);
				minute_value();
				setState(1214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1213);
					second_value();
					}
					break;
				}
				setState(1217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1216);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1219);
				second_value();
				setState(1221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1220);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1223);
				millisecond_value();
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

	public static class Year_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode YEARS() { return getToken(SampleLanguageParser.YEARS, 0); }
		public Year_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterYear_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitYear_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitYear_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Year_valueContext year_value() throws RecognitionException {
		Year_valueContext _localctx = new Year_valueContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_year_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(INT_LITERAL);
			setState(1227);
			match(YEARS);
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

	public static class Month_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode MONTHS() { return getToken(SampleLanguageParser.MONTHS, 0); }
		public Month_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterMonth_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitMonth_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitMonth_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Month_valueContext month_value() throws RecognitionException {
		Month_valueContext _localctx = new Month_valueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_month_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(INT_LITERAL);
			setState(1230);
			match(MONTHS);
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

	public static class Week_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode WEEKS() { return getToken(SampleLanguageParser.WEEKS, 0); }
		public Week_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_week_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterWeek_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitWeek_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitWeek_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Week_valueContext week_value() throws RecognitionException {
		Week_valueContext _localctx = new Week_valueContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_week_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(INT_LITERAL);
			setState(1233);
			match(WEEKS);
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

	public static class Day_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode DAYS() { return getToken(SampleLanguageParser.DAYS, 0); }
		public Day_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterDay_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitDay_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitDay_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Day_valueContext day_value() throws RecognitionException {
		Day_valueContext _localctx = new Day_valueContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_day_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(INT_LITERAL);
			setState(1236);
			match(DAYS);
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

	public static class Hour_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode HOURS() { return getToken(SampleLanguageParser.HOURS, 0); }
		public Hour_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterHour_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitHour_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitHour_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hour_valueContext hour_value() throws RecognitionException {
		Hour_valueContext _localctx = new Hour_valueContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_hour_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(INT_LITERAL);
			setState(1239);
			match(HOURS);
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

	public static class Minute_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode MINUTES() { return getToken(SampleLanguageParser.MINUTES, 0); }
		public Minute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterMinute_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitMinute_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitMinute_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minute_valueContext minute_value() throws RecognitionException {
		Minute_valueContext _localctx = new Minute_valueContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_minute_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(INT_LITERAL);
			setState(1242);
			match(MINUTES);
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

	public static class Second_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode SECONDS() { return getToken(SampleLanguageParser.SECONDS, 0); }
		public Second_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSecond_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSecond_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSecond_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_valueContext second_value() throws RecognitionException {
		Second_valueContext _localctx = new Second_valueContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_second_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(INT_LITERAL);
			setState(1245);
			match(SECONDS);
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

	public static class Millisecond_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SampleLanguageParser.MILLISECONDS, 0); }
		public Millisecond_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_millisecond_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterMillisecond_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitMillisecond_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitMillisecond_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Millisecond_valueContext millisecond_value() throws RecognitionException {
		Millisecond_valueContext _localctx = new Millisecond_valueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_millisecond_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(INT_LITERAL);
			setState(1248);
			match(MILLISECONDS);
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

	public static class Signed_double_valueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SampleLanguageParser.DOUBLE_LITERAL, 0); }
		public Signed_double_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_double_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSigned_double_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSigned_double_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSigned_double_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_double_valueContext signed_double_value() throws RecognitionException {
		Signed_double_valueContext _localctx = new Signed_double_valueContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_signed_double_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1250);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1253);
			match(DOUBLE_LITERAL);
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

	public static class Signed_long_valueContext extends ParserRuleContext {
		public TerminalNode LONG_LITERAL() { return getToken(SampleLanguageParser.LONG_LITERAL, 0); }
		public Signed_long_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_long_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSigned_long_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSigned_long_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSigned_long_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_long_valueContext signed_long_value() throws RecognitionException {
		Signed_long_valueContext _localctx = new Signed_long_valueContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_signed_long_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1255);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1258);
			match(LONG_LITERAL);
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

	public static class Signed_float_valueContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SampleLanguageParser.FLOAT_LITERAL, 0); }
		public Signed_float_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_float_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSigned_float_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSigned_float_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSigned_float_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_float_valueContext signed_float_value() throws RecognitionException {
		Signed_float_valueContext _localctx = new Signed_float_valueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_signed_float_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1260);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1263);
			match(FLOAT_LITERAL);
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

	public static class Signed_int_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SampleLanguageParser.INT_LITERAL, 0); }
		public Signed_int_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterSigned_int_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitSigned_int_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitSigned_int_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_int_valueContext signed_int_value() throws RecognitionException {
		Signed_int_valueContext _localctx = new Signed_int_valueContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_signed_int_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1265);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1268);
			match(INT_LITERAL);
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

	public static class Bool_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SampleLanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SampleLanguageParser.FALSE, 0); }
		public Bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitBool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valueContext bool_value() throws RecognitionException {
		Bool_valueContext _localctx = new Bool_valueContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_bool_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class String_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SampleLanguageParser.STRING_LITERAL, 0); }
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterString_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitString_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SampleLanguageVisitor ) return ((SampleLanguageVisitor<? extends T>)visitor).visitString_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_string_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(STRING_LITERAL);
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
		case 33:
			return every_pattern_source_chain_sempred((Every_pattern_source_chainContext)_localctx, predIndex);
		case 34:
			return pattern_source_chain_sempred((Pattern_source_chainContext)_localctx, predIndex);
		case 43:
			return sequence_source_chain_sempred((Sequence_source_chainContext)_localctx, predIndex);
		case 61:
			return math_operation_sempred((Math_operationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean every_pattern_source_chain_sempred(Every_pattern_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean pattern_source_chain_sempred(Pattern_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sequence_source_chain_sempred(Sequence_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean math_operation_sempred(Math_operationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3j\u04fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\7\4\u00d6\n\4\f\4\16\4\u00d9\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e1"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ea\n\4\7\4\u00ec\n\4\f\4\16\4"+
		"\u00ef\13\4\3\4\5\4\u00f2\n\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\4\3\4\3\4\5"+
		"\4\u00fc\n\4\7\4\u00fe\n\4\f\4\16\4\u0101\13\4\3\4\5\4\u0104\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u010d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0116"+
		"\n\4\7\4\u0118\n\4\f\4\16\4\u011b\13\4\3\4\3\4\3\4\5\4\u0120\n\4\7\4\u0122"+
		"\n\4\f\4\16\4\u0125\13\4\3\4\5\4\u0128\n\4\5\4\u012a\n\4\3\5\3\5\5\5\u012e"+
		"\n\5\3\6\3\6\5\6\u0132\n\6\3\6\3\6\3\7\7\7\u0137\n\7\f\7\16\7\u013a\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0146\n\7\f\7\16\7\u0149"+
		"\13\7\3\7\3\7\3\b\3\b\5\b\u014f\n\b\3\b\3\b\3\t\7\t\u0154\n\t\f\t\16\t"+
		"\u0157\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0163\n\t\f\t"+
		"\16\t\u0166\13\t\3\t\3\t\3\n\3\n\5\n\u016c\n\n\3\n\3\n\3\13\7\13\u0171"+
		"\n\13\f\13\16\13\u0174\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u0180\n\13\f\13\16\13\u0183\13\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0189\n\13\3\f\3\f\5\f\u018d\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u01a3\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01ae\n\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u01b7\n\24\3\24\3\24\3\24\5\24\u01bc\n"+
		"\24\7\24\u01be\n\24\f\24\16\24\u01c1\13\24\3\24\3\24\5\24\u01c5\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01cf\n\25\f\25\16\25\u01d2"+
		"\13\25\3\25\3\25\5\25\u01d6\n\25\3\26\3\26\3\26\5\26\u01db\n\26\3\26\3"+
		"\26\3\27\7\27\u01e0\n\27\f\27\16\27\u01e3\13\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u01eb\n\27\f\27\16\27\u01ee\13\27\3\27\3\27\3\27\3\27\5"+
		"\27\u01f4\n\27\3\27\3\27\3\27\5\27\u01f9\n\27\7\27\u01fb\n\27\f\27\16"+
		"\27\u01fe\13\27\3\27\5\27\u0201\n\27\3\27\3\27\3\30\3\30\5\30\u0207\n"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0213\n\31"+
		"\3\32\3\32\3\32\7\32\u0218\n\32\f\32\16\32\u021b\13\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\5\34\u0223\n\34\3\34\3\34\3\35\7\35\u0228\n\35\f\35\16"+
		"\35\u022b\13\35\3\35\3\35\3\35\5\35\u0230\n\35\3\35\5\35\u0233\n\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u023c\n\36\3\37\3\37\5\37\u0240"+
		"\n\37\3\37\5\37\u0243\n\37\3\37\5\37\u0246\n\37\3 \3 \3 \3 \3 \3 \5 \u024e"+
		"\n \3 \5 \u0251\n \3 \3 \3 \3 \3 \5 \u0258\n \3 \5 \u025b\n \3 \3 \3 "+
		"\3 \3 \3 \5 \u0263\n \3 \5 \u0266\n \5 \u0268\n \3!\3!\5!\u026c\n!\3!"+
		"\5!\u026f\n!\3!\3!\5!\u0273\n!\3\"\3\"\3#\3#\3#\3#\3#\5#\u027c\n#\3#\3"+
		"#\3#\3#\3#\5#\u0283\n#\3#\3#\3#\3#\5#\u0289\n#\5#\u028b\n#\3#\3#\3#\7"+
		"#\u0290\n#\f#\16#\u0293\13#\3$\3$\3$\3$\3$\5$\u029a\n$\3$\3$\5$\u029e"+
		"\n$\5$\u02a0\n$\3$\3$\3$\7$\u02a5\n$\f$\16$\u02a8\13$\3%\3%\3%\5%\u02ad"+
		"\n%\3&\3&\3&\3&\5&\u02b3\n&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02bd\n&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\5(\u02c7\n(\3(\3(\3)\3)\5)\u02cd\n)\3*\6*\u02d0"+
		"\n*\r*\16*\u02d1\3+\3+\5+\u02d6\n+\3,\5,\u02d9\n,\3,\3,\5,\u02dd\n,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\5-\u02e7\n-\3-\3-\5-\u02eb\n-\5-\u02ed\n-\3-\3"+
		"-\3-\7-\u02f2\n-\f-\16-\u02f5\13-\3.\3.\3.\5.\u02fa\n.\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\5/\u0304\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u030d\n"+
		"\60\3\60\5\60\u0310\n\60\3\60\3\60\5\60\u0314\n\60\5\60\u0316\n\60\3\61"+
		"\5\61\u0319\n\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\7\64\u032c\n\64\f\64\16\64\u032f\13\64"+
		"\5\64\u0331\n\64\3\64\5\64\u0334\n\64\3\64\5\64\u0337\n\64\3\65\3\65\3"+
		"\65\3\65\3\65\7\65\u033e\n\65\f\65\16\65\u0341\13\65\3\66\3\66\3\66\3"+
		"\67\3\67\5\67\u0348\n\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0350\n\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0359\n\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0363\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u036a"+
		"\n\67\5\67\u036c\n\67\38\38\38\38\38\38\38\38\38\38\38\58\u0379\n8\38"+
		"\58\u037c\n8\39\39\59\u0380\n9\39\39\39\39\59\u0386\n9\39\39\39\39\59"+
		"\u038c\n9\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\5<\u0398\n<\3=\3=\3>\3>\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u03a9\n?\3?\3?\3?\3?\5?\u03af\n?\3?\3?"+
		"\3?\3?\5?\u03b5\n?\3?\3?\3?\3?\3?\3?\5?\u03bd\n?\3?\3?\3?\3?\5?\u03c3"+
		"\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u03cf\n?\f?\16?\u03d2\13?\3@\3@\3"+
		"@\5@\u03d7\n@\3@\3@\3@\5@\u03dc\n@\3@\3@\3A\3A\3A\7A\u03e3\nA\fA\16A\u03e6"+
		"\13A\3A\5A\u03e9\nA\3B\3B\3B\5B\u03ee\nB\3B\3B\3B\3C\5C\u03f4\nC\3C\3"+
		"C\3C\3C\3C\5C\u03fb\nC\3D\5D\u03fe\nD\3D\3D\3D\3D\3D\5D\u0405\nD\3D\3"+
		"D\3D\3D\3D\3D\5D\u040d\nD\5D\u040f\nD\3D\3D\3D\3D\5D\u0415\nD\3E\3E\3"+
		"E\3E\5E\u041b\nE\5E\u041d\nE\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3J\7J\u042b"+
		"\nJ\fJ\16J\u042e\13J\3K\3K\3L\3L\3M\3M\3N\3N\3O\5O\u0439\nO\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\5R\u0443\nR\3S\3S\3S\3S\3S\3S\3S\3S\5S\u044d\nS\3T\3T\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u045d\nU\3U\5U\u0460\nU\3V\3V\3"+
		"V\3V\3V\3V\3V\5V\u0469\nV\3W\3W\3X\3X\3Y\3Y\5Y\u0471\nY\3Y\5Y\u0474\n"+
		"Y\3Y\5Y\u0477\nY\3Y\5Y\u047a\nY\3Y\5Y\u047d\nY\3Y\5Y\u0480\nY\3Y\5Y\u0483"+
		"\nY\3Y\3Y\5Y\u0487\nY\3Y\5Y\u048a\nY\3Y\5Y\u048d\nY\3Y\5Y\u0490\nY\3Y"+
		"\5Y\u0493\nY\3Y\5Y\u0496\nY\3Y\3Y\5Y\u049a\nY\3Y\5Y\u049d\nY\3Y\5Y\u04a0"+
		"\nY\3Y\5Y\u04a3\nY\3Y\5Y\u04a6\nY\3Y\3Y\5Y\u04aa\nY\3Y\5Y\u04ad\nY\3Y"+
		"\5Y\u04b0\nY\3Y\5Y\u04b3\nY\3Y\3Y\5Y\u04b7\nY\3Y\5Y\u04ba\nY\3Y\5Y\u04bd"+
		"\nY\3Y\3Y\5Y\u04c1\nY\3Y\5Y\u04c4\nY\3Y\3Y\5Y\u04c8\nY\3Y\5Y\u04cb\nY"+
		"\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3_\3`\3`\3`\3a"+
		"\3a\3a\3b\5b\u04e6\nb\3b\3b\3c\5c\u04eb\nc\3c\3c\3d\5d\u04f0\nd\3d\3d"+
		"\3e\5e\u04f5\ne\3e\3e\3f\3f\3g\3g\3g\2\6DFX|h\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\2\t\3\2HJ\5\2\7\7\t\t\23\23\3\2\\b\3\2cd\7\2"+
		"\37 ##%:<=?b\4\2\21\21\23\23\3\2Z[\u0583\2\u00ce\3\2\2\2\4\u00d1\3\2\2"+
		"\2\6\u00d7\3\2\2\2\b\u012d\3\2\2\2\n\u012f\3\2\2\2\f\u0138\3\2\2\2\16"+
		"\u014c\3\2\2\2\20\u0155\3\2\2\2\22\u0169\3\2\2\2\24\u0172\3\2\2\2\26\u018a"+
		"\3\2\2\2\30\u0190\3\2\2\2\32\u019a\3\2\2\2\34\u019c\3\2\2\2\36\u019e\3"+
		"\2\2\2 \u01a0\3\2\2\2\"\u01a6\3\2\2\2$\u01af\3\2\2\2&\u01b1\3\2\2\2(\u01c6"+
		"\3\2\2\2*\u01da\3\2\2\2,\u01e1\3\2\2\2.\u0204\3\2\2\2\60\u0212\3\2\2\2"+
		"\62\u0214\3\2\2\2\64\u021c\3\2\2\2\66\u0220\3\2\2\28\u0229\3\2\2\2:\u023b"+
		"\3\2\2\2<\u023d\3\2\2\2>\u0267\3\2\2\2@\u0269\3\2\2\2B\u0274\3\2\2\2D"+
		"\u028a\3\2\2\2F\u029f\3\2\2\2H\u02ac\3\2\2\2J\u02bc\3\2\2\2L\u02be\3\2"+
		"\2\2N\u02c6\3\2\2\2P\u02ca\3\2\2\2R\u02cf\3\2\2\2T\u02d5\3\2\2\2V\u02d8"+
		"\3\2\2\2X\u02ec\3\2\2\2Z\u02f9\3\2\2\2\\\u02fb\3\2\2\2^\u0315\3\2\2\2"+
		"`\u0318\3\2\2\2b\u031e\3\2\2\2d\u0321\3\2\2\2f\u0326\3\2\2\2h\u0338\3"+
		"\2\2\2j\u0342\3\2\2\2l\u036b\3\2\2\2n\u037b\3\2\2\2p\u038b\3\2\2\2r\u038d"+
		"\3\2\2\2t\u038f\3\2\2\2v\u0397\3\2\2\2x\u0399\3\2\2\2z\u039b\3\2\2\2|"+
		"\u03a8\3\2\2\2~\u03d6\3\2\2\2\u0080\u03e8\3\2\2\2\u0082\u03ed\3\2\2\2"+
		"\u0084\u03f3\3\2\2\2\u0086\u0414\3\2\2\2\u0088\u041c\3\2\2\2\u008a\u041e"+
		"\3\2\2\2\u008c\u0420\3\2\2\2\u008e\u0422\3\2\2\2\u0090\u0424\3\2\2\2\u0092"+
		"\u0426\3\2\2\2\u0094\u042f\3\2\2\2\u0096\u0431\3\2\2\2\u0098\u0433\3\2"+
		"\2\2\u009a\u0435\3\2\2\2\u009c\u0438\3\2\2\2\u009e\u043c\3\2\2\2\u00a0"+
		"\u043e\3\2\2\2\u00a2\u0442\3\2\2\2\u00a4\u044c\3\2\2\2\u00a6\u044e\3\2"+
		"\2\2\u00a8\u045f\3\2\2\2\u00aa\u0468\3\2\2\2\u00ac\u046a\3\2\2\2\u00ae"+
		"\u046c\3\2\2\2\u00b0\u04ca\3\2\2\2\u00b2\u04cc\3\2\2\2\u00b4\u04cf\3\2"+
		"\2\2\u00b6\u04d2\3\2\2\2\u00b8\u04d5\3\2\2\2\u00ba\u04d8\3\2\2\2\u00bc"+
		"\u04db\3\2\2\2\u00be\u04de\3\2\2\2\u00c0\u04e1\3\2\2\2\u00c2\u04e5\3\2"+
		"\2\2\u00c4\u04ea\3\2\2\2\u00c6\u04ef\3\2\2\2\u00c8\u04f4\3\2\2\2\u00ca"+
		"\u04f8\3\2\2\2\u00cc\u04fa\3\2\2\2\u00ce\u00cf\5\6\4\2\u00cf\u00d0\7\2"+
		"\2\3\u00d0\3\3\2\2\2\u00d1\u00d2\7i\2\2\u00d2\5\3\2\2\2\u00d3\u00d6\5"+
		"(\25\2\u00d4\u00d6\5\4\3\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u0129\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00e1\5\f\7\2\u00db\u00e1\5\20\t\2\u00dc"+
		"\u00e1\5\"\22\2\u00dd\u00e1\5\30\r\2\u00de\u00e1\5\24\13\2\u00df\u00e1"+
		"\5\4\3\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0"+
		"\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00ed\3\2"+
		"\2\2\u00e2\u00e9\7\b\2\2\u00e3\u00ea\5\f\7\2\u00e4\u00ea\5\20\t\2\u00e5"+
		"\u00ea\5\"\22\2\u00e6\u00ea\5\30\r\2\u00e7\u00ea\5\24\13\2\u00e8\u00ea"+
		"\5\4\3\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9"+
		"\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e2\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\7\b"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u012a\3\2\2\2\u00f3"+
		"\u012a\3\2\2\2\u00f4\u00f7\5\b\5\2\u00f5\u00f7\5\4\3\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00ff\3\2\2\2\u00f8\u00fb\7\b\2\2\u00f9"+
		"\u00fc\5\b\5\2\u00fa\u00fc\5\4\3\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0104\7\b\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u012a\3\2\2\2\u0105\u012a\3\2\2\2\u0106\u010d\5\f\7\2\u0107\u010d\5\20"+
		"\t\2\u0108\u010d\5\"\22\2\u0109\u010d\5\30\r\2\u010a\u010d\5\24\13\2\u010b"+
		"\u010d\5\4\3\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2"+
		"\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0119\3\2\2\2\u010e\u0115\7\b\2\2\u010f\u0116\5\f\7\2\u0110\u0116\5\20"+
		"\t\2\u0111\u0116\5\"\22\2\u0112\u0116\5\30\r\2\u0113\u0116\5\24\13\2\u0114"+
		"\u0116\5\4\3\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2"+
		"\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u010e\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u0123\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011f\7\b\2\2\u011d\u0120\5\b\5\2\u011e\u0120\5\4\3\2\u011f\u011d\3\2"+
		"\2\2\u011f\u011e\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0128\7\b\2\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u00e0\3\2\2\2\u0129\u00f3\3\2"+
		"\2\2\u0129\u00f6\3\2\2\2\u0129\u0105\3\2\2\2\u0129\u010c\3\2\2\2\u012a"+
		"\7\3\2\2\2\u012b\u012e\58\35\2\u012c\u012e\5,\27\2\u012d\u012b\3\2\2\2"+
		"\u012d\u012c\3\2\2\2\u012e\t\3\2\2\2\u012f\u0131\5\f\7\2\u0130\u0132\7"+
		"\b\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7\2\2\3\u0134\13\3\2\2\2\u0135\u0137\5&\24\2\u0136\u0135\3\2\2"+
		"\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7 \2\2\u013c\u013d\7\37\2\2\u013d"+
		"\u013e\5\u009cO\2\u013e\u013f\7\n\2\2\u013f\u0140\5\u0094K\2\u0140\u0147"+
		"\5\u00a6T\2\u0141\u0142\7\16\2\2\u0142\u0143\5\u0094K\2\u0143\u0144\5"+
		"\u00a6T\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0146\u0149\3\2\2\2"+
		"\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014b\7\13\2\2\u014b\r\3\2\2\2\u014c\u014e\5\20\t\2\u014d"+
		"\u014f\7\b\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\7\2\2\3\u0151\17\3\2\2\2\u0152\u0154\5&\24\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7 \2\2\u0159\u015a\7#\2"+
		"\2\u015a\u015b\5\u009cO\2\u015b\u015c\7\n\2\2\u015c\u015d\5\u0094K\2\u015d"+
		"\u0164\5\u00a6T\2\u015e\u015f\7\16\2\2\u015f\u0160\5\u0094K\2\u0160\u0161"+
		"\5\u00a6T\2\u0161\u0163\3\2\2\2\u0162\u015e\3\2\2\2\u0163\u0166\3\2\2"+
		"\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0167\u0168\7\13\2\2\u0168\21\3\2\2\2\u0169\u016b\5\24\13\2\u016a"+
		"\u016c\7\b\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\7\2\2\3\u016e\23\3\2\2\2\u016f\u0171\5&\24\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7 \2\2\u0176\u0177\7\'"+
		"\2\2\u0177\u0178\5\u009cO\2\u0178\u0179\7\n\2\2\u0179\u017a\5\u0094K\2"+
		"\u017a\u0181\5\u00a6T\2\u017b\u017c\7\16\2\2\u017c\u017d\5\u0094K\2\u017d"+
		"\u017e\5\u00a6T\2\u017e\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0185\7\13\2\2\u0185\u0188\5~@\2\u0186\u0187\7\63"+
		"\2\2\u0187\u0189\5n8\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\25"+
		"\3\2\2\2\u018a\u018c\5\30\r\2\u018b\u018d\7\b\2\2\u018c\u018b\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7\2\2\3\u018f\27"+
		"\3\2\2\2\u0190\u0191\7 \2\2\u0191\u0192\7!\2\2\u0192\u0193\5\32\16\2\u0193"+
		"\u0194\7\f\2\2\u0194\u0195\5\34\17\2\u0195\u0196\7\r\2\2\u0196\u0197\7"+
		"\60\2\2\u0197\u0198\5\u00a6T\2\u0198\u0199\5\36\20\2\u0199\31\3\2\2\2"+
		"\u019a\u019b\5\u00acW\2\u019b\33\3\2\2\2\u019c\u019d\5\u00acW\2\u019d"+
		"\35\3\2\2\2\u019e\u019f\7j\2\2\u019f\37\3\2\2\2\u01a0\u01a2\5\"\22\2\u01a1"+
		"\u01a3\7\b\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\7\2\2\3\u01a5!\3\2\2\2\u01a6\u01a7\7 \2\2\u01a7\u01a8"+
		"\7\"\2\2\u01a8\u01a9\5$\23\2\u01a9\u01ad\7;\2\2\u01aa\u01ab\7G\2\2\u01ab"+
		"\u01ae\5\u00b0Y\2\u01ac\u01ae\5\u00ccg\2\u01ad\u01aa\3\2\2\2\u01ad\u01ac"+
		"\3\2\2\2\u01ae#\3\2\2\2\u01af\u01b0\5\u00acW\2\u01b0%\3\2\2\2\u01b1\u01b2"+
		"\7\34\2\2\u01b2\u01c4\5\u00a2R\2\u01b3\u01b6\7\n\2\2\u01b4\u01b7\5*\26"+
		"\2\u01b5\u01b7\5&\24\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01bf"+
		"\3\2\2\2\u01b8\u01bb\7\16\2\2\u01b9\u01bc\5*\26\2\u01ba\u01bc\5&\24\2"+
		"\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b8"+
		"\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\13\2\2\u01c3\u01c5\3"+
		"\2\2\2\u01c4\u01b3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\'\3\2\2\2\u01c6\u01c7"+
		"\7\34\2\2\u01c7\u01c8\7$\2\2\u01c8\u01c9\7\7\2\2\u01c9\u01d5\5\u00a2R"+
		"\2\u01ca\u01cb\7\n\2\2\u01cb\u01d0\5*\26\2\u01cc\u01cd\7\16\2\2\u01cd"+
		"\u01cf\5*\26\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d4\7\13\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01ca\3\2\2\2\u01d5\u01d6\3"+
		"\2\2\2\u01d6)\3\2\2\2\u01d7\u01d8\5\u0092J\2\u01d8\u01d9\7\17\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01dd\5\u0098M\2\u01dd+\3\2\2\2\u01de\u01e0\5&\24\2\u01df\u01de"+
		"\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7&\2\2\u01e5\u01e6\7C\2"+
		"\2\u01e6\u01e7\7\n\2\2\u01e7\u01ec\5\60\31\2\u01e8\u01e9\7\16\2\2\u01e9"+
		"\u01eb\5\60\31\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3"+
		"\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\7\13\2\2\u01f0\u01f3\7D\2\2\u01f1\u01f4\58\35\2\u01f2\u01f4\5\4"+
		"\3\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01fc\3\2\2\2\u01f5"+
		"\u01f8\7\b\2\2\u01f6\u01f9\58\35\2\u01f7\u01f9\5\4\3\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\7\b\2\2\u0200\u01ff\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7E\2\2\u0203-\3\2\2\2\u0204"+
		"\u0206\5,\27\2\u0205\u0207\7\b\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7\2\2\3\u0209/\3\2\2\2\u020a\u020b"+
		"\5x=\2\u020b\u020c\79\2\2\u020c\u020d\5\u008eH\2\u020d\u0213\3\2\2\2\u020e"+
		"\u020f\5\62\32\2\u020f\u0210\79\2\2\u0210\u0211\5\u008eH\2\u0211\u0213"+
		"\3\2\2\2\u0212\u020a\3\2\2\2\u0212\u020e\3\2\2\2\u0213\61\3\2\2\2\u0214"+
		"\u0219\5\64\33\2\u0215\u0216\7<\2\2\u0216\u0218\5\64\33\2\u0217\u0215"+
		"\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\63\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\5z>\2\u021d\u021e\7:\2\2\u021e"+
		"\u021f\5\u00ccg\2\u021f\65\3\2\2\2\u0220\u0222\58\35\2\u0221\u0223\7\b"+
		"\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\7\2\2\3\u0225\67\3\2\2\2\u0226\u0228\5&\24\2\u0227\u0226\3\2\2"+
		"\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c"+
		"\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7%\2\2\u022d\u022f\5:\36\2\u022e"+
		"\u0230\5f\64\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2"+
		"\2\2\u0231\u0233\5p9\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\5l\67\2\u02359\3\2\2\2\u0236\u023c\5<\37\2\u0237"+
		"\u023c\5> \2\u0238\u023c\5B\"\2\u0239\u023c\5V,\2\u023a\u023c\5^\60\2"+
		"\u023b\u0236\3\2\2\2\u023b\u0237\3\2\2\2\u023b\u0238\3\2\2\2\u023b\u0239"+
		"\3\2\2\2\u023b\u023a\3\2\2\2\u023c;\3\2\2\2\u023d\u023f\5\u009cO\2\u023e"+
		"\u0240\5R*\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2"+
		"\2\u0241\u0243\5d\63\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245"+
		"\3\2\2\2\u0244\u0246\5R*\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"=\3\2\2\2\u0247\u0248\5@!\2\u0248\u0249\5\u00a8U\2\u0249\u024a\5@!\2\u024a"+
		"\u024d\7Q\2\2\u024b\u024c\7?\2\2\u024c\u024e\5z>\2\u024d\u024b\3\2\2\2"+
		"\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\5t;\2\u0250\u024f"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0268\3\2\2\2\u0252\u0253\5@!\2\u0253"+
		"\u0254\5\u00a8U\2\u0254\u0257\5@!\2\u0255\u0256\7?\2\2\u0256\u0258\5z"+
		">\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259"+
		"\u025b\5t;\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0268\3\2\2"+
		"\2\u025c\u025d\5@!\2\u025d\u025e\7Q\2\2\u025e\u025f\5\u00a8U\2\u025f\u0262"+
		"\5@!\2\u0260\u0261\7?\2\2\u0261\u0263\5z>\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0266\5t;\2\u0265\u0264\3\2\2"+
		"\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0247\3\2\2\2\u0267\u0252"+
		"\3\2\2\2\u0267\u025c\3\2\2\2\u0268?\3\2\2\2\u0269\u026b\5\u009cO\2\u026a"+
		"\u026c\5R*\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2"+
		"\2\u026d\u026f\5d\63\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0272"+
		"\3\2\2\2\u0270\u0271\7:\2\2\u0271\u0273\5\u0090I\2\u0272\u0270\3\2\2\2"+
		"\u0272\u0273\3\2\2\2\u0273A\3\2\2\2\u0274\u0275\5D#\2\u0275C\3\2\2\2\u0276"+
		"\u0277\b#\1\2\u0277\u0278\7\n\2\2\u0278\u0279\5D#\2\u0279\u027b\7\13\2"+
		"\2\u027a\u027c\5t;\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u028b"+
		"\3\2\2\2\u027d\u027e\7G\2\2\u027e\u027f\7\n\2\2\u027f\u0280\5F$\2\u0280"+
		"\u0282\7\13\2\2\u0281\u0283\5t;\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u028b\3\2\2\2\u0284\u028b\5F$\2\u0285\u0286\7G\2\2\u0286\u0288"+
		"\5H%\2\u0287\u0289\5t;\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028b\3\2\2\2\u028a\u0276\3\2\2\2\u028a\u027d\3\2\2\2\u028a\u0284\3\2"+
		"\2\2\u028a\u0285\3\2\2\2\u028b\u0291\3\2\2\2\u028c\u028d\f\5\2\2\u028d"+
		"\u028e\7\35\2\2\u028e\u0290\5D#\6\u028f\u028c\3\2\2\2\u0290\u0293\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292E\3\2\2\2\u0293\u0291"+
		"\3\2\2\2\u0294\u0295\b$\1\2\u0295\u0296\7\n\2\2\u0296\u0297\5F$\2\u0297"+
		"\u0299\7\13\2\2\u0298\u029a\5t;\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u02a0\3\2\2\2\u029b\u029d\5H%\2\u029c\u029e\5t;\2\u029d\u029c"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u0294\3\2\2\2\u029f"+
		"\u029b\3\2\2\2\u02a0\u02a6\3\2\2\2\u02a1\u02a2\f\4\2\2\u02a2\u02a3\7\35"+
		"\2\2\u02a3\u02a5\5F$\5\u02a4\u02a1\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7G\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9"+
		"\u02ad\5J&\2\u02aa\u02ad\5L\'\2\u02ab\u02ad\5N(\2\u02ac\u02a9\3\2\2\2"+
		"\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02adI\3\2\2\2\u02ae\u02af\7"+
		"A\2\2\u02af\u02b2\5N(\2\u02b0\u02b1\7=\2\2\u02b1\u02b3\5N(\2\u02b2\u02b0"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02bd\3\2\2\2\u02b4\u02b5\5N(\2\u02b5"+
		"\u02b6\7=\2\2\u02b6\u02b7\5N(\2\u02b7\u02bd\3\2\2\2\u02b8\u02b9\5N(\2"+
		"\u02b9\u02ba\7<\2\2\u02ba\u02bb\5N(\2\u02bb\u02bd\3\2\2\2\u02bc\u02ae"+
		"\3\2\2\2\u02bc\u02b4\3\2\2\2\u02bc\u02b8\3\2\2\2\u02bdK\3\2\2\2\u02be"+
		"\u02bf\5N(\2\u02bf\u02c0\7\26\2\2\u02c0\u02c1\5\u00a4S\2\u02c1\u02c2\7"+
		"\30\2\2\u02c2M\3\2\2\2\u02c3\u02c4\5\u00a0Q\2\u02c4\u02c5\7\17\2\2\u02c5"+
		"\u02c7\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02c9\5P)\2\u02c9O\3\2\2\2\u02ca\u02cc\5\u009cO\2\u02cb\u02cd"+
		"\5R*\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cdQ\3\2\2\2\u02ce\u02d0"+
		"\5T+\2\u02cf\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2S\3\2\2\2\u02d3\u02d6\5`\61\2\u02d4\u02d6\5b\62\2"+
		"\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6U\3\2\2\2\u02d7\u02d9\7"+
		"G\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dc\5Z.\2\u02db\u02dd\5t;\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2"+
		"\u02dd\u02de\3\2\2\2\u02de\u02df\7\16\2\2\u02df\u02e0\5X-\2\u02e0W\3\2"+
		"\2\2\u02e1\u02e2\b-\1\2\u02e2\u02e3\7\n\2\2\u02e3\u02e4\5X-\2\u02e4\u02e6"+
		"\7\13\2\2\u02e5\u02e7\5t;\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02ed\3\2\2\2\u02e8\u02ea\5Z.\2\u02e9\u02eb\5t;\2\u02ea\u02e9\3\2\2\2"+
		"\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e1\3\2\2\2\u02ec\u02e8"+
		"\3\2\2\2\u02ed\u02f3\3\2\2\2\u02ee\u02ef\f\4\2\2\u02ef\u02f0\7\16\2\2"+
		"\u02f0\u02f2\5X-\5\u02f1\u02ee\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4Y\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6"+
		"\u02fa\5J&\2\u02f7\u02fa\5\\/\2\u02f8\u02fa\5N(\2\u02f9\u02f6\3\2\2\2"+
		"\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa[\3\2\2\2\u02fb\u0303\5"+
		"N(\2\u02fc\u02fd\7\26\2\2\u02fd\u02fe\5\u00a4S\2\u02fe\u02ff\7\30\2\2"+
		"\u02ff\u0304\3\2\2\2\u0300\u0304\7\20\2\2\u0301\u0304\7\22\2\2\u0302\u0304"+
		"\7\21\2\2\u0303\u02fc\3\2\2\2\u0303\u0300\3\2\2\2\u0303\u0301\3\2\2\2"+
		"\u0303\u0302\3\2\2\2\u0304]\3\2\2\2\u0305\u0306\7\n\2\2\u0306\u0307\5"+
		"^\60\2\u0307\u0308\7\13\2\2\u0308\u0316\3\2\2\2\u0309\u030a\7%\2\2\u030a"+
		"\u030c\5:\36\2\u030b\u030d\5f\64\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030f\3\2\2\2\u030e\u0310\5p9\2\u030f\u030e\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\7\60\2\2\u0312\u0314\5n8\2\u0313"+
		"\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u0305\3\2"+
		"\2\2\u0315\u0309\3\2\2\2\u0316_\3\2\2\2\u0317\u0319\7\36\2\2\u0318\u0317"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\7\f\2\2\u031b"+
		"\u031c\5z>\2\u031c\u031d\7\r\2\2\u031da\3\2\2\2\u031e\u031f\7\36\2\2\u031f"+
		"\u0320\5~@\2\u0320c\3\2\2\2\u0321\u0322\7\36\2\2\u0322\u0323\7\'\2\2\u0323"+
		"\u0324\7\t\2\2\u0324\u0325\5~@\2\u0325e\3\2\2\2\u0326\u0330\7(\2\2\u0327"+
		"\u0331\7\20\2\2\u0328\u032d\5v<\2\u0329\u032a\7\16\2\2\u032a\u032c\5v"+
		"<\2\u032b\u0329\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0327\3\2"+
		"\2\2\u0330\u0328\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0334\5h\65\2\u0333"+
		"\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0337\5j"+
		"\66\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337g\3\2\2\2\u0338\u0339"+
		"\7)\2\2\u0339\u033a\7*\2\2\u033a\u033f\5\u0086D\2\u033b\u033c\7\16\2\2"+
		"\u033c\u033e\5\u0086D\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340i\3\2\2\2\u0341\u033f\3\2\2\2"+
		"\u0342\u0343\7+\2\2\u0343\u0344\5z>\2\u0344k\3\2\2\2\u0345\u0347\7,\2"+
		"\2\u0346\u0348\5n8\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349"+
		"\3\2\2\2\u0349\u034a\7\62\2\2\u034a\u036c\5\u009eP\2\u034b\u034c\7.\2"+
		"\2\u034c\u034f\5\u009eP\2\u034d\u034e\7\67\2\2\u034e\u0350\5n8\2\u034f"+
		"\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\7?"+
		"\2\2\u0352\u0353\5z>\2\u0353\u036c\3\2\2\2\u0354\u0355\7/\2\2\u0355\u0358"+
		"\5\u009eP\2\u0356\u0357\7\67\2\2\u0357\u0359\5n8\2\u0358\u0356\3\2\2\2"+
		"\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\7?\2\2\u035b\u035c"+
		"\5z>\2\u035c\u036c\3\2\2\2\u035d\u035e\7,\2\2\u035e\u035f\7-\2\2\u035f"+
		"\u0362\5\u009eP\2\u0360\u0361\7\67\2\2\u0361\u0363\5n8\2\u0362\u0360\3"+
		"\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\7?\2\2\u0365"+
		"\u0366\5z>\2\u0366\u036c\3\2\2\2\u0367\u0369\7\60\2\2\u0368\u036a\5n8"+
		"\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u0345"+
		"\3\2\2\2\u036b\u034b\3\2\2\2\u036b\u0354\3\2\2\2\u036b\u035d\3\2\2\2\u036b"+
		"\u0367\3\2\2\2\u036cm\3\2\2\2\u036d\u036e\7I\2\2\u036e\u037c\7\61\2\2"+
		"\u036f\u0370\7I\2\2\u0370\u0371\78\2\2\u0371\u037c\7\61\2\2\u0372\u0373"+
		"\7\64\2\2\u0373\u037c\7\61\2\2\u0374\u0375\7\64\2\2\u0375\u0376\78\2\2"+
		"\u0376\u037c\7\61\2\2\u0377\u0379\7\65\2\2\u0378\u0377\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\7\61\2\2\u037b\u036d\3\2\2\2"+
		"\u037b\u036f\3\2\2\2\u037b\u0372\3\2\2\2\u037b\u0374\3\2\2\2\u037b\u0378"+
		"\3\2\2\2\u037co\3\2\2\2\u037d\u037f\7\63\2\2\u037e\u0380\5r:\2\u037f\u037e"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0385\7G\2\2\u0382"+
		"\u0386\5\u00b0Y\2\u0383\u0384\7\3\2\2\u0384\u0386\7\61\2\2\u0385\u0382"+
		"\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u038c\3\2\2\2\u0387\u0388\7\63\2\2"+
		"\u0388\u0389\7\66\2\2\u0389\u038a\7G\2\2\u038a\u038c\5\u00b0Y\2\u038b"+
		"\u037d\3\2\2\2\u038b\u0387\3\2\2\2\u038cq\3\2\2\2\u038d\u038e\t\2\2\2"+
		"\u038es\3\2\2\2\u038f\u0390\7B\2\2\u0390\u0391\5\u00b0Y\2\u0391u\3\2\2"+
		"\2\u0392\u0393\5x=\2\u0393\u0394\7:\2\2\u0394\u0395\5\u0094K\2\u0395\u0398"+
		"\3\2\2\2\u0396\u0398\5\u0086D\2\u0397\u0392\3\2\2\2\u0397\u0396\3\2\2"+
		"\2\u0398w\3\2\2\2\u0399\u039a\5|?\2\u039ay\3\2\2\2\u039b\u039c\5|?\2\u039c"+
		"{\3\2\2\2\u039d\u039e\b?\1\2\u039e\u039f\7\n\2\2\u039f\u03a0\5|?\2\u03a0"+
		"\u03a1\7\13\2\2\u03a1\u03a9\3\2\2\2\u03a2\u03a9\5\u0082B\2\u03a3\u03a4"+
		"\7A\2\2\u03a4\u03a9\5|?\r\u03a5\u03a9\5~@\2\u03a6\u03a9\5\u00aaV\2\u03a7"+
		"\u03a9\5\u0086D\2\u03a8\u039d\3\2\2\2\u03a8\u03a2\3\2\2\2\u03a8\u03a3"+
		"\3\2\2\2\u03a8\u03a5\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9"+
		"\u03d0\3\2\2\2\u03aa\u03ae\f\f\2\2\u03ab\u03af\7\20\2\2\u03ac\u03af\7"+
		"\24\2\2\u03ad\u03af\7\25\2\2\u03ae\u03ab\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae"+
		"\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03cf\5|?\r\u03b1\u03b4\f\13"+
		"\2\2\u03b2\u03b5\7\21\2\2\u03b3\u03b5\7\23\2\2\u03b4\u03b2\3\2\2\2\u03b4"+
		"\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03cf\5|?\f\u03b7\u03bc\f\n\2"+
		"\2\u03b8\u03bd\7\31\2\2\u03b9\u03bd\7\27\2\2\u03ba\u03bd\7\30\2\2\u03bb"+
		"\u03bd\7\26\2\2\u03bc\u03b8\3\2\2\2\u03bc\u03b9\3\2\2\2\u03bc\u03ba\3"+
		"\2\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03cf\5|?\13\u03bf"+
		"\u03c2\f\t\2\2\u03c0\u03c3\7\32\2\2\u03c1\u03c3\7\33\2\2\u03c2\u03c0\3"+
		"\2\2\2\u03c2\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03cf\5|?\n\u03c5"+
		"\u03c6\f\7\2\2\u03c6\u03c7\7=\2\2\u03c7\u03cf\5|?\b\u03c8\u03c9\f\6\2"+
		"\2\u03c9\u03ca\7<\2\2\u03ca\u03cf\5|?\7\u03cb\u03cc\f\b\2\2\u03cc\u03cd"+
		"\7>\2\2\u03cd\u03cf\5\u00a2R\2\u03ce\u03aa\3\2\2\2\u03ce\u03b1\3\2\2\2"+
		"\u03ce\u03b7\3\2\2\2\u03ce\u03bf\3\2\2\2\u03ce\u03c5\3\2\2\2\u03ce\u03c8"+
		"\3\2\2\2\u03ce\u03cb\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0"+
		"\u03d1\3\2\2\2\u03d1}\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\5\u008c"+
		"G\2\u03d4\u03d5\7\7\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d3\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\5\u008aF\2\u03d9\u03db"+
		"\7\n\2\2\u03da\u03dc\5\u0080A\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2"+
		"\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\7\13\2\2\u03de\177\3\2\2\2\u03df\u03e4"+
		"\5x=\2\u03e0\u03e1\7\16\2\2\u03e1\u03e3\5x=\2\u03e2\u03e0\3\2\2\2\u03e3"+
		"\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e9\3\2"+
		"\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\7\20\2\2\u03e8\u03df\3\2\2\2\u03e8"+
		"\u03e7\3\2\2\2\u03e9\u0081\3\2\2\2\u03ea\u03ee\5\u0084C\2\u03eb\u03ee"+
		"\5\u0086D\2\u03ec\u03ee\5~@\2\u03ed\u03ea\3\2\2\2\u03ed\u03eb\3\2\2\2"+
		"\u03ed\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\7@\2\2\u03f0\u03f1"+
		"\7F\2\2\u03f1\u0083\3\2\2\2\u03f2\u03f4\7\36\2\2\u03f3\u03f2\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03fa\5\u00a2R\2\u03f6\u03f7"+
		"\7\f\2\2\u03f7\u03f8\5\u0088E\2\u03f8\u03f9\7\r\2\2\u03f9\u03fb\3\2\2"+
		"\2\u03fa\u03f6\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u0085\3\2\2\2\u03fc\u03fe"+
		"\7\36\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2"+
		"\u03ff\u0404\5\u00a2R\2\u0400\u0401\7\f\2\2\u0401\u0402\5\u0088E\2\u0402"+
		"\u0403\7\r\2\2\u0403\u0405\3\2\2\2\u0404\u0400\3\2\2\2\u0404\u0405\3\2"+
		"\2\2\u0405\u040e\3\2\2\2\u0406\u0407\7\36\2\2\u0407\u040c\5\u00a2R\2\u0408"+
		"\u0409\7\f\2\2\u0409\u040a\5\u0088E\2\u040a\u040b\7\r\2\2\u040b\u040d"+
		"\3\2\2\2\u040c\u0408\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2\2\2\u040e"+
		"\u0406\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7\t"+
		"\2\2\u0411\u0412\5\u0094K\2\u0412\u0415\3\2\2\2\u0413\u0415\5\u0094K\2"+
		"\u0414\u03fd\3\2\2\2\u0414\u0413\3\2\2\2\u0415\u0087\3\2\2\2\u0416\u041d"+
		"\7\3\2\2\u0417\u041a\7H\2\2\u0418\u0419\7\23\2\2\u0419\u041b\7\3\2\2\u041a"+
		"\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u0416\3\2"+
		"\2\2\u041c\u0417\3\2\2\2\u041d\u0089\3\2\2\2\u041e\u041f\5\u00a2R\2\u041f"+
		"\u008b\3\2\2\2\u0420\u0421\5\u00a2R\2\u0421\u008d\3\2\2\2\u0422\u0423"+
		"\5\u00a2R\2\u0423\u008f\3\2\2\2\u0424\u0425\5\u00a2R\2\u0425\u0091\3\2"+
		"\2\2\u0426\u042c\5\u00a2R\2\u0427\u0428\5\u009aN\2\u0428\u0429\5\u00a2"+
		"R\2\u0429\u042b\3\2\2\2\u042a\u0427\3\2\2\2\u042b\u042e\3\2\2\2\u042c"+
		"\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0093\3\2\2\2\u042e\u042c\3\2"+
		"\2\2\u042f\u0430\5\u00a2R\2\u0430\u0095\3\2\2\2\u0431\u0432\5\u00a2R\2"+
		"\u0432\u0097\3\2\2\2\u0433\u0434\5\u00ccg\2\u0434\u0099\3\2\2\2\u0435"+
		"\u0436\t\3\2\2\u0436\u009b\3\2\2\2\u0437\u0439\7\36\2\2\u0438\u0437\3"+
		"\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\5\u008eH\2"+
		"\u043b\u009d\3\2\2\2\u043c\u043d\5\u009cO\2\u043d\u009f\3\2\2\2\u043e"+
		"\u043f\5\u00a2R\2\u043f\u00a1\3\2\2\2\u0440\u0443\5\u00acW\2\u0441\u0443"+
		"\5\u00aeX\2\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2\2\u0443\u00a3\3\2\2"+
		"\2\u0444\u0445\7\3\2\2\u0445\u0446\7\7\2\2\u0446\u044d\7\3\2\2\u0447\u0448"+
		"\7\3\2\2\u0448\u044d\7\7\2\2\u0449\u044a\7\7\2\2\u044a\u044d\7\3\2\2\u044b"+
		"\u044d\7\3\2\2\u044c\u0444\3\2\2\2\u044c\u0447\3\2\2\2\u044c\u0449\3\2"+
		"\2\2\u044c\u044b\3\2\2\2\u044d\u00a5\3\2\2\2\u044e\u044f\t\4\2\2\u044f"+
		"\u00a7\3\2\2\2\u0450\u0451\7O\2\2\u0451\u0452\7M\2\2\u0452\u0460\7K\2"+
		"\2\u0453\u0454\7N\2\2\u0454\u0455\7M\2\2\u0455\u0460\7K\2\2\u0456\u0457"+
		"\7P\2\2\u0457\u0458\7M\2\2\u0458\u0460\7K\2\2\u0459\u045a\7M\2\2\u045a"+
		"\u0460\7K\2\2\u045b\u045d\7L\2\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2"+
		"\2\u045d\u045e\3\2\2\2\u045e\u0460\7K\2\2\u045f\u0450\3\2\2\2\u045f\u0453"+
		"\3\2\2\2\u045f\u0456\3\2\2\2\u045f\u0459\3\2\2\2\u045f\u045c\3\2\2\2\u0460"+
		"\u00a9\3\2\2\2\u0461\u0469\5\u00caf\2\u0462\u0469\5\u00c2b\2\u0463\u0469"+
		"\5\u00c6d\2\u0464\u0469\5\u00c4c\2\u0465\u0469\5\u00c8e\2\u0466\u0469"+
		"\5\u00b0Y\2\u0467\u0469\5\u00ccg\2\u0468\u0461\3\2\2\2\u0468\u0462\3\2"+
		"\2\2\u0468\u0463\3\2\2\2\u0468\u0464\3\2\2\2\u0468\u0465\3\2\2\2\u0468"+
		"\u0466\3\2\2\2\u0468\u0467\3\2\2\2\u0469\u00ab\3\2\2\2\u046a\u046b\t\5"+
		"\2\2\u046b\u00ad\3\2\2\2\u046c\u046d\t\6\2\2\u046d\u00af\3\2\2\2\u046e"+
		"\u0470\5\u00b2Z\2\u046f\u0471\5\u00b4[\2\u0470\u046f\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0474\5\u00b6\\\2\u0473\u0472\3\2\2"+
		"\2\u0473\u0474\3\2\2\2\u0474\u0476\3\2\2\2\u0475\u0477\5\u00b8]\2\u0476"+
		"\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478\u047a\5\u00ba"+
		"^\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\3\2\2\2\u047b"+
		"\u047d\5\u00bc_\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f"+
		"\3\2\2\2\u047e\u0480\5\u00be`\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2"+
		"\2\u0480\u0482\3\2\2\2\u0481\u0483\5\u00c0a\2\u0482\u0481\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u04cb\3\2\2\2\u0484\u0486\5\u00b4[\2\u0485\u0487"+
		"\5\u00b6\\\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\3\2\2"+
		"\2\u0488\u048a\5\u00b8]\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a"+
		"\u048c\3\2\2\2\u048b\u048d\5\u00ba^\2\u048c\u048b\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u048f\3\2\2\2\u048e\u0490\5\u00bc_\2\u048f\u048e\3\2\2"+
		"\2\u048f\u0490\3\2\2\2\u0490\u0492\3\2\2\2\u0491\u0493\5\u00be`\2\u0492"+
		"\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0495\3\2\2\2\u0494\u0496\5\u00c0"+
		"a\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u04cb\3\2\2\2\u0497"+
		"\u0499\5\u00b6\\\2\u0498\u049a\5\u00b8]\2\u0499\u0498\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049c\3\2\2\2\u049b\u049d\5\u00ba^\2\u049c\u049b\3\2\2"+
		"\2\u049c\u049d\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u04a0\5\u00bc_\2\u049f"+
		"\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u04a3\5\u00be"+
		"`\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4"+
		"\u04a6\5\u00c0a\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04cb"+
		"\3\2\2\2\u04a7\u04a9\5\u00b8]\2\u04a8\u04aa\5\u00ba^\2\u04a9\u04a8\3\2"+
		"\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04ad\5\u00bc_\2\u04ac"+
		"\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04b0\5\u00be"+
		"`\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1"+
		"\u04b3\5\u00c0a\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04cb"+
		"\3\2\2\2\u04b4\u04b6\5\u00ba^\2\u04b5\u04b7\5\u00bc_\2\u04b6\u04b5\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b9\3\2\2\2\u04b8\u04ba\5\u00be`\2\u04b9"+
		"\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04bd\5\u00c0"+
		"a\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04cb\3\2\2\2\u04be"+
		"\u04c0\5\u00bc_\2\u04bf\u04c1\5\u00be`\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1"+
		"\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04c4\5\u00c0a\2\u04c3\u04c2\3\2\2"+
		"\2\u04c3\u04c4\3\2\2\2\u04c4\u04cb\3\2\2\2\u04c5\u04c7\5\u00be`\2\u04c6"+
		"\u04c8\5\u00c0a\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04cb"+
		"\3\2\2\2\u04c9\u04cb\5\u00c0a\2\u04ca\u046e\3\2\2\2\u04ca\u0484\3\2\2"+
		"\2\u04ca\u0497\3\2\2\2\u04ca\u04a7\3\2\2\2\u04ca\u04b4\3\2\2\2\u04ca\u04be"+
		"\3\2\2\2\u04ca\u04c5\3\2\2\2\u04ca\u04c9\3\2\2\2\u04cb\u00b1\3\2\2\2\u04cc"+
		"\u04cd\7\3\2\2\u04cd\u04ce\7R\2\2\u04ce\u00b3\3\2\2\2\u04cf\u04d0\7\3"+
		"\2\2\u04d0\u04d1\7S\2\2\u04d1\u00b5\3\2\2\2\u04d2\u04d3\7\3\2\2\u04d3"+
		"\u04d4\7T\2\2\u04d4\u00b7\3\2\2\2\u04d5\u04d6\7\3\2\2\u04d6\u04d7\7U\2"+
		"\2\u04d7\u00b9\3\2\2\2\u04d8\u04d9\7\3\2\2\u04d9\u04da\7V\2\2\u04da\u00bb"+
		"\3\2\2\2\u04db\u04dc\7\3\2\2\u04dc\u04dd\7W\2\2\u04dd\u00bd\3\2\2\2\u04de"+
		"\u04df\7\3\2\2\u04df\u04e0\7X\2\2\u04e0\u00bf\3\2\2\2\u04e1\u04e2\7\3"+
		"\2\2\u04e2\u04e3\7Y\2\2\u04e3\u00c1\3\2\2\2\u04e4\u04e6\t\7\2\2\u04e5"+
		"\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\7\6"+
		"\2\2\u04e8\u00c3\3\2\2\2\u04e9\u04eb\t\7\2\2\u04ea\u04e9\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\7\4\2\2\u04ed\u00c5\3\2"+
		"\2\2\u04ee\u04f0\t\7\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f2\7\5\2\2\u04f2\u00c7\3\2\2\2\u04f3\u04f5\t\7"+
		"\2\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04f7\7\3\2\2\u04f7\u00c9\3\2\2\2\u04f8\u04f9\t\b\2\2\u04f9\u00cb\3\2"+
		"\2\2\u04fa\u04fb\7e\2\2\u04fb\u00cd\3\2\2\2\u00ae\u00d5\u00d7\u00e0\u00e9"+
		"\u00ed\u00f1\u00f6\u00fb\u00ff\u0103\u010c\u0115\u0119\u011f\u0123\u0127"+
		"\u0129\u012d\u0131\u0138\u0147\u014e\u0155\u0164\u016b\u0172\u0181\u0188"+
		"\u018c\u01a2\u01ad\u01b6\u01bb\u01bf\u01c4\u01d0\u01d5\u01da\u01e1\u01ec"+
		"\u01f3\u01f8\u01fc\u0200\u0206\u0212\u0219\u0222\u0229\u022f\u0232\u023b"+
		"\u023f\u0242\u0245\u024d\u0250\u0257\u025a\u0262\u0265\u0267\u026b\u026e"+
		"\u0272\u027b\u0282\u0288\u028a\u0291\u0299\u029d\u029f\u02a6\u02ac\u02b2"+
		"\u02bc\u02c6\u02cc\u02d1\u02d5\u02d8\u02dc\u02e6\u02ea\u02ec\u02f3\u02f9"+
		"\u0303\u030c\u030f\u0313\u0315\u0318\u032d\u0330\u0333\u0336\u033f\u0347"+
		"\u034f\u0358\u0362\u0369\u036b\u0378\u037b\u037f\u0385\u038b\u0397\u03a8"+
		"\u03ae\u03b4\u03bc\u03c2\u03ce\u03d0\u03d6\u03db\u03e4\u03e8\u03ed\u03f3"+
		"\u03fa\u03fd\u0404\u040c\u040e\u0414\u041a\u041c\u042c\u0438\u0442\u044c"+
		"\u045c\u045f\u0468\u0470\u0473\u0476\u0479\u047c\u047f\u0482\u0486\u0489"+
		"\u048c\u048f\u0492\u0495\u0499\u049c\u049f\u04a2\u04a5\u04a9\u04ac\u04af"+
		"\u04b2\u04b6\u04b9\u04bc\u04c0\u04c3\u04c7\u04ca\u04e5\u04ea\u04ef\u04f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}