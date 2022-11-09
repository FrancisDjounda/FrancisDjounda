package com.java.Week7.Class19;

import java.util.Scanner;

public class HomeworkClass19 {
    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);
        System.out.println("Please enter your sentence");

        String str = Franc.nextLine();
                splitWords(str);
    }

    static void splitWords(String str){
        String words [] = str.split(" ");

        for ( int i = 0; i < words.length; i++){
            String s = words[i];
            System.out.println(s.charAt(0));
        }
    }
}
