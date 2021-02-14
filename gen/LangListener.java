// Generated from C:/Users/HP/IdeaProjects/ProjectCompil/src\Lang.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link LangParser#expretions}.
	 * @param ctx the parse tree
	 */
	void enterExpretions(LangParser.ExpretionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expretions}.
	 * @param ctx the parse tree
	 */
	void exitExpretions(LangParser.ExpretionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expretion}.
	 * @param ctx the parse tree
	 */
	void enterExpretion(LangParser.ExpretionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expretion}.
	 * @param ctx the parse tree
	 */
	void exitExpretion(LangParser.ExpretionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(LangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(LangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(LangParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(LangParser.ValuesContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LangParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LangParser.OperatorContext ctx);
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