package main.java.com.javacodingchallenges.codewars.series.allstarcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Series10 {
  public static void main(String[] args) {
    System.out.println(fibonacci(6)); // 8
    System.out.println(fibonacci(5)); // 5
    System.out.println(fibonacci(0)); // 0
    System.out.println(fibonacci(18)); // 21
    System.out.println(fibonacci(1)); // 1
  }

  public static int fibonacci(int n) {
    if (n < 1) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    List<Integer> fibonacciList = new ArrayList<>();
    fibonacciList.add(1);
    fibonacciList.add(2);
    fibonacciList.add(3);
    addNextFibonacci(fibonacciList, n);
    return Collections.max(fibonacciList);
  }

  public static void addNextFibonacci(List<Integer> fibonacciList, int n) {
    int maxFibonacci = Collections.max(fibonacciList);
    int beforeLast = fibonacciList.get(fibonacciList.size() - 2);
    if (maxFibonacci < n) {
      fibonacciList.add(maxFibonacci + beforeLast);
      addNextFibonacci(fibonacciList, n);
    }
  }
}
