package com.javacodingchallenges.algorithms.recursion;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println("sub is " + "hello".substring(1));
    }

    public static String reverse(String s) {
        String ret = s.isEmpty() ? "" : reverse(s.substring(1))+ s.charAt(0);

        if (s.length() > 0) {
            System.out.println(s.substring(1));
            System.out.println( s.charAt(0));
            System.out.println(" line ");
        }

        return ret;
    }
}
