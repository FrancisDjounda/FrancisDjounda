package com.java.Week6.Class17;

public class NesterForLoopExample6 {
    //  Print
    //A
    // AA
    // AAA
    // AAAA
//     AAAAAA
    // AAAAA
    //  AAAA
    //  AAA
    //  AA
    //  A
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for ( int j= 1; j <= i; j++){
                System.out.print("A");
            }
            System.out.println();
        }
        for ( int i = 1; i <= 9; i++) {
            for ( int j = 1; j <= 10 - i; j++){
                System.out.print("A");
            }
            System.out.println();
        }

    }
}