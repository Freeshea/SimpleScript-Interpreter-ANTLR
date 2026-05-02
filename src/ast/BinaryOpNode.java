package ast;

public class BinaryOpNode implements Node{
    private Node left;
    private Node right;
    private String operator;

    public BinaryOpNode(Node leftHS, Node rightHS, String op){
        this.left = leftHS;
        this.right = rightHS;
        this.operator = op;
    }

    @Override
    public Object evaluate(){
        Object leftVal = left.evaluate();
        Object rightVal = right.evaluate();

        // Ha bármelyik oldal Double, akkor Double-ként számol
        boolean isDouble = (leftVal instanceof Double) || (rightVal instanceof Double);

        double l = (leftVal instanceof Double) ? (Double) leftVal : ((Integer) leftVal).doubleValue();
        double r = (rightVal instanceof Double) ? (Double) rightVal : ((Integer) rightVal).doubleValue();

        double result = 0;
        switch (operator) {
            case "+":
                result = l + r;
                break;
            case "-":
                result = l - r;
                break;
            case "*":
                result = l * r;
                break;
            case "/":
                if(r==0.0){
                    throw new RuntimeException("Runtime Error: Division by zero!");
                }
                result = l / r;
                break;
        }

        if(isDouble){
            return result;
        } else{
            return (int) result; // int return ha mindkettő int volt
        }
    }
}
