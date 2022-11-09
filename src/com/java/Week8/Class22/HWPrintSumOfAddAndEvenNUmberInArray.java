package com.java.Week8.Class22;

import java.util.Scanner;

public class HWPrintSumOfAddAndEvenNUmberInArray {
    public static void main(String[] args) {

        int num, sumE = 0, sumO = 0;
        int count =0;
       //
        Scanner Franc = new Scanner(System.in);
        System.out.println("Enter your Number");
        // int[] num = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        num = Franc.nextInt();
        int[] data = new int[num];

        System.out.println("Enter elements of the Array");
        for( int i = 0; i < num; i++){

            data[i] = Franc.nextInt();
        }
        for(int i = 0; i < num; i++){
            if( data[i] % 2 == 0){
                sumE = sumE + data[i];
            } else {
                sumO = sumO + data[i];
            }
        }
        System.out.println("Sum of Even Number: " + sumE);
        System.out.println("Sum of Add Number: " + sumO);



    }
}
