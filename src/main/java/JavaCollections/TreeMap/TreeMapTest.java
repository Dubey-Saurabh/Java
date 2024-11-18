package JavaCollections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        TreeMap<Integer, String> friends = new TreeMap<>();
        friends.put(1, "Akash");
        friends.put(2, "Saurabh");
        friends.put(3, "Ravi");
        friends.put(4, "Shivdeep");
        friends.put(5, "Rahul");

        System.out.println(friends);

        //iterate
        for (Map.Entry e : friends.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        //search for a key in a Tree Map
        if (friends.containsKey(1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        //search for a value in a Tree Map
        if (friends.containsValue("Anurag")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");

            //get a  key-value mapping associated with the greatest key and the least key in a map.
            System.out.println(friends.firstEntry());
            System.out.println(friends.lastEntry());

            //get the first (lowest) key and the last (highest) key currently in a map.
            System.out.println(friends.firstKey());
            System.out.println(friends.lastKey());

            //get a reverse order view of the keys contained in a given map.
            System.out.println(friends.descendingKeySet());

            //get a key-value mapping associated with the greatest key less than or equal to the given key.
            System.out.println(friends.floorKey(3));

            //get the least key strictly greater than the given key. Return null if there is no such key.
            System.out.println(friends.higherEntry(3));
            System.out.println(friends.higherEntry(5));

            //get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
            System.out.println(friends.lowerEntry(3));

            //get the greatest key strictly less than the given key. Return null if there is no such key.
            System.out.println(friends.lowerKey(5));

            //get a NavigableSet view of keys in a map.
            System.out.println(friends.navigableKeySet());

            //get a key-value mapping associated with the least key in a map.
            friends.pollFirstEntry();
            System.out.println(friends);

            // //get a key-value mapping associated with the greatest key in a map.
            friends.pollLastEntry();
            System.out.println(friends);

            //get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
            System.out.println(friends.subMap(2,4));

            //get the portion of a map whose keys range from a given key to another key.
            System.out.println(friends.subMap(2,true,4,true));

            //portion of a map whose keys are greater than a given key.
            System.out.println(friends.tailMap(3));







        }
    }
}
