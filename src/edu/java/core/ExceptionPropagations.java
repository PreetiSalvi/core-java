package edu.java.core;

import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionPropagations {

    // Calls method that has exception occurance.
    // This Method is executed only until exception occurance
    // Later part not executed if Unchecked exception is not handled
    // Normal flow if exception is handled
    public void a(){
        System.out.println("In method A : Before exception : Now calling C... ");
        c();
        System.out.println("In method A : After exception in C :");

        /*
        System.out.println("In method A : Before exception : Now calling D... ");
        d();
        System.out.println("In method A : After exception in D :");
        */

    }

    // Exceptions can be handled in the calling methods : and still continue with the normal flow after handling exception
    public void b(){
        System.out.println("In method B : Before exception : Now calling d ... ");
        try{
            d();
        }catch (Exception E){
            System.out.println("In method B : Exception occurance in D handled...");
        }
    }

    private void c() {
        System.out.println("In method C : Before exception : Runtime(Un-checked) Exception occurs here");
        try {
            int j = 50 / 0;
        } catch (Exception e ){
            System.out.println(" Exception Occured : " + e);
        }
        System.out.println("In method C : After exception : Runtime(Un-checked) Exception occurs here");
    }

    // Normal flow is interrupted after exception occurance
    // Rest of the code not executed.
    private void d() {
        System.out.println("In method D : Before exception : Runtime(Un-checked) Exception occurs here");
        int i = 50 / 0;
        System.out.println("In method D : After exception : Runtime(Un-checked) Exception occurs here");
    }



    // Checked exceptions MUST to be handled during compile time in the same function where exception occurs
    // If handled in calling functions is not allowed ( unlike unchecked exceptions )
    // If exception is handled in actual function , it is not caught in the calling function again
    public void z (){
        System.out.println("In Method Z : Before Checked exception occurs here....");
        //may throw exception
        try (PrintWriter pw = new PrintWriter("jtp1.txt")) {
            pw.println("saved");
            throw new ArithmeticException();
        }catch (Exception e)
        {
            System.out.println("Mandatory handling of compile time exception");
        }
        System.out.println("In Method Z : After Checked exception occurs ...");
    }

    public void x(){
        System.out.println("In Method X : Now calling Z where Compile time ( Checked ) Exception occurs ");
        try {
            z();
        }
        catch (Exception e ){
            System.out.println("In Method x : Checked exception of Z Handled in calling function ");
        }

        System.out.println("In Method X : After calling Z where Compile time ( Checked ) Exception occurs ");
    }


    // Throws keyword is used to declare an exception
    // by declaring an exception , it is not mandatory to handle the exception immediately
    // It can be handled even in the calling function.
    // IF its a checked exception , it is mandatory to either
        // a. handle it in the calling functions hierarchy
        // b. declare the exception in all callling functions hierarchy

    public void throwsDemo () throws IOException {

        System.out.println("in throws demo : explicitly throw a checked exception" );
        System.out.println("checked exception : not mandaotry to handle here as declared with throws in method" );
        throw new IOException();
        //System.out.println("After explicit throw of exception." );
    }

    // b. declare the exception in all callling functions hierarchy
    public void throwsDemoCall() throws IOException {
        System.out.println("Calling method where checked exception occurs");
        System.out.println("But not mandatory to handle here as declared in method header");
        System.out.println("However the normal flow is interuppted as soon as method is occured ");
        throwsDemo();
    }


    public static void main (String[] args) throws IOException {
        ExceptionPropagations obj = new ExceptionPropagations();
        obj.a();
        obj.b();
        obj.x();

        // a. Expetion handled in calling function
        try {
            obj.throwsDemo();
        } catch (IOException e) {
            e.printStackTrace();
        }

        obj.throwsDemoCall();
        System.out.println("Normal flow is interuppted....");
    }
}
