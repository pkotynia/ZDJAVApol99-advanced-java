package collections;

import shop.Dog;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClient {

    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(1,"Dilbert");
        String item = employees.put(1, "Wally");
        System.out.println("previous item " + item);
        employees.put(2, "Alice");

        Set<Map.Entry<Integer, String>> entries = employees.entrySet();

        for (Map.Entry<Integer, String> integerStringEntry : entries) {
            System.out.println("Key is " + integerStringEntry.getKey());
            System.out.println("Value is " + integerStringEntry.getValue());
        }

        Map<String, Dog> animals = Map.of("Burek", new Dog("Burek"), "Laser", new Dog("Laser"));

        System.out.println("Animals: " + animals);

        Dog dog = animals.getOrDefault("Burrek", new Dog("DefaultDog"));
        System.out.println(dog.getName());

    }
}
