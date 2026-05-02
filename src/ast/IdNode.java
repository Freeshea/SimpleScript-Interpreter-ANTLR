package ast;

public class IdNode implements Node{
    private String name;

    public IdNode(String nName){
        this.name = nName;
    }

    @Override
    public Object evaluate(){
        return Memory.getValue(name);
    }
    
}
