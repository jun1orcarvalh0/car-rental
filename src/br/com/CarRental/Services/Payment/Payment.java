package br.com.CarRental.Services.Payment;


import br.com.CarRental.Services.RentalReport;
import br.com.CarRental.Vehicle.Vehicle;

public interface Payment<T> {

    double calculatePrice(Vehicle vehicle, int dias);
    void toPay(T person, Vehicle vehicle, double price);
    double getDiscount();
}
