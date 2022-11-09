package com.java.Week7.Class20;

import java.util.Scanner;

public class HWPalindromeAndWhiteSpaces {
    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);

        System.out.println("Enter your String");
        String str = Franc.nextLine();
        String revStr = " ";
        String newStr = str.toLowerCase();


        for(int i = str.length()-1; i >= 0; i--){

            revStr = revStr + str.charAt(i);
            revStr = revStr.replace(" ", "") ;

        }
           if( str.equalsIgnoreCase(revStr)){

               System.out.println("Palindome");
           } else {
               System.out.println("Not palindrome");
           }

    }
}
