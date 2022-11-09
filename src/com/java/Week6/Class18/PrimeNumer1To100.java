package com.java.Week6.Class18;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumer1To100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int nbr = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nbr; i++) {
            if(isPrime(i)){
                result.add(i);
            }
        }
        System.out.println("prime numbers:" + result);
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
