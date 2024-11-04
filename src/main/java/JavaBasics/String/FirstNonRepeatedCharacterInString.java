package JavaBasics.String;

public class FirstNonRepeatedCharacterInString {


    // Loop through each character of the string.
    // Loop through the string again to compare characters.
    // apply a boolean condition to Assume the character at index 'i' is unique initially.
    // Check if the characters at positions 'i' and 'j' are the same but not at the same index.
    // If found, set unique to false and break the loop.
    // If the character at index 'i' is unique, print it and exit the loop.

    public static void main(String[] args) {

        String string = "pickoutthelongestsubstring";

        for (int i = 0; i < string.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < string.length(); j++) {

                if (i != j && string.charAt(i) == string.charAt(j)) {
                    unique = false;
                    break;
                }

            }

            if (unique) {
                System.out.println("First non repeated character would be: " + string.charAt(i));
                break;
            }


        }


    }

}
