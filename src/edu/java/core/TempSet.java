package edu.java.core;

import java.util.*;

public class TempSet {
    public static void main(String[] args) {

        Set<People> newSet = new HashSet<People>();

        newSet.add(new People(10,"Preeti"));
        newSet.add(new People(10,"Preeti"));
        newSet.add(new People(100,"Salvi"));

        System.out.println(newSet);

        People obj1 = new People(30,"Priya");
        newSet.add(obj1);

        System.out.println(newSet);

        newSet.remove(obj1);
        System.out.println(newSet);

        List<People> newList = new ArrayList<People>(newSet);
        Collections.sort(newList);
        System.out.println("List " + newList);


    }
}
