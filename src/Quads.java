import java.util.ArrayList;

public class Quads {

    ArrayList<Quadruple> Quads ;

    public Quads() {
        this.Quads = new ArrayList<Quadruple>();
    }

    /*Ajouter un quadruplé à la table*/

    public int addQuad (String str1, String str2, String str3, String str4){
        Quadruple quad = new Quadruple();
        quad.Quad(str1,str2,str3,str4);
        Quads.add(quad);
        return Quads.size() - 1;    //retourné le numéro du quadrublé dans la table
    }

    /*Récuperer un quadruplé */
    public Quadruple getQuad(int index)
    {
        return Quads.get(index);
    }

    public int size()
    {
        return Quads.size();
    }


    public void display() {
        System.out.println("Les quadruplés : ");
        System.out.println("********************************************************");

        for (Quadruple quad : Quads ) {
            System.out.println(quad.toString());
        }
        System.out.println("********************************************************\n");
    }


}
