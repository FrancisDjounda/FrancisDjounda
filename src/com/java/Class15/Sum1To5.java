package com.java.Class15;

public class Sum1To5 {

    public static void main(String[] args) {
        int result = 0;

        for ( int i = 1; i <= 5; i++) {
            result = result + i;
           // System.out.println(result);       // i = 1 -> result = 0 + 1 = 1
        }                         // i = 2 -> result = 1 + 2 = 3
        System.out.println(result); // i = 3 -> result = 3 + 3 = 6
                                    //  i = 4 -> result = 6 + 4 = 10
                                    //  i = 5 -> result = 10 + 5 = 15
    }
}  //              (1    2)    3    4    5
   //                ( 3   +  3)
   //                     (6   +   4)
   //                        (10  +    5)

  //                              15
