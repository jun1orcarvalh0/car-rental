package br.com.CarRental.Vehicle;

public class SmallVehicle extends Vehicle {
    public SmallVehicle(String licensePlate, String name){
        this.licensePlate = licensePlate;
        this.name = name;
        this.availability = Availability.AVAILABLE;
        this.baseValue = 100;
    }
}
