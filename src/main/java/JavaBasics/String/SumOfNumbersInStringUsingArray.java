package JavaBasics.String;

public class SumOfNumbersInStringUsingArray {

    public static void main(String[] args) {

        String string = "asgf4kjh678kh5f";

        char arr[] = string.toCharArray();

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {

                max += Character.getNumericValue(arr[i]);

            }

        }

        System.out.println(max);

    }
}
