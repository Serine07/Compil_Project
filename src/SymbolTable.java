import java.util.ArrayList;

public class SymbolTable {

    public ArrayList<Element> ST = new ArrayList<Element>();

    public Element getElement(String name) {

        for (int i = 0; i < ST.size(); i++) {
            if (ST.get(i).name.compareTo(name) == 0)
                return ST.get(i);
        }
        return null;
    }

    public boolean findElement(String name){

        return getElement(name) != null;
    }

    public void addElement(Element e){
        ST.add(e);
    }

    public void deleteElement(String name){
        for (int i=0; i<ST.size(); i++){
            if(ST.get(i).name.compareTo(name)==0){
                deleteE(ST.get(i));
                return;
            }
        }
    }

    public void deleteE(Element e){

        ST.remove(e);
    }


}
