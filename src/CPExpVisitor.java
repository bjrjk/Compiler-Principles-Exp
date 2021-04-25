// Generated from CPExp.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPExpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CPExpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link CPExpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CPExpParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link CPExpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CPExpParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link CPExpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(CPExpParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link CPExpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CPExpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPExpParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CPExpParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDNExpr}
	 * labeled alternative in {@link CPExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDNExpr(CPExpParser.IDNExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LowArithExpr}
	 * labeled alternative in {@link CPExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowArithExpr(CPExpParser.LowArithExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link CPExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(CPExpParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CPExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(CPExpParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HighArithExpr}
	 * labeled alternative in {@link CPExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighArithExpr(CPExpParser.HighArithExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int10P}
	 * labeled alternative in {@link CPExpParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt10P(CPExpParser.Int10PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int8P}
	 * labeled alternative in {@link CPExpParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt8P(CPExpParser.Int8PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int16P}
	 * labeled alternative in {@link CPExpParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt16P(CPExpParser.Int16PContext ctx);
}