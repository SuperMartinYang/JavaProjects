package com.str;

import java.util.HashMap;
import java.util.Iterator;

public class One_Way{
    public boolean isOneOK(String s1, String s2){
        // 1st: change one char in s1, justify whether newS1 == s2
        // 2nd: count all char in s1, compare the difference between s1 & s2, if the difference is 1, right O(N + M) ======> Wrong
        // 3rd: split this problem into 2 single problem
        int dif = Math.abs(s1.length() - s2.length());
        switch (dif){
            case 0:
            case 1:
                return oneEdit(s1, s2);
            default:
                return false;
        }
    }

    private boolean oneEdit(String s1, String s2) {
        String sh = s1.length() >= s2.length() ? s2 : s1;
        String lo = s1.length() >= s2.length() ? s1 : s2;
        boolean foundDif = false;
        int index1 = 0, index2 = 0;
        while (index1 < sh.length() && index2 < lo.length()){
            if (sh.charAt(index1) != lo.charAt(index2))
                if (foundDif)
                    return false;
                else {
                    foundDif = true;
                    if (sh.length() == lo.length()){
                        index1 ++;
                    }
                }
            else
                index1 ++;
            index2 ++;
        }
        return true;
    }

    public static void main(String args[]){
        One_Way ow = new One_Way();
        System.out.println(ow.isOneOK("pabe", "babe"));
    }
}