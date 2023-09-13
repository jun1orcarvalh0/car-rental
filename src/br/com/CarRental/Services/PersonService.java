package br.com.CarRental.Services;

import br.com.CarRental.Person.LegalPerson;
import br.com.CarRental.Person.Person;
import br.com.CarRental.Person.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public List<Person> getRegisteredPeople() {
        return registeredPeople;
    }

    List<Person> registeredPeople;

    public PersonService(){
        registeredPeople = new ArrayList<>();
    }

    public void addPerson(Person person){
        registeredPeople.add(person);
    }

    public void editPersonName(Person person, String name) {
        person.setName(name);
    }
}
