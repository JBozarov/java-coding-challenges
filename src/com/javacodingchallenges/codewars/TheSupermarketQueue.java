package com.javacodingchallenges.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class TheSupermarketQueue {
  public static void main(String[] args) {
    int[] queue = {10, 2, 14, 5};
    System.out.println(solveSuperMarketQueue(queue, 23));
  }

  public static int solveSuperMarketQueue(int[] customers, int n) {
//    int max = 0;
//    for (int i : customers) {
//      if (max < i) {
//        max = i;
//      }
//    }
//    if (n >= customers.length) {
//      return max;
//    }

    Map<Integer, Integer> isles = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      isles.put(i, 0);
    }

    for (int customer : customers) {
      Integer minValueOfMap = isles.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();
      Integer keyOfMinValueOfMap = isles.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
      System.out.println("pair is " + keyOfMinValueOfMap + " " +minValueOfMap);
      isles.replace(keyOfMinValueOfMap, minValueOfMap + customer);
      System.out.println("map is " + isles);
    }

    return isles.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
  }
}
