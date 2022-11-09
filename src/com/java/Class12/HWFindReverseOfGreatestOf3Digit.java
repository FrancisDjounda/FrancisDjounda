package com.java.Class12;

import java.util.Scanner;

public class HWFindReverseOfGreatestOf3Digit {
    // Write a program to take three numbers from user and find reverse of
    // the greatest number (3 digits number)

    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int a = Franc.nextInt();
        System.out.println("Enter 2nd number ");
        int b = Franc.nextInt();
        System.out.println("Enter 3rd number ");
        int c = Franc.nextInt();
        checkIfThreeNumbersAreEqual(a, b, c);
        printReserveOfThreeDigitNumber(c);


    }
     static void  checkIfThreeNumbersAreEqual(int num1, int num2, int num3) {

         if (num1 == num2 && num2 == num3 ) {
             System.out.println("They are Equal");
         } else if ( num1 > num2 && num1 >num3) {
             System.out.println(num1 + "Is the Greatest number");
             printReserveOfThreeDigitNumber(num1);
         } else if (num2 > num3) {
             System.out.println(num2 + " is the Greatest number");
             printReserveOfThreeDigitNumber(num2);
         } else {
             System.out.println(num3 + " is the Greatest number");
             printReserveOfThreeDigitNumber(num3);
        }
    }

    private static void printReserveOfThreeDigitNumber(int num){
            if (num <= 100 || num > 999) {
                System.out.println(" Enter re-run program and enter 3 digit number");
            } else {
                int a = num / 100;
                int b = (num % 100) / 10;
                int c = num % 10;

//                 int d = a;
//                a = c;
//               c = d;
                System.out.println("The reserve is " + c + "" + b + "" + a);


            }
        }  }


