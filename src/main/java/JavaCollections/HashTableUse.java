package JavaCollections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableUse {

    public static void main(String[] args) {

        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("Salman", 23);
        hashTable.put("Ajay", 13);
        hashTable.put("Kishan", 6);
        hashTable.put("Madhuri", 33);
        hashTable.put("Vinay", 43);
//        hashTable.put(null, 44);
//        hashTable.put("Sheck", null);

        System.out.println(hashTable.get("Ajay"));


    }
}
