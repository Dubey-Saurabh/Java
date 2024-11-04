package JavaBasics.Practice;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayPassword {

    public static void main(String[] args) {

        Console cons;

        //check if system console is available

        if ((cons = System.console()) != null) {

            //declare a char array to store the password
            char pass_word[] = null;

            try {
                // Prompt the user to input their password.
                pass_word = cons.readPassword("input your password");

                // Display the password to the console.

                System.out.println("your password was: " + new String(pass_word));
            } finally {
                // Ensure that the password array is securely cleared.
                if (pass_word != null) {
                    Arrays.fill(pass_word, ' ');
                }
            }
        } else {
            // If the system console is not available, throw a runtime exception.
            throw new RuntimeException("Can't get the password");

        }


    }
}
