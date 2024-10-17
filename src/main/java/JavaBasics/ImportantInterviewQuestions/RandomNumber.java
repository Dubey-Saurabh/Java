package JavaBasics.ImportantInterviewQuestions;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        for (int i=1;i<=5;i++){
            System.out.println(random.nextInt());
            System.out.println(random.nextBoolean());
            System.out.println(random.nextDouble());
            System.out.println(random.nextInt(20)); // 0-20
        }

        for (int i=1;i<=5;i++){
            System.out.println(Math.random());
        }



    }
}
