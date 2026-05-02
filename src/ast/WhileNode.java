package ast;

public class WhileNode implements Node{
    private Node condition;
    private Node body;

    public WhileNode(Node cond, Node bod){
        this.condition = cond;
        this.body = bod;
    }

    @Override
    public Object evaluate(){
        while(true){
            Object condVal = condition.evaluate();
            boolean isCondTrue = (condVal instanceof Double) ?  ((Double)condVal) != 0.0 : ((Integer)condVal) != 0;
            if(!isCondTrue) break;

            try{
                body.evaluate();
            } catch (BreakException e){
                break; // Megszakad a while ciklus
            }
        }
        return null;
    }
}
