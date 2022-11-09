package com.java.Class7;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your age");
        int age = sc.nextInt();

        if ( age >= 16) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("You are not eligible to drive");

        }
    }


}
