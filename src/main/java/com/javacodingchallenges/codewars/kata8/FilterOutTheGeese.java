package com.javacodingchallenges.codewars.kata8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutTheGeese {

    /*
    Write a function, gooseFilter/goose_filter/GooseFilter, that takes an array of strings as an argument and returns a
    filtered array containing the same elements but with the 'geese' removed.
    The geese are any strings in the following array, which is pre-populated in your solution:
    geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"]
    For example, if this array were passed as an argument:
    ["Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"]
    Your function would return the following array:
    ["Mallard", "Hook Bill", "Crested", "Blue Swedish"]
    The elements in the returned array should be in the same order as in the initial array passed to your function, albeit with
    the 'geese' removed. Note that all of the strings will be in the same case as those provided, and some elements may be repeated.
    MY TRY:
    */


    public static void main(String[] args) {
        List<String> geeseList = List.of("Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish");
        filterOutTheGeese(geeseList).forEach(System.out::println);
    }


    public static List<String> filterOutTheGeese(List<String> geese) {
        List<String> geeseList = List.of("African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher");
        return geese.stream().filter(v -> !geeseList.contains(v)).collect(Collectors.toList());
    }
}
