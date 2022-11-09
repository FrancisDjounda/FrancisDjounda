package com.java.Week6.Class17;

public class NesterForLoopExample4 {
         //print
    //A
   // AA
   // AAA
   // AAAA
//    AAAAAA

    public static void main(String[] args) {
        for ( int i =1; i <= 5; i++) {

            for ( int j = 1; j <= i; j++) {

                System.out.print("A");
            }
            System.out.println();
        }
    }
}
