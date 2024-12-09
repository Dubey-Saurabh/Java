package JavaBasics.String;

public class SumOfNumbersInStringUsingString {

    public static void main(String[] args) {

        String string = "asgf4kjh678kh5f";

        int max = 0;

        for (int i = 0; i < string.length(); i++) {

            char ch = string.charAt(i);

            if (Character.isDigit(ch)) {

                max += Integer.parseInt("" + ch);


            }

        }

        System.out.println(max);


    }
}
