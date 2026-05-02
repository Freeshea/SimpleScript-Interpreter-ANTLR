package ast;

public class RelationalNode implements Node{
    private Node left;
    private Node right;
    private String operator;

    public RelationalNode(Node l, Node r, String op){
        this.left = l;
        this.right = r;
        this.operator = op;
    }

    @Override
    public Object evaluate(){
        Object leftVal = left.evaluate();
        Object rightVal = right.evaluate();

        // Közös Double típusra hozva
        double l = (leftVal instanceof Double) ? (Double) leftVal : ((Integer) leftVal).doubleValue();
        double r = (rightVal instanceof Double) ? (Double) rightVal : ((Integer) rightVal).doubleValue();

        boolean result = false;
        switch (operator) {
            case "<":
                result = (l < r);
                break;
            case ">":
                result = (l > r);
                break;
            case "==":
                result = (l == r);
                break;
            case "!=":
                result = (l != r);
                break;
        }

        // True = 1 | False = 0
        return result ? 1 : 0; 
    }
    
}
