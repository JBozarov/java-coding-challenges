package main.java.com.javacodingchallenges.codewars.series.allstarcode;

public class Series7 {
  public static void main(String[] args) {
    System.out.println(insurance(18, "medium", 7)); // 490
    System.out.println(insurance(30,"full-size",30)); // 1950
    System.out.println(insurance(21,"economy",-10)); // 0
    System.out.println(insurance(42,"my custom car",7)); // 455
  }

  public static int insurance(int age, String size, int days) {
    int insuranceCost = days * 50;
    if (age < 25) {
      insuranceCost += days * 10;
    }
    if (size.equals("medium")) {
      insuranceCost += days * 10;
    } else {
      insuranceCost += days * 15;
    }
    return Math.max(insuranceCost, 0);
  }
}
