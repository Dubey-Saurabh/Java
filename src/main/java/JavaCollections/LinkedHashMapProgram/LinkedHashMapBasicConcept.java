package JavaCollections.LinkedHashMapProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasicConcept {

	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		 
		 map.put(1, "Android");
		 map.put(2, "iOS");
		 map.put(3,"Windows");
		 
		 
		 System.out.println(map);
		 
		 System.out.println(map.keySet());
		 
		 System.out.println(map.values());
		 
		 System.out.println(map.entrySet());

	}

}
