package com.javacodingchallenges.leetcode.math;

import java.util.Arrays;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50))); // [309.65, 97.7]
    }

    public static double[] convertTemperature(double celsius) {
        double[] result = {celsius + 273.15, celsius * 1.80 + 32.00};
        return result;
    }




}