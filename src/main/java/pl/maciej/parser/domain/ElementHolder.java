package pl.maciej.parser.domain;

/**
 * Created by maciej on 04.08.18.
 */
public class ElementHolder {
    private String typ;
    private String name;
    private String value;
    private Integer lineNumber;
    private  boolean errors;

    public ElementHolder(){
        errors = false;
    };

    public ElementHolder(String name, String value, Integer lineNumber) {
        this.name = name;
        this.value = value;
        this.lineNumber = lineNumber;
        errors = false;
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

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public boolean isErrors() {
        return errors;
    }

    public void setErrors(boolean errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "ElementHolder{" +
                "typ='" + typ + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", lineNumber=" + lineNumber +
                ", errors=" + errors +
                '}';
    }
}
