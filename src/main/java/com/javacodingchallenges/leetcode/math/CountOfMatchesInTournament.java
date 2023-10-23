package com.javacodingchallenges.leetcode.math;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));  // 6
        System.out.println(numberOfMatches(14)); // 13
    }

    public static int numberOfMatches(int n) {
        int numberOfMatchers = 0;
        return recursiveCount(n, numberOfMatchers);
    }

    public static int recursiveCount (int newTeam, int numberOfMatches) {
        if (newTeam == 1) {
            return numberOfMatches;
        }
        else if (newTeam != 1 && newTeam %2 == 0) {
            numberOfMatches += newTeam / 2;
            newTeam /= 2;
            return recursiveCount(newTeam, numberOfMatches);
        } else if (newTeam != 1 && newTeam %2 !=0 ) {
            numberOfMatches += (newTeam - 1) / 2;
            newTeam = (newTeam - 1 ) / 2 + 1;
            return recursiveCount(newTeam, numberOfMatches);
        }

        return numberOfMatches;
    }
}



