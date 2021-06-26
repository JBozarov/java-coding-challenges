package com.javacodingchallenges.codewars.kata6;

import java.util.Arrays;

public class NumberZooPatrol {

    public static int findMissingNumber(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        if (numbers[0] == 2 ) {
            return 1;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 2 == numbers[i + 1] ) {
                return numbers[i] + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int res = findMissingNumber(nums);
        System.out.println(res);
    }

}