package generics;

public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Dog " + name + " barked");
    }
}
