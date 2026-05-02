import java.util.ArrayList;
import java.util.List;

import ast.*;

public class MyVisitor extends ScriptLangBaseVisitor<Node> {
    
    @Override
    public Node visitProgram(ScriptLangParser.ProgramContext ctx){
        ProgramNode program = new ProgramNode();

        // Végig az összes utasításon
        for (ScriptLangParser.StatementContext stmtctx : ctx.statement()){
            Node stmtNode = visit(stmtctx);
            if(stmtNode != null){
                program.addStatement(stmtNode);
            }
        }

        return program;
    }

    @Override
    public Node visitPrintStatement(ScriptLangParser.PrintStatementContext ctx){
        PrintNode printNode = new PrintNode();

        for (ScriptLangParser.ExprContext exprCtx : ctx.expr()){
            printNode.addExpression(visit(exprCtx));
        }
        return printNode;
    }

    // Számok és műveletek
    @Override
    public Node visitNumberExpr(ScriptLangParser.NumberExprContext ctx){
        String text = ctx.NUMBER().getText();
        if(text.contains(".")){
            return new NumberNode(Double.parseDouble(text));
        } else{
            return new NumberNode(Integer.parseInt(text));
        }
    }

    @Override
    public Node visitAddSubExpr(ScriptLangParser.AddSubExprContext ctx){
        Node left = visit(ctx.expr(0));
        Node right = visit(ctx.expr(1));
        String op = ctx.op.getText(); // + vagy -
        return new BinaryOpNode(left, right, op);
    }

    @Override
    public Node visitMulDivExpr(ScriptLangParser.MulDivExprContext ctx){
        Node left = visit(ctx.expr(0));
        Node right = visit(ctx.expr(1));
        String op = ctx.op.getText(); // * vagy /
        return new BinaryOpNode(left, right, op);
    }

    @Override
    public Node visitParenthesesExpr(ScriptLangParser.ParenthesesExprContext ctx){
        return visit(ctx.expr());
    }

    // Változók
    @Override
    public Node visitVarDeclarationStatement(ScriptLangParser.VarDeclarationStatementContext ctx){
        String type = ctx.type().getText(); 
        String name = ctx.ID().getText();

        Node initExpr = null;
        if(ctx.expr() != null){
            initExpr = visit(ctx.expr());
        }

        return new VarDeclNode(name, type, initExpr);
    }

    @Override
    public Node visitVarDeletionStatement(ScriptLangParser.VarDeletionStatementContext ctx){
        String name = ctx.ID().getText();
        return new VarDelNode(name);
    }

    @Override
    public Node visitAssignExpr(ScriptLangParser.AssignExprContext ctx){
        String name = ctx.ID().getText();
        Node expr = visit(ctx.expr());
        return new AssignNode(name, expr);
    }

    @Override
    public Node visitIdExpr(ScriptLangParser.IdExprContext ctx){
        String name = ctx.ID().getText();
        return new IdNode(name);
    }

    @Override
    public Node visitTimeExpr(ScriptLangParser.TimeExprContext ctx){
        return new BillTinNode("TIME", null);
    }

    @Override
    public Node visitAbsExpr(ScriptLangParser.AbsExprContext ctx){
        Node expr = visit(ctx.expr());
        return new BillTinNode("ABS", expr);
    }

    // Sima értékadáshoz kell
    @Override
    public Node visitExprStatement(ScriptLangParser.ExprStatementContext ctx){
        return visit(ctx.expr()); 
    }

    // Relációk és Ternary
    @Override
    public Node visitRelationalExpr(ScriptLangParser.RelationalExprContext ctx){
        Node left = visit(ctx.expr(0));
        Node right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return new RelationalNode(left, right, op);
    }

    @Override
    public Node visitTernaryExpr(ScriptLangParser.TernaryExprContext ctx){
        Node condition = visit(ctx.expr(0));
        Node trueExpr = visit(ctx.expr(1));
        Node falseExpr = visit(ctx.expr(2));
        return new TernaryNode(condition, trueExpr, falseExpr);
    }

    // Vezérlési szerkezetek
    @Override
    public Node visitBlockStatement(ScriptLangParser.BlockStatementContext ctx){
        return visit(ctx.block());
    }

    @Override
    public Node visitBlock(ScriptLangParser.BlockContext ctx){
        BlockNode block = new BlockNode();
        for(ScriptLangParser.StatementContext stmtCtx : ctx.statement()){
            Node stmtNode = visit(stmtCtx);
            if(stmtNode != null){
                block.addStatement(stmtNode);
            }
        }
        return block;
    }

    @Override
    public Node visitIfStatement(ScriptLangParser.IfStatementContext ctx){
        Node condition = visit(ctx.expr());
        Node thenBranch = visit(ctx.statement(0));
        Node elseBranch = null;
        // Van-e else ág?
        if(ctx.statement().size()>1){
            elseBranch = visit(ctx.statement(1));
        }
        return new IfNode(condition, thenBranch, elseBranch);
    }

    @Override
    public Node visitWhileStatement(ScriptLangParser.WhileStatementContext ctx){
        Node condition = visit(ctx.expr());
        Node body = visit(ctx.statement());
        return new WhileNode(condition, body);
    }

    @Override
    public Node visitForStatement(ScriptLangParser.ForStatementContext ctx){ // for( )
        Node initStatement = visit(ctx.statement(0));   // Deklaráció vagy értékadás: int i=0;
        Node condition = visit(ctx.expr(0));            // Feltétel: i ..op.. valami;
        Node incrementExpr = visit(ctx.expr(1));        // Increment: i++
        Node body = visit(ctx.statement(1));            // { statement végrehajtás}
        return new ForNode(initStatement, condition, incrementExpr, body);
    }

    @Override
    public Node visitEmptyStatement(ScriptLangParser.EmptyStatementContext ctx){
        // Üres utasítás ( ;)
        return null;
    }

    // Scan
    @Override
    public Node visitScanStatement(ScriptLangParser.ScanStatementContext ctx){
        ScanNode scanNode = new ScanNode();
        // ctx.ID() visszaadja az összes változónevet a zárójelen belül
        for(org.antlr.v4.runtime.tree.TerminalNode idNode : ctx.ID()){
            scanNode.addVarName(idNode.getText());
        }
        return scanNode;
    }

    // Switch-case
    @Override
    public Node visitSwitchStatement(ScriptLangParser.SwitchStatementContext ctx){
        Node condition = visit(ctx.expr());
        SwitchNode swNode = new SwitchNode(condition);

        // Case blokkok
        for(ScriptLangParser.CaseBlockContext caseCtx : ctx.caseBlock()){
            SwitchNode.CaseBlock cb = new SwitchNode.CaseBlock();
            cb.valueExpr = visit(caseCtx.expr());
            for(ScriptLangParser.StatementContext stmtCtx : caseCtx.statement()){
                Node stmt = visit(stmtCtx);
                if(stmt != null) cb.statements.add(stmt);
            }
            swNode.addCase(cb);
        }

        // Default statementek
        if(ctx.defaultBlock() != null){
            List<Node> defStmts = new ArrayList<>();
            for(ScriptLangParser.StatementContext stmtCtx : ctx.defaultBlock().statement()){
                Node stmt = visit(stmtCtx);
                if(stmt != null) defStmts.add(stmt);
            }
            swNode.setDefaultStatements(defStmts);
        }

        return swNode;
    }

    // Break
    @Override
    public Node visitBreakStatement(ScriptLangParser.BreakStatementContext ctx){
        return new BreakNode();
    }

}
