    package edu.java.core;
    import java.io.*;
    class Calculation implements Cloneable,Serializable {
        void fact(int  n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("factorial is "+fact);
        }
        @Override
        public Object clone() {
            Object obj = null;
            try {

                obj = super.clone();

            } catch (CloneNotSupportedException e) {

                e.printStackTrace();
            }
            return obj;
        }
    }

    public class ObjectBasics   {

        public static void main(String[] args) {

            // create object ==> New keyword
            Calculation obj1 = new Calculation();
            obj1.fact(5);

            // can access methods with anonymous member as wekk
            new Calculation().fact(5);


            // create object ==> newInstance() method
            try {
                Calculation obj2 = (Calculation) Class.forName("edu.java.core.Calculation").newInstance();
                obj2.fact(5);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            // with clone method : implement cloneable interface in class whose object is to be cloned
            // + override the clone method
            // no call to constructor
            Calculation obj3 = (Calculation) obj1.clone();
            obj3.fact(5);


            // Deserialisation : no construtor call
            try {
                ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("file.txt"));
                Calculation obj4 = (Calculation) inStream.readObject();
                obj4.fact(3);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
