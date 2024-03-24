package com.javacodingchallenges.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};
        List<List<Integer>> result = mergeSimilarItems(items1, items2);  // [ [1,6], [3,9], [4,5] ]
        // result.stream().forEach(items -> System.out.println(Arrays.toString(items.toArray())));


        int[][] items11 = {{1, 1}, {3, 2}, {2, 3}};
        int[][] items22 = {{2, 1}, {3, 2}, {1, 3}};
        List<List<Integer>> result2 = mergeSimilarItems(items11, items22);  // [ [1,4], [2,4], [3,4] ]
        // result2.stream().forEach(items -> System.out.println(Arrays.toString(items.toArray())));


        int[][] items111 = {{1, 3}, {2, 2}};
        int[][] items222 = {{7, 1}, {2, 2}, {1, 4}};
        List<List<Integer>> result3 = mergeSimilarItems(items222, items111);  // [ [1,7], [2,4] ]
        result3.stream().forEach(items -> System.out.println(Arrays.toString(items.toArray())));

    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] sortedItems1 = new int[items1.length][2];

        for (int m = 0; m < items1.length - 1; m++) {
            if (items1[m][0] > items1[m + 1][0]) {
                int[] temp = items1[m];
                items1[m] = items1[m + 1];
                items1[m + 1] = temp;
            } else {

            }
        }

        for (int i = 0; i < items1.length; i++) {
            int lookedItem = items1[i][0];
            List<Integer> innerList = new ArrayList<>();
            innerList.add(lookedItem);
            int sumOfWeight = items1[i][1];
            for (int k = 0; k < items2.length; k++) {
                if (lookedItem == items2[k][0]) {
                    sumOfWeight += items2[k][1];
                }
            }
            innerList.add(sumOfWeight);
            result.add(innerList);
        }
        return result;
    }
}
