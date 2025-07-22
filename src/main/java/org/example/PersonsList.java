package org.example;

import java.util.*;
import java.io.*;


public class PersonsList {
    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        people.add(person);
    }

    public Person findByName(String name) {
        if (name == null || !name.matches("^[A-Za-z]+\\s[A-Za-z]+$")) {
            throw new IllegalArgumentException("Name must be in 'firstName lastName' format");
        }
        for (Person p : people) {
            if (p.getName().equals(name)) return p;
        }
        return null;
    }

    public Person clone(Person p, int newId) {
        return new Person(newId, p.getName(), p.getAge(), p.getOccupation());
    }

    public void writeToFile(Person p, String fileName) {
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            out.println(p.toString());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

