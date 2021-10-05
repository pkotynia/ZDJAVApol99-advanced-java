package oop;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public Cat(String name) {
        super(name);
    }
}
