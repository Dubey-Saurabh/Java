package Java8Concept.LambdaExpressions.LambdaExpressionForDiffParameters.DoubleParameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleParameterClass {

    public static void main(String[] args) {

        DoubleParameter doubleParameter = (a, b) -> System.out.println("name: " + a + ", marks: " + b);
        doubleParameter.doubleMethod("Saurabh", "Dubey");

        //Use in Arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach((n) -> System.out.println(n));
        list.forEach((n) -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        //Use with Stream

        List<String> names = Arrays.asList("Saurabh", "Aman", "Bob", "Sarang", "Mehul");
        names.stream().filter((n) -> n.startsWith("S")).map((n) -> n.toUpperCase()).forEach(System.out::println);


    }

}
