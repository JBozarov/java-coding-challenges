package com.javacodingchallenges.codewars.oldrepo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrayelementparity {

  public static int solve(int[] arr) {
    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    List<Integer> positives =
        list.stream().filter(val -> val > 0).sorted().collect(Collectors.toList());
    List<Integer> negatives =
        list.stream().filter(val -> val < 0).map(v -> v * -1).sorted().collect(Collectors.toList());

    int result = looper(positives, negatives);

    if (result == 0) {
      result = looper(negatives, positives) * -1;
    }
    return result;
  }

  public static int looper(List<Integer> pList, List<Integer> nList) {
    for (Integer integer : pList) {
      if (!nList.contains(integer)) {
        return integer;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = {-110, 110, -38, -38, -62, 62, -38, -38, -38};
    System.out.println(solve(nums));
  }
}
