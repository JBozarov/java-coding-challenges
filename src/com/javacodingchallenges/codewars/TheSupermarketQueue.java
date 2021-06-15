package com.javacodingchallenges.codewars;

import java.util.*;

public class TheSupermarketQueue {
  public static void main(String[] args) {
    int[] queue = {10, 2, 14, 5};
    System.out.println(solveSuperMarketQueue(queue, 2)); // 16
    System.out.println(solveSuperMarketQueue(queue, 20)); // 14
  }

  public static int solveSuperMarketQueue(int[] customers, int n) {
    Map<Integer, Integer> isles = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      isles.put(i, 0);
    }

    for (int customer : customers) {
      Integer minValueOfMap = isles.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();
      Integer keyOfMinValueOfMap = isles.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
      isles.replace(keyOfMinValueOfMap, minValueOfMap + customer);
    }

    return isles.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
  }
}
