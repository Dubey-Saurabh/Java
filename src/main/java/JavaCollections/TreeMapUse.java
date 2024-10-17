package JavaCollections;

import java.util.*;

public class TreeMapUse {

    public static void main(String[] args) {

        TreeMap<Integer, String> treemap = new TreeMap<>();
        treemap.put(1000, "Akash");
         treemap.put(5000, "Akash");
        treemap.put(3000, "Akash");
        treemap.put(10000, "Akash");
        treemap.put(4000, "Akash");

        System.out.println(treemap);
        treemap.forEach((k, v) -> System.out.println("Key: " + k + "," + "Values: " + v));

        System.out.println(treemap.lastKey());
        System.out.println(treemap.firstEntry());

        Set<Integer> keyLessThan5K = treemap.headMap(5000).keySet();
        System.out.println(keyLessThan5K);

        Set<Integer> keyGreaterThan3K = treemap.tailMap(3000).keySet();
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
