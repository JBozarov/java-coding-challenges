package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 12};
        System.out.println(findFinalValue(nums, 3)); // 24

        int[] nums2 = {2, 7, 9};
        System.out.println(findFinalValue(nums2, 4)); // 4
    }

    public static int findFinalValue(int[] nums, int original) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return recursiveCheck(list, original);
    }

    public static int recursiveCheck (List<Integer> list, int original) {
        if (list.contains(original)) {
            original *= 2;
            return recursiveCheck(list, original);
        }
        return original;
    }

}
