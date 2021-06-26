package com.javacodingchallenges.codewars.kata6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MmultiplesN {

  public static void main(String[] args) {
    int[] res = multiples(3, 5);
    Arrays.stream(res).map(v -> v*3).sum();
    System.out.println(Arrays.toString(res));
  }

  public static int[] multiples(int m, int n) {
    int[] results = new int[m];
    for (int i = 0; i < m; i++) {
      results[i] = n*(i+1);
    }

    // Better way using IntStrem
    return IntStream.rangeClosed(1, m).map(v -> v*n).toArray();
  }
}
