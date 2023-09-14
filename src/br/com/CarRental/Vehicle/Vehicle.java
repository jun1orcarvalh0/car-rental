package br.com.CarRental.Vehicle;

public abstract class Vehicle {
    protected String licensePlate;
    protected String name;

    protected double baseValue;

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    protected Availability availability;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getBaseValue() {
        return baseValue;
    }
}
