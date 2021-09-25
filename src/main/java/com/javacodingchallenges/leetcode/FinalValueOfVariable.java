package com.javacodingchallenges.leetcode;

public class FinalValueOfVariable {
    public static void main(String[] args) {
        String[] values = {"--X", "X++", "X--"};
        finalValueAfterOperations(values);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String operator : operations) {
            if (operator.equals("--X") || operator.equals("X--")) {
                count --;
            } else {
                count ++;
            }
        }
        return count;
    }
}
