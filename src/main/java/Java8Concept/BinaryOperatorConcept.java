package Java8Concept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorConcept {

    public static void main(String[] args) {

        //Represents an operation upon two operands of the same type,
        // producing a result of the same type as the operands.
        // This is a specialization of BiFunction for the case where the operands and the result are all of the same type.

        BinaryOperator<Integer> addition = (x1, x2) -> x1 + x2;
        int additionResult = addition.apply(40, 20);
        System.out.println(additionResult);

        BiFunction<Integer, Integer, Integer> additionAgain = (x1, x2) -> x1 + x2;
        int biFunctionAddition = additionAgain.apply(45, 32);
        System.out.println(biFunctionAddition);


    }
}
