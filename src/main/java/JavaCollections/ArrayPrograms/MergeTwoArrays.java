package JavaCollections.ArrayPrograms;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int arr[] = {5, 6, 8, 6, 4, 2, 1};
        int brr[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};

        int crr[] = new int[arr.length + brr.length];

        for (int i=0;i< arr.length;i++){
            crr[i] = arr[i];
        }

        for (int j=0;j< brr.length;j++){
            crr[arr.length+j] = brr[j];
        }

        System.out.println(Arrays.toString(crr));
    }
}
