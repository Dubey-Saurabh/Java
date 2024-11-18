package JavaCollections.ArrayPrograms;

import java.util.OptionalInt;

public class IndexOfElementInArray {

    // Define a method 'findIndex' that searches for an integer 't' in an integer array 'my_array'.
    // Check if the array is null and return an empty OptionalInt if it is.
    // Get the length of the array.
    // Iterate through the elements in the array.
    // Check if the current element is equal to 't' and return its index as an OptionalInt if found.
    // If 't' is not found in the array, return an empty OptionalInt.


    public static OptionalInt indexOf(int myArray[], int item) {

        if (myArray == null) {
            return OptionalInt.empty();
        }

        int len = myArray.length;
        int i = 0;

        while (i < len) {
            if (myArray[i] == item) {
                return OptionalInt.of(i);
            } else {
                i = i++;
            }

        }
        return OptionalInt.empty();


    }

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 77, 18, 29, 49};

        indexOf(my_array, 56).ifPresent(index -> System.out.println("index position of 56: " + index));
    }


}
