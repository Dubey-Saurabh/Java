package JavaBasics.ImportantInterviewQuestions;

public class Vowels {

    public static boolean isVowel(char t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'O' || t == 'I' || t == 'O' || t == 'U';
    }

    public static void main(String[] args) {

        String str = "testing";
        int vCount = 0;
        for (int i=0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vCount++;
            }
        }

        System.out.println(vCount);
    }

}
