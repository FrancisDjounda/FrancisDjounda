package com.java.Class15;

import java.util.Scanner;

public class Homework4 {
    // Write a program to print each digit of the number
    // into a separate line in reverse order
    public static void main(String[] args) {
        Scanner FJ = new Scanner(System.in);
        int num = FJ.nextInt();

        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}
    /**   2nd Approach
        Scanner Franc = new Scanner(System.in);
        System.out.println("Please enter your number");
        String num = Franc.next();
        for ( int i = num.length()-1; i >= 0; i--) {

            System.out.println(num.charAt(i)); */







