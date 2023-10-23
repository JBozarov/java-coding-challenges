package com.javacodingchallenges.leetcode.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)")); // Goal
        System.out.println(interpret("G()()()()(al)")); // Gooooal
        System.out.println(interpret("(al)G(al)()()G")); // alGalooG
    }

    public static String interpret(String command) {
        StringBuilder result = new StringBuilder("");
        List<String> characters = Arrays.stream(command.split("")).collect(Collectors.toList());
        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(i).equals("G")) {
                result.append(characters.get(i));
            } else if (i + 1 <= characters.size() - 1 && (characters.get(i).equals("(") && characters.get(i + 1).equals(")"))) {
                result.append("o");
            } else if (i + 3 <= characters.size() - 1 && (
                               characters.get(i).equals("(")
                            && characters.get(i + 1).equals("a")
                            && characters.get(i + 2).equals("l")
                            && characters.get(i + 3).equals(")"))) {
                result.append("al");
            }
        }
        return result.toString();
    }
}
