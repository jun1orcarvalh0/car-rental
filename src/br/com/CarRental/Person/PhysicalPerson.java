package br.com.CarRental.Person;

public class PhysicalPerson extends Person {
    String cpf;

    public PhysicalPerson(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}
