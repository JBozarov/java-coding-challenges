package com.javacodingchallenges.other;

import java.util.ArrayList;
import java.util.List;

public class FindNotFittingNumbers {
    public static void main(String[] args) {
        System.out.println(findNotFittingNums(20));
    }

    private static List<Integer> findNotFittingNums(int n) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 1; i < n; i ++ ) {
            if ( n%i != 0 ) {
                numbersList.add(i);
            }
        }
        return numbersList;
    }
}
