package com.javacodingchallenges.codewars.kata6;

import java.util.*;

public class DuplicateEncoder {

  public static void main(String[] args) {
    System.out.println(encode("Prespecialized"));
  }

  static String encode(String word) {
    String result = "";
    String[] charsList = word.toLowerCase().split("");
    Map<String, Integer> stringIntegerMap = new HashMap<>();
    for (String s : charsList) {
      if (stringIntegerMap.containsKey(s)) {
        stringIntegerMap.replace(s, stringIntegerMap.get(s) + 1);
      } else {
        stringIntegerMap.put(s, 1);
      }
    }

    for (String s : charsList) {
      if (stringIntegerMap.get(s) == 1) {
        result += "(";
      } else {
        result += ")";
      }
    }
    return result;
  }
}
