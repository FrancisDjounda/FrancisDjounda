package com.java.Week8.Class23;

public class ForEachLoop {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 44, 35};

        // Printing all elements of Array Using index based for Loop
        // Iterating / Traversing

        for( int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        // Print all elements of Array for each loop / Enhance for Loop

        for( int num : data) {
            System.out.println(num);
        }
    }
}
