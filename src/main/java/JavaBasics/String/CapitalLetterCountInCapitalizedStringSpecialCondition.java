package JavaBasics.String;

public class CapitalLetterCountInCapitalizedStringSpecialCondition {

    public static void main(String[] args) {

        String string = "thisNaveenAutomationLabsJavaTutorials";

        int count = 0;

        if (Character.isLowerCase(string.charAt(0))) {
            count++;
        }
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                count++;
            }
        }

        System.out.println(count);

        // Second case

        String str = " thisNaveenAutomationLabsJavaTutorials"; // with starting space

        int count1 = 0;

        if (Character.isLowerCase(string.trim().charAt(0))) {
            count1++;
        }
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                count1++;
            }
        }

        System.out.println(count1);

    }
}
