package Java8Concept;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrayWithFlatMapConcept {

    public static void main(String[] args) {

        int data[] = {1, 3, 4, 5, 6, 7, 4, 3, 5, 8};

        Stream<int[]> streamArray = Stream.of(data);
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
        intStream.forEach(x -> System.out.println(x));


    }
}
