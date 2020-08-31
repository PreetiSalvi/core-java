package edu.java.core;

class Animal {
    protected String color = "Animal white";


    Animal() {
        System.out.println("animal is created");
    }

    void eat() {
        System.out.println("Animal eating...");
    }
}

class Dog extends Animal {
    String color = "Dog black";

    Dog() {
        //super();                  // Not required as there is implicit call by constructor
        System.out.println("dog is created");
    }

    void printColor() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }


     void eat() {
        System.out.println("Dog eating bread...");
    }

    void bark() {
        System.out.println("Dog barking...");
    }

    void work() {
        super.eat();
        bark();
        eat();
    }

}

public class SuperBasics {

    public void superUsedFor(){
        System.out.println("Access parent class data members , methods & constructors...");
        System.out.println("Condition , it should not be private...");
    }

    public static void main(String[] args) {
        SuperBasics obj = new SuperBasics();
        Dog d=new Dog();
        d.printColor();
        d.work();


    }
}
