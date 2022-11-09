package com.java.Class13;

import java.util.Scanner;

public class HWFahrenheitUsingMethod {
    //Write a program to take a temperature from the user in celsius
    // and convert it into Fahrenheit  using the method

    public static void main(String[] args) {

        Scanner Franc = new Scanner(System.in);
        System.out.println("Enter your temperature in Celsius ");
        double Celsius = Franc.nextDouble();

        System.out.println("The Tem in Fahrenheit is " + printFahrenheitTemp(Celsius));
    }

    static double printFahrenheitTemp(double celsius) {
        double Celsius = 0;
        return   (Celsius * 9/5) + 32;
    }


}




