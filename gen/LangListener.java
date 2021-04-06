// Generated from C:/Users/pc/IdeaProjects/ProjetCompil/src\Lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(LangParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(LangParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(LangParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(LangParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LangParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LangParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(LangParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(LangParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(LangParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(LangParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(LangParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(LangParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#assignmant}.
	 * @param ctx the parse tree
	 */
	void enterAssignmant(LangParser.AssignmantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assignmant}.
	 * @param ctx the parse tree
	 */
	void exitAssignmant(LangParser.AssignmantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(LangParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(LangParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(LangParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(LangParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#pm}.
	 * @param ctx the parse tree
	 */
	void enterPm(LangParser.PmContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#pm}.
	 * @param ctx the parse tree
	 */
	void exitPm(LangParser.PmContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#md}.
	 * @param ctx the parse tree
	 */
	void enterMd(LangParser.MdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#md}.
	 * @param ctx the parse tree
	 */
	void exitMd(LangParser.MdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LangParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LangParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(LangParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(LangParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#el}.
	 * @param ctx the parse tree
	 */
	void enterEl(LangParser.ElContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#el}.
	 * @param ctx the parse tree
	 */
	void exitEl(LangParser.ElContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#dowhilestat}.
	 * @param ctx the parse tree
	 */
	void enterDowhilestat(LangParser.DowhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#dowhilestat}.
	 * @param ctx the parse tree
	 */
	void exitDowhilestat(LangParser.DowhilestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(LangParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(LangParser.CompareContext ctx);
}