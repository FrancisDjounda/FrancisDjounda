package com.java.Week6.Class17;

public class NesterForLoopExample5 {
    // Print
    // AAAAA
   //  AAAA
   //  AAA
   //  AA
   //  A
    public static void main(String[] args) {

        for ( int i = 1; i <= 15; i++) {
            for (int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = 1; j <= 16-i; j++){
                System.out.print("A");
            }
            System.out.println();
        }


    }
}
