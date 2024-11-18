package JavaCollections.ArrayPrograms;

import java.util.Arrays;

public class SecondSmallestElementinArray {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 8, 6, 4, 2, 1 };
		Arrays.sort(arr);
		System.out.println(arr[1]);
		
		System.out.println("Second Smallest element : " +getSecondSmallest(arr,7));

	}
	
	public static int getSecondSmallest(int[] arr, int total) {
		int temp;
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		  return arr[1];
	}

}
