package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(-5);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("full name = " + person.getFullName());
    }
}
