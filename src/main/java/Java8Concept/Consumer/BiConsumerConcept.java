package Java8Concept.Consumer;

import java.util.function.BiConsumer;

public class BiConsumerConcept {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer>biConsumer = (x,y) -> System.out.println(x+y);

        biConsumer.accept(2,3);

    }
}
