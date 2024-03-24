package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(sumOfUnique2(nums)); // 4

        int[] nums2 = {10, 4, 10, 9, 5};
        System.out.println(sumOfUnique2(nums2)); // 18

        int[] nums3 = {1, 1, 1, 1, 1};
        System.out.println(sumOfUnique2(nums3));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        String string = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(""));
        for ( int i = 0; i < nums.length; i++ ) {
            String leftSub = Arrays.stream(Arrays.copyOfRange(nums, 0, i)).mapToObj(String::valueOf).collect(Collectors.joining());
            String rightSub = Arrays.stream(Arrays.copyOfRange(nums, i, nums.length)).mapToObj(String::valueOf).collect(Collectors.joining());
            System.out.println("i is " + i + " " + leftSub + " " + rightSub);
            if ( !(leftSub + rightSub).contains(String.valueOf(nums[i])) ) {
                System.out.println("hit");
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int sumOfUnique2(int[] nums) {
        int sum = Arrays.stream(nums).sum();

        for ( int i = 0; i < nums.length; i++ ) {
            // System.out.println( i + " " + sum);
            for ( int k = 0; k < nums.length; k++ ) {
                if (i != k && nums[i] == nums[k]) {
                    sum -= nums[i];
                    break;
                }
            }
        }
        return sum;
    }
}
