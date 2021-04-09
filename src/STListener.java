import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class STListener extends LangBaseListener{

    public SymbolTable ST = new SymbolTable();
    private ArrayList<String> errors = new ArrayList<>();
    private HashMap<ParserRuleContext,Integer> types = new HashMap<>();

    private static final int INTcompil = 1;
    private static final int FLOATcompil = 2;
    private static final int STRINGcompil = 3;

    private static final int UNDECLARED = 0;
    private static final int DECLARED = 1;

    public STListener(ArrayList<String> errors) {
        this.errors = errors;
    }

    public STListener() {

    }

    public SymbolTable getTable() {
        return ST;
    }

    /********************************************************************************************/

    @Override
    public void exitDeclaration(LangParser.DeclarationContext ctx) {

        int type;

        if (ctx.type().getText().equals("intCompil")) {type =INTcompil;
        }else {
            if (ctx.type().getText().equals("floatCompil")){ type =FLOATcompil;
            }else {type =STRINGcompil;}
        }

        LangParser.VariableContext vars = ctx.variable();

        for (;;vars = vars.variable()) // loop over vars
        {
            String varName = vars.getChild(0).getText();
            if(ST.findElement(varName)) {
                errors.add(lineColumnOf(vars.ID()) + "Double declaration of variable: " + varName);
            }
            else
                ST.addElement(varName,new Element(DECLARED,type));
            if(vars.variable() == null)
                return;
        }

    }

    @Override
    public void exitValue(LangParser.ValueContext ctx) {
        int a=0;
        if(ctx.INT()!=null) {
            addTypeToCtx(ctx,INTcompil);
        }else{
            if(ctx.FLOAT()!=null){
                addTypeToCtx(ctx,FLOATcompil);
            }else{
                addTypeToCtx(ctx,STRINGcompil);
            }
        }
    }

    @Override
    public void exitAssignmant(LangParser.AssignmantContext ctx) {
        int typeExp = getCtxType(ctx.expression());
        //System.out.println(ctx.identifier().ID().getText()+" : "+ctx.expression().getText());
        String exp=ctx.expression().getText();
        exp=exp.replaceAll("\\s","");
        int typeIdf = ST.getElement(ctx.identifier().ID().getText()).type;


        if(exp.contains("/0")){
            errors.add(lineColumnOf(ctx.identifier().ID()) + "division par 0 ");
        }

        if (exp.matches("[0-9]+")){
            ST.SetValue(ctx.identifier().ID().getText(),ctx.expression().getText());
        }


        if(!CompatibleTypes(typeExp, typeIdf))
            errors.add(lineColumnOf(ctx.identifier().ID()) + "incompatible types in affectation " + ctx.getText() + " : " + typeExp + " avec " + typeIdf);
        clear();
    }

    @Override
    public void exitIdentifier(LangParser.IdentifierContext ctx) {
        // check if ID has been declared
        if(!ST.findElement(ctx.ID().getText()))
        {
            errors.add(lineColumnOf(ctx.ID()) + ctx.ID().getSymbol().getCharPositionInLine() + " variable : " + ctx.ID().getText() + " undeclared !!!");
            ST.addElement(ctx.ID().getText(),new Element(DECLARED,INTcompil|FLOATcompil|STRINGcompil));
            // adding non declared variable in order to not generate same error again
        }
    }

    @Override public void exitExpression(LangParser.ExpressionContext ctx)
    {
        if(ctx.expression() == null)
            addTypeToCtx(ctx,getCtxType(ctx.expression1()));
        else
        {
            if(CompatibleTypes(getCtxType(ctx.expression1()),getCtxType(ctx.expression())))
                addTypeToCtx(ctx,getTypeOfResult(getCtxType(ctx.expression1()),getCtxType(ctx.expression())));
            else {
                addTypeToCtx(ctx, 0); // type 0 will always generate error
                System.out.println("ERROR : incompatible type between " + ctx.expression1().getText() + " and " + ctx.expression().getText());
                System.out.println("we have : " + ctx.expression1().getText() + " type: " + getCtxType(ctx.expression1()) + " and " + ctx.expression().getText() + " type: " + getCtxType(ctx.expression()));
            }

        }
    }

    @Override public void exitExpression1(LangParser.Expression1Context ctx)
    {
        if(ctx.expression1() == null)
            addTypeToCtx(ctx,getCtxType(ctx.expression2()));
        else
        {
            if(CompatibleTypes(getCtxType(ctx.expression2()),getCtxType(ctx.expression1())))
                addTypeToCtx(ctx,getTypeOfResult(getCtxType(ctx.expression1()),getCtxType(ctx.expression2())));
            else {
                addTypeToCtx(ctx, 0); // type 0 will always generate error
                System.out.println("ERROR : incompatible type between " + ctx.expression1().getText() + " and " + ctx.expression2().getText());
                System.out.println("We have : " + ctx.expression1().getText() + " type: " + getCtxType(ctx.expression1()) + " and " + ctx.expression2().getText() + " type: " + getCtxType(ctx.expression2()));
            }
        }
    }

    @Override public void exitExpression2(LangParser.Expression2Context ctx)
    {
        String name="", v="";

        if(ctx.identifier() != null)
        {addTypeToCtx(ctx,ST.getElement(ctx.identifier().getText()).type);
            name=ctx.identifier().getText();
          }
        else if(ctx.expression() != null)
            addTypeToCtx(ctx,getCtxType(ctx.expression()));
        else{
            addTypeToCtx(ctx,getCtxType(ctx.value()));

            v=ctx.getText();
        }

    }




    /*************************************************************************************/
    /****************** somme methods helping on creating routines ***********************/

    public static String lineColumnOf(TerminalNode terminalNode) {
        return "line " + terminalNode.getSymbol().getLine() + ":" + terminalNode.getSymbol().getCharPositionInLine() + " ";
    }

    private void addTypeToCtx(ParserRuleContext ctx, int type)
    {
        types.put(ctx,type);
    }
    private int getCtxType(ParserRuleContext ctx)
    {
        return types.get(ctx);
    }

    private void clear()
    {
        types.clear();
    }

    private static boolean CompatibleTypes(int t1,int t2)
    {
        return (t1 & t2) != 0;
    }

    private static int getTypeOfResult(int t1,int t2)
    {
        if((t1 & t2 & FLOATcompil) != 0){return  FLOATcompil;}
        if((t1 & t2 & INTcompil) != 0){return  INTcompil;}
        if((t1 & t2 & STRINGcompil) != 0){return  STRINGcompil;}
        return 0;

        //return ((t1 & t2 & FLOATcompil) != 0)?FLOATcompil:INTcompil;
    }


}