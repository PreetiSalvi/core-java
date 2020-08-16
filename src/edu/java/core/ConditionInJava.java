package edu.java.core;

public class ConditionInJava {
    public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }

    public static void main(String[] args) {
            int year = 2020;
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " is a LEAP YEAR");
            } else {
                System.out.println(year + " is a COMMON YEAR");
            }

            int number = 13;
            //Using ternary operator
            String output = (number % 2 == 0) ? number + " is a even number" : number + " is a odd number";
            System.out.println(output);


            int marks = 65;

            if (marks < 50) {
                System.out.println("fail");
            } else if (marks >= 50 && marks < 60) {
                System.out.println("D grade");
            } else if (marks >= 60 && marks < 70) {
                System.out.println("C grade");
            } else if (marks >= 70 && marks < 80) {
                System.out.println("B grade");
            } else if (marks >= 80 && marks < 90) {
                System.out.println("A grade");
            } else if (marks >= 90 && marks < 100) {
                System.out.println("A+ grade");
            } else {
                System.out.println("Invalid!");
            }


            // Nested IF else
            int age = 25;
            int weight = 48;
            //applying condition on age and weight
            if (age >= 18) {
                if (weight > 50) {
                    System.out.println("You are eligible to donate blood");
                } else {
                    System.out.println("You are not eligible to donate blood");
                }
            } else {
                System.out.println("Age must be greater than 18");
            }


            // Switch Case : byte, short, int, long (with its Wrapper type), enums and string.
            number=20;
            switch(number){
                //Case statements
                case 10: System.out.println("10");
                    break;
                case 20: System.out.println("20");
                    break;
                case 30: System.out.println("30");
                    break;
                //Default case statement
                default:System.out.println("Not in 10, 20 or 30");
            }

            // Switch without break
            number=10;
            switch(number){
                //Case statements
                case 10: System.out.println("10");
                   // break;
                case 20: System.out.println("20");
                    //break;
                case 30: System.out.println("30");
                    //break;
                //Default case statement
                default:System.out.println("Not in 10, 20 or 30");
            }

            //Declaring String variable
            String levelString="Expert";
            int level=0;
            //Using String in Switch expression
            switch(levelString){
                //Using String Literal in Switch case
                case "Beginner": level=1;
                    break;
                case "Intermediate": level=2;
                    break;
                case "Expert": level=3;
                    break;
                default: level=0;
                    break;
            }
            System.out.println("Your Level is: "+level);


            // With Enums
        Day[] DayNow = Day.values();
        for (Day Now : DayNow)
        {
            switch (Now)
            {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }

        // Switch with wrapper ()
        Integer age1= 18;
        switch (age1)
        {
            case (16):
                System.out.println("You are under 18.");
                break;
            case (18):
                System.out.println("You are eligible for vote.");
                break;
            case (65):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");
                break;
        }

    }

}
