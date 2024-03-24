package com.javacodingchallenges.leetcode.math;

public class FindThePivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8)); //  6
        System.out.println(pivotInteger(1)); //  1
        System.out.println(pivotInteger(4)); // -1
    }

    public static int pivotInteger(int n) {
        for ( int i = 1; i <= n; i++ ) {
            int left = i * ( i + 1 ) / 2;
            int right = n * ( n + 1 ) / 2 - left + i;
            System.out.println("i " + i + " " + left + " " + right);
            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}
