package com.java.Week7.Class19;

import java.util.Scanner;

import static com.java.Week7.Class19.CountNumberOfSpaces.getNumberOfSpaces;

public class SizeOfString {
    // // Write a program to take String from user using scanner class
    //// Count the number of spaces from the String
    //// Print String is small if number of spaces less than 5
    //// Print String is medium if number of spaces
    ////  greater than or equal to 5 and less than 10
    //// Print String is large if number of spaces greater than 10
    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        System.out.println( "Please enter the number of spaces");
        int num = Franc.nextInt();
        String str = Franc.nextLine();
        int count = getNumberOfSpaces(str);

        if (count >= 10) {
            System.out.println("Large");
        } else if (count >= 5) {
            System.out.println("Medium");
        } else {
            System.out.println("Small");
        }
        System.out.println(getNumberOfSpaces(str));
    }
    static int getNumberOfSpaces(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
        return count;
            }
        }
    //  static <getNumberOfSpaces>  int(getNumberOfSpaces)(String str){
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                count++;
//            }
//        }
//                System.out.println(count);
//                return count;



