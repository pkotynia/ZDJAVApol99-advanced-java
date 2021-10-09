package newio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NioTest {

    public static void main(String[] args) {
        //check the place of execution start to be able to provide relative path
        System.out.println(System.getProperty("user.dir"));

        // creating Path to file using absolute path
        //Path pathToWordsFile = Paths.get("C:\\developer\\sda\\ZDJAVApol99-advanced-java\\src\\main\\resources\\words");
        // creating Path to file using relative path
        Path pathToWordsFile = Paths.get("src\\main\\resources\\words");

        String output = "";
        try {
            output = Files.readString(pathToWordsFile);
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //split string by white spaces
        String[] split = output.split("\\s+");

        //create map with word as a key and number of occurrences as a value
        Map<String, Long> wordsCount =
                Arrays.stream(split)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordsCount);
    }
}
