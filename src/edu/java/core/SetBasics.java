package edu.java.core;

import java.util.HashSet;
import java.util.Set;

public class SetBasics {

    public static void main(String[] args) {
        Set<SetClass> set = new HashSet<SetClass>();
        SetClass obj1=new SetClass(10,"Preeti");
        SetClass obj2=new SetClass(10,"Preeti");
        SetClass obj3=new SetClass(10,"preeti");
        set.add(obj1);
        set.add(obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        //System.out.println(obj1.equals(obj2));
        System.out.println(set);
    }

}
