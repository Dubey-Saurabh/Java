package Java8Concept.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {

    public static void main(String[] args) {


        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String> intermediateResult = new HashSet<>();

        List<String> result = listOfLists.stream().flatMap(List::stream)
                .filter((n) -> n.startsWith("S")).map(String::toUpperCase)
                .distinct().sorted().peek((s) -> intermediateResult.add(s))
                .collect(Collectors.toList());

        //print the intermediateResult
        System.out.println("IntemediateResult");
        intermediateResult.forEach(System.out::println);

        //Print out the final result
        System.out.println("Final Result");
        result.forEach(System.out::println);

    }
}
