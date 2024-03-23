package com.javacodingchallenges.leetcode.array;

public class CountNumberOfPairsWithAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int[] nums2 = {3, 2, 1, 5, 4};
        System.out.println(countKDifference(nums, 1)); // 4
        System.out.println(countKDifference(nums2, 2)); // 3
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int m = 0; m < nums.length; m++) {
                if (i != m && (nums[i] - nums[m] == k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
