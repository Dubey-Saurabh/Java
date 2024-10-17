package JavaBasics.String;

public class StringDividedIntoNParts {

    public static void main(String[] args) {

        String str = "SaurabhDubey";
        int temp = 0;

        int length = str.length();

        int noOfParts = 3;

        int chars = length / noOfParts;

        //Stores the array of string

        String[] equString = new String[noOfParts];

        //Check whether a string can be divided into n equal parts

        if (length % noOfParts != 0) {
            System.out.println("Can't be divided into equal parts");
        } else {
            for (int i = 0; i < length; i = i + chars) {
                String part = str.substring(i, i + chars);
                equString[temp] = part;
                temp++;
            }
            System.out.println(noOfParts + " equal parts of given string are ");
            for (int i = 0; i < equString.length; i++) {
                System.out.println(equString[i]);
            }
        }


    }
}
