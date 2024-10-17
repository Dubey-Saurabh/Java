package JavaCollections.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapexampletoaddelements {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		 
		 map.put(1, "Android");
		 map.put(2, "iOS");
		 map.put(3,"Windows");
		 map.put(2, "Blackberry");
		 
		 System.out.println(map);
		 
		 // to add elements
		 
		 map.putIfAbsent(4, "Mitesh");
		 
		 System.out.println(map);
		 
			Map<Integer,String> map1 = new HashMap<Integer,String>();
			 
			 map.put(5, "Geet");
			 
			 map.putAll(map1);
			 
			 System.out.println(map);
		 
		 

	}

}
