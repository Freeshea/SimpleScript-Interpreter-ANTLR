// Generated from c:/Users/Bence/Desktop/Ford/src/ScriptLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptLangParser}.
 */
public interface ScriptLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ScriptLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ScriptLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ScriptLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ScriptLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclarationStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatement(ScriptLangParser.VarDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclarationStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatement(ScriptLangParser.VarDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeletionStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeletionStatement(ScriptLangParser.VarDeletionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeletionStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeletionStatement(ScriptLangParser.VarDeletionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ScriptLangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ScriptLangParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScanStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(ScriptLangParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScanStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(ScriptLangParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ScriptLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ScriptLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ScriptLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ScriptLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ScriptLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ScriptLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ScriptLangParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ScriptLangParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ScriptLangParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ScriptLangParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(ScriptLangParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(ScriptLangParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(ScriptLangParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStatement}
	 * labeled alternative in {@link ScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(ScriptLangParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLangParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ScriptLangParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLangParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ScriptLangParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLangParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBlock(ScriptLangParser.DefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLangParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBlock(ScriptLangParser.DefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ScriptLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ScriptLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAbsExpr(ScriptLangParser.AbsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAbsExpr(ScriptLangParser.AbsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimeExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTimeExpr(ScriptLangParser.TimeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimeExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTimeExpr(ScriptLangParser.TimeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(ScriptLangParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(ScriptLangParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(ScriptLangParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(ScriptLangParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(ScriptLangParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(ScriptLangParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpr(ScriptLangParser.ParenthesesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpr(ScriptLangParser.ParenthesesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(ScriptLangParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(ScriptLangParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(ScriptLangParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(ScriptLangParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(ScriptLangParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(ScriptLangParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(ScriptLangParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link ScriptLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(ScriptLangParser.AssignExprContext ctx);
}