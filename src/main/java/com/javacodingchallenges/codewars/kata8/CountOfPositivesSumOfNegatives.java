package com.javacodingchallenges.codewars.kata8;

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(nums))); // [10, -65]
    }

    public static int[] countPositivesSumNegatives(int[] nums) {
        int[] result = new int[2];
        int count = 0;
        int sum = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            if (nums[i] >= 0) {
                count ++;
            } else {
                sum += nums[i];
            }
        }
        result[0] = count;
        result[1] = sum;
        return result;
    };
}
