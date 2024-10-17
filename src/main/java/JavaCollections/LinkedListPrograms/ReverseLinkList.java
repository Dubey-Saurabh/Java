package JavaCollections.LinkedListPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkList {

	public static void main(String[] args) {
		LinkedList<String>list = new LinkedList<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");
                 
		Iterator it = list.descendingIterator();
		
		while (it.hasNext()) {                                                                            // check if iterator has the elements
			System.out.println(it.next());   

	}

	}

}
