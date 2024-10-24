package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create instances of Person
        Person person1 = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        Person person2 = new Person("Jane", "Smith", LocalDate.of(1985, 5, 15));
        Person person3 = new Person("Alice", "Johnson", LocalDate.of(2000, 12, 25));

        // Create an instance of People and add Person instances to it
        People people = new People();
        people.addPerson(person1);
        people.addPerson(person2);
        people.addPerson(person3);

        // Display the number of people
        System.out.println("Number of people: " + people.getNumOfPeople());

        // Display the details of each person
        for (Person person : people.getPeople()) {
            System.out.println(person);
        }
    }
}