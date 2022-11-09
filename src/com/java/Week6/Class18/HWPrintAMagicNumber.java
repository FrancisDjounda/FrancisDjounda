package com.java.Week6.Class18;

public class HWPrintAMagicNumber {
    public static void main(String[] args) {

        for ( int i = 1; i <=100; i++){

            if(isMagic(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isMagic(int num) {

        if( num % 5 ==4 && num %4 ==3 && num %3 ==2 && num %2 ==1) {
            return true;
        }else{
            return false;
        }
    }
}
