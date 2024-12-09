package JavaBasics.String;

import java.util.HashMap;
import java.lang.String;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersString {

    public static void main(String[] args) {

        printDuplicateCharactersCount("The number of seconds the Appium server should wait for clients to send commands before deciding that the client has gone away and the session should shut down");
        try {
            printDuplicateCharactersCount(null);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        printDuplicateCharactersCount("Saurabh");
    }

    public static void printDuplicateCharactersCount(String str) {

        char arr[] = str.toCharArray();

        HashSet set = new HashSet();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j] && arr[i] != ' ') {

                    set.add(arr[i]);

                }

            }
        }

        System.out.println(set);

    }

}
