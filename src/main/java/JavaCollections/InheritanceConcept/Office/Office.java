package JavaCollections.InheritanceConcept.Office;

public class Office {

    public static void main(String[] args) {

        Employee employee = new Employee(2300);
        HRManager hrManager = new HRManager(6500);
        employee.work();
        System.out.println(employee.getSalary());
        hrManager.work();
        System.out.println(hrManager.getSalary());
        hrManager.addEmployee();

    }
}
