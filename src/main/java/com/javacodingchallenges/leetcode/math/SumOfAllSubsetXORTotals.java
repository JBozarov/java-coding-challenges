package com.javacodingchallenges.leetcode.math;

import java.util.Arrays;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        //System.out.println(subsetXORSum(nums));  // 6

        int[] nums1 = {5, 1, 6};
        System.out.println(subsetXORSum(nums1)); // 28

        int[] nums2 = {3, 4, 5, 6, 7, 8};
        //System.out.println(subsetXORSum(nums2)); // 480

    }

    public static int subsetXORSum(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        System.out.println("sum is " + sum);
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k <= nums.length; k++) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(nums, i, k)));
                int[] subArray = Arrays.copyOfRange(nums, i, k);
                for (int m = 1; m < subArray.length; m++) {
                    if (subArray.length > 1) {
                        int tempXORSum = 0;
                        if (m == 1) {
                            tempXORSum = subArray[m - 1] ^ subArray[m];
                            sum += tempXORSum;
                        } else {
                            if (m <= subArray.length) {
                                tempXORSum = tempXORSum ^ subArray[m];
                                sum += tempXORSum;
                            }
                        }

                    }
                }
            }

        }


        return sum;
    }
}
