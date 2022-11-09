package com.java.Week8.Class23;

public class SortElementInAscendingOrder {
    public static void main(String[] args) {
        int i;
        int j;
        int count;

        int num[] = {5, 2, 8, 7, 3, 6};

        for (i = 0; i < num.length - 1; i++) {
            count = 0;
            for (j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    count = num[i];
                    num[i] = num[j];
                    num[j] = count;

                }
            }
        }
          for (int a : num)
             System.out.println(a);
            }
        }



