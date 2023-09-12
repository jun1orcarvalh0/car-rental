package br.com.CarRental.Person;

public abstract class Person {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String name;
}