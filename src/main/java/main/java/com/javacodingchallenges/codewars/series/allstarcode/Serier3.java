package main.java.com.javacodingchallenges.codewars.series.allstarcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Serier3 {
  public static void main(String[] args) {
    String word = "aeiouk";
    System.out.println(removeVoves(word)); // k

    String drake = "drake";
    System.out.println(drake); // drk
  }

  public static String removeVoves(String word) {
    return Arrays.stream(word.split(""))
        .map(String::toLowerCase)
        .filter(v -> !v.equals("a"))
        .filter(v -> !v.equals("e"))
        .filter(v -> !v.equals("i"))
        .filter(v -> !v.equals("o"))
        .filter(v -> !v.equals("u"))
        .collect(Collectors.joining());
  }
}
