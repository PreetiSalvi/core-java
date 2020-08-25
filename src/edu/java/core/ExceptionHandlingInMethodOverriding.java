package edu.java.core;

class ParentClass{

    public void rule1Demo() {
        System.out.println("Parent class no declare of Exception");
    }

}

class ChildClass extends ParentClass {

    public void rule1Demo() {
        System.out.println("Child Class cant declare a Checked Exception");
    }
}

public class ExceptionHandlingInMethodOverriding {

    public void basicRules(){
        System.out.println("1.If Parent Class no throws ==> child class cannot declare Checked exception.");
        System.out.println("2.If Parent Class no throws ==> child class can declare un-Checked exception.");
        System.out.println("3.If Parent Class throws ==> child class can declare exception of same exception clss OR its sub classd.");
        System.out.println("3.If Parent Class throws ==> NOT mandatory for child class to throw.");
    }
    public static void main(String[] args) {
        ExceptionHandlingInMethodOverriding obj = new ExceptionHandlingInMethodOverriding();
        System.out.println("------------");
        System.out.println("Basic Rules are");
        obj.basicRules();
        System.out.println("------------");
    }

   /* ParentClass pobj = new ParentClass();
    ChildClass cobj = new ChildClass();
    pobj.rule1Demo();
    cobj.rule1Demo():*/
}
