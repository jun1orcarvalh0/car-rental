package br.com.CarRental.Services;

import br.com.CarRental.Person.PersonDocument;

import java.util.Date;


public class RentalReport {
    String licensePlate;
    Date rentDate;
    String rentTime;
    Date devolutionDate;
    PersonDocument document;
/*    LegalPersonPayment legalpayment = new LegalPersonPayment();
    PhysicalPersonPayment physicalpayment = new PhysicalPersonPayment();*/

    public RentalReport(String licensePlate, PersonDocument document, Date date, String hour) {
        this.document = document;
        this.licensePlate = licensePlate;
        this.rentDate = date;
        this.rentTime = hour;
    }

    public PersonDocument getDocument() {
        return document;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void devolution(PersonDocument document, String licensePlate, Date date, String hour) {
        this.devolutionDate = date;
        this.document = document;

        //System.out.println("Status: " + );

    }
}
