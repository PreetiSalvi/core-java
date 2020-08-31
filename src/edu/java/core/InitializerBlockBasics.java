package edu.java.core;

class Parent1 {
    Parent1() {
        System.out.println("parent class constructor invoked");
    }
    {
        System.out.println("Parent instance initializer block is invoked");
    }

}

class Child1 extends Parent1 {
    Child1() {
        //super();
        System.out.println("child class constructor invoked");
    }

    {
        System.out.println("Child instance initializer block is invoked");
    }
}

    public class InitializerBlockBasics {

        int speed;

        InitializerBlockBasics() {
            System.out.println("Constructor");
            System.out.println("speed is " + speed);
        }

        {
            System.out.println("Init Block");
            speed = 100;
        }

        public void orderOfExecution() {
            System.out.println("When object created ==> First constructor .... ");
            System.out.println("During Object creation ==> init block .... ");
            System.out.println("................. ");
            System.out.println("in case of inheritance.... ");
            System.out.println("When object created ==> First Parent constructor .... ");
            System.out.println("During Object creation ==> Parent init block .... ");
            System.out.println("When object created ==> Child constructor .... ");
            System.out.println("During Object creation ==> Child init block .... ");
            System.out.println(" THIS IS TRUE EVEN THOUGH THE EXECUTION MAY SEEM DIFFERENT....");
        }

        public static void main(String args[]) {
            InitializerBlockBasics b1 = new InitializerBlockBasics();
//        InitializerBlockBasics b2 = new InitializerBlockBasics();
            b1.orderOfExecution();

            Child1 obj = new Child1();
        }
    }
