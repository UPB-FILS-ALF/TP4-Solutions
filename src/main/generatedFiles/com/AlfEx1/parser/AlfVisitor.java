// Generated from java-escape by ANTLR 4.11.1
package com.AlfEx1.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AlfParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AlfParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AlfParser.ValueContext ctx);
}