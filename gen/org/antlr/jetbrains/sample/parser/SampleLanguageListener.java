// Generated from /home/yellowflash/Downloads/jetbrains-plugin-sample-master/src/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.6
package org.antlr.jetbrains.sample.parser;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleLanguageParser}.
 */
public interface SampleLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SampleLanguageParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SampleLanguageParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SampleLanguageParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SampleLanguageParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#execution_plan}.
	 * @param ctx the parse tree
	 */
	void enterExecution_plan(SampleLanguageParser.Execution_planContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#execution_plan}.
	 * @param ctx the parse tree
	 */
	void exitExecution_plan(SampleLanguageParser.Execution_planContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void enterExecution_element(SampleLanguageParser.Execution_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void exitExecution_element(SampleLanguageParser.Execution_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream_final(SampleLanguageParser.Definition_stream_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream_final(SampleLanguageParser.Definition_stream_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream(SampleLanguageParser.Definition_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream(SampleLanguageParser.Definition_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table_final(SampleLanguageParser.Definition_table_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table_final(SampleLanguageParser.Definition_table_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table(SampleLanguageParser.Definition_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table(SampleLanguageParser.Definition_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window_final(SampleLanguageParser.Definition_window_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window_final(SampleLanguageParser.Definition_window_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window(SampleLanguageParser.Definition_windowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window(SampleLanguageParser.Definition_windowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function_final(SampleLanguageParser.Definition_function_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function_final(SampleLanguageParser.Definition_function_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function(SampleLanguageParser.Definition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function(SampleLanguageParser.Definition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SampleLanguageParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SampleLanguageParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#language_name}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_name(SampleLanguageParser.Language_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#language_name}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_name(SampleLanguageParser.Language_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SampleLanguageParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SampleLanguageParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger_final(SampleLanguageParser.Definition_trigger_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger_final(SampleLanguageParser.Definition_trigger_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger(SampleLanguageParser.Definition_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger(SampleLanguageParser.Definition_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SampleLanguageParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SampleLanguageParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SampleLanguageParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SampleLanguageParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#plan_annotation}.
	 * @param ctx the parse tree
	 */
	void enterPlan_annotation(SampleLanguageParser.Plan_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#plan_annotation}.
	 * @param ctx the parse tree
	 */
	void exitPlan_annotation(SampleLanguageParser.Plan_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_element(SampleLanguageParser.Annotation_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_element(SampleLanguageParser.Annotation_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#partition}.
	 * @param ctx the parse tree
	 */
	void enterPartition(SampleLanguageParser.PartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#partition}.
	 * @param ctx the parse tree
	 */
	void exitPartition(SampleLanguageParser.PartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void enterPartition_final(SampleLanguageParser.Partition_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void exitPartition_final(SampleLanguageParser.Partition_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void enterPartition_with_stream(SampleLanguageParser.Partition_with_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void exitPartition_with_stream(SampleLanguageParser.Partition_with_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void enterCondition_ranges(SampleLanguageParser.Condition_rangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void exitCondition_ranges(SampleLanguageParser.Condition_rangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void enterCondition_range(SampleLanguageParser.Condition_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void exitCondition_range(SampleLanguageParser.Condition_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#query_final}.
	 * @param ctx the parse tree
	 */
	void enterQuery_final(SampleLanguageParser.Query_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#query_final}.
	 * @param ctx the parse tree
	 */
	void exitQuery_final(SampleLanguageParser.Query_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SampleLanguageParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SampleLanguageParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#query_input}.
	 * @param ctx the parse tree
	 */
	void enterQuery_input(SampleLanguageParser.Query_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#query_input}.
	 * @param ctx the parse tree
	 */
	void exitQuery_input(SampleLanguageParser.Query_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stream(SampleLanguageParser.Standard_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stream(SampleLanguageParser.Standard_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void enterJoin_stream(SampleLanguageParser.Join_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void exitJoin_stream(SampleLanguageParser.Join_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#join_source}.
	 * @param ctx the parse tree
	 */
	void enterJoin_source(SampleLanguageParser.Join_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#join_source}.
	 * @param ctx the parse tree
	 */
	void exitJoin_source(SampleLanguageParser.Join_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void enterPattern_stream(SampleLanguageParser.Pattern_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void exitPattern_stream(SampleLanguageParser.Pattern_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterEvery_pattern_source_chain(SampleLanguageParser.Every_pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitEvery_pattern_source_chain(SampleLanguageParser.Every_pattern_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source_chain(SampleLanguageParser.Pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source_chain(SampleLanguageParser.Pattern_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source(SampleLanguageParser.Pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source(SampleLanguageParser.Pattern_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterLogical_stateful_source(SampleLanguageParser.Logical_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitLogical_stateful_source(SampleLanguageParser.Logical_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_collection_stateful_source(SampleLanguageParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_collection_stateful_source(SampleLanguageParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stateful_source(SampleLanguageParser.Standard_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stateful_source(SampleLanguageParser.Standard_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source(SampleLanguageParser.Basic_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source(SampleLanguageParser.Basic_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handlers(SampleLanguageParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handlers(SampleLanguageParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handler(SampleLanguageParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handler(SampleLanguageParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void enterSequence_stream(SampleLanguageParser.Sequence_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void exitSequence_stream(SampleLanguageParser.Sequence_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source_chain(SampleLanguageParser.Sequence_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source_chain(SampleLanguageParser.Sequence_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source(SampleLanguageParser.Sequence_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source(SampleLanguageParser.Sequence_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_collection_stateful_source(SampleLanguageParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_collection_stateful_source(SampleLanguageParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_stream(SampleLanguageParser.Anonymous_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_stream(SampleLanguageParser.Anonymous_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(SampleLanguageParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(SampleLanguageParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void enterStream_function(SampleLanguageParser.Stream_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void exitStream_function(SampleLanguageParser.Stream_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#window}.
	 * @param ctx the parse tree
	 */
	void enterWindow(SampleLanguageParser.WindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#window}.
	 * @param ctx the parse tree
	 */
	void exitWindow(SampleLanguageParser.WindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#query_section}.
	 * @param ctx the parse tree
	 */
	void enterQuery_section(SampleLanguageParser.Query_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#query_section}.
	 * @param ctx the parse tree
	 */
	void exitQuery_section(SampleLanguageParser.Query_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#group_by}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by(SampleLanguageParser.Group_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#group_by}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by(SampleLanguageParser.Group_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHaving(SampleLanguageParser.HavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHaving(SampleLanguageParser.HavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#query_output}.
	 * @param ctx the parse tree
	 */
	void enterQuery_output(SampleLanguageParser.Query_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#query_output}.
	 * @param ctx the parse tree
	 */
	void exitQuery_output(SampleLanguageParser.Query_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_event_type(SampleLanguageParser.Output_event_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_event_type(SampleLanguageParser.Output_event_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate(SampleLanguageParser.Output_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate(SampleLanguageParser.Output_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate_type(SampleLanguageParser.Output_rate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate_type(SampleLanguageParser.Output_rate_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#within_time}.
	 * @param ctx the parse tree
	 */
	void enterWithin_time(SampleLanguageParser.Within_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#within_time}.
	 * @param ctx the parse tree
	 */
	void exitWithin_time(SampleLanguageParser.Within_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOutput_attribute(SampleLanguageParser.Output_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOutput_attribute(SampleLanguageParser.Output_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SampleLanguageParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SampleLanguageParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SampleLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SampleLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_math_operation(SampleLanguageParser.Multiplication_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_math_operation(SampleLanguageParser.Multiplication_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan_lessthan_math_operation(SampleLanguageParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan_lessthan_math_operation(SampleLanguageParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterBasic_math_operation(SampleLanguageParser.Basic_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitBasic_math_operation(SampleLanguageParser.Basic_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterIn_math_operation(SampleLanguageParser.In_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitIn_math_operation(SampleLanguageParser.In_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAddition_math_operation(SampleLanguageParser.Addition_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAddition_math_operation(SampleLanguageParser.Addition_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd_math_operation(SampleLanguageParser.And_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd_math_operation(SampleLanguageParser.And_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterOr_math_operation(SampleLanguageParser.Or_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitOr_math_operation(SampleLanguageParser.Or_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterEquality_math_operation(SampleLanguageParser.Equality_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitEquality_math_operation(SampleLanguageParser.Equality_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterNot_math_operation(SampleLanguageParser.Not_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SampleLanguageParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitNot_math_operation(SampleLanguageParser.Not_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void enterFunction_operation(SampleLanguageParser.Function_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void exitFunction_operation(SampleLanguageParser.Function_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(SampleLanguageParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(SampleLanguageParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#null_check}.
	 * @param ctx the parse tree
	 */
	void enterNull_check(SampleLanguageParser.Null_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#null_check}.
	 * @param ctx the parse tree
	 */
	void exitNull_check(SampleLanguageParser.Null_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void enterStream_reference(SampleLanguageParser.Stream_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void exitStream_reference(SampleLanguageParser.Stream_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference(SampleLanguageParser.Attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference(SampleLanguageParser.Attribute_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_index(SampleLanguageParser.Attribute_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_index(SampleLanguageParser.Attribute_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#function_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_id(SampleLanguageParser.Function_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#function_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_id(SampleLanguageParser.Function_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void enterFunction_namespace(SampleLanguageParser.Function_namespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void exitFunction_namespace(SampleLanguageParser.Function_namespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void enterStream_id(SampleLanguageParser.Stream_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void exitStream_id(SampleLanguageParser.Stream_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#stream_alias}.
	 * @param ctx the parse tree
	 */
	void enterStream_alias(SampleLanguageParser.Stream_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#stream_alias}.
	 * @param ctx the parse tree
	 */
	void exitStream_alias(SampleLanguageParser.Stream_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#property_name}.
	 * @param ctx the parse tree
	 */
	void enterProperty_name(SampleLanguageParser.Property_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#property_name}.
	 * @param ctx the parse tree
	 */
	void exitProperty_name(SampleLanguageParser.Property_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(SampleLanguageParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(SampleLanguageParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SampleLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SampleLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#property_value}.
	 * @param ctx the parse tree
	 */
	void enterProperty_value(SampleLanguageParser.Property_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#property_value}.
	 * @param ctx the parse tree
	 */
	void exitProperty_value(SampleLanguageParser.Property_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void enterProperty_separator(SampleLanguageParser.Property_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void exitProperty_separator(SampleLanguageParser.Property_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(SampleLanguageParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(SampleLanguageParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(SampleLanguageParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(SampleLanguageParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(SampleLanguageParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(SampleLanguageParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SampleLanguageParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SampleLanguageParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#collect}.
	 * @param ctx the parse tree
	 */
	void enterCollect(SampleLanguageParser.CollectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#collect}.
	 * @param ctx the parse tree
	 */
	void exitCollect(SampleLanguageParser.CollectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_type(SampleLanguageParser.Attribute_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_type(SampleLanguageParser.Attribute_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SampleLanguageParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SampleLanguageParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(SampleLanguageParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(SampleLanguageParser.Constant_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SampleLanguageParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SampleLanguageParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SampleLanguageParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SampleLanguageParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#time_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_value(SampleLanguageParser.Time_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#time_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_value(SampleLanguageParser.Time_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#year_value}.
	 * @param ctx the parse tree
	 */
	void enterYear_value(SampleLanguageParser.Year_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#year_value}.
	 * @param ctx the parse tree
	 */
	void exitYear_value(SampleLanguageParser.Year_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#month_value}.
	 * @param ctx the parse tree
	 */
	void enterMonth_value(SampleLanguageParser.Month_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#month_value}.
	 * @param ctx the parse tree
	 */
	void exitMonth_value(SampleLanguageParser.Month_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#week_value}.
	 * @param ctx the parse tree
	 */
	void enterWeek_value(SampleLanguageParser.Week_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#week_value}.
	 * @param ctx the parse tree
	 */
	void exitWeek_value(SampleLanguageParser.Week_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#day_value}.
	 * @param ctx the parse tree
	 */
	void enterDay_value(SampleLanguageParser.Day_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#day_value}.
	 * @param ctx the parse tree
	 */
	void exitDay_value(SampleLanguageParser.Day_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void enterHour_value(SampleLanguageParser.Hour_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void exitHour_value(SampleLanguageParser.Hour_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void enterMinute_value(SampleLanguageParser.Minute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void exitMinute_value(SampleLanguageParser.Minute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#second_value}.
	 * @param ctx the parse tree
	 */
	void enterSecond_value(SampleLanguageParser.Second_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#second_value}.
	 * @param ctx the parse tree
	 */
	void exitSecond_value(SampleLanguageParser.Second_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void enterMillisecond_value(SampleLanguageParser.Millisecond_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void exitMillisecond_value(SampleLanguageParser.Millisecond_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_double_value(SampleLanguageParser.Signed_double_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_double_value(SampleLanguageParser.Signed_double_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_long_value(SampleLanguageParser.Signed_long_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_long_value(SampleLanguageParser.Signed_long_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_float_value(SampleLanguageParser.Signed_float_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_float_value(SampleLanguageParser.Signed_float_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int_value(SampleLanguageParser.Signed_int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int_value(SampleLanguageParser.Signed_int_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(SampleLanguageParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(SampleLanguageParser.Bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(SampleLanguageParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(SampleLanguageParser.String_valueContext ctx);
}