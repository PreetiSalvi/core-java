package edu.java.core;

class A {
    A get() {
        System.out.println("In Method A get");
        return this;
    }

    void message() {
        System.out.println("Method a : message");
    }
}

class B1 extends A {
//    B1 get() {
//        System.out.println("In Method B get");
//        return this;
//    }

    void message() {
        System.out.println("Method B : message");
    }
}

    public class CovariantType {
    public static void main(String[] args) {

        new B1().get().message();
        new A().get().message();

        B1 obj = new B1();
        obj.get();

    }
}
