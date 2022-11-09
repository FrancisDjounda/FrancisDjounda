package com.java.Class13;

import java.util.Scanner;

public class HWFindGreatestNumOutOf4UsingMethod {
    // Write a program to find the greatest number out of four numbers using the method

    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        System.out.println("Enter number one");
        int num1 = Franc.nextInt();
        System.out.println("Enter number two");
        int num2 = Franc.nextInt();
        System.out.println("Enter number three");
        int num3 = Franc.nextInt();
        System.out.println("Enter number four");
        int num4 = Franc.nextInt();

        int max1 = printGreatest(num1, num2);
        int max2 = printGreatest(num3, num4);

        System.out.println("The Greatest number is " + printGreatest(max1, max2) );
    }

    static int printGreatest(int a, int b) {
        if ( a > b) {
            return a;
        } else
            return b;
    }
}

