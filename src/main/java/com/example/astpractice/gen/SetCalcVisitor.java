package com.example.astpractice.gen;// Generated from SetCalc.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SetCalcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetCalcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SetCalcParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetCalcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SetCalcParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetCalcParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SetCalcParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetCalcParser#ints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInts(SetCalcParser.IntsContext ctx);
}
