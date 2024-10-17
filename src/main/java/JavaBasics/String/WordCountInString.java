package JavaBasics.String;

public class WordCountInString {

    public static void main(String[] args) {

        String str = "welcome to java tutorial on Java2blog , what an awesome movie i had watched today";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if ((str.charAt(i) == ' ') && str.charAt(i + 1) != ' ') {

                count++;
            }
        }
        System.out.println("Total no of words would be :" + count);
    }

}
