package JavaCollections.InheritanceConcept.Employees;

public class Employees {

    private String name, address, job_title;
    private int Salary;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getJob_title() {
        return job_title;
    }

    public int getSalary() {
        return Salary;
    }

    public Employees(String name, String address, String job_title, int salary) {
        this.name = name;
        this.address = address;
        this.job_title = job_title;
        Salary = salary;
    }

    public double getBonus() {
        // Default implementation for bonus calculation
        return 0.0;
    }

    public String generatePerformanceReport() {
        // Default implementation for performance report
        return "No performance report available.";
    }


}
