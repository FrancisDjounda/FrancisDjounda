package com.java.Week6.Class16;

import java.util.Scanner;
// Write a program to print length of given number
//   input: 35667889
//   output: 7

public class Homework1 {
    public static void main(String[] args) {

        Scanner FJ = new Scanner(System.in);
       // System.out.println("Please enter your number");
        int num = FJ.nextInt();
        int count = 0;


        while (num != 0) {
            num = num / 10;
            count++;
        }
            System.out.println(count);
    }
}
