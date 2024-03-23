package com.javacodingchallenges.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(decompressRLElist(nums))); // [2, 4, 4, 4]

        int[] nums2 = {1, 1, 2, 3};
        System.out.println(Arrays.toString(decompressRLElist(nums2))); // [1, 3, 3]

    }


    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int k = 0; k < nums[i]; k++) {
                list.add(nums[i + 1]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
