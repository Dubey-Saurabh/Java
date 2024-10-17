package JavaBasics.ConstructorConcept;

public class ChildClass extends ParentClass {

    public ChildClass() {
        super(10); //To call second constructor of Parent Class
        System.out.println("Child Class Constructor");
    }

    public static void main(String[] args) {

        ChildClass childClass = new ChildClass(); //Parent Class constructor will be called first then child class as it first go to Parent Class.


    }
}
