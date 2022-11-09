package com.java.Class11;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        System.out.println("Please enter number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       switch(num) {
           case 0:
               System.out.println("Zero");
               break;
           case 1:
               System.out.println("one");
               break;
           case 2:
               System.out.println("two");
           case 3:
               System.out.println("tree");
               break;
           case 4:
               System.out.println("four");
               break;
           case 5:
               System.out.println("five");
               break;
           default:
               System.out.println("zero");


       }

    }
}
