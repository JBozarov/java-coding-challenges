package com.javacodingchallenges.leetcode.array;

import java.util.Collections;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        // LeetCode 2367
        int[] nums = { 0, 1, 4, 6, 7, 10 };
        System.out.println(arithmeticTriplets(nums, 3)); // 2

        int[] nums2 = {4, 5, 6, 7, 8, 9};
        System.out.println(arithmeticTriplets(nums2, 2)); // 2

    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int k = nums.length - 1; k >= 0; k-- ) {
            for ( int j = k; j >= 0; j-- ) {
                for ( int i = j; i >= 0; i-- ) {
                    if ( (i<j && j<k) && (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) ) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
