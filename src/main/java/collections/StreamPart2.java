package collections;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPart2 {

    public static void main(String[] args) {
        // Random generator used to generate random ints
        Random random = new Random();
        //Stream.generate - generates infinite stream
        //random.nextInt - return random int with range from 1 to 10
        //limit() limit infinite stream to 300 elements
        //Collector.groupingBy - creates a Map with item value as a key and number of items as a result
        var collect = Stream
                .generate(() -> random.nextInt((10 - 1) + 1) + 1)
                .limit(3000)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
