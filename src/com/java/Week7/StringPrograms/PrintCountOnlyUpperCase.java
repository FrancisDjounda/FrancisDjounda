package com.java.Week7.StringPrograms;

public class PrintCountOnlyUpperCase {
    public static void main(String[] args) {
        String str = " 1st Hello World in 1998";
        int count = 0;

        for ( int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (Character.isUpperCase(c))
                count++;
        }
            System.out.print(count + " Upper");

    }
}
