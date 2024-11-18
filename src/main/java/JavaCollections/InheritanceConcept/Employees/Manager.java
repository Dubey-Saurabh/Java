package JavaCollections.InheritanceConcept.Employees;

public class Manager extends  Employees{

    private int numberOfSubordinates;


    public Manager(String name, String address, String job_title, int salary, int numberOfSubordinates) {
        super(name, address, job_title, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public double getBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Manager " + getName() + ": Excellent";
    }

    public void manageProject() {
        // Printing a message indicating the manager is managing a project
        System.out.println("Manager " + getName() + " is managing a project.");
    }

}
