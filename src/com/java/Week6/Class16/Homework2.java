package com.java.Week6.Class16;

import java.util.Scanner;

public class Homework2 {
    // Write a program to print greatest digit
    // from the given number
    public static void main(String[] args) {
        Scanner FJ = new Scanner(System.in);
        int num = FJ.nextInt();
        int max = 0;

        while (num != 0) {
            int lastDigit = num % 10;

            if ( lastDigit > max) {
                max = lastDigit;
            }
          num = num / 10;

                System.out.println(max);
            }
        }

    }

