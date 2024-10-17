package Java8Concept;

import java.util.ArrayList;
import java.util.List;

public class LambdaClass {

    public static void main(String[] args) {

        LambdaInterface lambdaInterface = (value, marks) -> System.out.println("name: " + value + ", marks: " + marks);

        lambdaInterface.getValue("Saurabh", 31);

        //Using Iterable interface concept in List interface, suppose we want to print all colors
        //List<String>allColors = List.of("Blue","Black", "Yellow"); OR List<String>allColors = ArrayList.asList("Blue","Black", "Yellow");

        List<String>allColors = new ArrayList<>();
        allColors.add("Black");
        allColors.add("Blue");
        allColors.add("Yellow");
        allColors.forEach(color-> System.out.println(color));

    }


}
