package com.javacodingchallenges.leetcode.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selfDividingNumbers(1, 22).toArray()));
        System.out.println(Arrays.toString(selfDividingNumbers(47, 85).toArray()));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (!String.valueOf(i).contains("0")) {
                final int copyOfI = i;
                List<Integer> selfDividedNumberList = Arrays.stream(String.valueOf(i).split(""))
                        .map(Integer::valueOf)
                        .filter(v -> copyOfI % v == 0)
                        .collect(Collectors.toList());
                if (selfDividedNumberList.size() == String.valueOf(i).length()) {
                    list.add(i);
                }
            }

        }
        return list;
    }
}
