package com.javacodingchallenges.leetcode.general;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] acc1 = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(acc1));

        System.out.println(maximumWealthStream(acc1));


    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++ ) {
            int temp = 0;
            temp = Arrays.stream(accounts[i]).reduce(0, (c, a) -> c + a); 
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }

    public static int maximumWealthStream(int[][] accounts) {
        for (int i = 0; i < accounts.length; i++ ) {

        }
        return Arrays.stream(accounts).flatMapToInt(x -> Arrays.stream(x)).reduce(0, (c, e) -> c + e);

    }
}
