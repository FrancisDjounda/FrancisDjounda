package com.java.Week6.Class17;

import java.util.Scanner;

public class NesterForLoopExample7 {
    // Print
    //    A
    //   AA
    //  AAA
    // AAAA
    //AAAAA

    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        int num = Franc.nextInt();

        for ( int i = 1; i <= num; i++){
            for ( int s = 1; s <= num - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("A");
            }
            System.out.println();
        }


    }
}
