package JavaCollections.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class ElemenateDuplicateKey {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		 
		 map.put(1, "Android");
		 map.put(2, "iOS");
		 map.put(3,"Windows");
		 map.put(2, "Blackberry");
		 map.put(1, "Blackberry");
		 
		 System.out.println(map);
		 
		 System.out.println("Iterating Hashmap..."); 
		 
		 for(Map.Entry m : map.entrySet()) {
			 
			 System.out.println(m.getKey() + " : " + m.getValue());
		 }

	}

}
