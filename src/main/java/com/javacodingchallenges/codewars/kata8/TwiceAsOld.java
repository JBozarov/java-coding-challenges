package com.javacodingchallenges.codewars.kata8;

public class TwiceAsOld {

  public static void main(String[] args) {
    System.out.println(TwiceAsOld(30, 7)); // 16
    System.out.println(TwiceAsOld(45,30)); // 15
  }

  public static int TwiceAsOld(int dadYears, int sonYears) {
    int count = 0;
    if (dadYears >= sonYears * 2) {
      while (dadYears > sonYears * 2) {
        dadYears += 1;
        sonYears += 1;
        count += 1;
        System.out.println(dadYears + " " + sonYears);
      }
    } else {
      while (dadYears < sonYears * 2) {
        dadYears -= 1;
        sonYears -= 1;
        count += 1;
      }
    }
    return count;
    }
}
