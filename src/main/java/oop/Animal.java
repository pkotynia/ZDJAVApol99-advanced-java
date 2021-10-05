package oop;

public abstract class Animal {

    private String name;
    int color;
    protected String bread;
    public int weight;

    public Animal(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}
