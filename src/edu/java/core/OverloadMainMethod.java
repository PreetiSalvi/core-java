package edu.java.core;

public class OverloadMainMethod {

    /*
        It is possible to overload the main method with condition : signature of main method
        should be different
     */
    public static void main(int a)  //overloaded main method
    {
        System.out.println("Overloaded main method invoked");
        System.out.println(a);
    }

    public static void main(String a)  //overloaded main method
    {
        System.out.println("Overloaded main method with string parameter invoked");
        System.out.println(a);
    }

    public static void main(String args[]) {
        System.out.println("main method invoked");
        main(6);
        main("Preeti");
    }
}


