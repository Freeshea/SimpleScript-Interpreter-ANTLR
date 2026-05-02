package ast;

public class IfNode implements Node{
    private Node condition;
    private Node thenBranch;
    private Node elseBranch; // Ha van else

    public IfNode(Node cond, Node thenB, Node elseB){
        this.condition = cond;
        this.thenBranch = thenB;
        this.elseBranch = elseB;
    }

    @Override
    public Object evaluate(){
        Object condVal = condition.evaluate();
        boolean isCondTrue = false;

        if(condVal instanceof Double){
            isCondTrue = ((Double) condVal) != 0.0; 
        } else if(condVal instanceof Integer){
            isCondTrue = ((Integer) condVal) != 0;
        }

        if(isCondTrue){
            thenBranch.evaluate();
        } else if(elseBranch != null){
            elseBranch.evaluate();
        }

        return null;
    }
    
}
