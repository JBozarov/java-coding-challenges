package com.javacodingchallenges.codewars.kata8;

public class SumOfStrings {

  public static void main(String[] args) {
    System.out.println(sumOfStrings("4", "35"));
  }

  public static int sumOfStrings(String a, String b) {
      return Integer.parseInt(a) + Integer.parseInt(b);
  }
}

