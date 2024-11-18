package JavaCollections.ConstructorConcept;

public class Dog {

    //parametrized constructor
    private String name, colour;

    public Dog(String name, String colour){
        this.name = name;
        this.colour= colour;

    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Esco", "Black");
        Dog dog2 = new Dog("Bruno", "White");

        System.out.println(dog1.name+ " : " + dog1.colour);
        System.out.println(dog2.name+ " : " + dog2.colour);


    }

}
