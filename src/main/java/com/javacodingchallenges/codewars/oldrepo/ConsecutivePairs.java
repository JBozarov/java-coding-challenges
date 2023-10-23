

package com.javacodingchallenges.codewars.oldrepo;


public class ConsecutivePairs {
    public static int solve(int [] arr){
        int count = 0;
        int length = arr.length%2 == 0 ? arr.length : arr.length - 1;
        for (int i = 0; i < length; i += 2 ) {
            if (arr[i]+1 == arr[i+1] || arr[i]-1 == arr[i+1]) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {21, 20, 22, 40, 39, -56, 30, -55, 95, 94};
        int[] arr2 = {1,2,5,8,-4,-3,7,6,5};
        System.out.println(solve(arr2)); //3
        System.out.println(solve(arr)); //2
    }
}
