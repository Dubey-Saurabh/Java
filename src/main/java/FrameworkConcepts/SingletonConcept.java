package FrameworkConcepts;

public class SingletonConcept {

    //1. Can only have one instance of a class at a time, for other reference variable we create it will refer to same current object.
    //How to create Singleton class
    //1. Make a constructor as private so that it can be used within a class
    //2. Make a public method, which will return an object of a singleton class, in order to assign the instance or object of a class to reference variable.


    private static SingletonConcept singletonConcept = null;
    public String str;

    private SingletonConcept() {
        str = "Hey my name is Saurabh";
    }

    public static SingletonConcept getObject() {

        if (singletonConcept == null)
            singletonConcept = new SingletonConcept();
        return singletonConcept;

    }

    public static void main(String[] args) {

        SingletonConcept x = SingletonConcept.getObject(); // first object is already created here
        SingletonConcept y = SingletonConcept.getObject(); //  this will also refer to first object
        SingletonConcept z = SingletonConcept.getObject(); // this will also refer to first object

        x.str = (x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        z.str = (z.str).toLowerCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);


    }

}
