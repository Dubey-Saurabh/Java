package JavaBasics.String;

import java.util.HashMap;

public class FrequencyOfEachCharactersInString {

    //Create a method to check frequency of chars and pass an input string ref variable
    //Create a HashMap to store all those values of chars
    //Convert String to charArray
    //traverse char array and put condition to check frequencies
    //print the map
    //main method and call the above method


    public static void checkFrequency(String string) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        char charArr[] = string.toCharArray();

        for (char c : string.toCharArray()) {

            if (!String.valueOf(c).isBlank()) {

                if (charMap.containsKey(c)) {

                    charMap.put(c, charMap.get(c) + 1);

                } else {
                    charMap.put(c, 1);
                }

            }


        }

        System.out.println(string + " : " + charMap);


    }

    public static void main(String[] args) {


        String str = "Old town road is best song i have ever listened to";

        checkFrequency(str);

    }


}
