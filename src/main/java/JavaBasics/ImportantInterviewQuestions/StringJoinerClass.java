package JavaBasics.ImportantInterviewQuestions;

import java.util.StringJoiner;

public class StringJoinerClass {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(",", "{", "}");
        StringJoiner s = stringJoiner.add("Saurabh").add("Akash").add("Anurag");
        System.out.println(s);

    }
}
