package com.javacodingchallenges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        kidsWithCandies(candies, 3).forEach(System.out::print); // [true,true,true,false,true]

        int[] candies2 = {4, 2, 1, 1, 2};
        kidsWithCandies(candies2, 1).forEach(System.out::print); // [true,false,false,false,false]
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxValue = 0;
        for ( int i = 0; i < candies.length; i++ ) {
            if (maxValue < candies[i]) {
                maxValue = candies[i];
            }
        }

        for (int k = 0; k < candies.length; k++ ) {
            if ( (candies[k] + extraCandies) >= maxValue ) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
