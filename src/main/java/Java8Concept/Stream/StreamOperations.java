package Java8Concept.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        /*distinct: for unique elements
        * sorted : to sort
        * limit : to set limit or to want elements from starting till the defined limit element
        * skip : to ignore any element from starting
        * peek: to consume values or print only
        * count: count total elements left
        * collect: to collect in list or in set on in any collection*/

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 57, 66, 78, 88, 1, 4, 7);
        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(filteredList);

        /*Using iterate*/
        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x->x%2==0)
                .map(x->x/10)
                .distinct()
                .sorted()
                .peek(x-> System.out.println(x))
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("+++++++++++++++");

        /*max and min*/
        Integer integer = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().peek(System.out::println).max((a, b) -> a - b).get();
        System.out.println(integer);

        Integer integer1 = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().peek(System.out::println).min((a, b) -> a-b).get();
        System.out.println(integer1);

        /*count*/
        long integer2 = Stream.iterate(0, x -> x + 1).limit(101).skip(1).map(x -> x / 20).distinct().count();
        System.out.println(integer2);

        /*Other practice or multiple operations*/
        List<String>names = Arrays.asList("Saurabh", "Anurag", "Suresh");
        List<String> friendList = names.stream().filter(friend -> !friend.startsWith("A")).collect(Collectors.toList());
        friendList.forEach(e -> System.out.println(e));

        /*findAny*/
        String s = names.stream().filter(x -> x.equalsIgnoreCase("Anurag")).findAny().orElse("Default");
        System.out.println(s);



    }

}
