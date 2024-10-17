package JavaBasics.ImportantInterviewQuestions;

public class OccurenceOfCharacterUsingStream {

    public static void main(String[] args) {

        System.out.println(getOccurence("Java is wow", 'J'));


    }

    public static long getOccurence(String str, char val) {

        return str.chars().filter(e -> (char) e == val).count();

    }
}
