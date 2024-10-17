package JavaCollections.HashsetPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ElemenateDuplicateElements {

	public static void main(String[] args) {
		Set<String>list = new HashSet<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Guava");
		list.add("Mango");
                 
		System.out.println(list);
		
		list.remove("Guava");
		
		System.out.println(list);
		
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {                                                                            // check if iterator has the elements
			System.out.println(it.next());   

	}
	}
}
