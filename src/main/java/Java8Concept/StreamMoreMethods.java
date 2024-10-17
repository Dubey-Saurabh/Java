package Java8Concept;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMoreMethods {

    public static void main(String[] args) {

        //1. Usual stream
        Stream stream = Stream.of("Saurabh", "Akash", "Anurag");
//        stream.forEach(x -> System.out.println(x));
        stream.findFirst().ifPresent(System.out::println);

        // 2. ifPresent
        Arrays.asList("a1", "b2", "c3").stream().findFirst().ifPresent(System.out::println);

        //3. range
        IntStream.range(0, 5).forEach(System.out::println);

        //4. by creating new array
        Arrays.stream(new int[]{1, 2, 3, 4}).map(n -> n * 2 + 1).average().ifPresent(System.out::println);

        //5. max() for int value

        Stream.of("a1", "b2", "c3").map(x -> x.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        //6. for double
        Stream.of(1.0,2.0,3.0,4.0).mapToInt(Double::intValue).mapToObj(x->"a" + x).forEach(System.out::println);

       //7. limit
        Stream.iterate(0,x->x+1).limit(5).forEach(System.out::println);

        //8.odd
        Stream.iterate(0,x->x+1).filter(x->x%2!=0).limit(10).forEach(System.out::println);

        //9.prime
        Stream.iterate(0,x->x+1).filter(x->x%2==0).limit(10).forEach(System.out::println);

    }
}
