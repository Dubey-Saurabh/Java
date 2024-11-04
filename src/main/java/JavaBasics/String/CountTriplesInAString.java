package JavaBasics.String;

public class CountTriplesInAString {

    // Method to count the number of triples in the given string
    // Get the length of the given string
    // Initialize a counter for triples
    // Loop through the string to check for triples
    // Get the character at index 'i'
    // Check if the character at index 'i' is the same as the next two characters
    // Increment the counter if a triple is found
    // Return the total count of triples
    //call in main method

    public static int countTriples(String string) {

        int len = string.length();
        int count = 0;

        for (int i = 0; i < len - 2; i++) {

            char temp = string.charAt(i);

            if (temp == string.charAt(i + 1) && temp == string.charAt(i + 2)) {

                count++;
            }

        }

        return count;


    }

    public static void main(String[] args) {

        System.out.println(countTriples("welllcommmmeee"));

    }


}
