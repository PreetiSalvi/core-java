package edu.java.core;

import java.io.*;

class Parent {
    void rule1()  {
        System.out.println("parent dosent declare exception");
    }

    void rule2()  {
        System.out.println("parent dosent declare exception");
    }

    void rule3() throws IOException  {
        System.out.println("parent declare a checked exception");
    }

    void rule4_1() throws IOException {
        System.out.println("parent declare a checked exception ");
    }

    void rule4_2() throws ArithmeticException {
        System.out.println("parent declare a unchecked exception");
    }

    void rule4_3() throws Exception {
        System.out.println("parent declare a exception ");
    }
}

class TestExceptionChild extends Parent {
//    void rule1() throws IOException {
    void rule1()  {
        System.out.println("Child cannot declare a checked exception");
        System.out.println("void rule1() throws IOException ==> gives exception");
    }

    void rule2() throws ArithmeticException {
        System.out.println("Child can declare a unchecked exception");
    }

    void rule3() throws ArithmeticException{
        System.out.println("Child can declare same checked exception or its sub class");
        System.out.println("Child can declare same checked exception or any other unchecked exception but not its parent class");
        System.out.println("void rule3() throws Exception ==> gives compile time error");
    }

    void rule4_1() {
        System.out.println("Not necessary for child to declare an exception if parent declares one ");
    }

    void rule4_2() {
        System.out.println("Not necessary for child to declare an exception if parent declares one ");
    }
    void rule4_3() {
        System.out.println("Not necessary for child to declare an exception if parent declares one ");
    }


    public void basicRules(){
        System.out.println("1.If Parent Class no throws ==> child class cannot declare Checked exception.");
        System.out.println("2.If Parent Class no throws ==> child class can declare un-Checked exception.");
        System.out.println("3.If Parent Class throws ==> child class can declare exception of same exception clss OR its sub classd.");
        System.out.println("3.If Parent Class throws ==> NOT mandatory for child class to throw.");
    }


    public static void main(String args[]) {
        Parent p = new TestExceptionChild();
        TestExceptionChild obj = new TestExceptionChild();
        System.out.println("------------");
        System.out.println("Basic Rules are");
        obj.basicRules();
        System.out.println("------------");

        p.rule1();
    }
}