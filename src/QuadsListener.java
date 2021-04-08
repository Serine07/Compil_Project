import java.util.LinkedList;
import java.util.ArrayList;

// import org.antlr.v4.runtime.ParserRuleContext;
// import org.antlr.v4.runtime.tree.TerminalNode;


public class QuadsListener extends LangBaseListener  {

    private Quads quadsTable ;
    private int comptTemp = 0;  //pour compter les temporaires
    private LinkedList<String> stack ;  // Contient les temporaires
    private ArrayList<String> errors ;

    public QuadsListener(ArrayList<String> errors) {
        this.quadsTable = new Quads();
        this.stack = new LinkedList<>();
        this.errors = errors;
    }

    public Quads getQuadsTable() {
        return quadsTable;
    }

    @Override
    public void exitBody(LangParser.BodyContext ctx) {
        if(errors.size()>0)
            return;
        quadsTable.addQuad("END","","","");
    }

    @Override
    public void exitAssignmant(LangParser.AssignmantContext ctx) {
        String tmp = stack.removeLast();
        quadsTable.addQuad("=",tmp,"",ctx.identifier().getText());
    }

    @Override
    public void exitExpression(LangParser.ExpressionContext ctx) {
        if (ctx.expression() != null) {
            String t1 = stack.removeLast();
            String t2 = stack.removeLast();
            comptTemp++;
            String tmp = "tmp" + comptTemp;
            quadsTable.addQuad(ctx.pm().getText(), t1, t2, tmp);
            stack.add(tmp);
        }
    }

    @Override
    public void exitExpression1(LangParser.Expression1Context ctx) {
        if (ctx.expression1() != null) {
            String t1 = stack.removeLast();
            String t2 = stack.removeLast();
            comptTemp++;
            String tmp = "tmp" + comptTemp;
            quadsTable.addQuad(ctx.md().getText(), t1, t2, tmp);
            stack.add(tmp);
        }
    }


    @Override
    public void exitExpression2(LangParser.Expression2Context ctx) {
        stack.add(ctx.getText());
    }

    int Sauv_Cond;
    @Override
    public void exitCondition(LangParser.ConditionContext ctx) {
        String t1 = stack.removeLast();
        String t2 = stack.removeLast();
        Sauv_Cond = quadsTable.addQuad((ctx.compare().getText().compareTo(">") == 0)?"BLE":"BGE",t1,t2,"");
    }

    int Sauv_BR;
    @Override
    public void exitEl(LangParser.ElContext ctx) {
        quadsTable.getQuad(Sauv_Cond).set(3, ""+quadsTable.size()+1);
        Sauv_BR = quadsTable.addQuad("BR","","","");

    }

    @Override
    public void exitIfstat(LangParser.IfstatContext ctx) {
        quadsTable.getQuad(Sauv_BR).set(3, ""+quadsTable.size());
    }

    int Sauv_BR_Do;  //Pour le branchement vers le début de la boucle
    @Override
    public void enterDowhilestat(LangParser.DowhilestatContext ctx) {
        Sauv_BR_Do = quadsTable.size() +1;
    }

    @Override
    public void exitDowhilestat(LangParser.DowhilestatContext ctx) {
        quadsTable.getQuad(Sauv_Cond).set(3, ""+Sauv_BR_Do);
    }

    @Override
    public void exitRead(LangParser.ReadContext ctx) {
        quadsTable.addQuad("READ", ctx.variable().getText() ,"","");
    }

    @Override
    public void exitWrite(LangParser.WriteContext ctx) {
        if (ctx.identifier() != null) {
            quadsTable.addQuad("WRITE", ctx.identifier().getText(), "", "");
        }
    }
    
    /* **
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }
    */

    /* **
    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    } */

}
