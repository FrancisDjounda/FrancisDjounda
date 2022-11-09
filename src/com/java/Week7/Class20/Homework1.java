package com.java.Week7.Class20;

public class Homework1 {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0;

        String str = "Today is Saturday";
        str = str.toLowerCase();

        for ( int i = 0; i < str.length(); i++){

            if( str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='u' ||
                    str.charAt(i)=='i' || str.charAt(i)=='o') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                cCount++;
            }
        }
        System.out.println("All Vowels are: " + vCount);
        System.out.println("All consonants are: " + cCount);


    }
}
