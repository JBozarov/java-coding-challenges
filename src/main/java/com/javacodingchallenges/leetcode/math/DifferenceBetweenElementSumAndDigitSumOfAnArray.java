package com.javacodingchallenges.leetcode.math;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));  // 9

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(differenceOfSum(nums2)); // 0
    }

    public static int differenceOfSum(int[] nums) {
        int sumOfElements = Arrays.stream(nums).sum();
        int sumOfDigits = 0;

        for (int i = 0; i < nums.length; i++ ) {
            String current = String.valueOf(nums[i]);
            for (int k = 0; k < current.length(); k++ ) {
                sumOfDigits += Integer.valueOf(String.valueOf(current.charAt(k)));
            }
        }

        return Math.abs(sumOfDigits - sumOfElements);
    }
}
