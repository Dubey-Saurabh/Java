package Java8Concept;

import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

    public static void main(String[] args) {

        //represents an operation that accepts a single input argument and returns no result

        Consumer<String>consumer = x-> System.out.println(x);
        consumer.accept("Nothing is fixed");

    }
}
