package com.java.Week8.Class22;

public class CountPositiveAndNegative {
    public static void main(String[] args) {
        // Program to count number of +tive and -tive numb from Array
        int data[] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
        int countPositive = 0;
        int countNegative = 0;


        for (int i = 0; i < data.length; i++) {

            if (data[i] >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        System.out.println("Positive: " + countPositive);
        System.out.println("Negative: " + countNegative);

    }
}
