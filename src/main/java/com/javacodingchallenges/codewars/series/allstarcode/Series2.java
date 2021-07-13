package main.java.com.javacodingchallenges.codewars.series.allstarcode;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Series2 {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(17,16,16,16,16,15,17,17,15,5,17,17,16);
    System.out.println(findEverage(nums));
  }

  public static double findEverage(List<Integer> list) {
    int total = list.stream().reduce(0, (a, b) -> a+b);
    double result = (double) total/list.size();
      return Math.ceil(result*10)/10;
  }
}
