package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class TravesringThroughListIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Guava");
		list.add("Orange");
		list.add("Papaya");
		list.add("Banana");
           
		//Here, element iterates in reverse order  
		   ListIterator<String> list1=list.listIterator(list.size());
		   
		   while(list1.hasPrevious()) {
			   System.out.print(list1.previous()+ " ");
		   }
		   
		   

	}

}
