package JavaHW5;

public class Man {
    String firstName;
    String lastName;
    String name_animal;

    @Override
    public String toString() {
        return String.format("fn:%s ln:%s doc:%s", firstName, lastName, name_animal);
    }
}
