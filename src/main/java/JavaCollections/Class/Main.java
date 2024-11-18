package JavaCollections.Class;

public class Main {

    //Anonymous Class Implementing Abstract Class:

    public static void main(String[] args) {

        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }
        };
        cat.makeSound();
    }


}
