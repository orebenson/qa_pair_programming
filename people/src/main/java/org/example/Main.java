package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        People allPeople = new People();

        Person person1 = new Person("Jack", "Benton", LocalDate.of(2017, 1, 13));

        allPeople.addPerson(person1);

        System.out.println(allPeople.getNumOfPeople());


    }
}