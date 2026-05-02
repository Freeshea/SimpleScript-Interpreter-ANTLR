package ast;

public class NumberNode implements Node{
    private Object value; // Int vagy Double

    public NumberNode(Object val){
        this.value = val;
    }

    @Override
    public Object evaluate(){
        return value;
    }
    
}
