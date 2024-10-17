package JavaBasics.ImportantInterviewQuestions;

public class ObjectAndStringArgumentCall {

    public static void main(String[] args) {
        test(null);

    }

    public static void test(Object o) {
        System.out.println("object argument");
    }

    public static void test(String s) {
        System.out.println("String argument");
    }


}
