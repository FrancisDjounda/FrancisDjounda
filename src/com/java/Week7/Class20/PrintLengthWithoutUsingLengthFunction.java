package com.java.Week7.Class20;

import java.util.Scanner;

public class PrintLengthWithoutUsingLengthFunction {
    // Write a program to print length of the String
    // without using .length() function
    // Example - Java is Great
    // Output - 13
    // You can use length function in the for loop

    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);
        System.out.println(" Please enter your Full Name");

        String name = Franc.nextLine();

        int count = 0;

        while (!name.isEmpty()){
            count++;
            name= name.substring(1);
        }
        System.out.println(count);

    }
}
