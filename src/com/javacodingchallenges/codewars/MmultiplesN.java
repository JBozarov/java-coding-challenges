package com.javacodingchallenges.codewars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MmultiplesN {

  public static void main(String[] args) {
    int[] res = multiples(3, 5);
    System.out.println(Arrays.toString(res));
  }

  public static int[] multiples(int m, int n) {
    int[] results = new int[m];
    for (int i = 0; i < m; i++) {
      results[i] = n*(i+1);
    }
    return results;
  }
}
