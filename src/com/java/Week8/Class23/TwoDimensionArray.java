package com.java.Week8.Class23;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // Declaration of 2D Array
        int data[][];

        // Declaration and Initialization of 2D Array
        int nums[][] = new int [3][3];

        // Declaration and Assign in one line (It's new Array and not
        // relevant to above statement)
        int info[][] = {{23, 44, 21,},
                        {45, 42, 31},
                        {73, 14, 0}};

        // Find number of rows in the Array
        System.out.println(nums.length);

        // Find number of column in a row
        System.out.println(nums.length);

        // Print data from 2D array using index based for Loop
        for ( int i = 0; i < info.length;i++){
            for( int j = 0; j < info[i].length; j++){
                System.out.print(info[i][j]+ ",");
            }
            System.out.println();
        }

    }
}
