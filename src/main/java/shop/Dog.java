package shop;

import oop.Animal;

public class Dog extends Animal {

    private int age;

    public Dog(String name, int age) {
        this(name);
        this.age = age;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.bread + " is barking");
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name=" + super.getName() + " " +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog burek = new Dog("burek", 14);
        burek.makeSound();
        System.out.println(burek.getAge());
        System.out.println(burek.getName());

        Dog laser = new Dog("laser");
        System.out.println(laser.getAge());
        System.out.println(laser.getName());
    }
}
