package org.example;

public class Main {
    public static void main(String[] args) {
        PersonsList persons = new PersonsList();

        Person alice = new Person(1, "Alice Smith", 25, "Engineer");
        Person bob = new Person(2, "Bob Johnson", 30, "Doctor");

        persons.add(alice);
        persons.add(bob);

        persons.writeToFile(alice, "persons.txt");
        persons.writeToFile(bob, "persons.txt");

        System.out.println("Persons written to persons.txt");
    }
}
