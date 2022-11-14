package JavaHW5;

public class Cat {
    String name;
    String color;
    String type;

    @Override
    public String toString() {
        return String.format("n:%s c:%s t:%s", name, color, type);
    }

    // @Override
    // public boolean equals(Object o) {
    //     var t = (WORKER) o;
    //     return id == t.id && firstName == t.firstName;
    // }

    // @Override
    // public int hashCode() {
    //     return id;
    // }
}