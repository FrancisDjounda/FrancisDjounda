package com.java;

import java.util.Scanner;

/** Write a program to get age and weight from the user and print message based on following conditions

// 1. user has age more than or equal to 18 and weight more than equal to 50
// then they are eligible for blood donation
// 2. If user has age less than 18 and weight greater than 50 then
// print you're too young to donate blood
// 3. If user has age greater than 18 and weight less than 50 then
// print you're underweight. Please eat more and try again
// 4. If user has age less than 18 and weight less than 50 then
// print, you're not eligible. */

public class ExerciseClass8 {
    public static void main(String[] args) {
        // 1st : Ladder if-else //
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter your age ");
        int age = sc.nextInt();
        System.out.println( " Enter your weight");
        double w = sc.nextDouble();
        if ( age >= 18 && w >= 50) {
            System.out.println(" eligible for blood donation");
        } else if ( age < 18 && w >= 50) {
            System.out.println(" you're too young to donate blood ");
        } else if ( age >= 18 && w < 50) {
            System.out.println(" you're underweight ");
        } else  {
            System.out.println(" you're not eligible. ");
        }




        }
}
