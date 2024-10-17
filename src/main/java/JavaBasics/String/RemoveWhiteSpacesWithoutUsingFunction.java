package JavaBasics.String;

public class RemoveWhiteSpacesWithoutUsingFunction {

    public static void main(String[] args) {

        String string = "This is my Java";
        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) != '\t') {
                newString = newString + string.charAt(i);
            }
        }

        System.out.println(newString);

    }
}
