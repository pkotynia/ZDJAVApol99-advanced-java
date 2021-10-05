package collections;

import oop.Computer;

public class BoxClient {

    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.put("Hello");
        String stringFromBox = box.pullOut();

        Box<Computer> computerBox = new Box<>();
        Computer hp = new Computer("hp", "i7", 16);
        computerBox.put(hp);
        Computer hpFromBox = computerBox.pullOut();
        hpFromBox.getRamSize();

        Computer dell = new Computer("dell", "i5", 16);

        computerBox.put(dell);
        Computer dellFromBox = computerBox.pullOut();
        System.out.println(dellFromBox);
    }
}
