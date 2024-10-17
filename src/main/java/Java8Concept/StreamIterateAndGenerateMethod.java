package Java8Concept;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterateAndGenerateMethod {

    public static void main(String[] args) {

        //generate method gives random number

        List<Integer> count = IntStream.iterate(1, n->n+2).mapToObj(Integer ::valueOf).limit(10).collect(Collectors.toList());
        System.out.println(count);

        List<Integer> count1= Stream.generate(()->(new Random()).nextInt(200)).limit(10).collect(Collectors.toList());
        System.out.println(count1);

    }
}
