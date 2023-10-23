package com.javacodingchallenges.codewars.oldrepo;

public class CountDig {
    public static int nbDig(int n, int d) {
       int result = 0;
       for ( int i = 0; i<=n; i++ ) {
           int temp = i*i;
           String tempString = String.valueOf(temp);
           String[] tempArray = tempString.split("", tempString.length());
           for (int k = 0; k<tempArray.length; k++ ) {
               int innerTemp = Integer.parseInt(tempArray[k]);
               if (d == innerTemp) {
                   result += 1;
               }
           }
       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(nbDig(25, 1));
    }
}
