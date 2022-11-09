package com.java.Week8.Class22;

public class HWPrintGreatestNumberFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 44, 21, 56, 27, 35, 75, 34, 25};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Greatest Number is: " + max);


    }
}