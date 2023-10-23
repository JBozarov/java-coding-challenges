
package com.javacodingchallenges.codewars.oldrepo;

public class HalvingSum {
  public static int halvingSum(int n) {
		int result = 0; 
		
		int temp = 1; 
		while (n>=temp) {
			result = result + n/temp; 
			temp *= 2; 
		}
		return result; 
	}
}
