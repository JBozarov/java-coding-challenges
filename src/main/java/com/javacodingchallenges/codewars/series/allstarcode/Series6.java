package main.java.com.javacodingchallenges.codewars.series.allstarcode;

public class Series6 {
  public static void main(String[] args) {
    String hannah = "hannah";
    String banana = "banana";
    System.out.println(isPalindrome(hannah));
    System.out.println(isPalindrome(banana));
  }

  public static boolean isPalindrome(String s) {
    return s.equals(new StringBuilder(s).reverse().toString());
  }
}
