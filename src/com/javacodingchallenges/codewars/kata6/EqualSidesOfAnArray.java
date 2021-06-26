package com.javacodingchallenges.codewars.kata6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualSidesOfAnArray {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,3,2,1};
    System.out.println(findEvenIndex(numbers));
  }

  public static int findEvenIndex(int[] arr) {
    int result = -1;
    List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
    for (int i = 0; i < nums.size(); i++ ) {
      Integer left = nums.subList(0, i).stream().reduce(0, Integer::sum);
      Integer right = nums.subList(i+1, nums.size()).stream().reduce(0, Integer::sum);
      if (left.equals(right)) {
        result = i;
      }
    }
    return result;
  }
}