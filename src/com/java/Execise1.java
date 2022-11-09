package com.java;

import java.util.Scanner;

public class Execise1 {
    public static void main(String[] args) {
        System.out.println(" Please Enter your Mark");

        Scanner sc = new Scanner(System.in);
        double mark = sc.nextDouble();

        if (mark < 40) {
            System.out.println(" You Fail");

        } else if (mark >= 40) {
            System.out.println("Your grade is C");
        } else if ( mark > 50) {
            System.out.println("Your grade is C+");
        } else if (mark >= 60) {
            System.out.println("Your grade is B");
        } else if (mark >= 70) {
            System.out.println("Your grade is B+");
        } else if (mark >= 80) {
            System.out.println("Your grade is A");
        } else if ( mark >= 90) {
            System.out.println("Your grade is A+");
        } else if ( mark >= 101) {
                System.out.println("Error");
        }

    }
}
