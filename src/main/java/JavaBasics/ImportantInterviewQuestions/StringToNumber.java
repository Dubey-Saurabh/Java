package JavaBasics.ImportantInterviewQuestions;

public class StringToNumber {

    public static int convertor(String str){

        int len = str.length();
        int num =0;

        for (int i=0;i<str.length();i++){

            //formula
            num = num*10 +((int) str.charAt(i)-48); // converting by ascii logic
        }

        return num;

    }

    public static void main(String[] args) {

        System.out.println(convertor("1345")+29);

    }

}
