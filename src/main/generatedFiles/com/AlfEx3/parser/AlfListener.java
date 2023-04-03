// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx3.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlfParser}.
 */
public interface AlfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AlfParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AlfParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AlfParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AlfParser.ExpressionContext ctx);
}