// Generated from /home/maciej/IdeaProjects/skrypt/Scripts.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScriptsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScriptsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScriptsParser#rul1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRul1(ScriptsParser.Rul1Context ctx);
}