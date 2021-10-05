package collections;

import java.util.*;
import java.util.stream.Stream;

public class ListClient {

    public static void main(String[] args) {
        List<String> stringListOf = List.of("Bob", "Ted", "Greg");
        List<Integer> stringArraysList = Arrays.asList(1, 2, 3);
        List<String> stringList = new ArrayList<>();

        stringList.add("Bob");
        stringList.add("Ted");
        stringList.add("Greg");

        System.out.println(stringList.size());
        System.out.println(stringList.contains("Bober"));

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        for (String item : stringList) {
            System.out.println(item);
        }

        Stream<String> sirs = stringList.stream().map(item -> "Sir " + item);

        sirs.forEach(item -> System.out.println(item));
    }
}
