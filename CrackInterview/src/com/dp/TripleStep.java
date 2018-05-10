package com.dp;

public class TripleStep {
    public static int solver(int n){
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 2;
        memo[2] = 4;
        for (int i = 3; i < n; i ++){
            memo[i] += memo[i - 1] + 1;
            memo[i] += memo[i - 2] + 1;
            memo[i] += memo[i - 3] + 1;
        }
        return memo[n - 1];
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(solver(n));
    }
}
