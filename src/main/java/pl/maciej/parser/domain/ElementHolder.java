package pl.maciej.parser.domain;

/**
 * Created by maciej on 04.08.18.
 */
public class ElementHolder {
    private FunctionTypes typ;
    private String name = "";
    private String value = "";


    public ElementHolder(){
    };

    public ElementHolder(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FunctionTypes getTyp() {
        return typ;
    }

    public void setTyp(FunctionTypes typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "ElementHolder{" +
                "typ='" + typ + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\''+
                '}';
    }
}
