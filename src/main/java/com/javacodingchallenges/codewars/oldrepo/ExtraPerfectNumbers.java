package com.javacodingchallenges.codewars.oldrepo;

import java.util.ArrayList;
import java.util.List;

public class ExtraPerfectNumbers {
  public static int[] extraPerfect(int number) {
    List<Integer> results = new ArrayList<>();

    for (int i = 1; i <= number; i++) {
      String temp = Integer.toBinaryString(i);
      if (temp.charAt(0) == temp.charAt(temp.length() - 1)) {
        results.add(i);
      }
    }
    return results.stream().mapToInt(Integer::intValue).toArray();
  }
        }