package com.java.Week8.Class23;

public class SumOfArrayElementUsingForLoop{
    public static void main(String[] args) {

        int data[] = {23, 44, 21, 23, 23, 35, 35, 44, 35};

        int Sum = 0;

        for( int num : data){
            Sum = Sum + num;

        }
        System.out.println(Sum);



    }
}
