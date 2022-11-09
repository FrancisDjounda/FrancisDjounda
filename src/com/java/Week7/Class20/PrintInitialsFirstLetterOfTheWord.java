package com.java.Week7.Class20;

import java.util.Scanner;

public class PrintInitialsFirstLetterOfTheWord {
    // Print Initials. First Letter Of The Word

    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = Franc.nextLine();

        String initial = name.charAt(0) + ".";

        for ( int i = 0; i < name.length(); i++){
            if (name.charAt(i) == ' '){
                initial = initial + name.charAt(i+1) + ".";
            }
        }
        System.out.println(initial);
    }
}