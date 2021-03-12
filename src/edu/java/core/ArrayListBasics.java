package edu.java.core;


import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {

        String[] array={"Java","Python","PHP","C++"};
        //Creating a List
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

        list.add(0,"First");
        list.add(3,"Third");
        System.out.println("---------------------");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

//        System.out.println("Printing Array: "+Arrays.toString(array));
        System.out.println("Printing Array: "+array);


    }
}

