package com.javacodingchallenges.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        buildArray(nums); // [0, 1, 2, 4, 5, 3]

        int[] nums1 = {5, 0, 1, 2, 3, 4};
        buildArray(nums1); // [4, 5, 0, 1, 2, 3]

    }
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
