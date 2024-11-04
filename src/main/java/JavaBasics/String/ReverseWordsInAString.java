package JavaBasics.String;

public class ReverseWordsInAString {

    //create a method
    //split it
    //create an StringBuilder object to modify the string
    //iterate it in reverse order
    //append words in String builder object
    //append space as well
    //return it
    //call in main method

    public static String reverseWords(String str) {

        String arr[] = str.split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }

        return sb.toString().trim();


    }

    public static void main(String[] args) {

        System.out.println(reverseWords("Please find my details for QA Test Automation below"));
        ;

    }


}
