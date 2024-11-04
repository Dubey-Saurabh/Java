package JavaBasics.String;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        //take 3 variables startIndex, endIndex, maxLength
        //Take a list to store the characters of the string
        //add while loop condition until the length of the string
        //add condition to have the length of the longest substring
        //print the length of the longest substring


        String inputString = "pickoutthelongestsubstring";

        int startIndex = 0;
        int endIndex = 0;
        int maxLength = 0;

        List<Character> list = new ArrayList<>();

        while (endIndex < inputString.length()) {

            if (!list.contains(inputString.charAt(endIndex))) {

                list.add(inputString.charAt(endIndex));
                endIndex++;
                maxLength = Math.max(maxLength, list.size());
            }else{
                list.remove(Character.valueOf(inputString.charAt(startIndex)));
                startIndex++;
            }

        }

        System.out.println("length of the longest substring: " +maxLength);


    }


}
