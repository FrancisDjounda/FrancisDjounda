package com.java.Class11;

import java.util.Scanner;

public class CalculatorWithSwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please choose your operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = sc.nextInt();
       // if (operation == 1) {
          //  System.out.println(num1 + num2);
       // } else if (operation == 2){
           // System.out.println( num1 - num2);
        //} else if (operation == 3){
          //  System.out.println( num1 * num2);
        //} else if ( operation == 4){
           // System.out.println( num1 / num2);

        switch (operation) {
            case 1:
                System.out.println(num1 + num2);
            case 2:
                System.out.println(num1 - num2);
            case 3:
                System.out.println(num1 * num2);
            case 4:
                System.out.println(num1 / num2);


        }
}

}

