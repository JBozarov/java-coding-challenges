package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
        System.out.println(maxProductDifference(nums)); // 34
        System.out.println(maxProductDifference(nums2)); // 66
    }

    // using predefined Arrays sort method
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }

    // using bubble sort
    public static int maxProductDifference2(int[] nums) {

        for ( int i = 0; i < nums.length; i++ ) {
            for ( int k = 0; k < nums.length; k++ ) {
                if (i != k && nums[i] < nums[k]) {
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
