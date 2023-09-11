package br.com.CarRental.Services;

import br.com.CarRental.Person.LegalPerson;
import br.com.CarRental.Person.Person;
import br.com.CarRental.Person.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> registeredPeople;

    public PersonService(){
        registeredPeople = new ArrayList<>();
    }

    public void addLegalPerson(LegalPerson person){
        registeredPeople.add(person);
    }

    public void addPhysicalPerson(PhysicalPerson pessoa){
        registeredPeople.add(pessoa);
    }
}
