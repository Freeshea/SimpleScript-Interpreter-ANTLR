package ast;

public class BreakNode implements Node{

    @Override
    public Object evaluate(){
        throw new BreakException(); // Megszakítja a futást loopban vagy switchben
    }    
}
