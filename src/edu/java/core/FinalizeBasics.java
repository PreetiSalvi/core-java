package edu.java.core;

public class FinalizeBasics {
    public void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        FinalizeBasics f1 = new FinalizeBasics();
        FinalizeBasics f2 = new FinalizeBasics();
        f1 = null;
        f2 = null;
        System.gc();

        FinalizeDemo obj = new FinalizeDemo();
        System.gc();
    }
}

class FinalizeDemo{
    public void finalize() {
        System.out.println("Finalize Demo : finalize called");
    }
}