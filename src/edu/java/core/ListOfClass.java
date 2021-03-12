package edu.java.core;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListOfClass {

    public static void main(String[] args) {
        List<ListClass> listofClasses = new LinkedList<ListClass>();

        ListClass obj1 = new ListClass(30,"Priya");
        ListClass obj2 = new ListClass(100,"salvi");
        listofClasses.add(new ListClass(10,"Preeti"));
        listofClasses.add(new ListClass(20,"Salvi"));
        listofClasses.add(obj1);
        listofClasses.add(obj2);
        listofClasses.add(new ListClass(40,"Salvi"));

        System.out.println(listofClasses);

        listofClasses.remove(1);
        System.out.println(listofClasses);
        listofClasses.remove(obj1);
        System.out.println(listofClasses);

        Collections.sort(listofClasses);
        System.out.println(listofClasses);

        Collections.reverse(listofClasses);
        System.out.println(listofClasses);

    }
}
