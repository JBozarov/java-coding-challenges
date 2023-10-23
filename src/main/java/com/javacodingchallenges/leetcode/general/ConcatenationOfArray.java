package com.javacodingchallenges.leetcode.general;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        getConcatenation(nums); // [1, 2, 1, 1, 2, 1]

        int[] nums2 = {1, 3, 2, 1};
        getConcatenation(nums2); // [1, 3, 2, 1, 1, 3, 2, 1]
    }

    private static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length * 2; i ++ ) {
            int index = i;
            if ( i >= nums.length ) {
                index = i - nums.length;
            }
            result[i] = nums[index];
        }
        return result;
    }
}
