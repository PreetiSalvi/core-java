package edu.java.core;

/*
Aggregation is when one class has a data member as object of another class
*/

// Class having aggregation of class ADdress
class Person{
    private String name;
    private int age;
    Address address;

    public Person() {
        System.out.println("Person Default Constructor");
    }

    public Person(String name, int age, Address address) {
        System.out.println("Person parameterised Constuctor");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {
    private int streetNum;
    private String streetName;
    private int pinCode;

    public Address() {
        System.out.println("Default address constructor...");
    }

    public Address(int streetNum, String streetName, int pinCode) {
        System.out.println("Address Parameterised Constructor");
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.pinCode = pinCode;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}

public class AggregationBasics {
    public static void main(String[] args) {

        // Valid types of object creations
        Person obj = new Person();
        Person obj1 = new Person("Preeti",30,new Address(110,"MangalwarPeth",411));
        Person obj2 = new Person("Priya",20, new Address());

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getAddress());

        // Get entities of independent class and refrence class
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getAddress().getStreetNum());
        System.out.println(obj1.getAddress().getStreetName());
        System.out.println(obj1.getAddress().getPinCode());

        System.out.println(obj2.getName());
        System.out.println(obj2.getAge());
        System.out.println(obj2.getAddress().getStreetNum());
        System.out.println(obj2.getAddress().getStreetName());
        System.out.println(obj2.getAddress().getPinCode());

    }
}
