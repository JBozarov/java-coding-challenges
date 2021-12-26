package com.javacodingchallenges.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] acc1 = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(acc1));

        maximumWealthStream(acc1);


    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++ ) {
            int temp = 0;
            for (int k = 0; k < accounts[i].length; k++ ) {
                temp += accounts[i][k];
            }
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }

    public static int maximumWealthStream(int[][] accounts) {
        IntStream stream = Arrays.stream(accounts).flatMapToInt(x -> Arrays.stream(x));
        stream.forEach(System.out::println);
        return 1;
    }
}
