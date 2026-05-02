package ast;

import java.util.ArrayList;
import java.util.List;

public class PrintNode implements Node{
    private List<Node> expressions = new ArrayList<>();

    public void addExpression(Node expr){
        expressions.add(expr);
    }

    @Override
    public Object evaluate(){
        for(int i = 0; i< expressions.size(); i++){
            Object value = expressions.get(i).evaluate();
            System.out.print(value);
            if(i < expressions.size()-1){
                System.out.print(" "); // Szóköz tagolásra
            }
        }
        System.out.println();
        return null;
    }
    
}
