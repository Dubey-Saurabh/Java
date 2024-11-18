package JavaCollections.ConstructorConcept;

public class Singleton {

    //Constructor for Singleton Pattern

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Singleton Instance created");
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }


    }


}
