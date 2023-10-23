package com.javacodingchallenges.codewars.oldrepo;

import java.util.Arrays;
class Kata {
  public static String highAndLow(String numbers) {
    String[] array = numbers.split(" "); 
    int[] integers = new int[array.length];
		
		for (int i = 0; i<array.length; i++ ) {
			integers[i] = Integer.parseInt(array[i]);
		}
    
		int min = Arrays.stream(integers).min().getAsInt();
		int max = Arrays.stream(integers).max().getAsInt(); 
		return Integer.toString(max) + " " + Integer.toString(min);
  }
}
