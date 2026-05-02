package ast;

public class TernaryNode implements Node{
    private Node condition;
    private Node trueExpr;
    private Node falseExpr;

    public TernaryNode(Node cond, Node trueE, Node falseE){
        this.condition = cond;
        this.trueExpr = trueE;
        this.falseExpr = falseE;
    }

    @Override
    public Object evaluate(){
        Object condVal = condition.evaluate();
        boolean isCondTrue = false;

        // Condition igaz vagy hamis
        if(condVal instanceof Double){
            isCondTrue = ((Double) condVal) != 0.0; // Ha nem == 0-val, akkor 1 és a condition igaz
        } else if(condVal instanceof Integer){
            isCondTrue = ((Integer) condVal) != 0;
        }

        if(isCondTrue){
            return trueExpr.evaluate();
        } else{
            return falseExpr.evaluate();
        }
    }
    
}
