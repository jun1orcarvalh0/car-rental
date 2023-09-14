package br.com.CarRental.Person;

public class IndividualPerson extends Person{
    String cpf;

    public IndividualPerson(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public String getDocument() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
