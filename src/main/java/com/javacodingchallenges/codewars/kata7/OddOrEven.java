package com.javacodingchallenges.codewars.kata7;

import java.util.Arrays;


public class OddOrEven {

    public static void main(String[] args) {
        int[] nums = {2, 5, 34, 6};
        int[] numOne = {0};
        System.out.println(oddOrEven(nums));
        System.out.println(oddOrEven(numOne));
    }

    public static String oddOrEven (int[] array) {
        return Arrays.stream(array).reduce(0, (a, b) -> a + b)%2 == 0 ? "Even" : "Odd";
    }
}