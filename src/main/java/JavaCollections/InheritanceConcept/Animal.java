package JavaCollections.InheritanceConcept;

public class Animal {

    public void makeSound() {
        System.out.println("make sound");
    }

    public class Cat extends Animal {

        public void makeSound() {
            System.out.println("bark");
        }

    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal.Cat cat = animal.new Cat();
        cat.makeSound();
        animal.makeSound();

    }


}




