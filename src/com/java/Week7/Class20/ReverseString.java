package com.java.Week7.Class20;

public class ReverseString {
    public static void main(String[] args) {
        String str = "InmaihK garihC";

        String rev = "";

        for (int i = 0; i < str.length(); i++ ){
            char c = str.charAt(i);
            rev = c + rev;
        }
        System.out.println(rev);

    }
    }

