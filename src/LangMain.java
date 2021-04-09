import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.util.ArrayList;

public class LangMain {


    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            printUsage();
        }

        ArrayList<String> errors = new ArrayList<>();

        STListener stListener = new STListener(errors);
        QuadsListener quadsListener = new QuadsListener(errors);

        ArrayList<LangBaseListener> routines = new ArrayList<>();

        routines.add(stListener);
        routines.add(quadsListener);

        ErrorListener errorListener = new ErrorListener(errors);

        TestConfig config = new TestConfig(args);

        ConstumTestRig.process(config, routines, errorListener);

        if (errors.isEmpty()) {
            System.out.println("No errors on our program!");
            stListener.getTable().display();
            quadsListener.getQuadsTable().display();
        } else {
            System.err.println("Ouuuppsss our program compiled with some errors; take a look :");
            for (String error : errors)
                System.err.println(error);
        }
    }

    private static void printUsage() {
        System.err.println("Lang\n  [-tokens] [-tree] [-gui] [-ps file.ps] [-encoding encodingname]\n  [-trace] [-diagnostics] [-SLL]\n  [input-filename(s)]");
        System.err.println("Use startRuleName='tokens' if GrammarName is a lexer grammar.");
        System.err.println("Omitting input-filename makes rig read from stdin.");
        System.exit(0);
    }


}
