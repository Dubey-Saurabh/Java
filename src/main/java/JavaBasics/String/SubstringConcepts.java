package JavaBasics.String;

public class SubstringConcepts {

    public static void main(String[] args) {

        String string = "Hello my name is Saurabh";
        System.out.println(string.substring(5));
        System.out.println(string.substring(2, 4));

        String sub = "temp";

        boolean flag = false;

        String str[] = string.split(" ");
        for (String data : str) {
            if (data.equalsIgnoreCase(sub)) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println(sub + " is found");
        } else {
            System.out.println(sub + " not found");
        }

    }
}
