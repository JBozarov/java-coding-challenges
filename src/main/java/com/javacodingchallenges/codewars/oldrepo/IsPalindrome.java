package com.javacodingchallenges.codewars.oldrepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsPalindrome {

    public static boolean solve(String st) {
        String tempString = st;
        String tempString2 = st;
        String[] arr = st.split("");
        List<Character> charList = new ArrayList<>();

        List<String> result = new ArrayList<>();

        for (String s : arr) {
            charList.add(st.charAt(st.indexOf(s)));
        }

        for (Character c : charList) {

            char temp = ' ';
            if (c.equals('a')) {
                temp = 'b';
            tempString = tempString.replace(st.charAt(st.indexOf(c)), temp);
            System.out.println("first " + tempString);
            }

            if (c.equals('z')) {
                temp = 'y';
                tempString = tempString.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("second " + tempString);
            }

            if (!c.equals('a') && !c.equals('z')) {
                int i = c;
                temp = (char) (i + 1);
                System.out.println("temp " + temp);
                tempString = tempString.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("third " + tempString);
            }

            result.add(tempString);
        }

        for (Character c : charList) {

            char temp = ' ';
            if (c.equals('a')) {
                temp = 'b';
                tempString2 = tempString2.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("first " + tempString2);
            }

            if (c.equals('z')) {
                temp = 'y';
                tempString2 = tempString2.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("second " + tempString2);
            }

            if (!c.equals('a') && !c.equals('z')) {
                int i = c;
                temp = (char) (i - 1);
                System.out.println("temp " + temp);
                tempString2 = tempString2.replace(st.charAt(st.indexOf(c)), temp);
                System.out.println("third " + tempString2);
            }
            result.add(tempString2);
        }

        System.out.println(Arrays.toString(result.toArray()));
        List<String> filtered = result.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(filtered.toArray()));
        return true;
    }



    public static void main(String[] args) {
        solve("adfa");
    }
}
