package com.java.Week6.Class17;

import java.util.Scanner;

public class PrintAAAAAAAAExercises {
    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);
        int num = Franc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int s = 1; s <= num - i; s++){
                System.out.println(" ");
            }

            for ( int j = 1; j <= i; j++) {
                System.out.println("A");
            }
            System.out.println();
        }


    }
}
