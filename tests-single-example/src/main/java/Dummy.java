public class Dummy {
    String name;
    String type;

    public Dummy() {
        this.name = "Dummy";
        this.type = "DummyType";
    }

    public Dummy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String printMe() {
        return this.name + " " + this.type;
    }
}