package Java8Concept;

import java.util.function.Function;

public class FunctionInterfaceConcept {

    public static void main(String[] args) {

        //Calculate length
        Function<String, Integer> lengthMethod = x -> x.length();
        int length = lengthMethod.apply("Everyone is home");
        System.out.println(length);

        //chaining concept
        Function<Integer, Integer> multiplyMethod = x -> x * 2;
        int multiply = lengthMethod.andThen(multiplyMethod).apply("What is your name");
        System.out.println(multiply);


    }
}

