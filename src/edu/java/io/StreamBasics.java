package edu.java.io;

import java.io.IOException;

public class StreamBasics {

    public static void main(String[] args) {
        System.out.println("There are 3 types of streams....");
        System.out.println("1. Output ==> writes data to file , console array or device socket");
        System.out.println("2. Input ==> reads data from file , console or array or device socket");
        System.out.println("3. Error ==> writes error messages to file , console, array or device socket");

        // Output stream
        System.out.println("simple message");
        // Error stream
        System.err.println("error message");
        System.err.println("error message 1");

        int i= 0;//returns ASCII code of 1st character
        try {
            System.out.println("Enter something");
            // Input stream
            i = System.in.read();       // Reads a single char : returns Ascii charachter
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
        System.out.println((char)i);

        System.err.println("error message 2");

    }
}
