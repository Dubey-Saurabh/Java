package JavaCollections.ArrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDup(int arr[]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[count] = arr[i];
                count++;
            }

        }

        System.out.println(Arrays.toString(arr));
        return count;


    }

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(my_array);
        System.out.println(removeDup(my_array));

    }


}
