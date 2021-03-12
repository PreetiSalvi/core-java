package edu.java.core;


import java.io.*;
import java.io.PrintWriter;

public class ExceptionBasics {

    public void whatIsException(){
        System.out.println("What is exception ??? ");
        System.out.println("An abrupt behaviour of system that impacts normal flow.");
        System.out.println("An exception is not same as error.");
        System.out.println("Types of Exceptions : Checked , Un-checked , Error");
        System.out.println("-------------------------------------------");

    }

    public void whatIsExceptionHandling(){
        System.out.println("What is exception handling ??? ");
        System.out.println("Mechanism where the exception occurance can be handled & continue with normal flow.");
        System.out.println("Capable of handling both compile and runtime time exceptions.");
        System.out.println("Main objective of handling is to continue with normal execution inspite of abrupt execution.");
        System.out.println("-------------------------------------------");
    }

    public void whatAreImportantConcepts(){
        System.out.println("Difference between error and exception");
        System.out.println("Difference between checked and unchecked exceptions.");
        System.out.println("How to handle Divide by zero exception");
        System.out.println("Why use multiple catch blocks");
        System.out.println("Is there a possibility of finally block not being executed?");
        System.out.println("What is exception propagation");
        System.out.println("What is difference between throw and throws ??? ");
        System.out.println("what are rules for exception handling in method overriding");
    }

    public void exceptionHierarchy(){
        System.out.println("Parent ==> Throwable Class with 2 subclasses ==> Error Class & Exception Class");
        System.out.println("Parent ==> Exception Class with 4 subclasses ==> ");
        System.out.println("Parent Exception ==> subclass IOException ");
        System.out.println("Parent Exception ==> subclass SQLException ");
        System.out.println("Parent Exception ==> subclass ClassNotFoundException ");
        System.out.println("Parent Exception ==> subclass RuntimeException ");
        System.out.println("Parent Error ==> subclass StackOverflowError ");
        System.out.println("Parent Error ==> subclass VirtualMachineError ");
        System.out.println("Parent Error ==> subclass OutOfMemoryError ");
        System.out.println("Parent RuntimeException ==> Several subclasses OutOfMemoryError ");
        System.out.println("Parent RuntimeException ==> subclass ArithmaticException ");
        System.out.println("Parent RuntimeException ==> subclass NullPointerException ");
        System.out.println("Parent RuntimeException ==> subclass NumberFormatException ");
        System.out.println("Parent RuntimeException ==> subclass IndexOutOfBoundsException ");
        System.out.println("Parent RuntimeException ==> subclass ........ Many more ");
    }

    public void checkedOrUncheckedException(){
        System.out.println("Checked Vs Unchecked exceptions");
        System.out.println("Checked during compile time VS runtime time");
        System.out.println("During compilation : Mandatory to handle VS not mandatory to handle.");
        System.out.println("------------------------------------------");
    }

    public void waysToHandleException(){
        System.out.println("2 ways to handle an exception");
        System.out.println("1.try - catch - finally within the method : Handled Immediately");
        System.out.println("2.throws in method signature : Handled when method (throws) is called");
        System.out.println("----------------------------------------------------");
    }

