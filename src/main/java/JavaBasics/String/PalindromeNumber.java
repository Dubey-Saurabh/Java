package JavaBasics.String;

public class PalindromeNumber {

    public static void main(String[] args) {

        int Sum = 0, r = 0, temp;
        int num = 121;

        temp = num;

        while (num > 0) {

            r = num % 10; //1,2,1
            Sum = (Sum * 10) + r; //1+
            num = num / 10; //12,1

        }
        if (temp == Sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }


}
