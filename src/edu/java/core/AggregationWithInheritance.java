package edu.java.core;

/*
Aggregation is when one class has a data member as object of another class
it can be combined with inheritance : but recommended NOT to

This example demonstrates a child that has a aggregation
*/

class Employee  {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Employee()
    {
        System.out.println("Default Employee Constructor....");
    }

    public void display(){
        System.out.println(" In employee display....");
    }
}
// Class having aggregation of class ADdress
class Person1 extends Employee{
    private String name;
    private int age;
    Address1 address;

    public Person1() {
        System.out.println("Person Default Constructor");
    }

    public Person1(String name, int age, Address1 address) {
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

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }
}

class Address1 {
    private int streetNum;
    private String streetName;
    private int pinCode;

    public Address1() {
        System.out.println("Default address constructor...");
    }

    public Address1(int streetNum, String streetName, int pinCode) {
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



public class AggregationWithInheritance {

    public static void main(String[] args) {
        // Valid types of object creations
        Person1 obj = new Person1();
        Employee eobj = new Person1();
        Person1 obj1 = new Person1("Preeti",30,new Address1(110,"MangalwarPeth",411));
        Person1 obj2 = new Person1("Priya",20, new Address1());


        // Get entities of independent class and refrence class
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getAddress().getStreetNum());
        System.out.println(obj1.getAddress().getStreetName());
        System.out.println(obj1.getAddress().getPinCode());

        // Additional can call parent class method
        System.out.println(obj1.getId());
    }




}
