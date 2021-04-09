public class Element {

    String  value;
    int type, declared;

    public Element( int type, String value, int declared) {
        this.type=type;
        this.value=value;
        this.declared=declared;
    }

    public Element( ) {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Element(int declared, int type) {
        this.type=type;
        this.declared=declared;
    }

    @Override
    public String toString() {

        String d="";
        if(declared==1){d="yes";}else{d="no";}

        String t="";
        if(type==1){t="Integer";}else{if(type==2){t="Float";}else{if(type==3){t="String";}}}

        return "Element{" +
                " type='" + t + '\'' +
                ", value='" + value + '\'' +
                ", declared=" + d +
                '}';
    }
}
