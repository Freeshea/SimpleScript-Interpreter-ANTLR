package ast;

import java.util.ArrayList;
import java.util.List;

public class SwitchNode implements Node{
    
    // Belső segédosztály a Case áganak
    public static class CaseBlock{
        public Node valueExpr;
        public List<Node> statements = new ArrayList<>();
    }

    private Node condition;
    private List<CaseBlock> cases = new ArrayList<>();
    private List<Node> defaultStatements = null; // null, ha nincs default ág

    public SwitchNode(Node cond){
        this.condition = cond;
    }

    public void addCase(CaseBlock caseBlock){
        cases.add(caseBlock);
    }

    public void setDefaultStatements(List<Node> stmts){
        this.defaultStatements = stmts;
    }

    @Override
    public Object evaluate(){
        Object switchVal = condition.evaluate();
        double sVal = (switchVal instanceof Double) ? (Double) switchVal : ((Integer) switchVal).doubleValue();

        boolean fallingThrough = false;

        try{

            // Case ágak
            for(CaseBlock cb : cases){
                if(!fallingThrough){
                    Object caseVal = cb.valueExpr.evaluate();
                    double cVal = (caseVal instanceof Double) ? (Double) caseVal : ((Integer) caseVal).doubleValue();
                    if(sVal == cVal){ 
                        fallingThrough = true;
                    }
                }
                if(fallingThrough){ // Megtalálta a jó case ágat, innentől lefuttat mindent break-ig
                    for(Node stmt : cb.statements){
                        stmt.evaluate();
                    }
                }
            }

            // Ha nincs egyezés, akkor default
            if(!fallingThrough && defaultStatements != null){
                for(Node stmt : defaultStatements){
                    stmt.evaluate();
                }
            }
        } catch (BreakException e){
            // Kilépés a switchből
        }

        return null;
    }
}
