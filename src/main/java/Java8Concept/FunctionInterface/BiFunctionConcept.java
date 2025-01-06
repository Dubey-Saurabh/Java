package Java8Concept.FunctionInterface;

import java.util.function.BiFunction;

public class BiFunctionConcept {

    public static void main(String[] args) {

        BiFunction<String, String, Integer> biFunction = (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Saurabh", "Dubey"));

    }
}
