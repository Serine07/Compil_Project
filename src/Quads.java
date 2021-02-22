
import java.util.ArrayList;

public class Quads {

    ArrayList<Quadruple> Quads = new ArrayList<Quadruple>();

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

}