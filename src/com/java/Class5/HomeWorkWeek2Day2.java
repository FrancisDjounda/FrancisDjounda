package com.java.Class5;

public class HomeWorkWeek2Day2 {

    public static void main(String[] args) {

        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;

        System.out.println(i + j); // statement1: 30
        System.out.println("i + j");// statement1: i + j
        System.out.println(str1 + i);// statement1: Hello10
        System.out.println(str1 + i + j);// statement1: Hello1020
        System.out.println(i + j + str1);// statement1:30Hello
        System.out.println(str1 + i * j);// statement1:Hello200
        System.out.println(i - j + str1);// statement1:Error
        System.out.println(str1 + i + j + str2);// statement1: Hello1020java

    }
}
