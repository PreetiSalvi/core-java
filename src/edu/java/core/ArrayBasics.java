package edu.java.core;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] intArr = {0,15,42,1,28,36,75,23,5};

        String[] strArr = new String[10];
        strArr[0]="First";
        strArr[1]="Second";
        strArr[2]="third";


        System.out.println(strArr.length);
        System.out.println(intArr.length);

        System.out.println(strArr);
        System.out.println(intArr);

        System.out.println(strArr.toString());
        System.out.println(intArr.toString());

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(intArr));


        System.out.println(strArr.getClass());
        System.out.println(intArr.getClass());

        System.out.println(strArr.hashCode());
        System.out.println(intArr.hashCode());

//        // traverse array : for OR foreach
//        for ( int i = 0 ; i<strArr.length ; i++){
//            System.out.println("i = " + i + " value = " + strArr[i]);
//        }

        // Reverse traverse
        for (int j = intArr.length-1 ; j >= 0 ; j--){
            System.out.println("j = " + j + " value = " + intArr[j]);
        }
    }
}
