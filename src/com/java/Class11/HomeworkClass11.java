package com.java.Class11;

import java.util.Scanner;

public class HomeworkClass11 {

    public static void main(String[] args) {

        System.out.println(" Please enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch ( num) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong number");


        }
    }
}
