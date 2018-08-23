package pl.maciej.parser;

import org.antlr.v4.runtime.tree.TerminalNode;
import pl.maciej.parser.domain.ElementHolder;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by maciej on 12.08.18.
 */
public class ScriptsTreeWalkListener extends ScriptsBaseListener {
    private Queue<ElementHolder> elements = new ArrayDeque<>();

    @Override
    public void exitCompilationUnit(ScriptsParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
    }

    @Override
    public void exitSetOpcja(ScriptsParser.SetOpcjaContext ctx) {
        final TerminalNode option = ctx.ID(0);
        final TerminalNode valor = ctx.ID(1);
        ElementHolder el = new ElementHolder();
        el.setTyp("SETOPTION");
        el.setName(option.getText());
        el.setValue(valor.getText());
        elements.add(el);
    }

    @Override
    public void exitScriptLink(ScriptsParser.ScriptLinkContext ctx) {
        final TerminalNode script = ctx.ID(0);
        ElementHolder el =  new ElementHolder();
        el.setTyp("SCRIPT");
        el.setName(script.getText());
        el.setValue("");
        elements.add(el);
    }

    @Override
    public void exitOpcja(ScriptsParser.OpcjaContext ctx) {
        final TerminalNode option = ctx.ID(0);
        final TerminalNode valor = ctx.ID(1);
        ElementHolder el = new ElementHolder();
        el.setTyp("OPTION");
        el.setName(option.getText());
        el.setValue(valor.getText());
        elements.add(el);
    }


    @Override
    public void exitCpiece(ScriptsParser.CpieceContext ctx) {
        final TerminalNode base = ctx.ID();
        final TerminalNode quantity = ctx.arg().NUMBER();
        final TerminalNode var = ctx.arg().VAR();
        ElementHolder el = new ElementHolder();
        el.setTyp("CPIECE");
        el.setName(base.getText());
        if(quantity != null){
            el.setValue(quantity.getText());
        }
        if(var != null){
            el.setValue(var.getText());
        }
        elements.add(el);
    }



    public Queue<ElementHolder> getElements() {
        return elements;
    }

    public void setElements(Queue<ElementHolder> elements) {
        this.elements = elements;
    }
}
