package com.javacodingchallenges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class N_RepeatedElementInSize2NArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(repeatedNTimes(nums)); // 3

        int[] nums2 = {2, 1, 2, 5, 3, 2};
        System.out.println(repeatedNTimes(nums2)); // 2

        int[] nums3 = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(nums3)); // 5
    }

    public static int repeatedNTimes(int[] nums) {
        int count = 0;
        int n = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {
                count = entry.getKey();
            }
        }
        System.out.println(map.toString());
        return count;
    }
}
