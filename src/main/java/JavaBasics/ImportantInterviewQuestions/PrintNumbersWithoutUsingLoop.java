package JavaBasics.ImportantInterviewQuestions;

import java.util.stream.IntStream;

public class PrintNumbersWithoutUsingLoop {

    // two ways: recursion method and stream API

    public static void main(String[] args) {
        printNumbers(1);
        System.out.println("_______________________________________");
        IntStream.rangeClosed(1, 100).forEach(x -> System.out.println(x));
    }

    public static void printNumbers(int num) {
        if (num <= 100) {
            System.out.println(num);
            num++;
            printNumbers(num);
        }
    }


}
