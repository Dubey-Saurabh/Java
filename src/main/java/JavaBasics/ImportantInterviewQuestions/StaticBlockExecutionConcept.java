package JavaBasics.ImportantInterviewQuestions;

public class StaticBlockExecutionConcept {

    public static void main(String[] args) {

        System.out.println(Main.x);
    }

}

class Main {

    public static final int x = 100;  // If static block and static final variable both are there in same class then preference will be given to variable.

    static {
        System.out.println("Execute static block");
    }


}
