package JavaCollections.TreeMap;

import java.util.*;

public class TreeMapConcept {

    public static void main(String[] args) {

        TreeMap<Integer, String> friends = new TreeMap<>();
        friends.put(1, "Akash");
        friends.put(2, "Saurabh");
        friends.put(3, "Ravi");
        friends.put(4, "Shivdeep");
        friends.put(5, "Rahul");

        System.out.println(friends);
        friends.forEach((k, v) -> System.out.println("Key: " + k + "," + "Values: " + v));

        System.out.println(friends.lastKey());
        System.out.println(friends.firstEntry());

        Set<Integer> keyLessThan5K = friends.headMap(5000).keySet();
        System.out.println(keyLessThan5K);

        Set<Integer> keyGreaterThan3K = friends.tailMap(3000).keySet();
        System.out.println(keyGreaterThan3K);

        TreeMap<String, Integer> userMap = new TreeMap<>();
        userMap.put("Saurabh", 38);
        userMap.put("Anurag", 42);
        userMap.put("Dev", 11);
        userMap.put("Ravi", 24);
        userMap.put("Khyati", 78);

        userMap.forEach((k, v) -> System.out.println("Key: " + k + "," + "Values: " + v));

        //Reverse in order
        TreeMap<Integer, String> userMapReverseOrder = new TreeMap<>(Comparator.reverseOrder());
        userMapReverseOrder.put(1000, "Akash");
        userMapReverseOrder.put(5000, "Madhav");
        userMapReverseOrder.put(3000, "Nikhil");
        userMapReverseOrder.put(10000, "Ganesh");
        userMapReverseOrder.put(4000, "Gopi");

        System.out.println(userMapReverseOrder);

        Iterator it = userMapReverseOrder.entrySet().iterator();
        while (it.hasNext()) {

            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " : " + pairs.getValue());
        }

    }
}
