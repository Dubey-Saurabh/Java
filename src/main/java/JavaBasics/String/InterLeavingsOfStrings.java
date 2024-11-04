package JavaBasics.String;

import java.util.HashSet;
import java.util.Set;

public class InterLeavingsOfStrings {


    //Define a method to find all interLeavings of two strings.
    //Pass a result string, two input strings P and Q  and a set object
    //add result in set object when the length of any string is 0 or they are empty strings
    //If string P is not empty, recursively call allInterleavings with the first character of P removed.
    //If string Q is not empty, recursively call allInterleavings with the first character of Q removed.
    // The main method to execute the code, define two strings values like for P and Q
    // Create a HashSet to store unique interLeavings.
    // Call the allInterleavings method to generate interleavings of the input strings.
    // Print all the generated interleavings using streams.


    public static void allInterLeavings(String res, String p, String q, Set out) {

        if (p.length() == 0 && q.length() == 0) {
            out.add(res);
            return;
        }

        if (p.length() != 0) {
            allInterLeavings(res + p.charAt(0), p.substring(1), q, out);
        }

        if (q.length() != 0) {
            allInterLeavings(res + q.charAt(0), p, q.substring(1), out);
        }


    }

    public static void main(String[] args) {

        String p = "WX";
        String q = "YZ";

        Set<String> out = new HashSet<>();

        allInterLeavings(" ", p, q, out);

        out.stream().forEach(System.out::println);


    }


}
