// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScriptLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScriptLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScriptLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ScriptLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ScriptLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationStatement(ScriptLangParser.VarDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeletionStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeletionStatement(ScriptLangParser.VarDeletionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ScriptLangParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScanStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(ScriptLangParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ScriptLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ScriptLangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ScriptLangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ScriptLangParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ScriptLangParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(ScriptLangParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ScriptLangParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(ScriptLangParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptLangParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(ScriptLangParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptLangParser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(ScriptLangParser.DefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ScriptLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsExpr(ScriptLangParser.AbsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimeExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeExpr(ScriptLangParser.TimeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(ScriptLangParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(ScriptLangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(ScriptLangParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpr(ScriptLangParser.ParenthesesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(ScriptLangParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(ScriptLangParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(ScriptLangParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(ScriptLangParser.AssignExprContext ctx);
}