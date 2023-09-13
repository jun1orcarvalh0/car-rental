package br.com.CarRental.Services;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class RentalReport {
    String document;

    public String getDocument() {
        return document;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalTime getRentTime() {
        return rentTime;
    }

    String licensePlate;
    LocalDate rentDate;
    LocalTime rentTime;
    LocalDateTime devolutionDate;

    public RentalReport(String licensePlate, String document) {
        this.document = document;
        this.licensePlate = licensePlate;
        this.rentDate = LocalDate.now();
        this.rentTime = LocalTime.now();
    }

//    public devolution(String document, String licensePlate) {
//
//    }
}
