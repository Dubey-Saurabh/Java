package Java8Concept.FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {

    /*Functional Interface is an interface which can have only single abstract method (SAM) but any number of default or static methods
     * We can invoke Lambda Expressions by using functional interface    */

    public void sum();

    default void getNumbers() {
        System.out.println("get Numbers");
    }

    static void getValues() {
        System.out.println("Get values");
    }

    static void noValues() {
        System.out.println("No values");
    }

    static void sumValues() {
        System.out.println("Sum values");
    }

    default void getDigits() {
        System.out.println("get Digits");
    }


}
