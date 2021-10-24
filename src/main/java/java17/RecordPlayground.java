package java17;

import generics.Dog;

public class RecordPlayground {

    public static void main(String[] args) {
        Student fred = new Student("Fred");
        StudentRecord bob = new StudentRecord("Bob");

        System.out.println(fred);
        System.out.println(bob);

        System.out.println(fred.getFirstName());
        System.out.println(bob.firstName());
        bob.sayHello();

        RecordPlayground.match(bob);
        RecordPlayground.match(fred);
        RecordPlayground.match(new Dog("Laser"));
    }

    private static void match(Object student) {
        switch (student) {
            case StudentRecord i -> System.out.println("Student Record " + i.firstName());
            case Student i -> System.out.println("Student Class" + i.getFirstName());
            default -> System.out.println("something different");
        }

    }
}
