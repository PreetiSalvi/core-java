package edu.java.core;

public class LoopsInJava {

    // break statements are used to break from the current loop
        // when used in inner loop it breaks from the inner loop
    // continue is used to skip the current iteration and move to the next iteration in loop

    void forExample(){
        //for loop
        System.out.println("Print with for loop");
        for(int i=1;i<=3;i++){
            System.out.println(i);
        }
        System.out.println("----------------------");
    }

    void forEachExample(){
        System.out.println("Print with for each loop");
        int arr[]={12,23,44,56,78};
        //Printing array using for-each loop
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("----------------------");
    }

    void namedForLoopExapmle(){
        System.out.println("Print with named for each loop");
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
        System.out.println("----------------------");
    }

    void whileExample(){
        //for loop
        System.out.println("Print with while loop");
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("----------------------");
    }

    void doWhileExample(){
        //for loop
        System.out.println("Print with do-while loop");
        int i=1;
        while(i<=7){
            System.out.println(i);
            i++;
        }
        System.out.println("----------------------");
    }


    void infiniteLoopExample(){
        /*
        //Using no condition in for loop
        for(;;){
            System.out.println("infinitive loop");
        }

        while(true){
            System.out.println("infinitive loop");
        }

        do{
            System.out.println("infinitive loop");
        }while(true);
        */
    }



    public static void main (String[] args){

        LoopsInJava obj = new LoopsInJava();
        obj.forExample();
        obj.whileExample();
        obj.doWhileExample();
        obj.forEachExample();
        obj.namedForLoopExapmle();
    }
}
