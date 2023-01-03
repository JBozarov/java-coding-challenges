package com.javacodingchallenges.leetcode.math;

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));

        int[] nums2 = {1, 5, 4, 5};
        System.out.println(maxProduct(nums2));

        int[] nums3 = {3, 7};
        System.out.println(maxProduct(nums3));

        int[] nums4 = {1, 1, 1, 1};
        System.out.println(maxProduct(nums4));
    }

    public static int maxProduct(int[] nums) {
        int returnValue = 0;
        int maxProduct = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            for ( int k = i + 1; k < nums.length; k++ ) {
                if (nums[i] * nums[k] > maxProduct) {
                    maxProduct = nums[i] * nums[k];
                    returnValue = (nums[i] -1 ) * (nums[k] - 1);
                }
            }
        }
        return returnValue;
    }
}
