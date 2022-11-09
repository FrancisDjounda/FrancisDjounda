package com.java.Week7.StringPrograms;

public class PrintTheReverseOfTheString {
    public static void main(String[] args) {

        String str = " Hello World ";
        String rev = "";

        for (int i = 0; i < str.length(); i++ ){
            char c = str.charAt(i);
            rev = c + rev;
        }
        System.out.println(rev);


    }
}
