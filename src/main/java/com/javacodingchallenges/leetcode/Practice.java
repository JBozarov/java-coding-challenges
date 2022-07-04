package com.javacodingchallenges.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Practice {
    static int count = 0;
    public static void main(String[] args) {

        if (count < 3) {
            count ++;
            main(null);
        } else {
            return;
        }
        System.out.println("Hello Work");

        ArrayList<String> words = new ArrayList<>(Arrays.asList("HDFKH", "DHDKH"));

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(10);
        System.out.println(list);





    }
}
