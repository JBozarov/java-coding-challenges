package com.javacodingchallenges.leetcode.math;

import java.util.Arrays;

public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args) {
        System.out.println(countDigits(7));
        System.out.println(countDigits(121));
        System.out.println(countDigits(1248));
    }


    public static int countDigits(int num) {
        return (int) Arrays.stream(String.valueOf(num).split(""))
                .map(Integer::valueOf)
                .filter(v -> num % v == 0)
                .count();
    }
}
