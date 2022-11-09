package com.java.Week7.Class19;

public class StringAndStringMethods {
    public static void main(String[] args) {

        String str1 = " Hello World";
        String str2 = " hello World";
        String str3 = " Hello World";
        String str4 = "Hello,Welcome to java classes";
        String str5 = "hello";
        String str6 = "Hello";
        String str7 = "";
        String str8 = " ";

        // 1)  .equals()
   // Check if 2 Strings are equals or Not.
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    // 2) .equalsIgnoreCase()
    // Check if 2 Strings are equals or Not ignoring case sensitivity.
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));

        // 3) .to UpperCase()
        // Convert string characters to the upper case or lower case.

        System.out.println(str5.toUpperCase());
        System.out.println(str6.toLowerCase());
        System.out.println(str4.toUpperCase());

        // 4) .contains()
        // Check if one String contains another String.
        System.out.println(str4.contains(str6));
        System.out.println(str4.contains(str5));
        System.out.println(str6.contains(str5));

        // 5) .indexOf()
        // Get index of particular character or string.
        System.out.println(str4.indexOf('j'));
        System.out.println(str4.indexOf("Welcome"));

        // 6) .chartAt()
        // Get character at particular index
        System.out.println(str5.charAt(1));
        System.out.println(str4.charAt(3));

        // 7) .length()
        // Find Length of the String
        System.out.println(str5.length());
        System.out.println(str4.length());
        System.out.println(str2.length());
        System.out.println(str1.length());

        // 8) .isEmpty()
        // Check if string length is Zero.
        System.out.println(str7.isEmpty());
        System.out.println(str8.isEmpty());
        System.out.println(str1.isEmpty());

        // 9) isBlank()
        // Returns True if the string is empty or contains only white space,
        // otherwise False.
        System.out.println(str7.isBlank());
        System.out.println(str8.isBlank());
        System.out.println(str1.isBlank());

        // 10) .replace()
        // Replaces each substring of this string with our replacement string.
        String  str9 = "INR 200 & INR is indian currency";
        String str10 = "java is Great";

        System.out.println(str9.replace("INR", "USD"));
        System.out.println(str10.replace(" ",""));

        //10) .replaceAll()
        // Replaces each substring of this string that matches the given
        // regular expression with the given replacement.
        // [^0-9] - regular expression to replace all character except " digit"
        System.out.println(str9.replaceAll("[^0-9]", ""));
        // [^a-zA-Z]- regular expression to replace all character except "Alphabets"
        System.out.println(str9.replaceAll("[^a-zA-Z]", ""));

        //11) .format()
        // Returns a formatted string using the specified format string and arguments.
        String str11 = "Hello, Welcome to %s classes";
        String str12 = "Hello, Welcome to %s";

        System.out.println(String.format(str11, "java"));
        System.out.println(String.format(str12, "Ebay"));

        //12) .split()
        // Splits the string with given regular expression & it will return
        // array of split string
           String words[] = str4.split("");
           for(String word: words){
               System.out.print(word);
           }

         //13) .subString
        // Returns a string that is a substring of given string

        System.out.println(str4.substring(7));
        System.out.println(str4.substring(6,14));

    }
}
