package com.java.Week7.Class19;

public class CountNumberOfSpaces {
    public static void main(String[] args) {

        String str = "Hello User, How are you friend customer ?";
        System.out.println(getNumberOfSpaces(str));

    }

    static int getNumberOfSpaces(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
//         static int getnumberofspaces( String str){
//            int count = 0;
//          for( int i = 0; i < str.length(); i++ ){
//           if ( str.charAt(i) == ' ' ){
//              count++;
//          }
//        }
//             System.out.println(count);
//            return count;


// sout
// getnmofspaces