import java.util.HashMap;

public class SymbolTable {

    public HashMap<String,Element> ST = new HashMap<String,Element>();

    public Element getElement(String name) {

        return this.ST.get(name);
    }

    public boolean findElement(String name){

        return getElement(name) != null;
    }

    public void addElement(String name,Element e){
        ST.put(name,e);
    }

    public void deleteElement(String name){
        ST.remove(name);
    }

    public void display() {
        System.out.println("Our symbols table : ");
        System.out.println("\n********************************************************");

        for (String name : ST.keySet()) {
            System.out.println("key: " + name + " value: " + ST.get(name).toString());
        }
        System.out.println("\n********************************************************");
    }


}
