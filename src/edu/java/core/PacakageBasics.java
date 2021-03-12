// Declare in which package the current class is present
package edu.java.core;


/*
    NOTE : Note: If you import a package, subpackages will not be imported.
    ==> You need to be specific what needs to be imported
 */
//access package from another package import packageName.*;
import java.lang.*;

//access package from another package import packageName.ClassName;
import java.util.ArrayList;


public class PacakageBasics {

    public static void main(String[] args) {

        //access package from another package fully qualified name.
        java.util.LinkedList ll = new java.util.LinkedList();   //using fully qualified name

        // package class provides methods to get information about the specification and implementation of a package
        Package p=Package.getPackage("java.lang");

        System.out.println("package name: "+p.getName());

        System.out.println("Specification Title: "+p.getSpecificationTitle());
        System.out.println("Specification Vendor: "+p.getSpecificationVendor());
        System.out.println("Specification Version: "+p.getSpecificationVersion());

        System.out.println("Implementaion Title: "+p.getImplementationTitle());
        System.out.println("Implementation Vendor: "+p.getImplementationVendor());
        System.out.println("Implementation Version: "+p.getImplementationVersion());
        System.out.println("Is sealed: "+p.isSealed());
    }

}




