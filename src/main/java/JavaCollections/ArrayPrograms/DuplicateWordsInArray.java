package JavaCollections.ArrayPrograms;

import java.lang.String;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsInArray {

    public static void main(String[] args) {

        String s[] = {"Amazon", "Apple", "Microsoft", "Amazon", "Apple", "Walmart", "Orange"};
        // 1. brute force method
        // 2. HashSet
        // 3. HashMap
        // 4. Streams

        System.out.println(" Brute Force method");
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    System.out.println(s[i]);
                }
            }
        }
        System.out.println("____By HashSet_____");

        Set<String> data = new HashSet<>(); // Create a Hashset

        for (String e : s) { // for each loop
            if (data.add(e) == false) {
                System.out.println(e);
            }
        }

        System.out.println("____By HashMap_____");

        Map<String, Integer> hashMap = new HashMap<>();

        for (String e : s) {
            Integer count = hashMap.get(e);
            if (count == null) {
                hashMap.put(e, 1);
            } else {
                hashMap.put(e, count++);
            }
        }


        //print the duplicate values
        Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());


            }

        }
        System.out.println("____By Stream_____");
        Set<String> dataSet = new HashSet<>();

        Set<String> duplicate = Arrays.asList(s).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(duplicate);


        System.out.println("____By Stream and function interface_____");

        Set<String> newDup = Arrays.asList(s).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toSet());

        System.out.println(newDup);

        System.out.println("____By Stream and frequency_____");

        List<String> list = Arrays.asList(s);
        Set<String> freqOfEl = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(freqOfEl);



    }

}
