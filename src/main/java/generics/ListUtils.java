package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListUtils {

    public static List<Integer> fromArrayToList(Integer[] integers) {
        return Arrays.asList(integers);
    }

    public static <T> List<T> fromArrayToListGeneric(T[] names) {
        return Arrays.asList(names);
    }

    public static <T,G> List<G> fromArrayToListOfDifferentType(T[] items, Function<T, G> mapper){
        return Arrays.stream(items)
                .map(mapper)
                .collect(Collectors.toList());
//        List<G> res = new ArrayList<>();
//        for (T item : items) {
//            res.add(mapper.apply(item));
//        }
//        return res;
    }
}
