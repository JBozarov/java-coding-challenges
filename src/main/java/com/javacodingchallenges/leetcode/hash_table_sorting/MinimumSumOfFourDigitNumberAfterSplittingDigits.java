package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
        System.out.println(minimumSum(4009));

    }

    public static int minimumSum(int num) {
        int[] nums = new int[String.valueOf(num).length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
        }

        Arrays.sort(nums);
        int pairOne = 0;
        int pairTwo = 0;


        if (nums[0] == 0) {
            pairOne = nums[2];
        } else {
            pairOne = 10 * nums[0] + nums[2];
        }

        if (nums[1] == 0) {
            pairTwo = nums[3];
        } else {
            pairTwo = 10 * nums[1] + nums[3];
        }

        return pairOne + pairTwo;
    }
}
