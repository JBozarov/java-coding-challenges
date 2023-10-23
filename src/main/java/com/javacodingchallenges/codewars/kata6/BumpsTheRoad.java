package com.javacodingchallenges.codewars.kata6;

import java.util.ArrayList;
import java.util.*;


public class BumpsTheRoad {
    public static void main(String[] args) {
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        System.out.println(bumps("______n___n_"));
    }


    //  Using stream
    public static String bumps(final String road) {
        return Arrays
                .stream(road.split(""))
                .map(v -> v.charAt(0))
                .filter(v -> v == 'n')
                .count() >= 15 ? "Car Dead" : "Woohoo!";
    }

    // Second way
    /* public static String bumps(final String road) {
        char[] characterList = road.toCharArray();
        List<Character> characters =new ArrayList<>(characterList.length);
        for (char c : characterList) {
            characters.add(c);
        }
        return characters.stream().filter(v -> v == 'n').count() >= 15 ? "Car Dead" : "Woohoo!";
    } */
}