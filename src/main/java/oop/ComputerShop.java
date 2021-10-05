package oop;

public class ComputerShop {

    public static void main(String[] args) {
        Computer pc = new Computer("lenovo", "i7", 32);
        // Computer -> Object
        System.out.println(pc.toString());

        Laptop laptop = new Laptop("dell", "i5", 16, 90);
        // Laptop -> Computer -> Object
        System.out.println(laptop);
        laptop.saveBattery();

        Object laptopHp = new Laptop("hp", "i3", 8, 90);
        System.out.println(laptopHp);
        Laptop laptop1 = (Laptop) laptopHp;
        laptop1.saveBattery();
        ((Laptop)laptopHp).saveBattery();

    }
}
