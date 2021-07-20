package main.java.com.javacodingchallenges.codewars.series.allstarcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Series10 {
  public static void main(String[] args) {
//    System.out.println(fibonacci(6));  // 8
//    System.out.println(fibonacci(5));  // 5
//    System.out.println(fibonacci(0));  // 0
    System.out.println(fibonacci(18)); // 21
  }

  public static int fibonacci(int n) {
    List<Integer> fibonacciList = List.of(1,2,3);
    int maxFibonacci = Collections.max(fibonacciList);

    if (maxFibonacci < n) {
      System.out.println("hell " + fibonacciList);
      fibonacciList = nextFibonacci(fibonacciList, n);
    }

    return 0;
  }

  public static List<Integer> nextFibonacci(List<Integer> fibList, int n) {
    int n1 = 1;
    int n2 = 2;
    int n3 = 3;
    List<Integer> newFibList = fibList;
    newFibList.add(n);

    return newFibList;
  }
}
