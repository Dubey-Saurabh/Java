package Java8Concept.UnaryAndBinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        /*extends Function interface*/
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));


        /*Binary operator*/
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1.concat(str2);
        System.out.println(binaryOperator.apply("Saurabh", "Dubey"));
    }
}
