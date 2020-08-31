package edu.java.core;
/*

Types of inheritance
1. Single
2. Multi-level
3. Hybrid : One parent : multiple child
3. Multiple : One child : multiple parent ==> NOT direct inheritance ( in java with interfaces )

Java does not support multiple inheritance with extends keyword as it cannot resolve runtime polymorphism
in case of method overriding

*/

class GrandFather {

    int gfAttribute = 100;

    GrandFather(){
        System.out.println("In Grandfather constructor");
    }

    public void display(){
        System.out.println("In grandfather display");
    }

    public void grandFatherMethod(){
        System.out.println("In grandfather independent method");
    }
}

class Father extends GrandFather {

    int fAttribute = 50;

    Father(){
        System.out.println("In father constructor");
    }

    public void display(){
        System.out.println("In father display");
    }

    public void fatherMethod(){
        System.out.println("In father independent method");
    }
}

class Son extends Father {

    int sAttribute = 100;

    Son(){
        System.out.println("In son constructor");
    }

    public void display(){
        System.out.println("In son display");
    }

    public void sonMethod(){
        System.out.println("In son independent method");
    }
}

public class InheritanceBasics {

    public static void main(String[] args) {

        // With Child class , all the constructors of parent are called
        Son obj = new Son();
        Father obj1 = new Son();
        GrandFather obj2 = new Son();
        GrandFather obj3 = new Father();


        // Runtime polymorphism : When an overridden method is called , the Object type method is called
        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();

        // CHild class can call any of its independent method AND even independent methods of parent
        obj.sonMethod();
        obj.fatherMethod();
        obj.grandFatherMethod();
        obj1.fatherMethod();


        // Paren class object refrence can call a child class method if object type is of child class
        ((Son) obj1).sonMethod();
        ((Son) obj2).fatherMethod();
        ((Father) obj3).fatherMethod();     // Here obj3 cannot call son method as object type is of Father



    }

}
