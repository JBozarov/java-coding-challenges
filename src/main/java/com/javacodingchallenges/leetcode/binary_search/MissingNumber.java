package com.javacodingchallenges.leetcode.binary_search;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));   // 8

        int[] nums2 = {3, 0, 1};
        System.out.println(missingNumber(nums2));  // 2

        int[] nums3 = {0, 1};
        System.out.println(missingNumber(nums3));  // 2
    }


    public static int missingNumber(int[] nums) {
        int missingNumber = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if ( min > current) {
                min = current;
            }
            if ( max < current) {
                max = current;
            }
        }


        if (max != nums.length) {
            return nums.length;
        }

        Arrays.sort(nums);
        for ( int i = 0; i <= nums.length; i++ ) {
            if (nums[i] != i) {
                return i;
            }
        }

        return missingNumber;
    }
}
