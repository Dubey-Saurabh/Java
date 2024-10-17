package JavaCollections.HashsetPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HashsetBasicConcept {

	public static void main(String[] args) {
		Set<String>list = new HashSet<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");
                 
		System.out.println(list);
		
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {                                                                            // check if iterator has the elements
			System.out.println(it.next());   


	}
	}
}
