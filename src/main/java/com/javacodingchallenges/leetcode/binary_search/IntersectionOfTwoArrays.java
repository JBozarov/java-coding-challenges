package com.javacodingchallenges.leetcode.binary_search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));  // [2]

        int[] nums3 = {4, 9, 5}, nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));  // [4, 9]
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++ ) {
            for (int k = 0; k < nums2.length; k++) {
                if (nums1[i] == nums2[k]) {
                    set.add(nums1[i]);
                }
            }
        }
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
