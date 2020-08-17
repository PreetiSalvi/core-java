package edu.java.core;

abstract public class NoMainMethod extends javafx.application.Application  {

    /*
        This class can be run without a main method as it is abstract and extends other class
     */
    static      //static block
    {
        System.out.println("Java");
        System.exit(0);
    }
}
