package com.java.Class4;

import java.util.Scanner;

public class SoundBankPracticeExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Write a program to get three numbers from User and find average of these numbers

        System.out.println("Please enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Please enter the third number: ");
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3)/ 3;
        System.out.println("the average of your numbers is: " + average);




    }



}
