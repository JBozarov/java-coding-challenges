package com.javacodingchallenges.leetcode.math;

import java.util.Arrays;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));  // 15
        System.out.println(subtractProductAndSum(4421)); // 21
    }


    public static int subtractProductAndSum(int n) {
        return Arrays
                .stream(String.valueOf(n).split(""))
                .map(Integer::valueOf)
                .reduce(1, (a, b) -> a * b) -
                Arrays
                        .stream(String.valueOf(n).split(""))
                        .map(Integer::valueOf)
                        .reduce(0, (a, b) -> a + b);
    }
}
