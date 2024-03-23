package com.javacodingchallenges.leetcode.binary_search;

public class Virus {
    public static void main(String[] args) {
        System.out.println(solution(0, 50));  // 8
        System.out.println(solution(2, 7));  // 8
    }


    public static int solution(int N_Kundan_Keyin, int K_Kurishganlar_Soni) {
        double maximumDavolanganlarSoni = 0;
        int m = 1000000007;
        if (N_Kundan_Keyin <= 0 || K_Kurishganlar_Soni > Math.pow(10.0, 9.0)) {
            return (int) maximumDavolanganlarSoni;
        }

        Double nDouble = Double.parseDouble(String.valueOf(N_Kundan_Keyin));
        Double kDouble = Double.parseDouble(String.valueOf(K_Kurishganlar_Soni));


        // print((pow(k,n,m)-1)*pow(k-1,m-2,m)%m)
        // maximumDavolanganlarSoni = ( N_Kundan_Keyin - 1 ) * K_Kurishganlar_Soni + 1;
        double pow1 = Math.pow(kDouble, nDouble) % m - 1;
        System.out.println("line 24 " + pow1);
        double pow2 = Math.pow(kDouble -1, m - 2) % m;
        System.out.println("line 26 " + pow2);
        maximumDavolanganlarSoni = ( pow1 * pow2 ) % m;

        return (int) maximumDavolanganlarSoni;
    }
}
