package com.javacodingchallenges.codewars.kata6;

import java.util.Arrays;

public class SumOfDifferencesLCMof2Nums {

    public static void main(String[] args) {
        final int[][] arrayOfLists = {{15, 18}, {4, 5}, {12, 60}};
        final int[][] arrayOfLists2 = {{1, 1}, {0, 0}, {13, 91}};
        int result = sumDifferencesBetweenProductsAndLCMs(arrayOfLists2);
        System.out.println(result);
    }

    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
        System.out.println("hello");
        Arrays.stream(pairs).forEach(v -> System.out.println(Arrays.toString(v)));
        int result = 0;
        for (int[] pair : pairs) {
            int product = Arrays.stream(pair).reduce(1, (a, b) -> a * b);
            result += product - lcm(pair[0], pair[1]);
        }
        return result;
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static int lcm(int a, int b) {
        return gcd(a, b) == 0 ? 0 : (a / gcd(a, b)) * b;
    }
}