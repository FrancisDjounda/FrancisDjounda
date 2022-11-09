package com.java.Week7.StringPrograms;

public class PrintOnlyDigitCharacter {
    public static void main(String[] args) {

        String str = " Its Simple 1991";

        for( int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if( Character.isDigit(c))

             System.out.println(c);
        }


    }
}
