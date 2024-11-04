package JavaBasics.String;

public class ConcatinateTwoStrings {


    public static String concat(String str1, String str2) {

        if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            return str1 + str2.substring(1);
        }

        return str1 + str2;

    }

    public static void main(String[] args) {

        String str1 = "food";
        String str2 = "door";

        System.out.println(concat(str1, str2));

    }


}
