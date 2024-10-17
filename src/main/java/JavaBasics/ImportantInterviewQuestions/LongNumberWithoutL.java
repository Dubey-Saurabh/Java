package JavaBasics.ImportantInterviewQuestions;

public class LongNumberWithoutL {

    public static void main(String[] args) {

        long LongNumberWithoutl = 23*45*129*42*567;
        long LongNumberWithl = 23*45*129*42*567L;

        System.out.println(LongNumberWithoutl); // will give wrong output because of bits limitation
        System.out.println(LongNumberWithl);

    }
}
