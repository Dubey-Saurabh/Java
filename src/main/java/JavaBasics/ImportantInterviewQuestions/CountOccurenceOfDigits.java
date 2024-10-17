package JavaBasics.ImportantInterviewQuestions;

import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class CountOccurenceOfDigits {

    public static void main(String[] args) {

         getOccurence(12342574);

    }

    public static void getOccurence(int number) {

        HashMap<Long, Integer> hashMap = new HashMap<>();

        while (number != 0) {

            long lastDigit = number % 10;
            if (hashMap.containsKey(lastDigit)) {
                hashMap.put(lastDigit, hashMap.get(lastDigit) + 1);
            } else {
                hashMap.put(lastDigit, 1);
            }

            number = number / 10;


        }

        Set<Long> keys = hashMap.keySet();
        for (Long key : keys) {
            System.out.println(" " + key + " : " + hashMap.get(key));
        }

    }
}
