// Generated from /home/maciej/IdeaProjects/skrypt/Scripts.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ScriptsVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ScriptsBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ScriptsVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRul1(ScriptsParser.Rul1Context ctx) { return visitChildren(ctx); }
}