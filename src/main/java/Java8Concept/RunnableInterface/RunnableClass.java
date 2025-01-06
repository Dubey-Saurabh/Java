package Java8Concept.RunnableInterface;

public class RunnableClass {

    public static void main(String[] args) {

        /*Runnable is used to create a thread, starting the thread causes the object's run method to be called in that separately executing thread*/

        Runnable runnable = () -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
            }

        };

        Thread thread = new Thread(runnable);
        thread.run();


    }
}
