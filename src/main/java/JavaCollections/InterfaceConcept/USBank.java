package JavaCollections.InterfaceConcept;

public interface USBank {
	
	int MIN_BAL = 100;
	 void credit();
	 void debit();
	 void transferMoney();
	
	// Only method declaration: no body or only method prototype.
	// in interface, we can declare variables but they will always be static in nature.
	// in interface, variable values can not be changed.
	// No static method in interface
	// Interface is abstract in nature that means We can not create the object of interface.
	

}
