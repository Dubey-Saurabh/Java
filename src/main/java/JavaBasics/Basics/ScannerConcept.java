package JavaBasics.Basics;

import java.util.Scanner;

public class ScannerConcept {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = scanner.nextInt();
        System.out.println("Enter second no");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum would be");
        System.out.println(sum);

        //to check provided input is an integer or not

        System.out.println("Enter your number");
        Scanner scanner1 = new Scanner(System.in);
        boolean bool = scanner1.hasNextInt();
        System.out.println(bool);

        //String input
        System.out.println("Write something");
        Scanner scanner2 = new Scanner(System.in);
        //to read starting one word only, it doesn't read anything after space
        String string = scanner2.next();
        System.out.println(string);
        //to read complete sentence
        String string1 = scanner2.nextLine();
        System.out.println(string1);


    }
}
