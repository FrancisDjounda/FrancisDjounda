package com.java.Class5;

import java.util.Scanner;

public class Homework2Week2Day2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter first number: ");
       int a = sc.nextInt();

        System.out.println(" Enter second number");
        int b = sc.nextInt();

        System.out.println(" Enter third number");
        int c = sc.nextInt();

       double result = (a + b + c) / 3.0;

        System.out.println("Average is" + result);


    }

}

