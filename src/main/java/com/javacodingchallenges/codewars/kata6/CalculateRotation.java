package main.java.com.javacodingchallenges.codewars.kata6;

public class CalculateRotation {

  public static void main(String[] args) {
    System.out.println(shiftedDiff("coffee", "ffeeco")); // 4
  }

  static int shiftedDiff(String first, String second) {
    String tempString = String.valueOf(first);
    int num = 0;
    for (int i = 0; i < second.length(); i++ ) {
      if (tempString.toString().equals(second)) {
        return num;
      } else {
        num += 1;
        tempString = tempString.charAt(tempString.length() - 1) + tempString.substring(0, tempString.length() - 1);
      }
    }
    if (tempString.equals(second)) {
      return num;
    }
    return -1;
  }
}
