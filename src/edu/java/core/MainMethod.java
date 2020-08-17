package edu.java.core;

public class MainMethod {
    static                  //static block : always takes priority over static methods : even before main
    {
        System.out.println("Static block");
    }

    /*
        If main method is commented : it compiles but dosent run
     */
    public static void main(String args[])  //static method
    {
        System.out.println("Static method");
    }


}
