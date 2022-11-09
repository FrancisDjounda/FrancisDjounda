package com.java.Class15;

public class Homework1 {
    public static void main(String[] args) {
        int i;
        int result = 0;

        for (i = 1; i <= 50; i++) {

            if (i % 5 == 0 || i % 3 == 0) {

                result = result + i;
              //  System.out.println(result);
            }

        }

        System.out.println(result);

    }
}
