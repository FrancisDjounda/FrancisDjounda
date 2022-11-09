package com.java.Week7.StringPrograms;

public class PrintIfAStringIsAPalindrome {
    public static void main(String[] args) {
        String str = " 1st Hello World in 1998";
        String rev = "";
        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            rev = c + rev;
        }
           if (str.equalsIgnoreCase(rev))
               System.out.println("Yes it's a Palindrome");
           else
               System.out.println("No it's not a Palindrome");

    }
}
