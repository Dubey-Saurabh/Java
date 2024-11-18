package JavaBasics.String;

public class CheckSubstringIsAPartOfMainString {


    public static boolean isSubstringPresent(String str, String sub) {

        return str.matches("(.*)" + sub + "(.*)");
    }

    public static boolean isSubstringPresent1(String str, String sub) {

        return str.contains(sub);
    }

    public static boolean isSubstringPresent2(String str, String sub) {
        return str.indexOf(sub) != -1; // index of substring will always return -1 when it is not present.
    }


    public static void main(String[] args) {

        System.out.println(isSubstringPresent("My name is java", "av"));
        System.out.println(isSubstringPresent1("My name is java", "av"));
        System.out.println(isSubstringPresent2("My name is java", "av"));

    }


}
