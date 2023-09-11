package br.com.CarRental.Services;

import br.com.CarRental.Person.Person;
import br.com.CarRental.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RentalService {
    List<Vehicle> rentedVehicles;
    StockVehicleService stockVehicleService;
    PersonService personService;
    LocalDateTime localDateTime;

    public RentalService(){
         rentedVehicles = new ArrayList<>();
         stockVehicleService = new StockVehicleService();
         personService = new PersonService();
    }

    public void rentVehicle(Vehicle vehicle, Person person){

        rentedVehicles.add(vehicle);
        stockVehicleService.availableVehicles.remove(vehicle);
    }
}