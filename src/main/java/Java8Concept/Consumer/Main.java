package Java8Concept.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<List<Integer>> listConsumer = li -> {

            for (Integer i : li) {
                System.out.println(i + 100);
            }
        };

        listConsumer.accept(Arrays.asList(1, 2, 3, 4, 5));

        /*andThen method*/

        Consumer<List<Integer>> listConsumer1 = li -> {

            for (Integer i : li) {
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> consumer = listConsumer1.andThen(listConsumer);
        consumer.accept(Arrays.asList(1, 2, 3, 4, 5));


    }
}
