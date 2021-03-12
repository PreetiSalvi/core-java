package edu.java.core;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class ListBasics {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> stringList = new ArrayList<String>();
        List<Integer> intList = new LinkedList<Integer>();
        /*
        List <data-type> list1= new ArrayList();
        List <data-type> list2 = new LinkedList();
        List <data-type> list3 = new Vector();
        List <data-type> list4 = new Stack();

         */

        // add values to List
        stringList.add("Random");
        stringList.add("values");
        stringList.add("added");
        stringList.add("in");
        stringList.add("arraylist");
        stringList.add("with");
        stringList.add("with");
        stringList.add("duplicates");
        stringList.add("duplicates");
        stringList.add("duplicates");
        stringList.add("duplicates");

        // Iterate over List
        //Traversing list through Iterator in forward direction
        Iterator itr=stringList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        intList.add(10);
        intList.add(10);
        intList.add(100);
        intList.add(200);
        intList.add(200);
        intList.add(50);
        intList.add(3);
        intList.add(3);
        intList.add(3);
        System.out.println("Traverse in reverse direction");
        // listIterator only available for lists
        ListIterator irt2 =intList.listIterator(intList.size());
        while(irt2.hasPrevious()){

            System.out.println(irt2.previous());
        }



        //remove single element from ArrayList of Strings
        System.out.println("After removal of random from StringList");
        stringList.remove("random");        // dosent remove anything as no matching element
        stringList.remove("Random");
        for(String val : stringList){
            System.out.println(val);

        }

        //remove duplicate element from ArrayList of Strings
        System.out.println("After removal of duplicates from StringList");
        stringList.remove("duplicates");        // only removes a single matching element i.e first matched
        for(String val : stringList){
            System.out.println(val);
        }

        System.out.println(intList.contains(10));
        System.out.println(intList.contains(1001));

        System.out.println(intList.size());

        System.out.println(intList.subList(0,3));

        System.out.println(intList.get(6));

        System.out.println(intList.indexOf(3));
        System.out.println(intList.lastIndexOf(3));

        System.out.println(intList);
        System.out.println(stringList);

        Collections.sort(intList);
        System.out.println(intList);

        Collections.reverse(stringList);
        System.out.println(stringList);






    }
}
