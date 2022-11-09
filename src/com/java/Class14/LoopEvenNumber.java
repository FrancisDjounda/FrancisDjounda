package com.java.Class14;

public class LoopEvenNumber {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 20) {
         if ( i %2 == 0 );
         System.out.println(i);
         i++;
         }

         // Another approach
         i = 2;
         while (i <= 20);
         System.out.println(i);
         i = i + 2;

        // Another approach
        i = 1;
        while (i <= 20) {
            i++;
            System.out.println(i);
            i++;
        }
    }
}
