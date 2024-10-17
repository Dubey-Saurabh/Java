package JavaBasics.String;

import java.util.HashSet;
import java.lang.String;
import java.util.Set;

public class UniqueCharactersInString {

    public static int uniqueChar(String str) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size();
    }

    public static void main(String[] args) {

        System.out.println(uniqueChar("Java is my preferrable language"));
    }
}
