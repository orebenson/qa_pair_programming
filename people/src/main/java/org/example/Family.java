package org.example;

import org.example.Person;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<Person> familyList;

    public Family() {
        this.familyList = new ArrayList<>();
    }

    public void addMember(Person person) {
        familyList.add(person);
    }

    public boolean removeMember(String name) {
        return familyList.removeIf(person -> person.getName().equals(name));
    }

    public int countMembers() {
        return familyList.size();
    }
    public List<Person> getFamilyMembers() {
        return new ArrayList<>(familyList);
    }

    public Person findMember(String name) {
        for (Person person : familyList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Family Members:\n");
        for (Person person : familyList) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}