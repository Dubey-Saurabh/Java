package JavaCollections.ArrayPrograms;

public class PrintElementsOnEvenPosition {

	public static void main(String[] args) {
		int arr[] = {5,6,8,6,4,2,1};
		
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i] + " ");
		}

	}

}
