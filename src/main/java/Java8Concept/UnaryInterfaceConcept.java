package Java8Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryInterfaceConcept {

    public static void main(String[] args) {

        //Represents an operation on a single operand/argument that produces a result of the same type as its operand.
        // This is a specialization of Function for the case where the operand and result are of the same type.

        UnaryOperator<String> lowerCase = Str -> Str.toLowerCase();
        String lowerCaseString = lowerCase.apply("SYSTEM");
        System.out.println(lowerCaseString);

        Function<Integer, Integer> divide = x1 -> x1 / 2;
        int divideFunction = divide.apply(45);
        System.out.println(divideFunction);

        //ListExample

        List<String> allColors = new ArrayList<>();
        allColors.add("Black");
        allColors.add("Blue");
        allColors.add("Yellow");

        allColors.replaceAll(ele -> ele + "Saurabh");
        System.out.println(allColors);


    }
}
