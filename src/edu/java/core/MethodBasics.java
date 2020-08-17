package edu.java.core;

import java.util.Scanner;

public class MethodBasics {

    private int id;
    private String name;

    // Methods : Accessors and mutators i.e getters and setters for instance variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //user defined method : static
    public static void findEvenOdd(int num)
    {
        //method body
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }

    // non - static method
    public void findEvenOdd_nonstatic(int num)
    {
        //method body
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }

    //user defined method : that accepts 2 input params and returns the sum
    public int add(int n1, int n2)   //n1 and n2 are formal parameters
    {
        int s;
        s=n1+n2;
        return s; //returning the sum
    }

    public static void main(String[] args) {
        MethodBasics obj = new MethodBasics();

        int num = 10;

        //method calling : since the method is static and within same class , you do not
        // need object to invoke it
        // If the method were in different class , it needs be called with ClassName.methodName(args)
        findEvenOdd(num);
        InputValueFromUser.findEvenOdd(122);

        // method calling : called by object reference
        obj.findEvenOdd_nonstatic(23);


        // call to methods returning values
        int sum=obj.add(10,121);
        System.out.println("Sum is " + sum);

    }
}

// abstract class : can have one or more abstract methods + non-abstract methods
// It is not mandatory for an abstract class to have an abstract method
// But the other way round is not valid
// i.e An abstract method must be present in an abstract class ONLY.
abstract class AbstractClass{

   public abstract void show();
   public abstract void showLog();

    public void display(){
        System.out.println("Non abstract method in abstract class : display");
    }
}

// It is mandatory to implement all the abstract methods from parent
// class if the class is non-abstract
class AbstractChildClass extends AbstractClass {
    public void show(){
        System.out.println("Abstract method Implements in Child");
    }

    public void showLog(){
        System.out.println("Abstract method Implemented in Child ");
    }

}
// It is not mandatory to implement any of the abstract methods from parent
// class if the class is abstract
abstract class AbstractChild2 extends AbstractClass {
    
}