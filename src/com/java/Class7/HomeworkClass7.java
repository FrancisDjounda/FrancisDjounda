package com.java.Class7;

import java.util.Scanner;

public class HomeworkClass7 {
    public static void main(String[] args) {

        // Exercise 1: ladder & Nested If Else Statement//
         // Write a program to print a given number that is positive,negative, or zero//
        int a = 0;
        if ( a > 0) {

            System.out.println("Positive");
        } else if (a < 0) {
                System.out.println("Negative");
            } else {

                System.out.println("Zero");

        // Exercise2: Write a program to print the number of days in a given month //

    Scanner sc = new Scanner(System.in);

        System.out.println(" Please Enter the number of your month birth, between ( 1 & 12)");
            int num = sc.nextInt();
            if ( num == 1) {
            ;
                if ( num == 1) {
                System.out.println("Your month of birth is January" + 31 + "days");
                } else if ( num ==2){
                    System.out.println("Your month of birth is February" + 28 + "days");
                } else if ( num ==3){
                    System.out.println("Your month of birth is march"+ 31 + "days");
                } else if ( num ==4){
                    System.out.println("Your month of birth is April" + 30 + " days");
                } else if ( num ==5){
                    System.out.println("Your month of birth is May and has "+ 31 + " days" );
                } else if ( num ==6){
                    System.out.println("Your month of birth is June" + 30 + "days");
                } else if ( num ==7){
                    System.out.println("Your month of birth is July" +  31 + "days");
                } else if ( num ==8){
                    System.out.println("Your month of birth is August"+ 31 + "days");
                } else if ( num ==9){
                    System.out.println("Your month of birth is September"+ 3 + "days");
                } else if ( num ==10){
                    System.out.println("Your month of birth is October"+ 31 + "days");
                } else if ( num ==11){
                    System.out.println("Your month of birth is November"+ 30 + "days");
                } else if ( num ==12){
                    System.out.println("Your month of birth is December"+ 31 + "days");

                } else  {
                    System.out.println("Error");

                    // Exercise 3:  Write a program to take marks from the user and print the grade as follows//

                    System.out.println(" Please Enter your Mark");

                    int mark = sc.nextInt();
                    if (mark > 100 ) {
                        System.out.println(" Please Enter your Mark (0-100)");

                    } else if (mark >= 90 ) {
                        System.out.println("Your grade is A+");
                    } else if ( mark >= 80)  {
                        System.out.println("Your grade is A");
                    } else if (mark >= 70) {
                        System.out.println("Your grade is B+");
                    } else if (mark >= 60) {
                        System.out.println("Your grade is B");
                    } else if (mark >= 50) {
                        System.out.println("Your grade is C+");
                    } else if ( mark >= 40) {
                        System.out.println("Your grade is c");
                    }}}}}}





