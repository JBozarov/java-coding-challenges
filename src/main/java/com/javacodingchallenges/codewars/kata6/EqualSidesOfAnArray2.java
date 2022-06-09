package com.javacodingchallenges.codewars.kata6;

import com.javacodingchallenges.codewars.oldrepo.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EqualSidesOfAnArray2 {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 4, 3, 2, 1};
        int[] arrTwo = {1, 100, 50, -51, 1, 1};
        System.out.println(findEvenIndex(arrOne));
        System.out.println(findEvenIndex(arrTwo));
    }


    public static int findEvenIndex(int[] arr) {
        int result = 0;
        int sumLeft = 0;
        int sumRight = 0;
        List<Integer> integers = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = 1; i < arr.length; i++) {
            sumLeft = integers.subList(0, i).stream().reduce(0, Integer::sum);
            sumRight = integers.subList(i + 1, arr.length).stream().reduce(0, Integer::sum);
            //System.out.println("hello i => " + i + ", " + sumLeft + " " + sumRight);
            if (sumLeft == sumRight) {
                result = i;
            }
        }

        return result;
    }
}
