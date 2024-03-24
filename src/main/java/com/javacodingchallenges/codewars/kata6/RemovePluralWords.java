package com.javacodingchallenges.codewars.kata6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovePluralWords {
    public static void main(String[] args) {
        List<String> list = List.of("map", "apples", "laptop", "countries", "coffee", "phones", "tables", "router");
        long c = list.stream().filter(item -> String.valueOf(item.charAt(item.length() - 1)).equals("s")).count();
        List<String> sortedList = list.stream().filter(item -> !String.valueOf(item.charAt(item.length() - 1)).equals("s")).collect(Collectors.toList());
        System.out.println(c);
        System.out.println(Arrays.toString(sortedList.toArray()));

    }
}
