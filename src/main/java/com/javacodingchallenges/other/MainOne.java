package com.javacodingchallenges.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainOne {
    public static void main(String[] args) {
        String name = "Phila";
        String name2 = name.substring(1, 3);
        System.out.println(name2);
        System.out.println(name2.isEmpty());


        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());

        Integer[] ints = new Integer[12];
        System.out.println(ints.length);

        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);

        Iterator<Integer> integerIterator = list.iterator();
        System.out.println(integerIterator.next());
    }
}
