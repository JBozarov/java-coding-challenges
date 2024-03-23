package com.javacodingchallenges.leetcode.algorithms;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums2));
    }


    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]){
                nums[count] = nums[i + 1];
                count+=1;
            }
        }
        return count;
    }
}
