package edu.java.core;

public class CommandLineArgsBasics {
    public static void main(String[] args) {

        System.out.println("Your first argument is: "+args[0]);
                // when no argument passed : ArrayIndexOutOfBoundsException

        // Print all arguments
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);



}
}
