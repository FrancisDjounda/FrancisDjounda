package com.java.Week7.StringPrograms;

public class PrintOnlyLetterOrDigit {
    public static void main(String[] args) {

        String str = "Its Simple 1990";

        for( int i = 0; i < str.length(); i++){

            char c = str.charAt(i);
            if(Character.isLetter(c))
                System.out.print(c + " ");

        }


    }
}
