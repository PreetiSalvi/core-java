package edu.java.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamBasics {
    public static void main(String[] args) {

        /*
            FileOutputStream writes bytes to the output ( console or file )
            FileOutputStream ==> byte streams
            FileWriter ==> Charachter streams
            BufferedOutputStream ==> Write as per buffer ( line )
         */

        // This is a try catch block with resources : No need to closing the resources used
        // extend properties of AutoClosable
        try (FileOutputStream fout = new FileOutputStream("ascii.txt")) {
            fout.write(65);     // input given is the ASCII charachter of charachter to be displayed
                       // Prints A to file
       } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("success writing a single ascii char to file...");

        try{
            FileOutputStream fout=new FileOutputStream("string.txt");
            String s="Welcome to javaTpoint.";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Success writing a string byte array char to file.");
        }catch(Exception e){System.out.println(e);}

        // Write with BufferedOutputStream
        FileOutputStream fout= null;
        try {
            fout = new FileOutputStream("String_Buffer.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="Welcome to javaTpoint with BufferedOutputStream";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
