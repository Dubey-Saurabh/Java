package JavaCollections.InheritanceConcept.Vehicles;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);

        // Print the truck's model
        System.out.println("Truck Model: " + truck.getModel());
        // Print the truck's calculated fuel efficiency
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        // Print the truck's calculated distance traveled
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        // Print the truck's maximum speed
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph");


    }
}
