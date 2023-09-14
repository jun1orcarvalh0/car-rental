package br.com.CarRental.Services.Payment;


import br.com.CarRental.Person.LegalPerson;
import br.com.CarRental.Services.RentalReport;
import br.com.CarRental.Vehicle.Vehicle;

import java.text.DecimalFormat;

public class LegalPersonPayment implements Payment<LegalPerson>{
    DecimalFormat df = new DecimalFormat("#.##");

    final double discount = 0.1;

    @Override
    public double calculatePrice(Vehicle vehicle, int dias) {
        double price;
        if (dias >= 3){
            price = (vehicle.getBaseValue() * dias) - (vehicle.getBaseValue() * discount);
        } else {
            price = vehicle.getBaseValue() * dias;
        }
        return price;
    }

    @Override
    public void toPay(LegalPerson person, Vehicle vehicle, double price) {
        System.out.println("The client " + person.getName() + "is paying: " + df.format(price)
                + "$ " + "for the vehicle with the license plate: " + vehicle.getLicensePlate());
    }
    @Override
    public double getDiscount() {
        return discount;
    }
}
