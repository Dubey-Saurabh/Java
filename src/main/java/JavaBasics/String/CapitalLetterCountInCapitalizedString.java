package JavaBasics.String;

public class CapitalLetterCountInCapitalizedString {

    public static void main(String[] args) {

        //1. Brute Force Method
        String string = "NaveenAutomationLabsJavaTutorials";

        int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                count++;
            }
        }

        System.out.println(count);

        //2. uppercase

        int count1 = 0;

        for (int j = 0; j < string.length(); j++) {

            if (Character.isUpperCase(string.charAt(j))) {
                count1++;
            }
        }

        System.out.println(count1);

        //3.Streams 1

        long count2 = string.chars().filter(e -> e >= 65 && e <= 90).count();
        System.out.println(count2);

        //4. Streams 2

        long count3 = string.chars().filter(e->Character.isUpperCase(e)).count();
        System.out.println(count3);

        //Regex


    }
}
