package JavaBasics.String;

import java.lang.String;

public class CharacterOccurenceCountInString {

    public static void main(String[] args) {

        String str = "Why we all has indulge in everything which we can't desired of";

        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a') {
                count++;
            }

        }
        System.out.println("a:" + count);
        System.out.println("Another method below");

        getOccurence(str, 'w');
    }

    public static void getOccurence(String string, char c) {
        int count = 0;
        for (char ch : string.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }

        System.out.println("Count of " + c + " is " + count);

        System.out.println("Using Stream");

        long count1  = string.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals("i")).count();
        System.out.println(count1);


    }


}
