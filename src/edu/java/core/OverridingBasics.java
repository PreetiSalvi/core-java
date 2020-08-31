package edu.java.core;

//Creating a parent class.
class Bank {

    int bankid = 10;
    int getRateOfInterest() {
        return 0;
    }

    static void display(){
        System.out.println(" In Parent Static method");
    }
}

//Creating child classes and overriding method getRateOfInterest from parent class Bank
class SBI extends Bank {
    int bankid = 100;
    int getRateOfInterest() {
        return 8;
    }

    public static void display(){
        System.out.println(" In SBI Bank Static method");
    }
}

class ICICI extends Bank {
    int bankid = 100;
    int getRateOfInterest() {
        return 7;
    }

    public static void display(){
        System.out.println(" In ICICI Bank Static method");
    }
}

class AXIS extends Bank {
    int bankid = 100;
    int getRateOfInterest() {
        return 9;
    }
}


public class OverridingBasics {
    public OverridingBasics() {
        System.out.println("method Overriding implements : run time polymorphism.");
        System.out.println("occurs when child class has same method name with same no of arguments and their data-types as of parent class");
        System.out.println("Method OVerriding is only possible by keeping the return type AND arguments of the method SAME in child and parent class.");
    }

    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());

        Bank bank = new Bank();
        System.out.println("Parent Rate of Interest: "+bank.getRateOfInterest());
        bank = s;
        System.out.println("Parent Rate of Interest: "+bank.getRateOfInterest());
        bank = i;
        System.out.println("Parent Rate of Interest: "+bank.getRateOfInterest());
        bank = a;
        System.out.println("Parent Rate of Interest: "+bank.getRateOfInterest());

        // Static method in above parent & child classes are not over ridden
        // they individually belong to the class.

        Bank.display();
        SBI.display();
        ICICI.display();
        AXIS.display();


        // Overriding or Runtime polymorphism : does not work with data members
        Bank bankobj = new SBI();
        System.out.println(bankobj.bankid);


    }
}
