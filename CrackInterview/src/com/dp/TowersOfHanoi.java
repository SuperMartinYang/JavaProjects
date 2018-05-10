package com.dp;

import com.stack.Stack;

public class TowersOfHanoi {
    public static void solver(int nums, Stack<Integer> from, Stack<Integer> spare, Stack<Integer> target) throws Exception {
        if (nums == 1){
            target.push(from.pop());
        }else {
            solver(nums - 1, from, target, spare);
            solver(1, from, spare, target);
            solver(nums - 1, spare, from, target);
        }
    }

    public static void main(String[] args) throws Exception {
        int stacksize = 6;
        Stack<Integer> s0 = new Stack<>(stacksize);
        Stack<Integer> s1 = new Stack<>(stacksize);
        Stack<Integer> s2 = new Stack<>(stacksize);
        s0.push(10);
        s0.push(8);
        s0.push(7);
        s0.push(5);
        s0.push(3);
        s0.push(1);
        solver(stacksize, s0, s1, s2);
        while (!s2.isEmpty()){
            System.out.print(" " + s2.pop());
        }
    }
}
