package JavaCollections.ArrayListPrograms; // To merge one array to another we use .addAll method.
                                                            // To delete merging we use .removeAll
                                                           // To print the common element in both array list we use .retainAll
import java.util.ArrayList;

public class AddAllConceptInArrayList {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		a.add("Saurabh");
		a.add("Tom");
		a.add("Peter");

		ArrayList<String> b = new ArrayList<String>();

		b.add("Rakesh");
		b.add("Mahesh");
		b.add("Rohan");

		a.addAll(b); // To merge b ArrayList into A

		for (int i = 0; i < a.size(); i++) { // To print the values
			System.out.println(a.get(i));
		}

		// removeAll : to remove the merge
		System.out.println("_______________");
		a.removeAll(b);

		for (int i = 0; i < a.size(); i++) { // To print the values
			System.out.println(a.get(i));
		}

		// retainAll: to check the common values between two arrayList.
		System.out.println("_______________");

		ArrayList<String> c = new ArrayList<String>();
		c.add("Saurabh");
		c.add("Tom");
		c.add("Peter");

		ArrayList<String> d = new ArrayList<String>();

		d.add("Rakesh");
		d.add("Tom");
		d.add("Rohan");

		c.retainAll(d);

		for (int i = 0; i < c.size(); i++) { // To print the common values
			System.out.println(c.get(i));
		}

	}

}
