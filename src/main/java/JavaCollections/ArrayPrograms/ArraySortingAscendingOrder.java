package JavaCollections.ArrayPrograms;

public class ArraySortingAscendingOrder {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 8, 6, 4, 2, 1 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Elements in Ascending order");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
