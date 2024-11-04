package JavaCollections.ConstructorConcept;

public class ConstructorTest {

    public ConstructorTest() {
        System.out.println("default constructor");
    }

    public ConstructorTest(int i) {
        System.out.println("parametrized constructor");
    }

    public ConstructorTest(int i, int j) {
        System.out.println("two parametrized constructor");
    }

    public static void main(String[] args) {
        ConstructorTest con = new ConstructorTest();
        ConstructorTest con1 = new ConstructorTest(10);
        ConstructorTest con2 = new ConstructorTest(12, 36);

    }

}
