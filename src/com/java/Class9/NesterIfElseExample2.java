package com.java.Class9;

import java.util.Scanner;

public class NesterIfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println("Please enter your salary ");
        int salary = sc.nextInt();

        if(age < 18){
            System.out.println("You are not eligible");
        }
            else if ( age >= 18 && salary < 5000   ) {
            System.out.println("Sorry, you need to work hard to get credit card");

            } else if ((age >= 18 && salary >= 20000)){
                System.out.println("You are eligible");

            } else {
            System.out.println("You will get free credit card");
        }


    }
}
