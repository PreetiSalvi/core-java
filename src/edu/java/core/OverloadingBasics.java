package edu.java.core;

public class OverloadingBasics {

    private int id;
    private String name;
    public OverloadingBasics() {
        System.out.println("method overloading implements : compile time polymorphism.");
        System.out.println("occurs when same class has same method name with different no of arguments and their data-types");
        System.out.println("Method Overloading is not possible by changing the return type of the method ONLY.");
    }

    // Constructors can also be overloaded
    public OverloadingBasics(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public OverloadingBasics(int id) {
        this.id = id;
        this.name = "Default name";
    }

    public OverloadingBasics(String name) {
        this.id = 0;
        this.name = name;
    }

    static int add(int a, int b) {
        System.out.println("In method with 2 int params");
        return a + b;
    }

    /*
    compile time error : even though the return type of the method is different
            because the input arguments are exactly same
    static double add(int a, int b) {
        System.out.println("In method with 2 int params");
        return a + b;
    }
    */

    static int add(int a, int b, int c) {
        System.out.println("In method with 3 int params");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.println("In method with 2 double params");
        return a + b;
    }

    // Overloading of main method is possibles
    public static void main(String args) {
        System.out.println("main with String");
    }

    public static void main() {
        System.out.println("main without args");
    }

    void sum(int a, long b) {
        System.out.println("in sum with one int and long param");
        System.out.println(a + b);
    }

    void sum(long a, int b) {
        System.out.println("in sum with one int and long param");
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum1(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum1(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        OverloadingBasics obj = new OverloadingBasics();

        // Call to the function is decided based on the arguments passed to the method
        System.out.println(add(11,11));
        System.out.println(add(11,11,11));
        System.out.println(add(22,22));
        System.out.println(add(22.2,22.5));

        // CALL  to overloaded main
        main("Preeti");
        main();

        // implicit type casting happens when method accepts bigger datatype as input param as compared to the value passed
        // int passed from method , but method input param is long ==> No error : Implicit comparision

        int a = 22;
        int b = 23;
        obj.sum(a,(long)b);

/*
        // implicit type casting is not possible when when method accepts smaller datatype as input param as compared to the value passed
        // long passed from method , but method input param is int ==> compile time error :
        long l1 = 23;
        long l2 = 25;
        obj.sum(l1,l2);*/


        /*
            If exact match is found : there is no need for implicit conversion
            int passed to function
            method with int is availble then its called
            if method with is not available then only implicit conversion is called , if no ambuiguity
            if amguity : compile time error
         */
        obj.sum1(a,b);

        /*obj.sum(20,20);//now ambiguity  : compiler confused wether to call int method or long method */

    }
}
