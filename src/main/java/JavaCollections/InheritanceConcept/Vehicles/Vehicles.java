package JavaCollections.InheritanceConcept.Vehicles;

public abstract class Vehicles {

    private String make, model, fuel_type;
    private int year;
    private double fuelEfficiency;


    public Vehicles(String make, String model, int year, String fuel_type, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public String getFuel_type() {
        return fuel_type;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();


}
