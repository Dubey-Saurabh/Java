package JavaCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapRepresentationInDifferentWays {

    public static HashMap<String, Integer> marksMap;

    static {
        marksMap = new HashMap<>();
        marksMap.put("Saurabh", 100);
        marksMap.put("Akash", 200);
        marksMap.put("Anurag", 300);
    }

    public static void main(String[] args) {

        //1. Using HashMap class

        HashMap<Integer, Integer> hashMap = new HashMap<>(); //OR
        Map<Integer, Integer> hashMap1 = new HashMap<>();

        //2. Static way

        System.out.println(HashMapRepresentationInDifferentWays.marksMap.get("Saurabh"));

        //3. Immutable using singletonMap

        Map<String, String> newMap = Collections.singletonMap("Tree", "Apple");
        System.out.println(newMap.get("Tree"));

        //4. Using 2D String array and collecting in the form of map

        Map<String, String> map4 = Stream.of(new String[][]{
                {"Saurabh", "Tester"},
                {"Ravi", "Developer"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map4.get("Ravi"));

    }
}
