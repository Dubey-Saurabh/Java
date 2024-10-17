package JavaCollections.ArrayListPrograms;

import java.util.ArrayList;    // How to store user defined class in an ArrayList.
import java.util.Iterator;
import java.util.List;

public class ArrayListImp {

	public static void main(String[] args) {

		Employee e1 = new Employee( "Saurabh",  29,  "Electronics");
		Employee e2 = new Employee( "Tom",  30,  "Computer Science");
		Employee e3 = new Employee( "Frank",  29,  "Mechanical");
		
		List<Employee> ar = new ArrayList <Employee> ();
//
//		ar.add(e1);
//		ar.add(e2);
//		ar.add(e3);
//
//		// Iterator to traverse the values
//		Iterator<Employee> i = ar.iterator();
//		while(i.hasNext()) {
//			Employee  emp = i.next();
//			System.out.println(emp.name);
//			System.out.println(emp.age);
//			System.out.println(emp.dpt);
//		}
		
		
	}
}