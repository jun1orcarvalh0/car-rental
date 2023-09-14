package br.com.CarRental.Services;

import br.com.CarRental.Person.Person;
import br.com.CarRental.Person.PersonDocument;
import br.com.CarRental.Services.Payment.Payment;
import br.com.CarRental.Vehicle.Availability;
import br.com.CarRental.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class VehicleRentalService {
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    List<Vehicle> vehicleList;

    public List<RentalReport> getRentalReportList() {
        return rentalReportList;
    }

    List<RentalReport> rentalReportList;
    public VehicleRentalService(){
        rentalReportList = new ArrayList<>();
        vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle newVehicle){
        for (Vehicle vehicle:vehicleList) {
            if (Objects.equals(newVehicle.getLicensePlate(), vehicle.getLicensePlate())) {
                System.out.println("Não foi possível adicionar o veículo");
                return;
            }
        }
        vehicleList.add(newVehicle);
    }

    public void editVehicleName(Vehicle vehicle, String name){
        vehicle.setName(name);
    }
    public void editVehicleLicensePlate(Vehicle editedVehicle, String licensePlate){
        for (Vehicle vehicle:vehicleList) {
            if (Objects.equals(licensePlate, vehicle.getLicensePlate())) {
                System.out.println("Já possuímos uma placa igual em nosso catálogo");
                return;
            }
        }
        editedVehicle.setLicensePlate(licensePlate);
    }

    public List<Vehicle> searchVehicle(String name){
        List<Vehicle> found = new ArrayList<>();
        for (Vehicle vehicle : vehicleList){
            if(vehicle.getName().toLowerCase().contains(name.toLowerCase())){
                found.add(vehicle);
            }
        }
        return found;
    }

    public void rentVehicle(String licensePlate, PersonDocument document, Date date, String hour){
        for (Vehicle vehicle : vehicleList){
            if(vehicle.getLicensePlate().equals(licensePlate)){
                if (vehicle.getAvailability().equals(Availability.RENTED)) {
                    System.out.println("The vehicle is already rented.");
                    return;
                }
                vehicle.setAvailability(Availability.RENTED);
                rentalReportList.add(new RentalReport(licensePlate, document, date, hour));
                return;
            }
        }
        System.out.println("The vehicle is not registered in the system.");
    }

    public void getVehicleBack(Vehicle vehicle){
        vehicle.setAvailability(Availability.AVAILABLE);


    }
}
