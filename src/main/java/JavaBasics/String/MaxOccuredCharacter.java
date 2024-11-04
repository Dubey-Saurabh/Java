package JavaBasics.String;

public class MaxOccuredCharacter {

    // Define a constant for the size of the character set.
    // Method to find the character with the maximum occurrence in the string.
    //Array to count occurrences of each character.
    // Length of the given string.
    // Loop through the string to count occurrences of each character.
    // Variable to store maximum occurrence.
    // Variable to store the character with the maximum occurrence.
    // Loop through the string to find the character with the maximum occurrence.
    // Return the character with the maximum occurrence.

    public static final int N = 256;

    public static char maxOccurence(String str) {

        int ctrArr[] = new int[N];

        int len = str.length();

        for (int i = 0; i < len; i++) {
            ctrArr[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < ctrArr[str.charAt(i)]) {
                max = ctrArr[str.charAt(i)];
                result = str.charAt(i);
            }
        }


        return result;


    }

    public static void main(String[] args) {

        System.out.println("maximum occured character: " +maxOccurence("pickoutthelongestsubstring") );


    }


}
