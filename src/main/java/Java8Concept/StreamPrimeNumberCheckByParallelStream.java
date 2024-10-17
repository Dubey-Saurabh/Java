package Java8Concept;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrimeNumberCheckByParallelStream {

    public static void main(String[] args) {

        //sequential Stream
        long count = Stream.iterate(0, n -> n + 1).limit(200).filter(StreamPrimeNumberCheckByParallelStream::isPrime)
                .peek(x -> System.out.println(x)).count();

        //Use parallel to give more speed to execution
        long count1 = Stream.iterate(0, n -> n + 1).limit(200).parallel().filter(StreamPrimeNumberCheckByParallelStream::isPrime)
                .peek(x -> System.out.println(x)).count();

        System.out.println("Total count would be: " + count1);
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        return !IntStream.rangeClosed(2, n / 2).anyMatch(x -> n % x == 0);

    }

}
