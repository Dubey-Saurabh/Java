package JavaCollections.Class;

public class Mai {

    //Anonymous Class Exercise

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        greeting.sayHello();

    }

}
