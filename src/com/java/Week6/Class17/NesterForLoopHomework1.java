package com.java.Week6.Class17;
public class NesterForLoopHomework1 {
    // Print
    //    A
    //   AAA
    //  AAAAA
    // AAAAAAA
    //AAAAAAAAA
    // AAAAAAA
    //  AAAAA
    //   AAA
    //    A
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int s = 1; s <= 10 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {

            for (int s = 20; s >= 22 - i; s--) {
                System.out.print(" ");
            }
            for (int j = 22; j >= i * 2 + 2; j--) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}