package com.javacodingchallenges.leetcode.counting;

import java.util.*;

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

        Collection<Integer> values = map.values();
        for (Integer i : values) {
            System.out.println("values are " + i);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > half) {
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}
