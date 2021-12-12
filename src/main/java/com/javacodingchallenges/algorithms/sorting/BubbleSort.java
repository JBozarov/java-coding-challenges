package com.javacodingchallenges.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 23, 4, 5, 2, 5, 98, 63, 51));
        int[] ints = {1, 2, 23, 4, 15, 21, 5, 98, 63, 51};


        for (int i = 0; i < ints.length -1; i ++ ) {
            for (int k = 0; k < ints.length - i - 1; k++ ) {
                if (ints[k] > ints[k + 1]) {
                    int temp = ints[k];
                    ints[k] = ints[k+1];
                    ints[k+1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(ints));

    }
}
