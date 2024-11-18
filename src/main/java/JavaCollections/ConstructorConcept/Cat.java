package JavaCollections.ConstructorConcept;

public class Cat {

    //Default Constructor
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 21;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());


    }


}
