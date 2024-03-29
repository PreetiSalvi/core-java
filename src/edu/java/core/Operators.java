package edu.java.core;

public class Operators {

    void unaryOperator(){
        int x=10;
        System.out.println(x++);     // Postfix : First prints then  increments ==> Print Result 10 , but value of x=11
        System.out.println(++x);     // Prefix : First increments then prints ==> Print Result 12 , but value of x=12
        System.out.println(x--);     // Postfix : First prints then decrements  ==> Print Result 12 , but value of x=11
        System.out.println(--x);     // Prefix : First decrements then prints ==> Print Result 10 , but value of x=10


        int a=10;
        int b=10;
        System.out.println("Addition of post and prefix operators is "+ (a++ + ++a));//10+12=22
        System.out.println("Addition of post and post operators is "+ (b++ + b++));//10+11=21

        // Negation operators
        // ~ ==> Negate numbers
        // ! ==> Negate booleans

    }

    void arithmaticOperator(){
        int a=10;
        int b=5;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0

        System.out.println(10*10/5+3-1*4/2);        // Apply BEDMAS Rule for prio
        System.out.println(10*2+3-1*2);
        System.out.println(20+3-2);
    }

    void shitOperators(){
        // Left Shift
        //x<<y ==> x*(2^y)
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        // Right Shift
        //x>>y ==> x/(2^y)
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

    }

    void logicalOperators(){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true

        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked

        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }


    void bitWiseOperator(){
        int a=10;
        int b=5;
        int c=20;

        System.out.println(a<b&a<c);//false & true = false
        System.out.println(a>b&a<c);//true & true = true

        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked

    }

    void ternaryOperator(){
        int a=2;
        int b=5;
        int min=(a<b)?a:b;
        int max=(a>b)?a:b;
        System.out.println(min);
        System.out.println(max);
    }

    void assignmentOperators()
    {
        int a=10;
        int b=20;
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);
        a*=2;//14*2
        System.out.println(a);
        a/=2;//28/2
        System.out.println(a);
    }
    public static void main(String []args){
        Operators obj = new Operators();
        obj.unaryOperator();
        obj.arithmaticOperator();
        obj.shitOperators();
        obj.logicalOperators();
        obj.ternaryOperator();
        obj.assignmentOperators();
    }
}
