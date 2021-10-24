package generics;

import java.util.List;
import java.util.function.Function;

public class GenericPlayground {

    public static void main(String... args) {
        Integer[] integers = new Integer[] {1,2,3,4};

        List<Integer> integersList = ListUtils.fromArrayToList(integers);
        System.out.println(integersList);

        String[] names = new String[] {"Burek","Strzała","Laser"};

        List<String> namesList = ListUtils.fromArrayToListGeneric(names);
        System.out.println(namesList);

        List<Dog> dogs = ListUtils.fromArrayToListOfDifferentType(names, name -> new Dog(name));
        dogs.forEach(dog -> dog.bark());

    }
}
