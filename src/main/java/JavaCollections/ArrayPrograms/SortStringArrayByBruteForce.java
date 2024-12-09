package JavaCollections.ArrayPrograms;

import java.util.Arrays;

public class SortStringArrayByBruteForce {

    public static void main(String[] args) {

        String arr[] = {"Amazon", "Tata", "Microsoft", "Facebook", "Ericsson", "Reliance", "Walmart", "Orange"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

/*             The compareTo() method in Java is used to compare two strings lexicographically (by converting characters into Unicode).
                It returns an integer value that indicates the relative order of the two strings.

                How it works:
                Positive value: If the current string is lexicographically greater than the specified string.
                Negative value: If the current string is lexicographically less than the specified string.
                Zero: If both strings are equal.*/

                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }


            }
        }

        System.out.println(Arrays.toString(arr));
    }
}