// Generated from /home/yellowflash/Downloads/jetbrains-plugin-sample-master/src/grammars/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleLanguageParser}.
 */
public interface SampleLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SampleLanguageParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SampleLanguageParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SampleLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SampleLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void enterFormal_args(SampleLanguageParser.Formal_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void exitFormal_args(SampleLanguageParser.Formal_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void enterFormal_arg(SampleLanguageParser.Formal_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void exitFormal_arg(SampleLanguageParser.Formal_argContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntTypeSpec(SampleLanguageParser.IntTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntTypeSpec(SampleLanguageParser.IntTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFloatTypeSpec(SampleLanguageParser.FloatTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFloatTypeSpec(SampleLanguageParser.FloatTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringTypeSpec(SampleLanguageParser.StringTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringTypeSpec(SampleLanguageParser.StringTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTypeSpec(SampleLanguageParser.BooleanTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTypeSpec(SampleLanguageParser.BooleanTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VectorTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVectorTypeSpec(SampleLanguageParser.VectorTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VectorTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVectorTypeSpec(SampleLanguageParser.VectorTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SampleLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SampleLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(SampleLanguageParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(SampleLanguageParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(SampleLanguageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(SampleLanguageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SampleLanguageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SampleLanguageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementAssign}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterElementAssign(SampleLanguageParser.ElementAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementAssign}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitElementAssign(SampleLanguageParser.ElementAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallStatement}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(SampleLanguageParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallStatement}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(SampleLanguageParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SampleLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SampleLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(SampleLanguageParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(SampleLanguageParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SampleLanguageParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SampleLanguageParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(SampleLanguageParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(SampleLanguageParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(SampleLanguageParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(SampleLanguageParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOp(SampleLanguageParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOp(SampleLanguageParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(SampleLanguageParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(SampleLanguageParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(SampleLanguageParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(SampleLanguageParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SampleLanguageParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SampleLanguageParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(SampleLanguageParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(SampleLanguageParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SampleLanguageParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SampleLanguageParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SampleLanguageParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SampleLanguageParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(SampleLanguageParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(SampleLanguageParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLanguageParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(SampleLanguageParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLanguageParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(SampleLanguageParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SampleLanguageParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SampleLanguageParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SampleLanguageParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SampleLanguageParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFloat(SampleLanguageParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFloat(SampleLanguageParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterString(SampleLanguageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitString(SampleLanguageParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterVector(SampleLanguageParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitVector(SampleLanguageParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(SampleLanguageParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(SampleLanguageParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(SampleLanguageParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(SampleLanguageParser.FalseLiteralContext ctx);
}