package HashTablePrograms;

import java.util.Hashtable;

public class JavaHashtableExamplegetOrDefault {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();

		map.put(1, "Android");
		map.put(2, "iOS");
		map.put(3, "Windows");

		// Here, we specify the if and else statement as arguments of the method
		System.out.println(map.getOrDefault(2, "Not Found"));
		System.out.println(map.getOrDefault(4, "Not Found"));

	}

}
