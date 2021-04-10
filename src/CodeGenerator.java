import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;

public class CodeGenerator {

    Quads quadsTable ;
    String AX;
    ArrayList<String> CodeAssembleur = new ArrayList<>();

    public CodeGenerator(Quads quadsTable) {
        this.quadsTable = quadsTable;
    }

    public void AssemblyGenerator() throws IOException {

        CodeAssembleur.add("Code Assembleur : ");
        CodeAssembleur.add("********************************************************");
        CodeAssembleur.add("START");

        for (Quadruple quad : quadsTable.Quads ) {

            switch(quad.get(0)) {
                case "=":
                    if (AX != quad.get(2)) {
                        CodeAssembleur.add("\tMOV AX, " + quad.get(2));
                    }
                    CodeAssembleur.add("\tMOV "+quad.get(3)+", AX");
                    AX = quad.get(3);
                    break;
                case "+":
                    if (!(AX.equals(quad.get(1)))) {
                        CodeAssembleur.add("\tSTORE " + AX);
                        CodeAssembleur.add("\tMOV AX, " + quad.get(1));
                    }
                    CodeAssembleur.add("\tADD "+quad.get(2));
                    AX = quad.get(3);
                    break;
                case "-":
                    if (!(AX.equals(quad.get(1)))) {
                        CodeAssembleur.add("\tSTORE " + AX);
                        CodeAssembleur.add("\tMOV AX, " + quad.get(1));
                    }
                    CodeAssembleur.add("\tSUB "+quad.get(2));
                    AX = quad.get(3);
                    break;
                case "*":
                    if (!(AX.equals(quad.get(1)))) {
                        CodeAssembleur.add("\tSTORE " + AX);
                        CodeAssembleur.add("\tMOV AX, " + quad.get(1));
                    }
                    CodeAssembleur.add("\tMUL "+quad.get(2));
                    AX = quad.get(3);
                    break;
                case "/":
                    if (!(AX.equals(quad.get(1)))) {
                        CodeAssembleur.add("\tSTORE " + AX);
                        CodeAssembleur.add("\tMOV AX, " + quad.get(1));
                    }
                    CodeAssembleur.add("\tDIV "+quad.get(2));
                    AX = quad.get(3);
                    break;
                case "BLE":
                    CodeAssembleur.add("\tMOV AX, " + quad.get(1));
                    CodeAssembleur.add("\tCMP AX, "+quad.get(2));
                    CodeAssembleur.add("\tJLE EtiqAdr"+quad.get(3));
                    break;
                case "BGE":
                    CodeAssembleur.add("\tMOV AX, " + quad.get(1));
                    CodeAssembleur.add("\tCMP AX, "+quad.get(2));
                    CodeAssembleur.add("\tJGE EtiqAdr"+quad.get(3));
                    break;
                case "BZ":
                    CodeAssembleur.add("\tMOV AX, " + quad.get(1));
                    CodeAssembleur.add("\tCMP AX, 0");
                    CodeAssembleur.add("\tJZ EtiqAdr"+quad.get(3));
                    break;
                case "READ":
                    CodeAssembleur.add("\tINPUT "+quad.get(1));
                    break;
                case "WRITE":
                    CodeAssembleur.add("\tOUTPUT "+quad.get(1));
                    break;
                case "END":
                    CodeAssembleur.add("END.");
                    break;
                default:
                    // code block
            }

        }
        CodeAssembleur.add("********************************************************");

        File CodeFile = new File("AssemblyCode.txt");
        FileWriter fwriter = new FileWriter(CodeFile);

        for (String inst : CodeAssembleur ) {
            System.out.println(inst);
            fwriter.write(inst+"\n");
        }

        fwriter.close();

    }


}
