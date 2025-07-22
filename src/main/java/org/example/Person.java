package org.example;

public class Person {
    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        setAge(age);
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public boolean equals(Person other) {
        if (other == null) return false;
        return this.name.equals(other.name)
                && this.age == other.age
                && this.occupation.equals(other.occupation);
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s', age=%d, occupation='%s'}",
                id, name, age, occupation);
    }
}


