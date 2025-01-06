package Java8Concept.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

            /*Ways to create Stream*/
        /*Array into stream*/
        int arr[] = {1,2,3,4,5,6};
        long sum = Arrays.stream(arr).filter(x->x%2==0).sum();
        System.out.println(sum);

        /*list into stream*/
        List<String>fruits = Arrays.asList("Banana", "Apple", "Watermelon");
        Stream<String> stream = fruits.stream();

        /*Stream.of*/
        Stream<Integer> integerStream = Stream.of(1, 3, 4, 6, 2);

        /*using iterate or to create loop*/
        Stream<Integer> limit = Stream.iterate(0, x -> x + 1).limit(100);
        
        /*using generate */
        Stream<String> limit1 = Stream.generate(() -> "hello").limit(5);


    }
}
