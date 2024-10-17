package JavaCollections.ArrayPrograms;

public class CopyElementsOfOneArrayToOther {

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 6, 5, 9 };

		int arr2[] = new int[arr1.length];

		// copying elements of one array to other

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		// Displaying elements of first array

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		// Displaying elements of first array
          System.out.println();
          
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");

		}

	}

}
