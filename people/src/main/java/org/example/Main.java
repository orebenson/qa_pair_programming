package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // create the people container object
        People people = new People();

        // create some example people using the builder method of people
        Person person1 = people.createPerson("John", "Doe", LocalDate.of(1990, 1, 1));
        Person person2 = people.createPerson("Jane", "Smith", LocalDate.of(1985, 5, 15));
        Person person3 = people.createPerson("Alice", "Johnson", LocalDate.of(2000, 12, 25));


        // print the total number of people
        System.out.println("Number of people: " + people.getNumOfPeople());

        // print all the people
        System.out.println(people);

        // create a family
        Family family = new Family();
        family.addMember(person1);
        family.addMember(person2);
        family.addMember(person3);

        // find a family member
        String searchName = "Jane Doe";
        Person foundMember = family.findMember(searchName);
        if (foundMember != null) {
            System.out.println("Found member: " + foundMember);
        } else {
            System.out.println("Member not found: " + searchName);
        }

        // remove a family member
        boolean removed = family.removeMember("John Doe");
        System.out.println("John Doe removed: " + removed);

        // see family after removal
        System.out.println("Family members after removal:");
        for (Person person : family.getFamilyMembers()) {
            System.out.println(person);
        }
    }
}