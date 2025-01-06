package Java8Concept.FunctionalInterface;

public class Main implements MyFunctionalInterface {

    public static void main(String[] args) {

        Main main = new Main();
        main.getNumbers(); /*Calling default method*/
        main.sum(); /*Calling abstract method*/
        MyFunctionalInterface.getValues(); /*Calling static method*/

    }

    @Override
    public void sum() {
        System.out.println("sum");
    }


}
