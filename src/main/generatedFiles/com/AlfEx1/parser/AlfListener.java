// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx1.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlfParser}.
 */
public interface AlfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AlfParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AlfParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AlfParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AlfParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AlfParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AlfParser.ValueContext ctx);
}