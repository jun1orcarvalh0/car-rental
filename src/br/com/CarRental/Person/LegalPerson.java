package br.com.CarRental.Person;

public class LegalPerson extends Person implements GetDocument{
    String cnpj;
    public LegalPerson(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    @Override
    public String getDocument() {

        return "";
    }
}
