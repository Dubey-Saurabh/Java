package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");

		Collections.sort(list);

		for (String fruits : list) {
			System.out.println(fruits);
		}
	   ArrayList<Integer> list1 = new ArrayList<Integer>();

	   list1.add(10);
	   list1.add(30);
	   list1.add(60);
	   list1.add(40);
	   list1.add(80);

		Collections.sort(list1);

		for (Integer num : list1) {
			System.out.println(num);

		}

}
}
