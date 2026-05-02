package ast;

public class AssignNode implements Node{
    private String name;
    private Node expr;

    public AssignNode(String asName, Node asExpr){
        this.name = asName;
        this.expr = asExpr;
    }

    @Override
    public Object evaluate(){
        Object value = expr.evaluate();
        Memory.setValue(name, value);
        return value; // Return value, hogy a cascade értékadás is működjön: a = b = 3
    }
    
}
