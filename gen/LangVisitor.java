// Generated from C:/Users/pc/IdeaProjects/ProjetCompil/src\Lang.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link LangParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(LangParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(LangParser.DeclarationsContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LangParser.IdentifierContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(LangParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(LangParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPm(LangParser.PmContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#md}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd(LangParser.MdContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl(LangParser.ElContext ctx);
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