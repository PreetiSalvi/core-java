package edu.java.core;

public class NameConvention {

    String rule1="no spaces";
    String rule2="no Special chars except in contants";

    void packageNameConvention(){
        System.out.println("Package name : all lower case");
        System.out.println("Package name : Seperated by dots(.)");
    }

    void classNameConvention(){
        System.out.println("Class name : camel Case : Start with capital letter");
        System.out.println("Class name : Denoted by noun.");
        System.out.println("Class name : Approriate words instead of acronyms.");
    }

    void interfaceNameConvention(){
        System.out.println("Interface name : camel Case : Start with capital letter");
        System.out.println("Interface name : Denoted by adjective.");
        System.out.println("Interface name : Approriate words instead of acronyms.");
    }

    void methodNameConvention(){
        System.out.println("Method name : camel Case : Start with small letter");
        System.out.println("Method name : Denoted by verb.");
    }

    void variableNameConvention(){
        System.out.println("Variable name : camel Case : Start with small letter");
        System.out.println("Variable name : Approriate words instead of acronyms.");
        System.out.println("Variable name : No starting special chars");
    }

    void constantNameConvention(){
        System.out.println("Constant name : Upper Case : seperated with _ in case of multiple words");
    }
      public static void main(String[] args) {


        NameConvention obj = new NameConvention();
          System.out.println(obj.rule1);
          System.out.println(obj.rule2);
        obj.classNameConvention();
        obj.constantNameConvention();
        obj.interfaceNameConvention();
        obj.methodNameConvention();
        obj.packageNameConvention();
        obj.variableNameConvention();


    }
}
