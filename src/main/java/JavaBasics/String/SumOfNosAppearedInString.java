package JavaBasics.String;

public class SumOfNosAppearedInString {

    // Method to calculate the sum of numbers present in a string
    // Get the length of the given string
    // Initialize a variable to store the sum
    // Initialize an empty string to store temporary numeric values
    // Loop through the string to find and sum the numbers
    // Check if the character is a digit
    // If the next character is also a digit, add the current digit to the temporary string
    // If the next character is not a digit or it's the end of the string, add the last digit to the temporary string
    // Convert the temporary string to an integer and add it to the sum
    // Reset the temporary string for the next number
    // Return the total sum of the numbers found in the string
    // Main method to execute the program


    public static int sumOfNums(String str) {

        int len = str.length();
        int sum = 0;
        String finalString = "";

        for (int i = 0; i < len; i++) {

            if (Character.isDigit(str.charAt(i))){

                if (i<len-1 && Character.isDigit(str.charAt(i+1))){

                    finalString +=str.charAt(i);
                }else{
                    finalString +=str.charAt(i);
                    sum += Integer.parseInt(finalString);
                    finalString="";
                }

            }

        }

        return sum;


    }

    public static void main(String[] args) {

        System.out.println(sumOfNums("it 15 is25 a 20string"));


    }


}
