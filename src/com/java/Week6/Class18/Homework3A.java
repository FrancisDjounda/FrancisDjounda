package com.java.Week6.Class18;

public class Homework3A {
    public static void main(String[] args) {

        for ( int i = 5; i >= 1 ; i--) {

            for ( int j = 5; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 5; k >= 5 - i + 1;k--){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
/** for ( int i = 1; i <= 5; i++){

 for ( int j = 1; j <= 3; j++){
 System.out.print(j);*/