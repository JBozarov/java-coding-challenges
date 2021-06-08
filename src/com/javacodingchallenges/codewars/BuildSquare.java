package com.javacodingchallenges.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BuildSquare {

  public static void main(String[] args) {
    System.out.println(generateShape(3));
  }

    public static final String generateShape(int n) {
      String result = "";
      for ( int i = 1; i <= n; i++ ) {
          if (i == n) {
              result += "+".repeat(n);
          } else {
              result += "+".repeat(n) + "\n";
          }
      }
        return result;
    }
}
