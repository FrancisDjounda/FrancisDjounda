package com.java.Week6.Class18;

public class Homework3C {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 10 - i * 2 + 1; k++) {

                System.out.print(k);
                // k++;
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i*2 - 1 ; k++) {
                System.out.print(k);
                // k++;
            }
            System.out.println();
        }}}