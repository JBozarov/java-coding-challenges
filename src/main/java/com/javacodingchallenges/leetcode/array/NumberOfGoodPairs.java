package com.javacodingchallenges.leetcode.array;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int[] nums2 = { 1, 1, 1, 1 };
        System.out.println(numIdenticalPairs(nums)); // 4
        System.out.println(numIdenticalPairs(nums2)); // 6
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++ ) {
            for (int k = 0; k < nums.length; k++ ) {
                if ( i != k ) {
                    if ( nums[i] == nums[k] ) {
                        count ++;
                    }
                }
            }
        }
        return count % 2 == 0 ? count / 2 : count / 2 - 1/2;
    }
}
