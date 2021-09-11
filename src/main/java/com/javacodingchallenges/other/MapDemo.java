package com.javacodingchallenges.other;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

  public static void main(String[] args) {
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("One", "Real Madrid");
    stringMap.put("Two", "Barselona");
    stringMap.put("Three", "Atletico");
    System.out.println(stringMap.entrySet());

    Map.Entry<String, String> entry = stringMap.entrySet().iterator().next();
    System.out.println(entry);
    String values = null;
    for (Map.Entry<String, String> single: stringMap.entrySet()) {
      System.out.println("key " + single.getKey());
      System.out.println("value " + single.getValue());
    }
  }
}
