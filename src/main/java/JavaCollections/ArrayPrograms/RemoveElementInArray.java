package JavaCollections.ArrayPrograms;

import java.util.Arrays;

public class RemoveElementInArray {

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int removeIndex = 1;

        for (int i = removeIndex; i < my_array.length; removeIndex++) {
            my_array[i] = my_array[i + 1];
        }

        System.out.println("After removal: " + Arrays.toString(my_array));


    }

}
