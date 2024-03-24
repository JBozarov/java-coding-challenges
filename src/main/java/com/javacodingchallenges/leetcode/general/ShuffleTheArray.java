package com.javacodingchallenges.leetcode.general;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));


    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        for (int i = 0; i < nums.length; i++ ) {
            if ( i %2 ==0 ) {
                shuffled[i] = nums[i/2];
            } else {
                shuffled[i] = nums[n+i/2];
            }
        }
        return shuffled;
    }
}
