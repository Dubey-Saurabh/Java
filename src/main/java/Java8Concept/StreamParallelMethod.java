package Java8Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamParallelMethod {

    public static void main(String[] args) {

        // NOTE: For Direct Stream class, we can use parallel method not parallelStream() method.
        // parallel and parallelStream() method doesn't follow SEQUENCE!

        Stream.of("Saurabh", "Akash", "Anurag").parallel().forEach(System.out::println);

        IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);

        getAlphabets().stream().forEach(System.out::println);
        System.out.println("______________________________");
        getAlphabets().parallelStream().forEach(System.out::println); // NOTE: We use parallelStream() with collection only.

        //isParallelMethod

        IntStream range = IntStream.rangeClosed(1, 10);
        System.out.println(range.isParallel());

        IntStream ranger = IntStream.rangeClosed(1, 10).parallel();
        System.out.println(ranger.isParallel());


    }

    public static List<String> getAlphabets() {

        List<String> alpha = new ArrayList<>();

        int n = 97;
        while (n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }
        return alpha;

    }
}
