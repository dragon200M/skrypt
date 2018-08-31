package pl.maciej.parser;

import com.google.gson.Gson;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pl.maciej.parser.domain.ElementHolder;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by maciej on 26.07.18.
 */
public class Main1 {
    private static final String sourceStr  = "IF [OPTION(\"DE_01_192 Sk_SKS_wewn\",\"SKS_Sk_Orzech\")]THEN ENDIF";



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("skrypt_1"));

//        InputStream strStream = new ByteArrayInputStream(sourceStr.getBytes(Charset.forName("UTF-8")));
        InputStream strStream =
                new ByteArrayInputStream
                        (Files.readAllBytes(new File("data/newFile").toPath()));

        CharStream stream = CharStreams.fromStream(strStream);
        ScriptsLexer lexer = new ScriptsLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);

        ScriptsParser parser = new ScriptsParser(tokens);
        ScriptsTreeWalkListener listener = new ScriptsTreeWalkListener();
        parser.addParseListener(listener);
        BaseErrorListener errorListener = new ScriptErrorListener();
        parser.addErrorListener(errorListener);
        parser.removeErrorListeners();
        parser.compilationUnit();

        System.out.println(listener.getSkryptNazwa());
        Gson gson = new Gson();
        System.out.println(gson.toJson(listener.getElements()));
        listener.getElements().forEach(el -> {
            String obj = gson.toJson(el);
            System.out.println(obj);
        });
//WItam

    }

}
