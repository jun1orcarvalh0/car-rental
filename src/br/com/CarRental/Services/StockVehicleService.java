package br.com.CarRental.Services;

import br.com.CarRental.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class StockVehicleService {
    List<Vehicle> availableVehicles;
    public StockVehicleService(){
        availableVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        availableVehicles.add(vehicle);
    }

    public void editVehicle(Vehicle vehicle, String name, String licensePlate){
        vehicle.setName(name);
        vehicle.setLicensePlate(licensePlate);
    }
    public void editVehicle(Vehicle vehicle, String name){
        vehicle.setName(name);
    }

    public List<Vehicle> searchVehicle(String name){
        List<Vehicle> found = new ArrayList<>();
        for (Vehicle vehicle : availableVehicles){
            if(vehicle.getName().toLowerCase().contains(name.toLowerCase())){
                found.add(vehicle);
            }
        }
        return found;
    }
}
