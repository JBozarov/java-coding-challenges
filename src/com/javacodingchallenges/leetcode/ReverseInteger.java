package com.javacodingchallenges.groups.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        int k = 1563847412;
        int i = reverse(k);
        System.out.println("i is " + i);
    }

    public static int reverse(int x) {
        long result = 0;
        if (x < 0) {
            result = -Long.parseLong(new StringBuilder(String.valueOf((int) Math.sqrt(Math.pow(x, 2)))).reverse().toString());
        } else {
            result = Long.parseLong(new StringBuilder(String.valueOf(x)).reverse().toString());
        }
        if (result > Math.pow(2, 31) - 1 || result < -Math.pow(2, 31)) {
            return 0;
        }
        return (int) result;
    }
}
