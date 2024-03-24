package com.javacodingchallenges.leetcode.math;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));  // 6
        System.out.println(numberOfSteps(8));   // 4
        System.out.println(numberOfSteps(123)); // 12

        System.out.println(0 ^ 2 ^ 4 ^ 6 ^ 8);
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        return recursive(count, num);
    }

    public static int recursive(int count, int num) {
        if (num == 0) {
            return count;
        } else {
            count++;
            if (num %2 == 0) {
                num = num / 2;
                return recursive(count, num);
            } else {
                num --;
                return recursive(count, num);
            }
        }
    }
}
