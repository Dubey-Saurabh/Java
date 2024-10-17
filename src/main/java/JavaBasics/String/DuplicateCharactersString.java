package JavaBasics.String;

import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersString {

    public static void main(String[] args) {

        printDuplicateCharactersCount("The number of seconds the Appium server should wait for clients to send commands before deciding that the client has gone away and the session should shut down");
        printDuplicateCharactersCount(null);
        printDuplicateCharactersCount("Saurabh");
    }

    public static void printDuplicateCharactersCount(String s) { // a method

        if (s == null || s.isEmpty() || s.length() == 1) {
            System.out.println("String is not valid");
            return;
        }
        char characters[] = s.toCharArray(); // string to char
        Map<Character, Integer> charactersMap = new HashMap<Character, Integer>(); // create hm

        for (Character ch : characters) { // for each loop for character

            if (charactersMap.containsKey(ch)) {
                charactersMap.put(ch, charactersMap.get(ch) + 1);
            } else {
                charactersMap.put(ch, 1);
            }

        }
        Set<Map.Entry<Character, Integer>> entrySet = charactersMap.entrySet();
        for (Map.Entry<Character, Integer> e : entrySet) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }


//        charactersMap.entrySet().removeIf(i -> i.getValue() == 1);
//        System.out.println(charactersMap);
//

    }

}
