package com.javacodingchallenges.codewars.kata6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayDiff {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 2, 2, 2};
    int[] b = {2, 4};
    System.out.println(Arrays.toString(arrayDiff(a, b)));
  }

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
    List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
    aList.removeAll(bList);
    return aList.stream().mapToInt(Integer::intValue).toArray();
  }
}
