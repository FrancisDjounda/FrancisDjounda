package com.java.Week8.Class22;

public class FindIndexOfTheNumber {
    public static void main(String[] args) {

        int data[] = {12, 34, 56, 23, 76, 33, 74, 32, 21};

                int targetNumber = 76;
        System.out.println(findIndex(data, targetNumber));


    }

        static int findIndex(int data[], int targetNumber){

        for( int i = 0; i < data.length; i++){
            if(data[i] == targetNumber)
                return i;
        }
        return -1;
    }
}
