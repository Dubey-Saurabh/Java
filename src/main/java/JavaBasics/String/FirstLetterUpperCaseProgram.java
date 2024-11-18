package JavaBasics.String;

import java.lang.String;

public class FirstLetterUpperCaseProgram {

    public static void main(String[] args) {

        String string = "when managing an appium cloud";

        String[] newString = string.trim().split(" "); //{salute,the,nation};

        String finalString = "";

        for (int i = 0; i < newString.length; i++) {
            String str = "";

            for (int j = 0; j < newString[i].length(); j++) {
                char chr = ' ';
                if (j == 0) {
                    chr = newString[i].charAt(j);
                    str = str + chr;
                    str = str.toUpperCase();
                } else {
                    chr = newString[i].charAt(j);
                    str = str + chr;
                }
            }
            finalString = finalString + str + " ";
        }

        System.out.println(finalString);

    }

}
