package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 2};
        System.out.println(divideArray(nums)); // true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(divideArray(nums2)); // false
    }

    public static boolean divideArray(int[] nums) {
        int[] sortedArray = Arrays.stream(nums).sorted().toArray();
        for ( int i = 0; i < sortedArray.length; i += 2 ) {
            if (sortedArray[i] != sortedArray[i+1]) {
                return false;
            }
        }
        return true;
    }
}
