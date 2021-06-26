package com.javacodingchallenges.codewars.oldrepo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextIdClass {

    public static int nextId(int[] ids) {

        List<Integer> list =new ArrayList<>();
        List<Integer> unusedIds = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();


        for ( int i = 0; i<ids.length; i++ ) {
            list.add(ids[i]);
        }
        int max = Collections.max(list);

        for ( int k = 0; k<=max; k++ ) {
            tempList.add(k);
        }

        for ( int g = 0; g<ids.length; g++ ) {
            if (!list.contains(g) || !tempList.contains(g)) {
                unusedIds.add(g);
            }
        }
        return unusedIds.size()>0 ? Collections.min(unusedIds) : max+1;

    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(nextId(arr));
    }
}
