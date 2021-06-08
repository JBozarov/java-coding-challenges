package com.javacodingchallenges.groups.hackerrank.string;

import java.util.*;
import java.util.stream.Collectors;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.split("[ !,?._'@]");
        List<String> filteredTokens = Arrays
                .stream(tokens)
                .filter(v -> !v.equals(""))
                .filter(v -> !v.equals(" "))
                .collect(Collectors.toList());

        System.out.println(filteredTokens.size());
        filteredTokens.forEach(System.out::println);

        scan.close();
    }
}
