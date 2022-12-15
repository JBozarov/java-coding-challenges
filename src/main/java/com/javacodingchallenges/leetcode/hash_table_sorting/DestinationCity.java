package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args) {
        List<String> one = List.of("London","New York");
        List<String> two = List.of("New York","Lima");
        List<String> three = List.of("Lima","Sao Paulo");
        List<List<String>> listList = new ArrayList<>();
        listList.add(one);
        listList.add(two);
        listList.add(three);
        System.out.println(destCity(listList)); // San Paulo

        List<List<String>> listListTwo = List.of(List.of("B","C"), List.of("D","B"), List.of("C", "A"));
        System.out.println(destCity(listListTwo)); //

        System.out.println(destCity(List.of(List.of("A", "Z"))));
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> destinationSet = new HashSet<>();
        for ( int i = 0; i < paths.size(); i++ ) {
            destinationSet.add(paths.get(i).get(paths.get(i).size() - 1));
        }

        for ( int k = 0; k < paths.size(); k++ ) {
            if (destinationSet.contains(paths.get(k).get(0))) {
                destinationSet.remove(paths.get(k).get(0));
            }
        }

        return destinationSet.iterator().next();
    }
}
