package com.javacodingchallenges.leetcode.math;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(6));  // 6
        System.out.println(smallestEvenMultiple(5));  // 10
    }


    public static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}
