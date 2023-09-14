package br.com.CarRental.Services;

import br.com.CarRental.Person.LegalPerson;
import br.com.CarRental.Person.*;
import br.com.CarRental.Person.IndividualPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonService {
    List<Person> registeredPeople;

    public PersonService(){
        registeredPeople = new ArrayList<>();
    }

    public void addPerson(Person newPerson){
        for (Person person : registeredPeople){
            if (Objects.equals(newPerson.getDocument(), person.getDocument())){
                System.out.println("This document is already in use!");
                return;
            }
        }
        registeredPeople.add(newPerson);
    }

    public void editPersonName(Person person, String name) {
        person.setName(name);
    }

    public void editLegalPersonDocument(LegalPerson editedPerson, String cnpj){
        for (Person person : registeredPeople){
            if (Objects.equals(person.getDocument(), cnpj)){
                System.out.println("This document is already in use!");
                return;
            }
        }
            editedPerson.setCnpj(cnpj);
    }
    public void editPhysicalPersonDocument(IndividualPerson editedPerson, String cpf){
        for (Person person : registeredPeople){
            if (Objects.equals(person.getDocument(), cpf)){
                System.out.println("This document is already in use!");
                return;
            }
        }
        editedPerson.setCpf(cpf);
    }

    public List<Person> getRegisteredPeople() {
        return registeredPeople;
    }
}
