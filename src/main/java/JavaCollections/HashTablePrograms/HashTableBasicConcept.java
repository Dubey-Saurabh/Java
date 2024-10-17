package JavaCollections.HashTablePrograms;

import java.util.Hashtable;
import java.util.Map;

public class HashTableBasicConcept {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();

		map.put(1, "Android");
		map.put(2, "iOS");
		map.put(3, "Windows");

		System.out.println(map);
		System.out.println(map.entrySet());

		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}

}
