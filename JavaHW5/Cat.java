package JavaHW5;

public class Cat {
    String name;
    String color;
    String type;

    @Override
    public String toString() {
        return String.format("n:%s c:%s t:%s", name, color, type);
    }
}