package JavaBasics.ImportantInterviewQuestions;

public class InstanceInitializationBlock {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Instance Initialization Block");
    }

    InstanceInitializationBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");
        new InstanceInitializationBlock(); // NOTE: when object of class is created only then constructor and IIB will be executed.

    }

}
