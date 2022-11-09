package com.java.Week6.Class18;

import java.util.Scanner;

public class Homework3B {
    public static void main(String[] args) {

         for (int i = 1; i <= 5; i++){

             for ( int j = 1; j <= i; j++){
                 System.out.print(" ");
             }
             for ( int k = 1; k <= 10 - i*2 + 1; k++){

                 System.out.print(k);
                // k++;
             }
             System.out.println();
         }}}
