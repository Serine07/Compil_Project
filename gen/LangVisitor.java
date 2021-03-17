// Generated from C:/Users/HP/IdeaProjects/Compil_Project/src\Lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(LangParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(LangParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LangParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#assignmant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmant(LangParser.AssignmantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expretions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpretions(LangParser.ExpretionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expretion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpretion(LangParser.ExpretionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(LangParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(LangParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LangParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(LangParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstat(LangParser.IfstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#dowhilestat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhilestat(LangParser.DowhilestatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(LangParser.CompareContext ctx);
}