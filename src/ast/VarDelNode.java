package ast;

public class VarDelNode implements Node{
    private String name;

    public VarDelNode(String delName){
        this.name = delName;
    }

    @Override
    public Object evaluate(){
        Memory.delete(name);
        return null;
    }
    
}
