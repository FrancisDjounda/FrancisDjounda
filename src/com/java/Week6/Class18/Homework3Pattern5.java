package com.java.Week6.Class18;

public class Homework3Pattern5 {
    //    1
    //   000
    //  11111
    // 0000000
    //111111111
    // 0000000
    //  11111
    //   000
    //    1

    public static void main(String[] args) {
        // Upper Triangle
        for ( int i = 1; i <= 5; i++){

            for (int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++){
                System.out.print(i % 2);
            }
            System.out.println();
        }
        // Lower Triangle
        for (int i = 1; i <= 4; i++){

            for ( int l = 1; l <= i  ; l++){
                System.out.print(" ");
            }

            for( int j = 1; j <= 9 - 2 * i;j++){
                // System.out.println((i + 1) % 2);
                if ( i % 2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }
}
