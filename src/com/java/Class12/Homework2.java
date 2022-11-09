package com.java.Class12;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int a = Franc.nextInt();
        boolean isEven = checkIsEven(a);
        System.out.println("Is your number Even ?" + isEven);
    }

    static boolean checkIsEven(int a) {
        boolean isEven = true;
        if ( a % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;

    }
}
