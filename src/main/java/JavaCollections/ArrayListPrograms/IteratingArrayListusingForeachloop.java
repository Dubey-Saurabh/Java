package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;

public class IteratingArrayListusingForeachloop {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");

		for(String fruits : list) {
			System.out.println(fruits);
		}

	}

}
