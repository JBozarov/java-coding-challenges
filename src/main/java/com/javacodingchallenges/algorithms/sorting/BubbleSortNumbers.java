package com.javacodingchallenges.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortNumbers {
    public static void main(String[] args) {
        int[] nums = {112, 2, 23, 4, 5, 1, 5, 98, 63, 51};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++ ) {
            for (int k = 0; k < nums.length; k++ ) {
                if (i != k && nums[i] > nums[k]) {
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}
