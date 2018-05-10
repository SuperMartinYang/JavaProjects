package com.bit_manipulation;

public class Insertion {
    /**
     * Input: N = 10000000000, M = 10011, i = 2, j = 6
     * Output: N = 10001001100
     */
    public static int solver(int N, int M, int i, int j){
        int mask = (~0 << (j + 1)) ^ (~0 >>> (32 - i));
        return (N & mask) ^ (M << i);
    }
    public static void main(String[] args){
        int N = 0b10000000000, M = 0b10011;
        int i = 2, j = 6;
        System.out.println(solver(N, M, i, j));
    }
}
