package JavaBasics.ImportantInterviewQuestions;

public class CorrectPhoneNumber {

    public static boolean isCorrectPhoneNumber(String number) {

        return number.matches("[0-9]{10}");  // Number should be between 0-9 and length limit is 10.
    }

    public static void main(String[] args) {
        System.out.println(isCorrectPhoneNumber("99713709122"));
    }
}
