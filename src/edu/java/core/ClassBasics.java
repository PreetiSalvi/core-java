package edu.java.core;

class Student{
    int id;
    String name;

    public Student() {
        System.out.println("Default constructor overloaded");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void insertRecord(int r, String n){
        id=r;
        name=n;
        System.out.println("In Student : id= " + this.id + " name = " + this.name);
    }

    void displayRecord(){
         System.out.println("In Student displayRecord : id= " + this.id + " name = " + this.name);
    }
}

public class ClassBasics {
    // Fields or instance variables
    private int classField1;
    private String classField2;

    public ClassBasics() {
        System.out.println("Constructor with no parameters.");
    }

    public ClassBasics(int classField1, String classField2) {
        this.classField1 = classField1;
        this.classField2 = classField2;
    }

    void method1()
    {
        System.out.println(" I am in method 1");
    }

    int method2(int inputValue){
        int returnValue=inputValue+10;
        return returnValue;
    }

    void classContents(){
        System.out.println("Class can contain......");
        System.out.println("Fields having data type like classField1,classField2");
        System.out.println("Methods that can accept input and return value like method1,method2");
        System.out.println("Constructors that can be multiple with or without input parameters.");
        System.out.println("Simple block of code.");
        System.out.println("Nested Or inner class.");
    }


    public static void main(String[] args) {

        Student s1=new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);

        // Intialise object ==> through refrence : only if fields are not private
         s1.id=101;
         s1.name="Sonoo";
         System.out.println(s1.id+" "+s1.name);//printing members with a white space

        s1.id=102;
        s1.name="monoo";
        System.out.println(s1.id+" "+s1.name);//printing members with a white space

        // Initialise through method
        s1.insertRecord(111,"Karan");

        // Initialise through Constructor
        Student s2 = new Student(333,"Arjun");
        s2.displayRecord();
    }
}
