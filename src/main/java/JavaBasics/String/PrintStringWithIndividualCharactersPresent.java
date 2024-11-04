package JavaBasics.String;

public class PrintStringWithIndividualCharactersPresent {


    public static String indChar(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        int maxLength = Math.max(len1, len2);
        String newString = "";

        for (int i = 0; i < maxLength; i++) {

            if (i < len1 - 1) {
                newString += str1.substring(i, i + 1);
            }
            if (i < len2 - 1) {
                newString += str2.substring(i, i + 1);
            }

        }

        return newString;


    }

    public static void main(String[] args) {

        String str1 = "welcome";
        String str2 = "w3resource";

        System.out.println(indChar(str1,str2));

    }


}
