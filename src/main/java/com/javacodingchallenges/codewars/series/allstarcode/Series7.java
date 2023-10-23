package main.java.com.javacodingchallenges.codewars.series.allstarcode;

public class Series7 {
  public static void main(String[] args) {
    System.out.println(compute(5)); // => 1.1511111111111112;
    System.out.println(compute(9)); // => 1.1838649533887629;
    System.out.println(compute(-1)); // => 0
    System.out.println(compute(8)); // => 0
  }

  public static double compute(int n) {
    double result = 0.0;
    for (int i = 1; i <= n; i += 2) {
      result += (double) 1 / Math.pow(i, 2);
    }
    return n % 2 == 0 || n < 1 ? 0 : result;
  }
}
