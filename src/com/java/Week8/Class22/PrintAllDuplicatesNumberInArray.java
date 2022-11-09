package com.java.Week8.Class22;

public class PrintAllDuplicatesNumberInArray {
    public static void main(String[] args) {

        int[] Num = new int[]{23, 44, 23, 23, 27, 35, 35, 44, 35};
        System.out.println("Duplicate elements: ");
        int countDuplicates;
        int i;

        for (i = 0; i < Num.length - 1; i++) {
            countDuplicates = 0;
            for (int j = i + 1; j < Num.length; j++) {
                if (Num[i] == (Num[j])) {
                    countDuplicates++;
                }
            }
            if (countDuplicates == 1) {
                System.out.println(Num[i]);
            }
        }
    }
}