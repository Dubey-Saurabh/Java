package Java8Concept.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        names.stream().forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> collectNames = names.stream().filter((n) -> n.startsWith("S")).collect(Collectors.toList());
        collectNames.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        String concatinatedNames = names.stream().reduce("", (partialString, element) -> partialString + " " + element);
        System.out.println(concatinatedNames.trim());

        // count: Count the number of names
        long count = names.stream().count();
        System.out.println(count);

        // findFirst: Find the first name
        Optional<String> firstNames = names.stream().findFirst();
        firstNames.ifPresent(System.out::println);

        // allMatch: Check if all names start with 'S'
        boolean allMatch = names.stream().allMatch((n) -> n.startsWith("S"));
        System.out.println(allMatch);

        // anyMatch: Check if all names start with 'S'
        boolean anyMatch = names.stream().anyMatch((n) -> n.startsWith("S"));
        System.out.println(anyMatch);


    }
}
