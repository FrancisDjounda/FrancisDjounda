package com.java.Week7.StringPrograms;

public class PrintOnlyLowerCaseCharacter {
    public static void main(String[] args) {

        String str = " Its Simple";

        for ( int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(Character.isLowerCase(c))
              System.out.print(c + " ");
        }

    }
}
