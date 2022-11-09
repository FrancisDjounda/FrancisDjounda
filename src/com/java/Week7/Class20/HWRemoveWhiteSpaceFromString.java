package com.java.Week7.Class20;

public class HWRemoveWhiteSpaceFromString {

    public static class HWRemoveWhiteSpacesFromAString {
        public static void main(String[] args) {

            String str = " Today is my favorite Day of the week, Saturday";
            String str1 = str.replaceAll("\\s", "");

            System.out.println(str1);
        }
    }
}