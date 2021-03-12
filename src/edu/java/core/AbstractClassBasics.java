package edu.java.core;
/*
    An abstract class can have
        - members
        - abstract methods
        - non-abstract methods ( only declaration : no method body)
        - constructors
        - static methods
        - final methods
        - ITS INSTANCES CANNOT BE CREATED
        - If any class has a abstract method : Class MUST be abstract : VIce -versa not mandatory
        - CAN BE USED TO provide implementation of interfaces
 */
abstract class AbstractClassDef{

    int id;
    String name;

    public AbstractClassDef() {
        System.out.println("Default Construtor for Abstract class");
    }

    public void whatIsAbstraction(){
        System.out.println("meachanism of data hiding....");
        System.out.println("Foucs on WHAT an object does instead of HOW it does it");
        System.out.println("Implemented with Abstract class and interfaces..");
    }

    public abstract void abstractMethodEg();

    public void overRiddenMethod(){
        System.out.println("Method of Parent");
    }

}

/*
    Any class that extends an abstract class MUST implement the abstract methods of abstract class : else compile time error

 */
public class AbstractClassBasics extends AbstractClassDef {
    String name = "Preeti";

    public AbstractClassBasics() {
        System.out.println("Constructor : AbstractClassBasics");
    }

    @Override
    public void abstractMethodEg() {
        System.out.println("Overriden abstract method in child class : AbstractClassBasics");
    }

    public void overRiddenMethod(){
        System.out.println("Method of Child");
    }

    public static void main(String[] args) {
        // Calls both Parent and child constructors
        AbstractClassBasics obj = new AbstractClassBasics();
        AbstractClassDef obj1 = new AbstractClassBasics();
        // Child can call non abstract methods & access members of Parent
        obj.whatIsAbstraction();
        System.out.println(obj.id);

        //Overriden data members
        System.out.println(obj1.name);
        System.out.println(obj.name);

        //Overriden methods
        obj.overRiddenMethod();
        obj1.overRiddenMethod();
    }
}
