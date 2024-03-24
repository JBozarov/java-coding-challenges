package com.javacodingchallenges.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<String> item1 = List.of("phone", "blue", "pixel");
        List<String> item2 = List.of("computer", "silver", "lenovo");
        List<String> item3 = List.of("phone", "gold", "iphone");
        List<String> item4 = List.of("car", "red", "lenovo");

        List<List<String>> itemsList = List.of(item1, item2, item3);
        System.out.println(countMatches(itemsList, "color", "silver"));



    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                count++;
            }
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                count++;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }


    // wrong coding may need to optimize later
    public static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {

        int searchIndex = 0;
        if (ruleKey.equals("color")) {
            searchIndex = 1;
        } else if (ruleKey.equals("name")) {
            searchIndex = 2;
        }
        int finalSearchIndex = searchIndex;
        return (int) items.stream().filter(innerList -> innerList.get(finalSearchIndex) == ruleValue).count();
    }
}
