package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayListusingIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");

		Iterator it = list.iterator();                                                                      // Traversing list through Iterator

		while (it.hasNext()) {                                                                            // check if iterator has the elements
			System.out.println(it.next());                                                           // printing the element and move to next

		}

	}

}
