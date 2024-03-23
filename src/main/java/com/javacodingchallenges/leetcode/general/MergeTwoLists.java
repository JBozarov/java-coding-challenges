package com.javacodingchallenges.leetcode.general;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {

    public static void main(String[] args) {
        List<Integer> listOne = new LinkedList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(4);

        List<Integer> listTwo = new LinkedList<>();
        listTwo.add(1);
        listTwo.add(3);
        listTwo.add(4);

        System.out.println(merge(listOne, listTwo));
    }


    public static List<Integer> merge(List<Integer> listOne, List<Integer> listTwo) {
        listOne.stream().sorted();
        return Stream.concat(listOne.stream(), listOne.stream()).collect(Collectors.toList());
    }
}
