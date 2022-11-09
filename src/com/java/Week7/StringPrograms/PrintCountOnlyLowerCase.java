package com.java.Week7.StringPrograms;

public class PrintCountOnlyLowerCase {

    public static void main(String[] args) {

        String str = " First Hello World in 1998";
        int count = 0;
        int countu = 0;
        int countd = 0;
        int countr = 0;

         for( int i = 0; i < str.length(); i++){
             char c = str.charAt(i);
             char r = str.charAt(i);

             if( Character.isLowerCase(c))
                 count++;
             if( Character.isUpperCase(c))
                 countu++;
             if( Character.isDigit(c))
                 countd++;
             if( Character.isLetter(r))
                 countr++;

         }
        System.out.println(count + " Lower ");
        System.out.println(countu + " Upper ");
        System.out.println(countd + " Digit ");
        System.out.println(countr + " Letter ");


    }


}
