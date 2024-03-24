package com.javacodingchallenges.leetcode.string;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("jahongir"));
        System.out.println(reverseWithLoop("jahongir"));
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static String reverseWithLoop(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        for ( int i = s.length() - 1; i >= 0; i-- ) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
