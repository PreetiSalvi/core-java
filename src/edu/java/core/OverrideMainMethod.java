package edu.java.core;
/*
    It is not possible to override the main method in order to implement runtime polymorphism
    It is possible to have main method in both parent and child class
    no compile time error and can be invoked independently.
 */
public class OverrideMainMethod {
    public static void main(String[] args) {
        System.out.println("Parent main method");
    }
}

class OverrideChildClass extends OverrideMainMethod{
    public static void main(String[] args) {
        System.out.println("Child Main Method");
    }

    OverrideChildClass obj = new OverrideChildClass();
    //obj.main();


}