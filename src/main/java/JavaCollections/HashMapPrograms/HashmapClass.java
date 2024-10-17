package JavaCollections.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapClass {

	public static void main(String[] args) {

		// 1. Hashmap is a class implements map interface
		// 2. Hashmap extends Abstract map
		// 3. it stores values in the form of key and value format
		// 4. It may have one null key and multiple null values
		// 5. It maintains no order
		// 6. it contains only unique elements
		//7. It is non synchronised -- not thread safe
		// 8. Concurrent modification exception -- Fail Fast exception

		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Are");
		hm.put(2, "you");
		hm.put(3, "there?");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));

		// to get full values in hashmap we use mapentry

		for (Entry e : hm.entrySet()) {

			System.out.println(e.getKey() + " : " + e.getValue());

		}

	}

}
