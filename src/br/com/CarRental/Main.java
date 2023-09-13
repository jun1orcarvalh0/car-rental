package br.com.CarRental;

import br.com.CarRental.Person.LegalPerson;
import br.com.CarRental.Services.PersonService;
import br.com.CarRental.Services.VehicleRentalService;
import br.com.CarRental.Vehicle.*;

public class Main {
    public static void main(String[] args) {
        VehicleRentalService vehicleRentalService = new VehicleRentalService();
        PersonService personService = new PersonService();
        LegalPerson person1 = new LegalPerson("Luis Filipe", "1234");
        personService.addPerson(person1);

        Vehicle vehicle1 = new MediumVehicle("ACD2821", "Camaro");
        Vehicle vehicle2 = new MediumVehicle("ACD2820", "Uno");
        Vehicle vehicle3 = new SportsUtilityVehicle("ACD2821", "SW4");

        vehicleRentalService.addVehicle(vehicle1);
        vehicleRentalService.addVehicle(vehicle2);
        vehicleRentalService.addVehicle(vehicle3);

        vehicleRentalService.editVehicleName(vehicle1, "Camaro V10");
        vehicleRentalService.editVehicleLicensePlate(vehicle1, "ACD2820");

//        System.out.println(vehicleRentalService.getVehicleList().get(0).getName());
//        System.out.println(vehicleRentalService.getVehicleList().get(0).getLicensePlate());
//
//        vehicleRentalService.editVehicleLicensePlate(vehicle1, "ACD2823");
//        System.out.println(vehicleRentalService.getVehicleList().get(0).getLicensePlate());
        System.out.println("Disponibilidade: " + vehicleRentalService.getVehicleList().get(0).getAvailability());
        vehicleRentalService.rentVehicle(vehicle1.getLicensePlate(), person1.getDocument());
        System.out.println(vehicleRentalService.getRentalReportList().get(0).getRentDate());
        System.out.println(vehicleRentalService.getRentalReportList().get(0).getRentTime());
        System.out.println("Disponibilidade: " + vehicleRentalService.getVehicleList().get(0).getAvailability());
    }
}
