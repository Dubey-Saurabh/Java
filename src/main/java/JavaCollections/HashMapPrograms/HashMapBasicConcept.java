package JavaCollections.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicConcept {

	public static void main(String[] args) {
		 Map<Integer,String> map = new HashMap<Integer,String>();
		 
		 map.put(1, "Android");
		 map.put(2, "iOS");
		 map.put(3,"Windows");
		 map.put(4, "iOS");
		 map.put(5, "iOS");
		 map.put(6, "iOS");
		 map.put(7, "iOS");
		 map.put(8, "iOS");
		 map.put(9, "iOS");
		 map.put(10, "iOS");
		 map.put(5, "iOS");
		 
		 System.out.println(map);
		 
		 System.out.println(map.entrySet());
		 
		 System.out.println("Iterating Hashmap..."); 
		 
		 for(Map.Entry m : map.entrySet()) {
			 
			 System.out.println(m.getKey() + " : " + m.getValue());
		 }

	}

}
