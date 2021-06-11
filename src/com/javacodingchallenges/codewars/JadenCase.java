package com.javacodingchallenges.codewars;

import java.util.Arrays;

public class JadenCase {

  public static void main(String[] args) {
    System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
  }

  public static String toJadenCase(String phrase) {
    if (phrase == null || phrase.equals("")) {
      return null;
    }
    return Arrays.stream(phrase.split(" "))
        .map(v -> String.valueOf(v.charAt(0)).toUpperCase() + v.substring(1))
        .reduce("", (sum, cur) -> sum + " " + cur).trim();
  }
}
