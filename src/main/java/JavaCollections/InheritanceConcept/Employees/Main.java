package JavaCollections.InheritanceConcept.Employees;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Avril Aroldo", "1 ABC St", "Manager", 80000, 5);

        // Printing the manager's bonus
        System.out.println("Manager's Bonus: $" + manager.getBonus());

        // Printing the manager's performance report
        System.out.println(manager.generatePerformanceReport());

        manager.manageProject();


    }
}
