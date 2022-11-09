package com.java.Class15;

import java.util.Scanner;

public class CalculatorUsingDoWhileLoop {
    public static void main(String[] args) {
        Scanner Franc = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("Please enter 1st number: ");
            int num1 = Franc.nextInt();
            System.out.println("Please enter 2nd number: ");
            int num2 = Franc.nextInt();
           // System.out.println("Please enter 3rd number: ");
           // int num3 = Franc.nextInt();

            System.out.println("Please enter your operation");
            String operator = Franc.next();

            switch (operator.toLowerCase()) {
                case "add":
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "sub":
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "mul":
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "div":
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Please choose right operation");
            }
            System.out.println(" Do you want to try one more time ?");
            System.out.println("Press 1 for Yes");
            System.out.println("Press 2 for No");
            choice = Franc.nextInt();
        } while (choice == 1);

        }
    }

