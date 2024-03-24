package com.javacodingchallenges.leetcode.general;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1, 1, 2};
        int[] num2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] num3 = {0, 10, 1, 1, 11, 2, 2, 32, 3, 24};

        removeDuplicates(num3);
    }

    public static int removeDuplicates(int[] nums) {
        return new HashSet<>(Arrays.stream(nums).sorted().boxed().collect(Collectors.toList())).size();
    };
}
