package com.javacodingchallenges.leetcode.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        System.out.println(targetIndices(nums, 2));

    }


    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        List<Integer> sortedList = Arrays.stream(nums)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        for ( int i = 0; i < sortedList.size(); i++ ) {
            if (sortedList.get(i) == target) {
                list.add(i);
            }
        }
        return list;
    }
}
