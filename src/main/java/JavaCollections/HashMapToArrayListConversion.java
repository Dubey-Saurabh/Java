package JavaCollections;

import java.util.*;

public class HashMapToArrayListConversion {

    public static void main(String[] args) {

        HashMap<String, Integer> hashmap = new HashMap<>();

        hashmap.put("Google", 10000);
        hashmap.put("Amazon", 20000);
        hashmap.put("Walmart", 30000);
        hashmap.put("Johnson", 40000);
        hashmap.put("Flipkart", 50000);

        Iterator it = hashmap.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " : " + pairs.getValue());

        }

        List<String> cl = new ArrayList<>(hashmap.keySet());
        System.out.println(cl);
        for (String companyList : cl) {
            System.out.println(companyList);
        }

        List<Integer> cs = new ArrayList<>(hashmap.values());
        System.out.println(cs);
        for (Integer companyShares : cs) {
            System.out.println(companyShares);
        }

        //Using Lambda expression

        hashmap.forEach((k, v) -> System.out.println("key: " + k + "," + "values: " + v));


    }
}
