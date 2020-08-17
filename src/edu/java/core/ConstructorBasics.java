
package edu.java.core;

//
public class ConstructorBasics{

    private int id;
    private String name;

    // Override the default constructor
    // Mandatory , if parameterised constructor is available and possibility of creating objects without parameters
    public ConstructorBasics() {
        System.out.println("Constructors are used to initialise objects.");
    }

    // Parameterised Constructor
    public ConstructorBasics(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overloading of constructors possible
    // Parameterised constructors overloaded
    public ConstructorBasics(int id) {
        this.id = id;
    }

    public void constructorRules()
    {
        System.out.println("Same name as classd");
        System.out.println("No return type");
        System.out.println("Cannot be abstract , static , final , synchronized...");
        System.out.println("Types ==> no-arg Constructor OR Paramaterised constructor");
    }

    public  void isConstructorAndMethodSame()
    {
        System.out.println("NOOO !!!");
        System.out.println("Constructor initialises object whereds method exposes object behaviour");
        System.out.println("Constructor call implicit whereas method CALL explicit");
        System.out.println("Constructor has no return type whereas method must have return type");
        System.out.println("Constructor name mandatory : same name as class whereas method not necessary to be same as classname.");
    }

    // it is possible to have method name same as classname but not mandatory
    // It is also possible to override such methods : provided they have same name and different arguments
    public void ConstructorBasics()
    {
        System.out.println("Method same name as class..");
    }

    public int ConstructorBasics(int num){
        System.out.println("Id is " + this.id + " name is "+ this.name);
        return this.id;
    }

    public void doesCOnstructorReturnValue (){
        System.out.println("YES .... current class instance");
        System.out.println("We cannot explicitly use return type but it returns value.");
    }
    public static void main(String[] args) {

        ConstructorBasics obj = new ConstructorBasics();
        obj.constructorRules();
        obj.isConstructorAndMethodSame();
    }
}



