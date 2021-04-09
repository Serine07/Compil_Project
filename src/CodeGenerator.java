import java.io.*;
import java.io.FileWriter;

public class CodeGenerator {

    Quads quadsTable ;
    String AX;

    public CodeGenerator(Quads quadsTable) {
        this.quadsTable = quadsTable;
    }

    public void AssemblyGenerator() throws IOException {

        File CodeFile = new File("AssemblyCode.txt");
        FileWriter fwriter = new FileWriter(CodeFile);

        fwriter.write("Assembly Code \n");
        fwriter.write("START \n");

        System.out.println("Assembly Code : ");
        System.out.println("START");

        for (Quadruple quad : quadsTable.Quads ) {

            switch(quad.get(0)) {
                case "=":
                    if (AX != quad.get(2)) {
                        System.out.println("\tMOV AX, " + quad.get(2));
                        fwriter.write("\tMOV AX, " + quad.get(2)+"\n");
                    }
                    System.out.println("\tMOV "+quad.get(3)+", AX" );
                    fwriter.write("\tMOV "+quad.get(3)+", AX\n" );
                    AX = quad.get(3);
                    break;
                case "+":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("\tSTORE " + AX);
                        fwriter.write("\tSTORE " + AX+"\n");
                        System.out.println("\tMOV AX, " + quad.get(1));
                        fwriter.write("\tMOV AX, " + quad.get(1)+"\n");
                    }
                    System.out.println("\tADD "+quad.get(2) );
                    fwriter.write("\tADD " + quad.get(2) +"\n");
                    AX = quad.get(3);
                    break;
                case "-":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("\tSTORE " + AX);
                        fwriter.write("\tSTORE " + AX+"\n");
                        System.out.println("\tMOV AX, " + quad.get(1));
                        fwriter.write("\tMOV AX, " + quad.get(1)+"\n");
                    }
                    System.out.println("\tSUB "+quad.get(2) );
                    fwriter.write("\tSUB " + quad.get(2) +"\n");
                    AX = quad.get(3);
                    break;
                case "*":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("\tSTORE " + AX);
                        fwriter.write("\tSTORE " + AX+"\n");
                        System.out.println("\tMOV AX, " + quad.get(1));
                        fwriter.write("\tMOV AX, " + quad.get(1)+"\n");
                    }
                    System.out.println("\tMUL "+quad.get(2) );
                    fwriter.write("\tMUL " + quad.get(2) +"\n");
                    AX = quad.get(3);
                    break;
                case "/":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("\tSTORE " + AX);
                        fwriter.write("\tSTORE " + AX+"\n");
                        System.out.println("\tMOV AX, " + quad.get(1));
                        fwriter.write("\tMOV AX, " + quad.get(1)+"\n");
                    }
                    System.out.println("\tDIV "+quad.get(2) );
                    fwriter.write("\tDIV " + quad.get(2) +"\n");
                    AX = quad.get(3);
                    break;
                case "BLE":
                    System.out.println("\tMOV AX, "+quad.get(1));
                    fwriter.write("\tMOV AX, " + quad.get(1) +"\n");
                    System.out.println("\tCMP AX, "+quad.get(2));
                    fwriter.write("\tCMP AX, " + quad.get(2) +"\n");
                    System.out.println("\tJLE EtiqAdr"+quad.get(3));
                    fwriter.write("\tJLE EtiqAdr" + quad.get(3) +"\n");
                    break;
                case "BGE":
                    System.out.println("\tMOV AX, "+quad.get(1));
                    fwriter.write("\tMOV AX, " + quad.get(1) +"\n");
                    System.out.println("\tCMP AX, "+quad.get(2));
                    fwriter.write("\tCMP AX, " + quad.get(2) +"\n");
                    System.out.println("\tJGE EtiqAdr"+quad.get(3));
                    fwriter.write("\tJGE EtiqAdr" + quad.get(3) +"\n");
                    break;
                case "BZ":
                    System.out.println("\tMOV AX, "+quad.get(1));
                    fwriter.write("\tMOV AX, " + quad.get(1) +"\n");
                    System.out.println("\tCMP AX, 0");
                    fwriter.write("\tCMP AX, 0 \n");
                    System.out.println("\tJZ EtiqAdr"+quad.get(3));
                    fwriter.write("\tJZ EtiqAdr" + quad.get(3) +"\n");
                    break;
                case "READ":
                    System.out.println("\tINPUT "+quad.get(1));
                    fwriter.write("\tINPUT " + quad.get(1) +"\n");
                    break;
                case "WRITE":
                    System.out.println("\tOUTPUT "+quad.get(1));
                    fwriter.write("\tOUTPUT " + quad.get(1) +"\n");
                    break;
                case "END":
                    System.out.println("END.");
                    fwriter.write("END. \n");
                    break;
                default:
                    // code block
            }


        }

        fwriter.close();

    }


}
