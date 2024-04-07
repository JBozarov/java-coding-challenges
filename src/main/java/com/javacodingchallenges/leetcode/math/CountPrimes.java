package com.javacodingchallenges.leetcode.math;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(0));   // 0
        System.out.println(countPrimes(1));   // 0
        System.out.println(countPrimes(2));   // 0
        System.out.println(countPrimes(-90)); // 0
        System.out.println(countPrimes(10));  // 4
        System.out.println(countPrimes(20));  // 8
        System.out.println(countPrimes(30));  // 10
    }


    public static int countPrimes (int n) {
        int count = 2;
        if (n <= 2) {
            return 0;
        } else if (n == 3) {
            return 1;
        } else {
            for (int i = 5; i < n; i += 2) {
                int tempCount = 0;
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0) {
                        tempCount++;
                    }
                }
                if (tempCount == 2) {
                    count++;
                }
            }
        }
        return count;
    }
}
