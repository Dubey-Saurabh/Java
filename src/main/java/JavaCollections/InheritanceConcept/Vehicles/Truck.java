package JavaCollections.InheritanceConcept.Vehicles;

public class Truck extends Vehicles {

    private double cargoCapacity;


    public Truck(String make, String model, int year, String fuel_type, double fuelEfficiency, double cargoCapacity) {
        super(make, model, year, fuel_type, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
}
