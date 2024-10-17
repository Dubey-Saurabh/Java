package JavaBasics.String;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        String original = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        String rev = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            rev = rev + original.charAt(i);
        }

        if (rev.equals(original)) {
            System.out.println("Plaindrome");
        } else {
            System.out.println("No Palindrome");
        }


    }
}

