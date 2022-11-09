package com.java.Week8.Class22;

public class PrintIndexOfTheNumber {
    public static void main(String[] args) {
        int data[] = {12, 34, 56, 23, 76, 33, 74, 32, 21};
        int targetNum = 76;

        System.out.println(findIndex(data, targetNum));


    }

      static int findIndex(int data[], int targetNum){

       for( int i = 0; i < data.length; i++){
           if( data[i] == targetNum)
               return i;
       }
            return -1;


    }
}





