package com.javacodingchallenges.groups.leetcode;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] ar = {2,7,11,15};
        int[] ar2 = {3,2,3};
        System.out.println(Arrays.toString(twoSum(ar, 9))); // [0,1]
        System.out.println(Arrays.toString(twoSum(ar2, 6))); // [0,2]
    }


    public static int[] twoSum(int[] nums, int target) {
        int [] results = new int[2];
        for (int i = 0; i<nums.length-1; i++ ) {
            for (int k = i+1; k<nums.length; k++ ) {
                if (nums[i] + nums[k] == target) {
                    results[0] = i;
                    results[1] = k;
                }
            }
        }
        return results;
    }
}
