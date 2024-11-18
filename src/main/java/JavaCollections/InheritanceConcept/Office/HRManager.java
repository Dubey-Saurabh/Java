package JavaCollections.InheritanceConcept.Office;

public class HRManager extends Employee {


    public HRManager(int Salary) {
        super(Salary);
    }

    public void work() {
        System.out.println("\nmanager is working");
    }

    public void addEmployee() {
        System.out.println("\nAdding employees");
    }


}
