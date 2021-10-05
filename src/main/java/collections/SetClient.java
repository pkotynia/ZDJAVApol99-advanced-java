package collections;

import oop.Computer;

import java.util.HashSet;
import java.util.Set;

public class SetClient {

    public static void main(String[] args) {
        Set<Computer> computers = new HashSet<>();

        Computer hp = new Computer(2,"hp", "i7", 32);
        Computer hp1 = new Computer(2,"hp", "i7", 32);
        Computer dell = new Computer(3,"dell", "i7", 32);

        computers.add(hp);
        computers.add(hp1);
        computers.add(dell);

        for (Computer item : computers) {
            System.out.println(item);
        }
    }
}
