package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr)); // true

        int[] arr2 = {1, 2};
        System.out.println(uniqueOccurrences(arr2)); // false

        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr3)); // true
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++ ) {
            int key = arr[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set.size() == map.size();
    }
















}
