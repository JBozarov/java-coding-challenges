package com.javacodingchallenges.other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

  public static void main(String[] args) {
    Map<String, String> stringMap = new HashMap<>();
//    stringMap.put("One", "Real Madrid");
//    stringMap.put("Two", "Barselona");
//    stringMap.put("Three", "Atletico");
//    stringMap.put("Four", null);


    Iterator<Map.Entry<String, String>> entry = stringMap.entrySet().iterator();


    String eciValues = "";

    System.out.println(stringMap.isEmpty());
    for (String eciValue : stringMap.keySet()) {
      System.out.println(" stiring  " + eciValues);

      if (stringMap.get(eciValue) != null) {

        eciValues += stringMap.get(eciValue) + " ";
      } else {
        System.out.println("nulll key is " + eciValue);
      }

    }
    System.out.println("eci Value is " + eciValues);
  }
}
