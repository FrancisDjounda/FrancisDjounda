package com.java.Week6.Class18;

public class HWPrintPrimeNumFrom1To100 {
    public static void main(String[] args) {

        for ( int i = 1; i <= 100; i++){

            if ( isPrime(i)){
                System.out.print(i + " - ");
            }
        }
    }

    public static boolean isPrime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2){
            return true;
        }else {
            return false;
        }

    }
}
