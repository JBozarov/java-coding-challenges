package com.javacodingchallenges.leetcode.math;

import java.util.Arrays;

public class Maximum69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669)); // 9969
    }

    public static int maximum69Number(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        for ( int i = 0; i < chars.length; i++ ) {
            if (String.valueOf(chars[i]).equals("6")) {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}
