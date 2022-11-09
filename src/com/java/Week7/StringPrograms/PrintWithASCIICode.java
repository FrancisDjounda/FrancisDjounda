package com.java.Week7.StringPrograms;

public class PrintWithASCIICode {

    public static void main(String[] args) {

           String str ="ITS SIMPLY";

           for( int i = 0; i < str.length(); i++){

               char c = str.charAt(i);

               System.out.println(c + " " + (int)c);
            }
    }
}
