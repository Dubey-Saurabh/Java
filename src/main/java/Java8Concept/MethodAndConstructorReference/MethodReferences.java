package Java8Concept.MethodAndConstructorReference;

import java.util.Arrays;

public class MethodReferences {


    public static void geeksForGeeks(String names) {
        System.out.println(names);
    }

    public static void main(String[] args) {

        String[] names = {"Geek1", "Geek2", "Geek3"};

        //Reference to a Static Method

        Arrays.stream(names).forEach(MethodReferences::geeksForGeeks);

    }


}
