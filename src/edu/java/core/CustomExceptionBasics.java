package edu.java.core;
import java.io.IOException;
import java.io.PrintWriter;

// User defined Exception
// MUST have a constructor : code gets executed when exception occurs
// Can have data members and methods like any other class
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

// User defined Exception : can be checked : it MUST be handled , if not gives compile time error
class InvalidAgeException_Checked extends IOException{
    InvalidAgeException_Checked(String s){
        super(s);
    }
}


// User defined Exception : can be Unchecked : it's not MANDATORY to handled , if not does not give compile time error
class InvalidAgeException_UnChecked extends ArithmeticException{
    InvalidAgeException_UnChecked(String s){
        super(s);
    }
}

public class CustomExceptionBasics {

    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    static void validateChecked(int age)throws InvalidAgeException_Checked{
        if(age<18)
            throw new InvalidAgeException_Checked("InvalidAgeException_Checked ; not valid");
        else
            System.out.println("welcome to vote");
    }


    static void validateUnChecked(int age)throws InvalidAgeException_UnChecked{
        if(age<18)
            throw new InvalidAgeException_UnChecked("InvalidAgeException_UnChecked ; not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        try{
            validate(13);
        }catch(Exception m){System.out.println("Exception occured: "+m);}

        // Gives compile time error if not handled
        //validateChecked(18)

        // Does not give compile time error if not handled , but normal flow is interrupted.
        try {
            validateUnChecked(13);
        }catch (Exception e){
            System.out.println("Exception handled/......");
        }
        System.out.println("rest of the code...");
    }

}
