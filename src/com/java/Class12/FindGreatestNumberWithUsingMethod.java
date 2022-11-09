package com.java.Class12;

import java.util.Scanner;

public class FindGreatestNumberWithUsingMethod {

    public static void main(String[] args) {
        // Print greatest number out of three number
        // 15 25 35, output 35
        Scanner Franc = new Scanner(System.in);

        System.out.println(" Please enter your 1st number");
        int num1 = Franc.nextInt();

        System.out.println(" Please enter your 1st number");
        int num2 = Franc.nextInt();

        System.out.println(" Please enter your 1st number");
        int num3 = Franc.nextInt();
        findGreatestNumber(num1, num2, num3);
    }
    // Method with arguments but no return value
    static void findGreatestNumber( int a, int b , int c) {
        if ( a > b && a > c) {
            System.out.println(a + " is the Greatest");
        } else if ( b > c ) {
            System.out.println(b + " is the Greatest number");
        } else {
            System.out.println(c + " is the Greatest number");
        }
    }

}






