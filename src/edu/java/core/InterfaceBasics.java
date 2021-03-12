package edu.java.core;

/*
    Data members are by default public static and final ==> hence must be initialised else Compile time error
    Methods are by default public & abstract
 */
interface InterfaceParent{
    int minValue=0;
    void print();
    // Constructor not allowed
}

interface Drawable{
    void draw();

    default void msg(){System.out.println("default method");}

}

interface Showable extends InterfaceParent{
    void show();
}

/*
    Class needs to override all the methods of Implement hirerachy..
    else there is compile time error
 */
class Hierarchy implements Showable{

    @Override
    public void show() {
        System.out.println("SHOW Welcome");
    }

    @Override
    public void print() {
        System.out.println("PRINT Welcome");
    }
}
//Implementation: by second user
class Rectangle implements Drawable{
    public void draw(){System.out.println("In draw rectangle");}


}
class Circle implements Drawable{
    public void draw(){System.out.println("In draw circle");}
}

class MultipleInheritance implements InterfaceParent,Drawable{

    @Override
    public void print() {
        System.out.println("Overriden method from Parent Interface : InterfaceParent");
    }

    @Override
    public void draw() {
        System.out.println("Overriden method from Parent Interface : Drawable");
    }
}

public class InterfaceBasics implements InterfaceParent {
    public void whatIsAllowedInInterface(){
        System.out.println("Only abstract methods .. Decleration no method body");
        System.out.println("Data members");
        System.out.println("From Java8 ==> default and static method ");
        System.out.println("From Java9 ==> private methods");
    }
    public InterfaceBasics() {
        System.out.println("Interfaces used to achieve abstraction & implement multiple inheritance");
    }

    public static void main(String[] args) {
        InterfaceBasics obj = new InterfaceBasics();
        obj.print();

        Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
        d=new Rectangle();
        d.draw();
        d.msg();

        MultipleInheritance mIObj = new MultipleInheritance();
        mIObj.print();
       mIObj.draw();
       mIObj.msg();

    }

    @Override
    public void print() {
        System.out.println("Method overriden from Parent (Interface) ");
    }
}
