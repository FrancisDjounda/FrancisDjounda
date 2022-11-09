package com.java.Week6.Class17;

public class NesterForLoopExample8 {
    //  Print
    //    A
    //   AAA
    //  AAAAA
    // AAAAAAA
    //AAAAAAAAA

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int s = 1; s <= 10 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("A");
            }

            System.out.println();
        }
    }
}