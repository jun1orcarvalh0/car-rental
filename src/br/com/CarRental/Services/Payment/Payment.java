package br.com.CarRental.Services.Payment;

public interface Payment<T> {
    void toPay(T person);
}
