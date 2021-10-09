package collections;

import shop.Dog;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {

    public static void main(String[] args) {
        //var keyword allows java to perform type inference
        var integers = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> results = new ArrayList<>();
        for (Integer integer : integers) {
            if(integer > 2 && integer < 7) {
                results.add(integer);
            }
        }

        // in this task we will filter integers larger then 2 and smaller than 7
        List<Integer> collect = integers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer > 2;
                    }
                })
                .filter(element -> element < 7)
                .collect(Collectors.toUnmodifiableList());

//        System.out.println(results);
//        System.out.println(collect);

        Set<String> names = Set.of("Burek", "Laser", "Marley", "Waldi");

        System.out.println(names.stream()
                .collect(Collectors.joining(" ")));

        List<Dog> dogs = names.stream()
                //.map(name -> new Dog(name))
                .map(new Function<String, Dog>() {
                    @Override
                    public Dog apply(String name) {
                        return new Dog(name);
                    }
                })
                .collect(Collectors.toList());

        // Bad example of Optional usage
//        Optional<Dog> anyDog = dogs.stream()
//                .findAny();
//
//        boolean present = anyDog
//                .isPresent();
//
//        if (present) {
//            System.out.println(anyDog.get().getName());
//        }

        Dog dog = dogs.stream()
                .findAny()
                .orElseThrow(() -> new  RuntimeException("Dog starting with W is not here"));

        Dog nullDog = null;

        Optional<Dog> optionalDog = Optional.ofNullable(nullDog);

        Dog defaultDog = optionalDog.orElse(new Dog("newDog"));

        System.out.println(dog.getName());

        Random random = new Random();

        List<Dog> dogsWithAge = dogs.stream()
                .map(dogToUpdate -> new Dog(dogToUpdate.getName(), random.nextInt((10 - 1) + 1) +1))
                .collect(Collectors.toList());

        System.out.println(dogsWithAge);

        Optional<Dog> youngestDog = dogsWithAge.stream()
                .min((dog1, dog2) -> Integer.compare(dog1.getAge(), dog2.getAge()));

        System.out.println(youngestDog
                .orElseThrow(() -> new RuntimeException("dog not found"))
                .getName());

    }
}
