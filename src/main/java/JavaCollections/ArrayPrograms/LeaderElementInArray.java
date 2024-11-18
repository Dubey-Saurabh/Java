package JavaCollections.ArrayPrograms;

public class LeaderElementInArray {

    // Define an array of integers.
    // Loop through each element in the array.
    // Find the first element greater than or equal to arr[i].
    // If no greater element is found, print the current element.

    public static void main(String[] args) {

        int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int size = arr.length;

        int max = arr[size-1];

        for (int i=size-2;i>=0;i--){

            if (arr[i] >max){
                max=arr[i];
                System.out.print(max+ " ");
            }

        }



    }
}
