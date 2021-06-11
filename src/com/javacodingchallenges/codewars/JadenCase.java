package com.javacodingchallenges.codewars;

import java.util.Arrays;

public class JadenCase {

  public static void main(String[] args) {
    System.out.println(toJadenCase("men Seni Sevaman guncha"));
  }


    public static String toJadenCase(String phrase) {
        String result = Arrays.stream(phrase.split(" "))
                .map(v -> String.valueOf(v.charAt(0)).toUpperCase())
                .reduce("", (sum, cur) -> sum + " " + cur);

        return result;
    }


}