    // throw is used to throw an exception explicitly
    // can throw both checked or unchecked exception
    // normally used to throw custom exceptions
    // You cannot have any other valid statement after throw in same block of code ( its possible after block ends )
    public static void waytoThrowExceptionExplicitly(int i ){

        System.out.printf("throw new <Exception>");

        if (i < 18){
            // throw new ArithmeticException("not valid");     // Throw checked exception

            // When throwing a checked exception : you need to surround with a try catch
            try {
                throw new FileNotFoundException("not valid");     //Throw checked exception
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        System.out.println("Rest of the code after throwing exception when exception is handled.....");

            // When throwing a checked exception : you need to surround with a try catch
            // IT is mandatory to handle the EXACT exception thrown ( or its parent Exception class )
            // Either with try-catch finally OR method call (throws keyword in method signature )
            // IF not not done gives compile time error
            try {
                throw new FileNotFoundException("not valid");     //Throw checked exception
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Exact exception not caught : but its parent is caught ... so VALID ");
                e.printStackTrace();
            }

            System.out.println("Rest of the code after throwing exception when exception is handled.....");

    }
        else
            System.out.println("welcome to vote");

}

    public static void main(String[] args) {
        // Exception handling with try - catch - finally ( with exception )
        try{
            int data=100/0;
        }catch(ArithmeticException e){
            System.out.println("Exception occured ==> " + e);
        }finally {
            System.out.println("In Finally....");
        }
        System.out.println("rest of the code 1...");

        // Exception handling with try - catch - finally ( without exception )
        try{
            int data=100/10;
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("In Finally....");
        }
        System.out.println("rest of the code 2...");

        // When a runtime ( unchecked )  Exception is not handled ..
        // No compile time error but program ends abruptly w/o executing rest of code
        // the behaviour is same as error : normal flow is not executed
        //String s=null;
        //System.out.println(s.length());     //NullPointerException
        //System.out.println("rest of the code 3...");

        // When there is exception scenario in catch block
        // No compile time error but program ends abruptly w/o executing rest of code
        // the behaviour is same as error : normal flow is not executed
        try{
            String s=null;
            System.out.println(s.length());     //NullPointerException
            System.out.println("rest of the code 3...");
        }catch (Exception e){
            System.out.println("in catch : before it introduces another runtime exception");
            //    int i = 100/0;              // Introduced another exception
            //    System.out.println("in catch : after it introduces another runtime exception");
        }
        finally{
            System.out.println("In finally 2 ... ");
        }
        System.out.println("rest of the code 4...");

        // if we dont handle the exact exception :
        // exception occurred : divideByZero but handled ArrayIndexOutOfBound
        // No compile time error but program ends abruptly w/o executing rest of code
        // the behaviour is same as error : normal flow is not executed
        // however, if finally is present : that is always executed
        try
        {
            System.out.println("Exception thrown is different that caught");
                // int data=50/0; //may throw exception divideByZero

        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" Exception occured " + e);
        }
        finally {
            System.out.println("Finally executed even when exception is not caught and normal flow interrupted.");
        }
        System.out.println("rest of the code 555");

        // multiple catch block : are allowed
        // rule : Only one catch ( along with finally ) block is executed at once.
        //      : Which one catch is executed, depends on which exception occurs first.
        // rule : handling of Parent class must be after child class handling
        //      : if not : compile time error occurs
        try
        {
            System.out.println("Exception thrown is different that caught for 2nd time...");
            int data=50/0; //may throw exception divideByZero
            String s=null;
            System.out.println(s.length());     //NullPointerException
            System.out.println("rest of the code 123...");


        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointer Exception occured " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndex Exception occured " + e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmatic Exception occured " + e);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured " + e);
        }
        System.out.println("rest of the code 555");

        // if Checked exceptions are not handled gives : compile time error
           /* PrintWriter pw;
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
            */

        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception" + e);
        }
        catch (Exception e){
            System.out.println("Exception occured" + e);
        }
        System.out.println("File saved successfully");

        // It us possible to have nested try - catch - finally
        try{
                try{
                        System.out.println("going to divide");
                        int b =39/0;
                }catch(ArithmeticException e){System.out.println(e);}
                finally {
                    System.out.println("In nested finally 1 ");
                }


            try{
                int a[]=new int[5];
                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
            finally {
                System.out.println("In nested finally 2 ");
            }
            System.out.println("some remaining code ..");
        }catch(Exception e){System.out.println("handeled");}
        finally {
            System.out.println("In outer finally of nests 3");
        }
        System.out.println("normal flow..");


        // The only case when finally is not executed
        // if an explicit exit is given in either try or catch OR
        // error ocuurs before control reaches finally block
        try{
            System.out.println("Explicit call to exit...No catch or finally.");
            // System.exit(1);
        }
        catch (Exception e ) {
            System.out.println("In catch where exit called in try");
        }
        finally {
            System.out.println("In finally where exit called in try");

        }

        // explicit exit in catch
        try{
            System.out.println("Explicit call to exit...No finally.");
            int i = 100/0;
        }
        catch (Exception e ) {
            System.out.println("In catch where exit called in catch");
           // System.exit(1);
        }
        finally {
            System.out.println("In finally where exit called in catch");

        }

        // throw and throws pending.....

        // throw is used to throw an exception explicitly
        // can throw both checked or unchecked exception
        // normally used to throw custom exceptions
        waytoThrowExceptionExplicitly(13);




    }
}

