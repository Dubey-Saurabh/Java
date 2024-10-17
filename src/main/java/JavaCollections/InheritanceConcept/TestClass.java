package JavaCollections.InheritanceConcept;

public class TestClass {

	public static void main(String[] args) {
		// Static Polymorphism or compile time polymorphism
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.theftsafety();
		a.engine();
		System.out.println("_________________");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("_________________");

		Car c1 = new Audi(); // Top Casting : Child class object can be referred by parent class reference
								// variable. Dynamic or Run time polymorphism.
		c1.start();
		c1.stop();
		c1.refuel();

	}

}
