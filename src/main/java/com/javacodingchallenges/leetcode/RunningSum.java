package com.javacodingchallenges.leetcode;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        runningSum(nums);



    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int k = 0; k <= i; k ++ ) {
                sum += nums[k];
            }
            result[i] = sum;
        }
        System.out.println("result is " + Arrays.toString(result));
        return result;
    }
}
