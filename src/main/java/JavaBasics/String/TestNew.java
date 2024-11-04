package JavaBasics.String;

public class TestNew {

    public static void main(String[] args) {

        //CharSequence
        String str1 = "example.com", str2 = "Example.com";

        CharSequence cs = "example.com";

        String string = new StringBuffer("Java").append("Exercises").toString();

        String string1 = string.intern();
        System.out.println(string1);

        System.out.println(str1==string); // false
        System.out.println(str1 == string1); // false

        System.out.println(str1.indexOf('a',0));

        System.out.println(str1.endsWith("om"));

        System.out.println(str1.contentEquals(cs));

    }
}
