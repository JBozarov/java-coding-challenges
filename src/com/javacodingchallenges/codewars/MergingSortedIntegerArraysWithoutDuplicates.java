package com.javacodingchallenges.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergingSortedIntegerArraysWithoutDuplicates {
  public static void main(String[] args) {
    int[] first = {2, 3, 4};
    int[] second = {2, 5, 1};
    System.out.println(Arrays.toString(mergeArrays(first, second)));
  }

  public static int[] mergeArrays(int[] first, int[] second) {
    return IntStream.concat(Arrays.stream(first), Arrays.stream(second)).sorted().distinct().toArray();
  }
}
