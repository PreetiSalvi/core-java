package edu.java.core;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.Scanner;
import java.io.Console;
import java.io.DataInputStream;

public class InputValueFromUser {
    public static void main (String args[]) throws IOException {
        //creating Scanner class object
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number and String: ");
        //reading value from user : with Scanner object
        int num=scan.nextInt();
        String str=scan.nextLine();
        findEvenOdd(num);
        System.out.println("String is " + str);

        /*
        // reading value from user
        Console console = System.console();
        System.out.println("Enter a number : ");
        String s = console.readLine();
        int i = Integer.parseInt(console.readLine());
        System.out.println("Integer is " + i);
        */

        // reading value from user
        DataInputStream dis = new DataInputStream(System.in);
        int i = dis.readInt();
        findEvenOdd(i);

    }

    public static void findEvenOdd(int num)
    {
        System.out.println("Method from InputValueFromUser..");
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}
