package edu.java.core;

public class AccessModifiersBasics {

    public void whatAccessModifiersDo(){
        System.out.println("Access modifiers are used to specify accessibility or SCOPE of ");
        System.out.println("- data members of class");
        System.out.println("- methods of class");
        System.out.println("- constructors of class");
        System.out.println("- class itself");
    }

    public void whichAccessModifiersAreAvailable(){
        System.out.println("There are 4 types of access modifiers....");
        System.out.println("Private ==> Access only within same class . Class cannot be inherited");
        System.out.println("Default ==> Access only within same package.");
        System.out.println("Protected ==> Access only within hierarchy to child class irrespective of same or different package.");
        System.out.println("Public ==> Everywhere.");
        System.out.println("During Overriding : If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.");
    }

    public void privateKeyPoints(){
        System.out.println("Members private ==> Access only in same class");
        System.out.println("methods private ==> Can be called only in same class");
        System.out.println("Constructor private ==> Objects can be created only in same class");
    }


}
