package Java8Concept.Predicate;

import java.util.function.BiPredicate;

public class BiPredicateConcept {
    public static void main(String[] args) {

        BiPredicate<String, Integer> biPredicate = (str, x) -> str.length() == x;
        System.out.println(biPredicate.test("Saurabh", 7));

    }
}
