package edu.java.core;

interface Printable {
}

class A1 implements Printable {
    public void a() {
        System.out.println("a method");
    }
}

class B implements Printable {
    public void b() {
        System.out.println("b method");
    }
}

class Call {
    void invoke(Printable p) {//upcasting
        if (p instanceof A1) {
            A1 a = (A1) p;//Downcasting
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;//Downcasting
            b.b();
        }
    }
}
        class Animal12 {
}

class Dog1 extends Animal12 {//Dog inherits Animal

}

    public class InstanceOfBasics {

    InstanceOfBasics(){
        System.out.println(" Used to test wether an object is instance of specified type.");
    }

    public static void main(String[] args) {
        InstanceOfBasics obj = new InstanceOfBasics();
        System.out.println(obj instanceof InstanceOfBasics);

        // Child objec is always of type parent as well
        // Hence instance of always returns true
        Dog1 dogObj =new Dog1();
        System.out.println(dogObj instanceof Animal12);//true

        Animal12 dogObj1 =new Dog1();
        System.out.println(dogObj1 instanceof Animal12);//true

        // instanceOf comparision with a NULL object is always false
        Dog1 d=null;
        System.out.println(d instanceof Dog1);//false

      /*
        // instanceOf gives a compile time error if object is not initialised
        Dog1 d1;
        System.out.println(d1 instanceof Dog1);
*/
/*

      // Downcasting of objects without instanceOf gives either a compile time error OR runtime exception
           Dog1 subdog =new Animal12();//Compilation error
            Dog1 subDog1=(Dog1) new Animal12(); // Runtime exception : ClassCastException

*/
        Animal12 aniObj = new Dog1();
        // Downcasting of objects withinstanceOf is allowed : no compile type or runtime Exception
           if(aniObj instanceof Dog1){
               Dog1 subDog2=(Dog1)aniObj;//downcasting
              System.out.println("ok downcasting performed");
         }
         else
           {
               System.out.println("In instanceOf false");
           }


        // Above scenario would work without instanOf also as the object type aniObj IS OF DOg1
        Dog1 subDog3=(Dog1)aniObj;//downcasting
        System.out.println("ok downcasting performed");


        // instanceOF is used to decide the binding based on the type of the object
        Printable p=new B();
        Call c=new Call();
        c.invoke(p);

        Printable p1=new A1();
        Call c1=new Call();
        c1.invoke(p1);
    }
}
