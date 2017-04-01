// Generated from /home/yellowflash/Downloads/jetbrains-plugin-sample-master/src/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.6
package org.antlr.jetbrains.sample.parser;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SampleLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SampleLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SampleLanguageParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SampleLanguageParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#execution_plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution_plan(SampleLanguageParser.Execution_planContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#execution_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution_element(SampleLanguageParser.Execution_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_stream_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream_final(SampleLanguageParser.Definition_stream_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream(SampleLanguageParser.Definition_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_table_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table_final(SampleLanguageParser.Definition_table_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table(SampleLanguageParser.Definition_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_window_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window_final(SampleLanguageParser.Definition_window_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window(SampleLanguageParser.Definition_windowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_function_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function_final(SampleLanguageParser.Definition_function_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function(SampleLanguageParser.Definition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SampleLanguageParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#language_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_name(SampleLanguageParser.Language_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(SampleLanguageParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger_final(SampleLanguageParser.Definition_trigger_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#definition_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger(SampleLanguageParser.Definition_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SampleLanguageParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SampleLanguageParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#plan_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan_annotation(SampleLanguageParser.Plan_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#annotation_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_element(SampleLanguageParser.Annotation_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition(SampleLanguageParser.PartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#partition_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_final(SampleLanguageParser.Partition_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#partition_with_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_with_stream(SampleLanguageParser.Partition_with_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#condition_ranges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_ranges(SampleLanguageParser.Condition_rangesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#condition_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_range(SampleLanguageParser.Condition_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#query_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_final(SampleLanguageParser.Query_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SampleLanguageParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#query_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_input(SampleLanguageParser.Query_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#standard_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stream(SampleLanguageParser.Standard_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#join_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_stream(SampleLanguageParser.Join_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#join_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_source(SampleLanguageParser.Join_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#pattern_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_stream(SampleLanguageParser.Pattern_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_pattern_source_chain(SampleLanguageParser.Every_pattern_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source_chain(SampleLanguageParser.Pattern_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source(SampleLanguageParser.Pattern_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_stateful_source(SampleLanguageParser.Logical_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_collection_stateful_source(SampleLanguageParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stateful_source(SampleLanguageParser.Standard_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#basic_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source(SampleLanguageParser.Basic_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handlers(SampleLanguageParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handler(SampleLanguageParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#sequence_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_stream(SampleLanguageParser.Sequence_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source_chain(SampleLanguageParser.Sequence_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#sequence_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source(SampleLanguageParser.Sequence_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_collection_stateful_source(SampleLanguageParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#anonymous_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_stream(SampleLanguageParser.Anonymous_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(SampleLanguageParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#stream_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_function(SampleLanguageParser.Stream_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow(SampleLanguageParser.WindowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#query_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_section(SampleLanguageParser.Query_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#group_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by(SampleLanguageParser.Group_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#having}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving(SampleLanguageParser.HavingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#query_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_output(SampleLanguageParser.Query_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#output_event_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_event_type(SampleLanguageParser.Output_event_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#output_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate(SampleLanguageParser.Output_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#output_rate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate_type(SampleLanguageParser.Output_rate_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#within_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_time(SampleLanguageParser.Within_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#output_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_attribute(SampleLanguageParser.Output_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SampleLanguageParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SampleLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication_math_operation(SampleLanguageParser.Multiplication_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthan_lessthan_math_operation(SampleLanguageParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_math_operation(SampleLanguageParser.Basic_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_math_operation(SampleLanguageParser.In_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition_math_operation(SampleLanguageParser.Addition_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_math_operation(SampleLanguageParser.And_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_math_operation(SampleLanguageParser.Or_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_math_operation(SampleLanguageParser.Equality_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_math_operation(SampleLanguageParser.Not_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#function_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_operation(SampleLanguageParser.Function_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(SampleLanguageParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#null_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_check(SampleLanguageParser.Null_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#stream_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_reference(SampleLanguageParser.Stream_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#attribute_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_reference(SampleLanguageParser.Attribute_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#attribute_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_index(SampleLanguageParser.Attribute_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#function_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_id(SampleLanguageParser.Function_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#function_namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_namespace(SampleLanguageParser.Function_namespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#stream_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_id(SampleLanguageParser.Stream_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#stream_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_alias(SampleLanguageParser.Stream_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(SampleLanguageParser.Property_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(SampleLanguageParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SampleLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#property_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_value(SampleLanguageParser.Property_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#property_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_separator(SampleLanguageParser.Property_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(SampleLanguageParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(SampleLanguageParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(SampleLanguageParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SampleLanguageParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#collect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect(SampleLanguageParser.CollectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#attribute_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_type(SampleLanguageParser.Attribute_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(SampleLanguageParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#constant_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_value(SampleLanguageParser.Constant_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SampleLanguageParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SampleLanguageParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#time_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_value(SampleLanguageParser.Time_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#year_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear_value(SampleLanguageParser.Year_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#month_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_value(SampleLanguageParser.Month_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#week_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeek_value(SampleLanguageParser.Week_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#day_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_value(SampleLanguageParser.Day_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#hour_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour_value(SampleLanguageParser.Hour_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#minute_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute_value(SampleLanguageParser.Minute_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#second_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_value(SampleLanguageParser.Second_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#millisecond_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMillisecond_value(SampleLanguageParser.Millisecond_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#signed_double_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_double_value(SampleLanguageParser.Signed_double_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#signed_long_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_long_value(SampleLanguageParser.Signed_long_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#signed_float_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_float_value(SampleLanguageParser.Signed_float_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#signed_int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_int_value(SampleLanguageParser.Signed_int_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(SampleLanguageParser.Bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value(SampleLanguageParser.String_valueContext ctx);
}