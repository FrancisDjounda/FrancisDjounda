package com.java.Week6.Class18;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = Franc.nextInt();
        int originalNum = num;
        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if ( originalNum == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
