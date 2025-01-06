package Java8Concept.LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaClass {

    public static void main(String[] args) {

        LambdaInterface lambdaInterface = (value, marks) -> System.out.println("name: " + value + ", marks: " + marks);

        lambdaInterface.getValue("Saurabh", 31);

        List<String> allColors = new ArrayList<>(Arrays.asList("Blue", "Black", "Yellow"));
        allColors.forEach(color -> System.out.println(color));

    }


}
