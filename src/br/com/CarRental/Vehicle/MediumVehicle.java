package br.com.CarRental.Vehicle;

public class MediumVehicle extends Vehicle{
    public MediumVehicle(String licensePlate, String name){
        this.licensePlate = licensePlate;
        this.name = name;
        this.availability = Availability.AVAILABLE;
        this.baseValue = 150;
    }
}
