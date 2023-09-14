package br.com.CarRental.Person;

public abstract class Person implements PersonDocument {
    String name;

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

}