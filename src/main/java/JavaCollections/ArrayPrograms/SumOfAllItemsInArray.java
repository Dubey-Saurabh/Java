package JavaCollections.ArrayPrograms;

public class SumOfAllItemsInArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 6, 4, 2, 1};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum of all elements : " + sum);
    }

}
