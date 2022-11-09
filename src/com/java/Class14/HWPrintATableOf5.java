package com.java.Class14;

import java.util.Scanner;

public class HWPrintATableOf5 {
    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = Franc.nextInt();
        int i = 1;
        while (i <= 10) {
           // if (i <= 10) {
                System.out.println(num + "*" + i + "=" + num * i);
                i++;
            }

        }
    }
