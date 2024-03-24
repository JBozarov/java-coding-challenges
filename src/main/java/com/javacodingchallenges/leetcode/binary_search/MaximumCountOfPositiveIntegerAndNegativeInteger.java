package com.javacodingchallenges.leetcode.binary_search;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        System.out.println(maximumCount(nums));

        int[] nums2 = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println(maximumCount(nums2));

        int[] nums3 = {5, 20, 66, 1314};
        System.out.println(maximumCount(nums3));
    }


    public static int maximumCount(int[] nums) {
        int negativeCount = 0;
        int positiveCount = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            if (nums[i] < 0) {
                negativeCount++;
            } else if (nums[i] > 0) {
                positiveCount++;
            }
        }
        return negativeCount >= positiveCount ? negativeCount : positiveCount;
    }
}
