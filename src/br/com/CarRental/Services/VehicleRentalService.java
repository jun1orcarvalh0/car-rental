package br.com.CarRental.Services;

import br.com.CarRental.Vehicle.Availability;
import br.com.CarRental.Vehicle.Vehicle;

import java.util.ArrayList;
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

    public void rentVehicle(String licensePlate, String document){
        for (Vehicle vehicle : vehicleList){
            if(vehicle.getLicensePlate().equals(licensePlate)){
                if (vehicle.getAvailability().equals(Availability.RENTED)) {
                    System.out.println("O Veículo já está alugado.");
                    return;
                }
                vehicle.setAvailability(Availability.RENTED);
                rentalReportList.add(new RentalReport(licensePlate, document));
                return;
            }
        }
        System.out.println("Veiculo não cadastrado no sistema.");
    }
}
