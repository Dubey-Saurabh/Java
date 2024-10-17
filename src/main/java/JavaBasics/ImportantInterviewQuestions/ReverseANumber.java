package JavaBasics.ImportantInterviewQuestions;

public class ReverseANumber {

    public static void rev(int n) {

        if (n < 10) {
            System.out.println(n);
            return;
        } else {
            System.out.print(n % 10);
            rev(n / 10);
        }

    }


    public static void main(String[] args) {

        rev(123);


    }

}
