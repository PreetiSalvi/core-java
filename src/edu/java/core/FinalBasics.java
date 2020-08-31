package edu.java.core;

class Bike {
    final void run() {
        System.out.println("Bike class running");
    }
}

class Honda extends Bike {
    // Cannot override method : but can be called from here
    // void run() {     COMPILE TIME ERROR
    void run1() {
        System.out.println("Honda running safely with 100kmph");
    }
}


final class Parent2{
    public Parent2() {
        System.out.println("Parent constructor ......");
    }
}


class Child2{
    public Child2(){
        System.out.println("Child constructor ");
    }
}
    public class FinalBasics {

    final int constVal;
    final String constStringVal;

    // Final members can be initilaized in EITHER a constructor OR a init block
    public FinalBasics() {
        constVal = 100;
       // constStringVal="not allowed";
;    }

    {
        constStringVal="Preeti";
    }

    public void display(){
        System.out.println("What can be final???");
        System.out.println("Class ==> cant be extended");
        System.out.println("Method ==> cant be overridden");
        System.out.println("Variable ==> value cant be changed");
    }
    public static void main(String[] args) {

    }
}
