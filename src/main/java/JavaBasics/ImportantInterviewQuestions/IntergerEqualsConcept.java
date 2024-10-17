package JavaBasics.ImportantInterviewQuestions;

public class IntergerEqualsConcept {

    public static void main(String[] args) {

        //Integer caching principle, ranges from -128 to 127

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 198;
        Integer num4 = 198;

        if (num3 == num4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }
}
