package com.javacodingchallenges.codewars.kata8;

import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static void main(String[] args) {
    /*
        Given an array of integers.
        Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
        If the input array is empty or null, return an empty array.
        Example
        For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
    */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        System.out.println(Arrays.toString(countAndSum(arr))); // [10, -65]

    }

    public static int[] countAndSum(int[] arr) {
        int a = 0;
        int b = 0;
        a = (int) Arrays.stream(arr).filter(k -> k >= 0).count();
        b = Arrays.stream(arr).filter(m -> m < 0).sum();
        int[] result = {a, b};
        return result;
    }
}
