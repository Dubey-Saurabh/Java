package JavaBasics.String;

public class CountNoOfCharactersInString {

    public static void main(String[] args) {
        String string = "a-1,b-3,c-4";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);

    }

}
