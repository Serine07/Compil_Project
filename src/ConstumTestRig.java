import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;

import javax.print.PrintException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class ConstumTestRig {

    public static void process(TestConfig config, ArrayList<LangBaseListener> listeners, ANTLRErrorListener errorListener) throws Exception {


        LangLexer lexer = new LangLexer(null);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.addErrorListener(errorListener);

        for (LangBaseListener listener : listeners) parser.addParseListener(listener);

        Charset charset = config.encoding == null ? Charset.defaultCharset() : Charset.forName(config.encoding);
        if (config.inputFiles.size() == 0) {
            CharStream charStream = CharStreams.fromStream(System.in, charset);
            process(lexer, parser, charStream, config);
        } else {
            CharStream charStream;
            for (Iterator i$ = config.inputFiles.iterator(); i$.hasNext(); process(lexer, parser, charStream, config)) {
                String inputFile = (String) i$.next();
                charStream = CharStreams.fromPath(Paths.get(inputFile), charset);
                if (config.inputFiles.size() > 1) {
                    System.err.println(inputFile);
                }
            }
        }
    }

    private static void process(LangLexer lexer, LangParser parser, CharStream input, TestConfig config) throws IOException, IllegalAccessException, InvocationTargetException, PrintException {
        lexer.setInputStream(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        if (config.showTokens) {
            Iterator i$ = tokens.getTokens().iterator();
            while (i$.hasNext()) {
                Token tok = (Token) i$.next();
                if (tok instanceof CommonToken) {
                    System.out.println(((CommonToken) tok).toString(lexer));
                } else {
                    System.out.println(tok.toString());
                }
            }
        }
        if (config.diagnostics) {
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        }

        if (config.printTree || config.gui || config.psFile != null) {
            parser.setBuildParseTree(true);
        }

        if (config.SLL) {
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        }

        parser.setTokenStream(tokens);
        parser.setTrace(config.trace);

        ParserRuleContext tree = parser.body();
        if (config.printTree) {
            System.out.println(tree.toStringTree(parser));
        }

        if (config.gui) {
            Trees.inspect(tree, parser);
        }

        if (config.psFile != null) {
            Trees.save(tree, parser, config.psFile);
        }
    }
}
