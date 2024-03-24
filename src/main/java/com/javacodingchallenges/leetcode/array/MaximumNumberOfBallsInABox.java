package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
        System.out.println(countBalls(1, 10));  // 2
        System.out.println(countBalls(5, 15));  // 2
        System.out.println(countBalls(19, 28)); // 2
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int maxNumberOfBalls = -10;
        Map<Integer, Integer> boxMap = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = Arrays
                    .stream(String.valueOf(i).split(""))
                    .map(Integer::valueOf)
                    .reduce(0, (a, b) -> a + b);


            if (!boxMap.containsKey(sum)) {
                boxMap.put(sum, 1);
            } else {
                boxMap.put(sum, boxMap.get(sum) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : boxMap.entrySet()) {
                if (maxNumberOfBalls < entry.getValue()) {
                    maxNumberOfBalls = entry.getValue();
                }
            }
        }
        return maxNumberOfBalls;
    }
}
