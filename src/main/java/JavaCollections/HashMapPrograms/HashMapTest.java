package JavaCollections.HashMapPrograms;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Grapes");
        fruits.put(2, "Orange");
        fruits.put(3, "Banana");
        fruits.put(4, "Watermelon");
        fruits.put(5, "Strawberry");

        System.out.println(fruits);

        //iterate hashmap
        for (Map.Entry e : fruits.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        //count the number of key-value (size) mappings in a map.
        System.out.println(fruits.size());

        //copy all mappings from the specified map to another map
        HashMap<Integer, String> moreFruits = new HashMap<>();
        moreFruits.putAll(fruits);
        moreFruits.put(6, "Blackberry");

        for (Map.Entry e : moreFruits.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        //remove all mappings from a map.
        moreFruits.clear();
        System.out.println(moreFruits);

        //map contains key-value mappings (empty) or not.
        System.out.println(moreFruits.isEmpty());

        //get a shallow copy of a HashMap instance.
        HashMap<Integer, String> addedFruits = (HashMap<Integer, String>) fruits.clone();
        addedFruits.put(6, "Guava");
        System.out.println(addedFruits);

        //test if a map contains a mapping for the specified key.
        System.out.println("++++++++++++");
        System.out.println(addedFruits.get(6));
        System.out.println(addedFruits.containsValue("Watermelon"));

        //create a set view of the mappings contained in a map.
        Set set = fruits.entrySet();
        System.out.println(set);

        //get a set view of the keys contained in this map.
        System.out.println(fruits.keySet());

        //get a set view of the values contained in this map.
        System.out.println(fruits.values());

        //putIfAbsent
        fruits.putIfAbsent(6, "Apple");
        System.out.println(fruits);

        //replace
        fruits.put(3, "Camel");
        System.out.println(fruits);

        //replaceAll
        fruits.replaceAll((k, v) -> "Papaya");
        System.out.println(fruits);

        //Duplicate Keys
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Android");
        map.put(2, "iOS");
        map.put(3, "Windows");
        map.put(2, "Blackberry");
        map.put(1, "Blackberry");

        System.out.println(map);

        System.out.println("Iterating Hashmap...");

        for (Map.Entry m : map.entrySet()) {

            System.out.println(m.getKey() + " : " + m.getValue());
        }

        //Convert Hashmap into Arraylist
        Map<String, Integer> compMap = new HashMap<String, Integer>();
        compMap.put("Google", 10000);
        compMap.put("Amazon", 20000);
        compMap.put("Apple", 30000);
        compMap.put("Yahoo", 40000);
        compMap.put("Cisco", 50000);


        Iterator it = compMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " : " + pairs.getValue());

            // Convert HashMap into ArrayList

        }
        ArrayList<String> compList = new ArrayList<String>(compMap.keySet());
        System.out.println(compList);
        for (String t : compList) {
            System.out.println(t);
        }
        System.out.println(" Employee numbers will be below :");
        ArrayList<Integer> empList = new ArrayList<Integer>(compMap.values());
        System.out.println(empList);
        for (Integer e : empList) {
            System.out.println(e);
        }
        System.out.println("++++++++");
        compMap.forEach((k, v) -> System.out.println("key: " + k + "," + "values: " + v));


    }
}
