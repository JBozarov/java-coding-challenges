package com.javacodingchallenges.leetcode.counting;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));
    }


    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for ( int i = 0; i < accounts.length; i++ ) {
            int[] currentArray = accounts[i];
            int sum = 0;
            for ( int k = 0; k < currentArray.length; k++ ) {
                sum += currentArray[k];
            }
            if (maxWealth < sum) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
