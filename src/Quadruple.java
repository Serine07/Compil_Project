
public class Quadruple {

    String [] Quadruple = new String[4];

    public void Quad(String operateur, String op1, String op2, String res)
    {
        Quadruple[0] = operateur;
        Quadruple[1] = op1;
        Quadruple[2] = op2;
        Quadruple[3] = res;
    }

    public String get(int index)
    {
        return Quadruple[index];
    }

    public void set(int index, String s)
    {
        Quadruple[index] = s;
    }

}
