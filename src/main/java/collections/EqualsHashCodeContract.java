package collections;

import oop.Computer;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeContract {

    public static void main(String[] args) {
        Computer hp = new Computer(1, "hp", "i7", 16);
        Computer sameHp = new Computer(1, "hp", "i7", 16);
        Computer differentHp = new Computer(2, "hp", "i7", 16);

        if (hp.equals(sameHp)) {
            System.out.println(sameHp.hashCode());
            System.out.println(hp.hashCode());
        }

        if(hp.hashCode() == differentHp.hashCode()){
            System.out.println(hp.equals(differentHp));
        }

        Map<Computer, Integer> computerIntegerMap = new HashMap<>();

        computerIntegerMap.put(hp, 1);
        computerIntegerMap.put(sameHp, 1);
        computerIntegerMap.put(differentHp, 1);

        System.out.println("Map size " + computerIntegerMap.size());

        Computer sameSameHp = new Computer(1, "hp", "i7", 16);
        System.out.println(sameSameHp.equals(hp));
        System.out.println(computerIntegerMap.get(sameSameHp));
    }
}
