package br.com.CarRental;

import br.com.CarRental.Person.*;
import br.com.CarRental.Services.PersonService;
import br.com.CarRental.Services.VehicleRentalService;
import br.com.CarRental.Vehicle.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        VehicleRentalService vehicleRentalService = new VehicleRentalService();
        PersonService personService = new PersonService();
        LegalPerson person1 = new LegalPerson("Luis Filipe", "1234");
        LegalPerson person2 = new LegalPerson("Jhonantan", "1234");
        LegalPerson person3 = new LegalPerson("Antonio", "1235");

        personService.addPerson(person1);
        personService.addPerson(person2);
        personService.addPerson(person3);


       /* for (Person person : personService.getRegisteredPeople()){
            System.out.println(person.getName());
        }*/

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
        vehicleRentalService.rentVehicle(vehicle1.getLicensePlate(), person1, new Date(), "15:30");
        System.out.println(vehicleRentalService.getRentalReportList().get(0).getRentDate());
        System.out.println(vehicleRentalService.getRentalReportList().get(0).getRentTime());
        System.out.println("Disponibilidade: " + vehicleRentalService.getVehicleList().get(0).getAvailability());
        vehicleRentalService.rentVehicle(vehicle2.getLicensePlate(), person2, new Date(), "12:30");
        System.out.println("Rental report " + vehicleRentalService.getRentalReportList().get(0).getLicensePlate());
        System.out.println("Rental report " + vehicleRentalService.getRentalReportList().get(1).getLicensePlate());
        vehicleRentalService.getVehicleBack(vehicle1);
        System.out.println("Disponibilidade: " + vehicleRentalService.getVehicleList().get(0).getAvailability());
        // Continue...

    }
}
