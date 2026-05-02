package ast;

public class BillTinNode implements Node{
    private String functionName;
    private Node expr;

    public BillTinNode(String fName, Node exp){
        this.functionName = fName;
        this.expr = exp;
    }

    @Override
    public Object evaluate(){
        if(functionName.equals("TIME")){
            // UNIX idő másodpercben
            return (int) (System.currentTimeMillis() / 1000L);
        } else if(functionName.equals("ABS")){
            Object value = expr.evaluate();
            if(value instanceof Double){
                return Math.abs((Double) value);
            } else{
                return Math.abs((Integer) value);
            }
        }
        return null;
    }
    
}
