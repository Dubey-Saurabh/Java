package JavaCollections.ArrayPrograms;

import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int arr[] = {5, 6, 8, 6, 4, 2, 1};

        HashSet set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    set.add(arr[i]);
                }
            }
        }

        System.out.println(set.stream().sorted().collect(Collectors.toSet()));

    }
}
