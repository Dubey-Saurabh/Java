package JavaCollections.InheritanceConcept.Office;

public class Employee {

    private int Salary;

    public Employee(int Salary) {
        this.Salary = Salary;
    }

    public void work() {
        System.out.println("employee is working");
    }

    public int getSalary() {
        return Salary;
    }


}
