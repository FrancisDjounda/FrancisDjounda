package com.java.Week7.StringPrograms;

public class PrintReverseCaseOfAString {
    public static void main(String[] args) {

        String str = "First Hello World 1998";
        String r = "";
        for( int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (Character.isUpperCase(c))
                r = r + Character.toUpperCase(c);
        else
              r = r + Character.toLowerCase(c);
            }
        System.out.println(r);
        }

    }

