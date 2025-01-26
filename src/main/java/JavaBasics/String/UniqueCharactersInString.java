package JavaBasics.String;

public class UniqueCharactersInString {

    public static void main(String[] args) {

        String string = "How are you";
        String str = "";

        for (int i = 0; i < string.length(); i++) {
            int flag = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j) && i != j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                str = str + string.charAt(i);
            }
        }
        System.out.print(str);

    }
}
