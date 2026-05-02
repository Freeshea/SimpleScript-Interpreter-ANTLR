package ast;

public class ForNode implements Node{
    private Node initStatement;
    private Node condition;
    private Node incrementExpr;
    private Node body;

    public ForNode(Node initS, Node cond, Node incExpr, Node bod){
        this.initStatement = initS;
        this.condition = cond;
        this.incrementExpr = incExpr;
        this.body = bod;
    }

    @Override
    public Object evaluate(){
        if(initStatement != null){
            initStatement.evaluate();
        }

        while(true){
            Object condVal = condition.evaluate();
            boolean isCondTrue = (condVal instanceof Double) ?  ((Double)condVal) != 0.0 : ((Integer)condVal) != 0;
            if(!isCondTrue) break;

            try{
                body.evaluate();
            } catch (BreakException e){
                break; // Megszakad a for ciklus
            }

            if(incrementExpr != null){
                incrementExpr.evaluate();
            }
        }
        return null;
    }    
}
