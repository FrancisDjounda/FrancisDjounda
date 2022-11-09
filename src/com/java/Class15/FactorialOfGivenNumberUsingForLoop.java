package com.java.Class15;

import java.util.Scanner;

public class FactorialOfGivenNumberUsingForLoop {
    public static void main(String[] args) {

        Scanner Djounda = new Scanner(System.in);
        System.out.println("Please enter Number");

        int num = Djounda.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
          System.out.println(result); // This line give the operation detail
            // and evolution.
        }
        System.out.println(result);// this line give directly the result
    }
}

