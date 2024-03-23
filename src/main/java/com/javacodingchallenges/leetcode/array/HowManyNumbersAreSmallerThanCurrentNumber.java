package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

        int[] nums2 = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2)));
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tempCount = 0;
            for (int k = 0; k < nums.length; k++) {
                if (i != k && nums[i] > nums[k]) {
                    tempCount++;
                }
                result[i] = tempCount;
            }
        }
        return result;
    }
}

