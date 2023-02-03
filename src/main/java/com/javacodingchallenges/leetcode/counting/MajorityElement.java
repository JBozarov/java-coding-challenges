package com.javacodingchallenges.leetcode.counting;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElement(arr)); // 3

        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr2)); // 2

    }

    public static int majorityElement(int[] nums) {
        int majorityElement = 0;
        int half = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for ( Integer i : nums ) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > half) {
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}
