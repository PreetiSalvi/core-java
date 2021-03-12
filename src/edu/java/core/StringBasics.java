package edu.java.core;

public class StringBasics {

    public static void main(String[] args) {
        // String declerations : Char array
        char[] ch={'j','a','v','a','t','p','o','i','n','t'};
        String s=new String(ch);
        // String Literal
        String s1="javatpoint";
        // String Object
        String s2=new String("javatpoint");//creates two objects and one reference variable

        System.out.println("String ==> Immutable Object");
        System.out.println("StringBuffer ==> Mutable Object");
        System.out.println("StringBilder ==> Mutable Object");


        // String Methods
        System.out.println("Character at 0th position in Javatpoint is " + s.charAt(0));
        System.out.println("Length of string Javatpoint is " +s1.length());
        System.out.println("Substring from Javatpoint form location 5 is " + s.substring(5));
        System.out.println("Substring from Javatpoint form location 0 to 4 is " + s.substring(0,4));
       // System.out.printf("Last n chars from Javatpoint form location 5 is " + s.substring(-5));
                // cant give negtive to substring function
        System.out.println("Last n chars from Javatpoint form location 5 is " + s.substring(s.length()-5,s.length()));
        System.out.println("Does javatpoint contain java " + s.contains("java"));
        System.out.println("Does javatpoint contain pointer " + s.contains("pointer"));
        System.out.println("javatpoint concatenated with plus" + s.concat("plus"));
        System.out.println("is s and s1 javatpoint equal " + s.equals(s1));
        System.out.println("is s and s1 javatpoint equal JavatPoint " + s.equals("JavatPoint"));
        System.out.println("is s and s1 javatpoint equal JavatPoint " + s.equalsIgnoreCase("JavatPoint"));
        System.out.println("replace j with p in  javatpoint " + s.replace('j','p') );
        System.out.println("replace t with p in  javatpoint " + s.replace('t','p') );
        System.out.println("replace java with pot in  javatpoint " + s.replace("java","pot") );
        System.out.println("Convert javatpoint to upperCase " + s.toUpperCase());
        System.out.println("Index of j in javatpoint " + s.indexOf('j'));
        System.out.println("Index of t in javatpoint " + s.indexOf('t'));
        System.out.println("Index of point in javatpoint " + s.indexOf("point"));
        System.out.println("Split javatpoint " + s.split("t")[0]);
        System.out.println("Split javatpoint " + s.split("t")[1]);

        String strim = "      i sdadasd u     ";
        System.out.println("Before trim '" + strim +"'");
        System.out.println("After trim '" + strim.trim()+"'");

        System.out.println(s1==s2);//false (because both refer to different instance)
        System.out.println(s1==s);//false(because s refers to instance created in nonpool)



    }
}
