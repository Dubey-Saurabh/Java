package JavaBasics.Basics;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        switch (age) {

            case 12:
                System.out.println("Not adult");
                break;

            case 18:
                System.out.println("Adult");
                break;

            case 21:
                System.out.println("Job time");
                break;

            default:
                System.out.println("Enjoy life");


        }

        System.out.println("Thanks for using this code!");


    }
}
