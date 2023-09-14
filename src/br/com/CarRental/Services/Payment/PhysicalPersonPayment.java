package br.com.CarRental.Services.Payment;

import br.com.CarRental.Person.IndividualPerson;
import br.com.CarRental.Services.RentalReport;
import br.com.CarRental.Services.VehicleRentalService;
import br.com.CarRental.Vehicle.Vehicle;

import java.text.DecimalFormat;


public class PhysicalPersonPayment implements Payment<IndividualPerson>{
    DecimalFormat df = new DecimalFormat("#.##");
    VehicleRentalService vehicleRentalService = new VehicleRentalService();
    final double discount = 0.05;

    @Override
    public double calculatePrice(Vehicle vehicle, int dias) {
        double price;
        if (dias >= 5){
            price = (vehicle.getBaseValue() * dias) - (vehicle.getBaseValue() * discount);
        } else {
            price = vehicle.getBaseValue() * dias;
        }
        return price;
    }

    @Override
    public void toPay(IndividualPerson person, Vehicle vehicle, double price) {
        System.out.println("The client " + person.getName() + "is paying: " + df.format(price)
                + "$ " + "for the vehicle with the license plate: " + vehicle.getLicensePlate());
    }
    @Override
    public double getDiscount(){
        return discount;
    }
}
