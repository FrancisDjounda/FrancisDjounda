package com.java.Week6.Class18;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = Franc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.println(i);
                count++;
          //  } else {
           //     System.out.println(i);
            }
        }
        if(count == 2){
                System.out.println(" It's a Prime number");
            } else {
                System.out.println(" It's not a Prime number");
            }
            //System.out.println(num);
        }
    }

