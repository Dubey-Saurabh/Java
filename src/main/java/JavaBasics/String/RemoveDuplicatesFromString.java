package JavaBasics.String;

public class RemoveDuplicatesFromString {

    //create a method to remove duplicates and pass string as an input parameter
    //convert string into char array
    //take an empty string
    //for loop for each element of the array
    //apply condition to check duplicates
    //return the result
    //call the above method in main method


    public static String removeDuplicates(String str) {

        char charArr[] = str.toCharArray();
        String resultString = "";

        for (char value : charArr) {

            // Check if the character doesn't exist in the resultString.
            if (resultString.indexOf(value) == -1) {
                resultString += value;
            }
        }

        return resultString;

    }

    public static void main(String[] args) {

        System.out.println("Final String: " +removeDuplicates("pickoutthelongestsubstring"));

    }


}
