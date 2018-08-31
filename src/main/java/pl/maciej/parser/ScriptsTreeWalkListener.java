package pl.maciej.parser;

import org.antlr.v4.runtime.tree.TerminalNode;
import pl.maciej.parser.domain.ElementHolder;
import pl.maciej.parser.domain.FunctionTypes;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by maciej on 12.08.18.
 */
public class ScriptsTreeWalkListener extends ScriptsBaseListener {

    private String skryptNazwa = "";
    private Queue<ElementHolder> elements = new ArrayDeque<>();

    @Override
    public void exitCompilationUnit(ScriptsParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
    }

    @Override
    public void exitNazwa(ScriptsParser.NazwaContext ctx) {
        final TerminalNode skryptName = ctx.ID();

        if(null != skryptName){
            skryptNazwa = removeDoubleQuota(skryptName.getText());
        }

    }

    @Override
    public void exitSetOpcja(ScriptsParser.SetOpcjaContext ctx) {
        final TerminalNode option = ctx.ID(0);
        final TerminalNode valor = ctx.ID(1);
        ElementHolder el = new ElementHolder();
        el.setTyp(FunctionTypes.SETOPTION);
        el.setName(removeDoubleQuota(option.getText()));
        el.setValue(removeDoubleQuota(valor.getText()));
        elements.add(el);
    }

    @Override
    public void exitScriptLink(ScriptsParser.ScriptLinkContext ctx) {
        final TerminalNode script = ctx.ID(0);
        ElementHolder el =  new ElementHolder();
        el.setTyp(FunctionTypes.SCRIPT);
        el.setValue(removeDoubleQuota(script.getText()));
        elements.add(el);
    }

    @Override
    public void exitOpcja(ScriptsParser.OpcjaContext ctx) {
        final TerminalNode option = ctx.ID(0);
        final TerminalNode valor = ctx.ID(1);
        ElementHolder el = new ElementHolder();
        el.setTyp(FunctionTypes.OPTION);
        el.setName(removeDoubleQuota(option.getText()));
        el.setValue(removeDoubleQuota(valor.getText()));
        elements.add(el);
    }


    @Override
    public void exitCpiece(ScriptsParser.CpieceContext ctx) {
        final TerminalNode base = ctx.ID();
        final TerminalNode quantity = ctx.arg().NUMBER();
        final TerminalNode var = ctx.arg().VAR();
        ElementHolder el = new ElementHolder();
        el.setTyp(FunctionTypes.CPIECE);
        el.setName(base.getText());
        if(quantity != null){
            el.setValue(quantity.getText());
        }
        if(var != null){
            el.setValue(var.getText());
        }
       // elements.add(el);


    }

    public String removeDoubleQuota(String str){
        if(str.charAt(0) == '"' && str.charAt(str.length()-1) == '"'){
            str = str.substring(1,str.length()-1);
        }
        return str;
    }

    public String getSkryptNazwa() {
        return skryptNazwa;
    }

    public Queue<ElementHolder> getElements() {
        return elements;
    }

    public void setElements(Queue<ElementHolder> elements) {
        this.elements = elements;
    }
}
