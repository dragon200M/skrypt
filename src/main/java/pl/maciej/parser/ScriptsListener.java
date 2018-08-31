// Generated from /home/maciej/IdeaProjects/skrypt/Scripts.g4 by ANTLR 4.7
package pl.maciej.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptsParser}.
 */
public interface ScriptsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ScriptsParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ScriptsParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#ifrule}.
	 * @param ctx the parse tree
	 */
	void enterIfrule(ScriptsParser.IfruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#ifrule}.
	 * @param ctx the parse tree
	 */
	void exitIfrule(ScriptsParser.IfruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#opcja}.
	 * @param ctx the parse tree
	 */
	void enterOpcja(ScriptsParser.OpcjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#opcja}.
	 * @param ctx the parse tree
	 */
	void exitOpcja(ScriptsParser.OpcjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#setOpcja}.
	 * @param ctx the parse tree
	 */
	void enterSetOpcja(ScriptsParser.SetOpcjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#setOpcja}.
	 * @param ctx the parse tree
	 */
	void exitSetOpcja(ScriptsParser.SetOpcjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#scriptLink}.
	 * @param ctx the parse tree
	 */
	void enterScriptLink(ScriptsParser.ScriptLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#scriptLink}.
	 * @param ctx the parse tree
	 */
	void exitScriptLink(ScriptsParser.ScriptLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(ScriptsParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(ScriptsParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(ScriptsParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(ScriptsParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ScriptsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ScriptsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(ScriptsParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(ScriptsParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#colour}.
	 * @param ctx the parse tree
	 */
	void enterColour(ScriptsParser.ColourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#colour}.
	 * @param ctx the parse tree
	 */
	void exitColour(ScriptsParser.ColourContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#innercolor}.
	 * @param ctx the parse tree
	 */
	void enterInnercolor(ScriptsParser.InnercolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#innercolor}.
	 * @param ctx the parse tree
	 */
	void exitInnercolor(ScriptsParser.InnercolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#outercolor}.
	 * @param ctx the parse tree
	 */
	void enterOutercolor(ScriptsParser.OutercolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#outercolor}.
	 * @param ctx the parse tree
	 */
	void exitOutercolor(ScriptsParser.OutercolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#cpiece}.
	 * @param ctx the parse tree
	 */
	void enterCpiece(ScriptsParser.CpieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#cpiece}.
	 * @param ctx the parse tree
	 */
	void exitCpiece(ScriptsParser.CpieceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#cpiecexu}.
	 * @param ctx the parse tree
	 */
	void enterCpiecexu(ScriptsParser.CpiecexuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#cpiecexu}.
	 * @param ctx the parse tree
	 */
	void exitCpiecexu(ScriptsParser.CpiecexuContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#seterror}.
	 * @param ctx the parse tree
	 */
	void enterSeterror(ScriptsParser.SeterrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#seterror}.
	 * @param ctx the parse tree
	 */
	void exitSeterror(ScriptsParser.SeterrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#setnumeric}.
	 * @param ctx the parse tree
	 */
	void enterSetnumeric(ScriptsParser.SetnumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#setnumeric}.
	 * @param ctx the parse tree
	 */
	void exitSetnumeric(ScriptsParser.SetnumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#getnumeric}.
	 * @param ctx the parse tree
	 */
	void enterGetnumeric(ScriptsParser.GetnumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#getnumeric}.
	 * @param ctx the parse tree
	 */
	void exitGetnumeric(ScriptsParser.GetnumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#piecex}.
	 * @param ctx the parse tree
	 */
	void enterPiecex(ScriptsParser.PiecexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#piecex}.
	 * @param ctx the parse tree
	 */
	void exitPiecex(ScriptsParser.PiecexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#piece}.
	 * @param ctx the parse tree
	 */
	void enterPiece(ScriptsParser.PieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#piece}.
	 * @param ctx the parse tree
	 */
	void exitPiece(ScriptsParser.PieceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#surface}.
	 * @param ctx the parse tree
	 */
	void enterSurface(ScriptsParser.SurfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#surface}.
	 * @param ctx the parse tree
	 */
	void exitSurface(ScriptsParser.SurfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#csurface}.
	 * @param ctx the parse tree
	 */
	void enterCsurface(ScriptsParser.CsurfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#csurface}.
	 * @param ctx the parse tree
	 */
	void exitCsurface(ScriptsParser.CsurfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#surfacex}.
	 * @param ctx the parse tree
	 */
	void enterSurfacex(ScriptsParser.SurfacexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#surfacex}.
	 * @param ctx the parse tree
	 */
	void exitSurfacex(ScriptsParser.SurfacexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#surfacexu}.
	 * @param ctx the parse tree
	 */
	void enterSurfacexu(ScriptsParser.SurfacexuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#surfacexu}.
	 * @param ctx the parse tree
	 */
	void exitSurfacexu(ScriptsParser.SurfacexuContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#crod}.
	 * @param ctx the parse tree
	 */
	void enterCrod(ScriptsParser.CrodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#crod}.
	 * @param ctx the parse tree
	 */
	void exitCrod(ScriptsParser.CrodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#crodx}.
	 * @param ctx the parse tree
	 */
	void enterCrodx(ScriptsParser.CrodxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#crodx}.
	 * @param ctx the parse tree
	 */
	void exitCrodx(ScriptsParser.CrodxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#crodxu}.
	 * @param ctx the parse tree
	 */
	void enterCrodxu(ScriptsParser.CrodxuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#crodxu}.
	 * @param ctx the parse tree
	 */
	void exitCrodxu(ScriptsParser.CrodxuContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#rod}.
	 * @param ctx the parse tree
	 */
	void enterRod(ScriptsParser.RodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#rod}.
	 * @param ctx the parse tree
	 */
	void exitRod(ScriptsParser.RodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#rodx}.
	 * @param ctx the parse tree
	 */
	void enterRodx(ScriptsParser.RodxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#rodx}.
	 * @param ctx the parse tree
	 */
	void exitRodx(ScriptsParser.RodxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#cinrod}.
	 * @param ctx the parse tree
	 */
	void enterCinrod(ScriptsParser.CinrodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#cinrod}.
	 * @param ctx the parse tree
	 */
	void exitCinrod(ScriptsParser.CinrodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#coutrod}.
	 * @param ctx the parse tree
	 */
	void enterCoutrod(ScriptsParser.CoutrodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#coutrod}.
	 * @param ctx the parse tree
	 */
	void exitCoutrod(ScriptsParser.CoutrodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(ScriptsParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(ScriptsParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#workforce}.
	 * @param ctx the parse tree
	 */
	void enterWorkforce(ScriptsParser.WorkforceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#workforce}.
	 * @param ctx the parse tree
	 */
	void exitWorkforce(ScriptsParser.WorkforceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#existVar}.
	 * @param ctx the parse tree
	 */
	void enterExistVar(ScriptsParser.ExistVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#existVar}.
	 * @param ctx the parse tree
	 */
	void exitExistVar(ScriptsParser.ExistVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#setdimension}.
	 * @param ctx the parse tree
	 */
	void enterSetdimension(ScriptsParser.SetdimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#setdimension}.
	 * @param ctx the parse tree
	 */
	void exitSetdimension(ScriptsParser.SetdimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(ScriptsParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(ScriptsParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptsParser#nazwa}.
	 * @param ctx the parse tree
	 */
	void enterNazwa(ScriptsParser.NazwaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptsParser#nazwa}.
	 * @param ctx the parse tree
	 */
	void exitNazwa(ScriptsParser.NazwaContext ctx);
}