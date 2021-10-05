package shop;

import oop.Animal;
import oop.Cat;

public class VetShop {

    static public void addToRecord(Animal animal){
        System.out.println(("hi " + animal));
        System.out.println("Welcome to our clinic");
        animal.makeSound();
    }

    public static void main(String[] args) {
        Dog burek = new Dog("burek");
        Animal laser = new Dog("laser");
        laser.makeSound();

        Animal janusz = new Cat("Janusz");
        Animal rabbit = new Rabbit("Jack");

        janusz.makeSound();

        VetShop.addToRecord(burek);
        VetShop.addToRecord(janusz);
        VetShop.addToRecord(rabbit);

        Animal someAnimal = new Animal("Fred") {
            @Override
            public void makeSound() {
                System.out.println("some sound");
            }
        };
        Animal someAnimal1 = new Animal("Fred") {
            @Override
            public void makeSound() {
                System.out.println("some sound");
            }
        };
        VetShop.addToRecord(someAnimal);
        VetShop.addToRecord(someAnimal1);


    }
}
