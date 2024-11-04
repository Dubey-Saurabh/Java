package JavaCollections.ArrayPrograms;

public class LargestElementinArray {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 8, 6, 4, 2, 1 };

		// Initialize max with first element of array.

		int max = arr[0];

		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with max

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element :" + max);
	}

}
