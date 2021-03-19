public class Element {

    String  value;
    int type, declared;

    public Element( int type, String value, int declared) {
        this.type=type;
        this.value=value;
        this.declared=declared;
    }

    public Element( int declared, int type) {
        this.type=type;
        this.declared=declared;
    }

    @Override
    public String toString() {
        return "Element{" +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", declared=" + declared +
                '}';
    }
}
