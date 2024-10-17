package Java8Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndCollectorConcept {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Saurabh");
        list.add("Akash");
        list.add("Anurag");
        list.add("Ravi");
        list.add("Rahul");
        list.add("Shivdeep");
        list.add("Nikhil");
        list.add("Kapil");
        list.add("Dushyant");

        List<String> friendList = list.stream().filter(friend -> !friend.startsWith("A")).collect(Collectors.toList());
        friendList.forEach(e -> System.out.println(e));



    }
}
