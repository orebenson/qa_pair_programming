package org.example;

import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return this.formatInputs(this.firstName, this.lastName, this.dateOfBirth);
    }

    private String formatInputs(String firstName, String lastName, LocalDate dob) {
        return String.format("%-10s %-10s %-10s", firstName, lastName, dob.toString());
    }
}
