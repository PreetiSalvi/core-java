package edu.java.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreams {
    public static void main(String[] args) {
         /*
            FileInputStream  reads bytes from the input ( console or file )
            FileInputStream  ==> byte streams : image data, audio, video
            FileReader ==> Charachter streams
         */

        // This is a try catch block with resources : No need to closing the resources used
        // extend properties of AutoClosable
        try (FileInputStream fin = new FileInputStream("testout.txt")) {
            int i = fin.read();// reads the first character from the file

            System.out.println(i);       // Prints ascii code for first letter in file

            System.out.println((char) i);

         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fin = new FileInputStream("string.txt")) {
            int i = fin.read();// reads the first character from the file

            System.out.println(i);       // Prints ascii code for first letter in file

            System.out.println((char) i);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Read string with FileINputStream
        try{
            FileInputStream fin=new FileInputStream("string.txt");
            int i,j=0;
            int b[]= new int[100];
            while((i=fin.read())!=-1){
                b[j]=(char)i;
                j++;
                System.out.print((char)i);
            }
            System.out.println();
            System.out.println(b);
            fin.close();
        }catch(Exception e){System.out.println(e);}


        /*
            Eg with BufferedInputReader
         */
        try{
            FileInputStream fin=new FileInputStream("String_Buffer.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }


}

