package edu.java.core;

public class MethodCallByValueOrRefrence {

    int data=50;

    void change(int data){
        System.out.println("in change : Adding 100 to value passed");
        data=data+100;//changes will be in the local variable only
    }

    void thisChange(int data){
        System.out.println("in thisChange : Adding 1000 to value passed");
        this.data=data+1000;//changes will be in the object variable due to use of this
    }

    void objectChange(MethodCallByValueOrRefrence op){
        System.out.println("in objectChange : Adding 10000 to value passed");
        op.data=op.data+10000;//changes will be in the instance variable
    }

    public static void main(String[] args) {
        MethodCallByValueOrRefrence op=new MethodCallByValueOrRefrence();

        System.out.println("before change "+op.data);
        op.change(3);
        System.out.println("after change "+op.data);
        op.thisChange(3);
        System.out.println("after thischange "+op.data);
        op.data=3;
        op.objectChange(op);//passing object
        System.out.println("after object change "+op.data);

    }
}
