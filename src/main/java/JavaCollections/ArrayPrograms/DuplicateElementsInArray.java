package JavaCollections.ArrayPrograms;

import java.util.HashSet;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 14, 29, 49};

        HashSet set = new HashSet();

        for (int i = 0; i < my_array.length; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[i] == my_array[j] && i != j) {
                    set.add(my_array[i]);
                }
            }
        }

        System.out.println(set);

    }


}
