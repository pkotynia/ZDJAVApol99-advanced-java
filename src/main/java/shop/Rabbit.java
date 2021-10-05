package shop;

import oop.Animal;

public class Rabbit extends Animal {

    @Override
    public void makeSound() {
        System.out.println("pi pi");
    }

    public Rabbit(String name) {
        super(name);
    }
}
