package com.javacodingchallenges.codewars.kata6;

import java.util.*;
import java.util.stream.Collectors;

public class TakeATenMinuteWalk {
  public static void main(String[] args) {
      char[] directions = new char[] {'n','s','n','s','n','s','n','s','n','s', 'e'};
      System.out.println(isValid(directions));
  }

  public static boolean isValid(char[] walk) {
    Map<Character, Integer> directionsMap = new HashMap<>();
        for (char c : walk) {
          if (directionsMap.containsKey(c)) {
            directionsMap.replace(c, directionsMap.get(c) + 1);
          }
          else {
            directionsMap.put(c, 1);
          }
        }
      List<Character> keysList = new ArrayList<>(directionsMap.keySet());
    System.out.println();
    if (keysList.size() == 1 || keysList.size() == 3) {
        return false;
    } // else if (keysList.size() == 2 && ())

    return true;
  }
}
