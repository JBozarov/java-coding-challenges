package com.javacodingchallenges.codewars;


import java.util.Arrays;


public class ArrayPlusArray {
  public static void main(String[] args) {
    int[] arr1 = new int[]{1,2,3};
    int[] arr2 = new int[]{4,5,6};
    System.out.println(arrayPlusArray(arr1, arr2)); // 21
  }

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    System.arraycopy(arr1, 0, result, 0, arr1.length);
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
    return Arrays.stream(result).sum();
  }
}
