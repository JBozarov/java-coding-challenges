package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));

        int[] arr2 = {1, 2};
        System.out.println(sumOddLengthSubarrays(arr2));

        int[] arr3 = {10, 11, 12};
        System.out.println(sumOddLengthSubarrays(arr3));

    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int count = 0;
        for (int k = 0; k < arr.length; k += 2) {
            for (int i = 0; i < arr.length; i++) {
                if (i + 1 + k <= arr.length) {
                    count += Arrays.stream(Arrays.copyOfRange(arr, i, i + 1 + k)).sum();
                }
            }
        }
        return count;
    }
}
