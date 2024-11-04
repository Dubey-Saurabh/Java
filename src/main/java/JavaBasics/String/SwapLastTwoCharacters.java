package JavaBasics.String;

public class SwapLastTwoCharacters {

    public static void main(String[] args) {

        String string = "string";

        System.out.println(string.substring(0, string.length() - 2) + string.charAt(string.length() - 1) + string.charAt(string.length() - 2));


    }


}
