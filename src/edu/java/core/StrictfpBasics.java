package edu.java.core;

public class StrictfpBasics {
    public StrictfpBasics() {
        System.out.println("Strictfp used to get same results for Floating Point on different platforms");
        System.out.println("Gives better control over the floating-point arithmetic");
    }

    public void whereAllowed(){
        System.out.println("Strictfp can be applied on ");
        System.out.println("1. Methods");
        // strictfp void m(){}//strictfp applied on method
        System.out.println("2. Classes");
       // strictfp class A{}//strictfp applied on class
        System.out.println("3. Interfaces");
        // strictfp interface M{}//strictfp applied on interface
    }

    public void whereNotAllowed(){
        System.out.println("Strictfp cannot be applied on ");
        System.out.println("1. Variables");
        System.out.println("2. Abstract Classes");
        System.out.println("3. Constructors.");
    }

}
