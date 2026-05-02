package ast;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode implements Node {
    private List<Node> statements = new ArrayList<>();

    public void addStatement(Node stmt){
        statements.add(stmt);
    }

    @Override
    public Object evaluate(){
        // Végigmegy az összes utasításon és végrehajtja
        for (Node stmt: statements){
            stmt.evaluate();
        }
        return null;
    }
}
