package com.java.Week7.Class19;

public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Hello, How are you Francis?";
        char target = 'e';
        int count = 0;

        for ( int i = 0; i <str.length(); i++){
            if (str.charAt(i) == target){
                count++;
            }
            System.out.println(str.charAt(i));
        }
        System.out.println(count);
    }
}
