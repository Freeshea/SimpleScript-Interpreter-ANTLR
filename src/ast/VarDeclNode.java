package ast;

public class VarDeclNode implements Node{
    private String name;
    private String type;
    private Node initExpr; // Lehet null, ha nincs értékadás egyből

    public VarDeclNode(String varName, String varType, Node initE){
        this.name = varName;
        this.type = varType;
        this.initExpr = initE;
    }

    @Override
    public Object evaluate(){
        Memory.declare(name, type); // 0 értéket kap

        // Ha van kezdeti érték beleírja
        if(initExpr != null){
            Object value = initExpr.evaluate();
            Memory.setValue(name, value);
        }
        return null;
    }
    
}
