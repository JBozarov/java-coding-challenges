package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
        String[] people = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(people, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {

        for ( int i = 0; i < heights.length; i++ ) {
            for ( int k = 0; k < heights.length; k++ ) {
                if (i != k && heights[i] > heights[k]) {
                    int tempHeight = heights[k];
                    heights[k] = heights[i];
                    heights[i] = tempHeight;

                    String tempName = names[k];
                    names[k] = names[i];
                    names[i] = tempName;
                }
            }
        }

        return names;

    }
}
