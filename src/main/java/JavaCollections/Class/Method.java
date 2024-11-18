package JavaCollections.Class;

public class Method {

    //local classes

    public void startEngine() {

        class Engine {

            public void run() {

                System.out.println("Engine is running");
            }

        }

        Engine engine = new Engine();
        engine.run();


    }

    public static void main(String[] args) {

        Method method = new Method();
        method.startEngine();

    }

}
