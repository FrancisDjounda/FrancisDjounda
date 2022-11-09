package com.java.Class6;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your age in years");
        int age = sc.nextInt();



        System.out.println(" you have spend " + age * 12 + " months");
        System.out.println(" you have spend " + age * 365 + " dayss");
        System.out.println(" you have spent " + age * 365 * 24 * 60 + " minutes");


    }
}
