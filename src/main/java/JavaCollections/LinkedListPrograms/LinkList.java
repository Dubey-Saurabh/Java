package JavaCollections.LinkedListPrograms; // add, addFirst, addLast, remove first and last element

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Apple");
		ll.add("Orange");
		ll.add("Grapes");

		System.out.println("Content of Linked List:" + ll);

		// addFirst
		ll.addFirst("Mango");

		// addLast
		ll.addLast("Guava");
		System.out.println("Content of Linked List:" + ll);

		// get
		System.out.println(ll.get(2));

		// set

		ll.set(0, "Mahesh");
		System.out.println(ll.get(0));

		// remove first and last element

		ll.removeFirst();
		ll.removeLast();

		System.out.println("Content of Linked List:" + ll);

		ll.remove(2);
		System.out.println("Content of Linked List:" + ll);

	}

}
