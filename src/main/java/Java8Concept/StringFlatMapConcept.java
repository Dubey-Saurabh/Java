package Java8Concept;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringFlatMapConcept {

    public static void main(String[] args) {

        String data[][] = new String[][]{
                {"a", "b"},
                {"c", "d"},
                {"e", "f"}
        };

        Stream<String> flatMapStream= Arrays.stream(data).flatMap(x->Arrays.stream(x)).filter(x->"a".equals(x.toString()));
        flatMapStream.forEach(System.out::println);

    }
}

