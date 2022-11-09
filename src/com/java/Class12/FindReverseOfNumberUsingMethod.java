package com.java.Class12;

import java.util.Scanner;

public class FindReverseOfNumberUsingMethod {
    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);
        System.out.println("Please enter a number (100 to 999)");
        int num = Franc.nextInt();  // 874

        int rev = getReverse(num);
        System.out.println(rev);
    }
    static int getReverse(int num) {
        int rev = 0;

        int lastDigit = num %10; // 4
        rev = rev * 10 + lastDigit; // 0 * 10 + 4 = 4
        num = num/ 10; num = 87;

        lastDigit = num % 10; // 7
        rev = rev * 10 + lastDigit; // 4 * 10 + 7 = 47;
        num = num / 10; // num = 8

        lastDigit = num % 10; // 8
        rev = rev * 10 + lastDigit; //
        num = num / 10; // num = 0

        return rev;

    }
}
