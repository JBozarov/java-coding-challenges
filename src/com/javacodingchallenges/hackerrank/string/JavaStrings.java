package com.javacodingchallenges.hackerrank.string;

import java.util.Scanner;

public class JavaStrings {

    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       String A = sc.next();
       String B = sc.next();

       System.out.println(A.length() + B.length());
      
       System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
      
       A = A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0)));
       B = B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0)));
       System.out.println(A + " " + B);
      
    }
  
}
