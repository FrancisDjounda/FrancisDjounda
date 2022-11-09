package com.java.Class6;

import java.util.Scanner;

public class HomeworkClass6 {
    /** Task 1. Write a program to get a number from user and print square
     * of given number.*/

    public static void main(String[] args) {
        // Task1: //
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = sc.nextInt();
        System.out.println(" The square of the given number is:" + (num * num));

        /**  Task 2. Write a program to get principle, rate of interest and number
        // of years from the user and calculate simple interest */
          // Task2//
        System.out.println("Enter the Principal Amount");
        int p = sc.nextInt();
        System.out.println("Enter the rate of interest number");
        double r = sc.nextDouble();
        System.out.println(" Enter the time in years");
        int t = sc.nextInt();
        double si = (p * r * t)/100;
        System.out.println("The Simple Interest is: " + si );

        /** Task 3.  Write a program to take total bill amount and discount percentage
        // from user and print value of final bill amount after discount.*/

        System.out.println("Please Enter total Bill Amount");
        int a = sc.nextInt();
        System.out.println("Please Enter the discount percentage");
        double d  = sc.nextDouble();
        double v = (a * d)/100;
        System.out.println(" the value of the Bill is : " + v);


    }


}
