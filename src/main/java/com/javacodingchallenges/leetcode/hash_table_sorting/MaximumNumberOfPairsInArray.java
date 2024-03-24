package com.javacodingchallenges.leetcode.hash_table_sorting;

import com.javacodingchallenges.codewars.oldrepo.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 3, 2, 2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));

    }

    public static int[] numberOfPairs(int[] nums) {
        int[] result = new int[2];
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return looper(list, result);
    }

    public static int[] looper(List<Integer> list, int[] existingArray) {
        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < list.size(); k++) {
                if (i != k && list.get(i) == list.get(k)) {
                    list.remove(i);
                    System.out.println("line 28 new arr " + Arrays.toString(list.toArray()));
                    list.remove(k);
                    existingArray[0] = existingArray[0] + 1;
                    System.out.println(i + " " + k + " and new array " + Arrays.toString(list.toArray()));
                }
            }
        }

        if (list.size() != list.stream().distinct().count()) {
            looper(list, existingArray);
        }
        return existingArray;
    }

}
