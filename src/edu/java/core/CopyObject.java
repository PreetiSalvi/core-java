package edu.java.core;

public class CopyObject {
    private int id;
    private String name;
    protected int Salary;

    // Default constructor
    public CopyObject() {
        System.out.println("Default constructor overriden.");
    }

    // Parameterised constructor : to initialise object
    public CopyObject(CopyObject object) {
        this.id = object.id;
        this.name = object.name;
        System.out.println("Parameterised constructor : to initialise object");
    }

    // Parameterised constructor : to copy object
    public CopyObject(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterised constructor : to copy object");
    }

    public static void main(String[] args) {
        CopyObject obj1 = new CopyObject(10,"preeti");

        System.out.println(obj1.id);
        System.out.println(obj1.name);

        // Copy Object with constructor
        CopyObject obj2 = new CopyObject(obj1);
        System.out.println(obj2.id);
        System.out.println(obj2.name);

        // Copy Object by assiginig member values
        // Here we can assign values even if they are private as they are same class
        // If they were in other class it would give error
        // If they were protected , they would not give error in child class
        CopyObject obj3 = new CopyObject();
        obj3.id = obj1.id;
        obj3.name = obj1.name;
        System.out.println(obj3.id);
        System.out.println(obj3.name);

    }
}

class CopyObjectValue {

    void copyFromCopyObject()
    {
        // Copy Object by assiginig member values
        // If they are in other class it would give error as members are private
        CopyObject obj4 = new CopyObject();
        //obj4.id = 10;
        //obj4.name = "Preeti";
    }
}

class CopyObjectVal extends CopyObject {

    void copyFromCopyObject()
    {
        // Copy Object by assiginig member values
        // If they are in other class it would give error as members are private
        CopyObject obj4 = new CopyObject();
        //obj4.id = 10;
        //obj4.name = "Preeti";
        // If they are protected , they would not give error in child clas
        obj4.Salary = 10000;
    }
}
