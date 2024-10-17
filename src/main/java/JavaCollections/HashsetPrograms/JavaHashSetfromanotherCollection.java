package JavaCollections.HashsetPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaHashSetfromanotherCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");
		
		Set<String>list1 = new HashSet<String>(list);
		
		list1.add("Papaya");
		
		Iterator it = list1.iterator();                                                                      // Traversing list through Iterator

		while (it.hasNext()) {                                                                            // check if iterator has the elements
			System.out.println(it.next());   

	}

	}

}
