package com.javacodingchallenges.leetcode.math;

import java.util.HashSet;
import java.util.Set;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
        System.out.println(commonFactors(25, 30));
    }

    public static int commonFactors(int a, int b) {
        int count = 0;
        int smaller = a > b ? b : a;
        for ( int i = 1; i <= smaller; i++ ) {
            if ( a %i == 0 && b %i == 0 ) {
                count++;
            }
        }
        return count;
    }
}
