package org.example;

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

    public int getNumOfPeople() {
        return this.people.size();
    }
}
