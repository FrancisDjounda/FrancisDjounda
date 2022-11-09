package com.java.Class5;


import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {

        // Creating object of Scanner class //

       Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter First number");
                   int a = sc.nextInt();
        System.out.println("Please Enter second number");
                   int b = sc.nextInt();

       System.out.println(" Your Total will be " + (a + b));





    }
}
