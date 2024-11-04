package JavaBasics.String;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "Grab";
        String str2 = "Crab";

        if (!str1.isEmpty() && !str2.isEmpty())
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        }
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        System.out.println(string1);

        Arrays.sort(string1);
        Arrays.sort(string2);

        if (Arrays.equals(string1, string2)) {
            System.out.println(" Anagram");
        } else
            System.out.println("Not an anagram");


    }
}
