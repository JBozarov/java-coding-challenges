package com.javacodingchallenges.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] nums3 = {1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(nums1, 3))); // [2, 3, 5, 4, 1, 7]
        System.out.println(Arrays.toString(shuffle(nums2, 4))); // [1, 4, 2, 3, 3, 2, 4, 1]
        System.out.println(Arrays.toString(shuffle(nums3, 2))); // [1, 2, 1, 2]
    }

    public static int[] shuffle(int[] nums, int n) {
        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();

        for (int i = 0; i < nums.length; i++ ) {
            if (i < nums.length / 2) {
                firstHalf.add(nums[i]);
            } else {
                secondHalf.add(nums[i]);
            }
        }

        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < firstHalf.size(); i++ ) {
            newArr.add(firstHalf.get(i));
            newArr.add(secondHalf.get(i));
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++ ) {
            result[i] = newArr.get(i);
        }
        return result;
    }
}
