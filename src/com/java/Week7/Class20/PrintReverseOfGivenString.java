package com.java.Week7.Class20;

import java.util.Scanner;

public class PrintReverseOfGivenString {

// Write a program to print reverse of given String
// inmaihK garihC

    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);
        System.out.println("Please enter your full Name");
        String name = Franc.nextLine(); // Francis Djounda

          for ( int i = name.length()-1; i >= 0; i--){
              System.out.print(name.charAt(i));
          }
        System.out.println();

          // Another Approach
        for( int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(name.length()-1 - i));
        }
    }

}
