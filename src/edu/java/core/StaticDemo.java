package edu.java.core;

public class StaticDemo {
    // Static variable : Instance or Class variable
    // Can be refrenced without any object
    // If used in same class ==> variable name is enough for reference
    // IF used in different class ==> ClassName.VarName is required for reference
    // It is a unique ( shared ) value across all objects & classes.
    static int cnt=0;
    private int id ;

    public StaticDemo() {
        cnt++;
        System.out.println("Counter increased " + cnt);
    }

    //static block : always takes priority over static methods : even before main
    static
    {
        System.out.println("Static block...");
        System.out.println("Advantage of static is saves memory...");
        // this and super cannot be used within static block
        // this.id = 100;
    }

    public static void  whatCanBeStatic(){
        System.out.println("What Can be Static ?");
        System.out.println("Variable !");
        System.out.println("Method!");
        System.out.println("Block!");
        System.out.println("Nested Class!");
        System.out.println("--------------------------");
        // this and super cannot be used within static methods
        // this.id = 100;
    }

    // Static method can be called in non/static methods also
    public void nonStaticMethod(){
        System.out.println("Call to static method from a non-static method because both belong to same class ...");
        whatCanBeStatic();
        System.out.println("Modifying static member in a non-static method of same class.");
        cnt++;
        System.out.println("After Modifying cnt is " + cnt);
    }

    // Static method to calculate the cube of the number
    static int cube(int x){
        return x*x*x;
    }

    //static method : main
    public static void main(String args[])
    {
        System.out.println("Static method");
        System.out.println("Access to static variable from same class " + cnt);
        cnt = 100;
        OtherClass obj = new OtherClass();
        obj.showStaticVar();
        System.out.println("Access to static variable from same class " + cnt + " after modification.");

        StaticDemo cbj1 = new StaticDemo();
        StaticDemo cbj2 = new StaticDemo();
        StaticDemo cbj3 = new StaticDemo();

        // Access to static method : from same class
        System.out.println("Access to static method : from same class");
        whatCanBeStatic();

        // Access to static method : from other class
        System.out.println("Access to static method : from other class");
        obj.callTOOtherStatic();

        // Access to static method : from non-static method of same class
        cbj1.nonStaticMethod();

        // Access to methods from same class
        int result=cube(5);
        System.out.println("Cube of number is " + result);
        result=StaticDemo.cube(10);
        System.out.println("Cube of number is " + result);



    }
}

class OtherClass {
    private int id;

   public void showStaticVar()
   {
       System.out.println("Access to static variable from different class " + StaticDemo.cnt);
   }

   public void callTOOtherStatic() {
       // Access to static method : from different class :
       StaticDemo.whatCanBeStatic();
       System.out.println("Modifying static member in a non-static method of different class.");
       StaticDemo.cnt++;
       System.out.println("After Modifying cnt is " + StaticDemo.cnt);
   }

   public void nonStaticMehod(){
       int result=StaticDemo.cube(5);
       System.out.println("Cube of number is " + result);
   }
}