public class CodeGenerator {

    Quads quadsTable ;
    String AX;

    public CodeGenerator(Quads quadsTable) {
        this.quadsTable = quadsTable;
    }

    public void AssemblyGenerator() {

        System.out.println("Assembly Code : ");
        System.out.println("START");
        for (Quadruple quad : quadsTable.Quads ) {

            switch(quad.get(0)) {
                case "=":
                    if (AX != quad.get(2)) {
                        System.out.println("MOV AX, " + quad.get(2));
                    }
                    System.out.println("MOV "+quad.get(3)+", AX" );
                    AX = quad.get(3);
                    break;
                case "+":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("STORE " + AX);
                        System.out.println("MOV AX, " + quad.get(1));
                    }
                    System.out.println("ADD "+quad.get(2) );
                    AX = quad.get(3);
                    break;
                case "-":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("STORE " + AX);
                        System.out.println("MOV AX, " + quad.get(1));
                    }
                    System.out.println("SUB "+quad.get(2) );
                    AX = quad.get(3);
                    break;
                case "*":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("STORE " + AX);
                        System.out.println("MOV AX, " + quad.get(1));
                    }
                    System.out.println("MUL "+quad.get(2) );
                    AX = quad.get(3);
                    break;
                case "/":
                    if (!(AX.equals(quad.get(1)))) {
                        System.out.println("STORE " + AX);
                        System.out.println("MOV AX, " + quad.get(1));
                    }
                    System.out.println("DIV "+quad.get(2) );
                    AX = quad.get(3);
                    break;
                case "BLE":
                    System.out.println("MOV AX, "+quad.get(1));
                    System.out.println("CMP AX, "+quad.get(2));
                    System.out.println("JLE EtiqAdr"+quad.get(3));
                    break;
                case "BGE":
                    System.out.println("MOV AX, "+quad.get(1));
                    System.out.println("CMP AX, "+quad.get(2));
                    System.out.println("JGE EtiqAdr"+quad.get(3));
                    break;
                case "BZ":
                    System.out.println("MOV AX, "+quad.get(1));
                    System.out.println("CMP AX, 0");
                    System.out.println("JLE EtiqAdr"+quad.get(3));
                    break;
                case "READ":
                    System.out.println("INPUT "+quad.get(1));
                    break;
                case "WRITE":
                    System.out.println("OUTPUT "+quad.get(1));
                    break;
                case "END":
                    System.out.println("END.");
                    break;
                default:
                    // code block
            }


        }


    }


}
