package com.java.Week7.StringPrograms;

public class PrintOnlyUppercaseCharacter {
    public static void main(String[] args) {

        String str = " Its Simple";

        for( int i = 0; i < str.length(); i++){

            char c = str.charAt(i);

            if( Character.isUpperCase(c))
                System.out.print(c+ " ");

        }

    }
}
