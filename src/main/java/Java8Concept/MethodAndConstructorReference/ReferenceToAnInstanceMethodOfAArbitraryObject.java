package Java8Concept.MethodAndConstructorReference;

import java.util.*;

public class ReferenceToAnInstanceMethodOfAArbitraryObject {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "spring", "microservice");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}
