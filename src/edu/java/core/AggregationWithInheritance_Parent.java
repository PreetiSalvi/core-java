package edu.java.core;

/*
Aggregation is when one class has a data member as object of another class
it can be combined with inheritance : but recommended NOT to

This example demonstrates a parent that has a aggregation
*/
// Class having aggregation of class ADdress
class Person2{
    private String name;
    private int age;
    Address2 address;

    public Person2() {
        System.out.println("Person Default Constructor");
    }

    public Person2(String name, int age, Address2 address) {
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

    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }
}

class Address2 {
    private int streetNum;
    private String streetName;
    private int pinCode;

    public Address2() {
        System.out.println("Default address constructor...");
    }

    public Address2(int streetNum, String streetName, int pinCode) {
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

class Employee1 extends Person2{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Employee1()
    {
        System.out.println("Default Employee Constructor....");
    }

    public void display(){
        System.out.println(" In employee display....");
    }
}

public class AggregationWithInheritance_Parent {

    public static void main(String[] args) {
        // Valid Declrations
        Employee1 cobj = new Employee1();
        Person2 pobj = new Employee1();

        Address2 obj = new Address2();

        // Set values for data members
        cobj.setId(10);
        cobj.setName("Preeti");
        cobj.setAge(30);
        cobj.setAddress(new Address2 (110,"MP",411));
        pobj.setAddress(obj);

        // Get values for data members
        System.out.println(cobj.getId());
        System.out.println(cobj.getAddress().getStreetName());
        System.out.println(pobj.getAddress().getPinCode());

    }
}
