package JavaBasics.String;

public class ReverseString {

    public static void main(String[] args) {

        String string = "Saurabh";

        //Approach1
        String rev = "";

        for (int i = string.length(); i >= 1; i--) {

            rev = rev + string.charAt(i - 1);
        }

        System.out.println(rev);

        //Approach2

        char ch[] = string.toCharArray();

        for (int i=ch.length-1;i>=0;i--){

            System.out.print(ch[i]);
        }


    }


}
