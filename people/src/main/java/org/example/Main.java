package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // create the people container object
        System.out.println("Creating the people container object...");
        People people = new People();

        // create some example people using the builder method of people
        System.out.println("Creating example people...");
        Person person1 = people.createPerson("John", "Doe", LocalDate.of(1990, 1, 1));
        System.out.println("Created person: " + person1);
        Person person2 = people.createPerson("Jane", "Smith", LocalDate.of(1985, 5, 15));
        System.out.println("Created person: " + person2);
        Person person3 = people.createPerson("Alice", "Johnson", LocalDate.of(2000, 12, 25));
        System.out.println("Created person: " + person3);

        // print the total number of people
        System.out.println("Number of people: " + people.getNumOfPeople());
        System.out.println(" ");

        // print all the people
        System.out.println("Printing all people...");
        System.out.println(people);

        System.out.println(" ");
        // create a family
        System.out.println("Creating a family...");
        Family family = new Family();
        family.addMember(person1);
        System.out.println("Added to family: " + person1);
        family.addMember(person2);
        System.out.println("Added to family: " + person2);
        family.addMember(person3);
        System.out.println("Added to family: " + person3);

        // find a family member
        System.out.println(" ");
        String searchName = "Jane Doe";
        System.out.println("Searching for family member: " + searchName);
        Person foundMember = family.findMember(searchName);
        if (foundMember != null) {
            System.out.println("Found member: " + foundMember);
        } else {
            System.out.println("Member not found: " + searchName);
        }

        // remove a family member
        System.out.println(" ");
        System.out.println("Removing family member: John Doe");
        boolean removed = family.removeMember("John Doe");
        System.out.println("John Doe removed: " + removed);

        // see family after removal
        System.out.println("Printing family members after removal...");
        System.out.println("Family members after removal: " + family);
    }
}
