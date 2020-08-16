package edu.java.core;

public class VariableTypes {
    int data=50;//instance variable : seperate for all instances of the class
    static int m=100;//static variable : common variable for all instances of the class
    void method(){
        int n=90;//local variable to the method only
    }

    void primitiveDataTyp(){
        byte byteVal=8;              // 8 bits
        short shortVal;             // 8 bits integer value
        int intVal;                 // 16 bits integer value
        long longVal;               // 32 bits integer value
        float floatVal=3.14f;       // 16 bits decimal value ==> needs to be assigned with f in value
        double doubleVal;           // 32 bits decimal value
        char charVal='C';           // 8 bits : initialised with single quote
        boolean boolVal=true;       // 8 bits : value true or false
    }

    void typeCasting(){
        // 2 types : Widening and narrowing
        // widening does not require explicit type cast
        int intVal=28;
        float floatVal=intVal;

        // Narrowing needs an explicit type cast
        float floatVal1=3.14f;
        int intVal1=(int) floatVal1;
    }

    // problem with type cast which is not identified during compile time
    void variableOverflow(){
        int a=129;
        byte b=(byte)a;         // maximum size a byte can hold is 128
        System.out.println(a);
        System.out.println(b);
    }

    // arithmetic operations in byte : same will be behaviour for short
    // Type casting is needed for performing arithmetic operations on byte and short
    void byteOperations(){
        byte a=10;
        byte b=10;
        // byte c=a+b;           //Compile Time Error: because a+b=20 will be int
        byte c=(byte)(a+b);
        System.out.println(c);
    }
    public static void main (String[] args){
        VariableTypes obj=new VariableTypes();
        obj.variableOverflow();
    }
}
