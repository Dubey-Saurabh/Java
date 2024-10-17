package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;

public class GetAndSetArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");

		System.out.println(list.get(3));
		
		// to set the elements at the index
		
		list.set(3, "Apple");
		
		for(String fruits : list) {
			System.out.println(fruits);  
		}

	}

}
