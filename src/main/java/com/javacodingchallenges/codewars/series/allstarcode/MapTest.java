package com.javacodingchallenges.codewars.series.allstarcode;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

  public static void main(String[] args) {

    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("K1", "V1");
    stringMap.put("K2", "V2");
    stringMap.put("K3", "V3");
    stringMap.put("K3", "V4");

    for (Map.Entry<String, String> entry : stringMap.entrySet()) {
      System.out.println(entry.getValue() + " ------- " + entry.getKey());
    }
  }
}
