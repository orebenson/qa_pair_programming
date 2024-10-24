package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> people;

    public People(){
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getPeople() {
        return this.people;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Person person : this.people) {
            if (!output.isEmpty()) output.append(", ");
            output.append(person.getName()).append(" ");
        }
        return output.toString();
    }

    public int getNumOfPeople() {
        return this.people.size();
    }

    public Person createPerson(String firstName, String lastName, LocalDate dateOfBirth) {
        Person person = new Person(firstName, lastName, dateOfBirth);
        this.people.add(person);
        return person;
    }
}
