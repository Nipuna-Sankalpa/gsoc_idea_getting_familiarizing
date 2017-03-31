// Generated from /home/yellowflash/Downloads/jetbrains-plugin-sample-master/src/grammars/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by {@link SampleLanguageParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(SampleLanguageParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SampleLanguageParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#formal_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_args(SampleLanguageParser.Formal_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#formal_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_arg(SampleLanguageParser.Formal_argContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTypeSpec(SampleLanguageParser.IntTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatTypeSpec(SampleLanguageParser.FloatTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTypeSpec(SampleLanguageParser.StringTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTypeSpec(SampleLanguageParser.BooleanTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VectorTypeSpec}
	 * labeled alternative in {@link SampleLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorTypeSpec(SampleLanguageParser.VectorTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SampleLanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(SampleLanguageParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(SampleLanguageParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SampleLanguageParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementAssign}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAssign(SampleLanguageParser.ElementAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStatement}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(SampleLanguageParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SampleLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(SampleLanguageParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link SampleLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SampleLanguageParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(SampleLanguageParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(SampleLanguageParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SampleLanguageParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(SampleLanguageParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(SampleLanguageParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(SampleLanguageParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(SampleLanguageParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link SampleLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SampleLanguageParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SampleLanguageParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(SampleLanguageParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SampleLanguageParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(SampleLanguageParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SampleLanguageParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SampleLanguageParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(SampleLanguageParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SampleLanguageParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(SampleLanguageParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(SampleLanguageParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link SampleLanguageParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(SampleLanguageParser.FalseLiteralContext ctx);
}