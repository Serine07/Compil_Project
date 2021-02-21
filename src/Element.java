public class Element {

    String name, type, value;
    boolean declared;

    public Element(String name, String type, String value, boolean declared) {
        this.name=name;
        this.type=type;
        this.value=value;
        this.declared=declared;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", declared=" + declared +
                '}';
    }
}
