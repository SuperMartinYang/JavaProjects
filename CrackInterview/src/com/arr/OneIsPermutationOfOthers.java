package com.arr;

import java.util.HashMap;

public class OneIsPermutationOfOthers {
    public boolean isPermutation(String a, String b){
        // Array is also fit, size is 128 (Assume char is in ASCII)
        if (a.length() != b.length()){
            return false;
        }
        HashMap<Character, Integer> maps = new HashMap<>();
        for (char ch : a.toCharArray()){
            if (maps.containsKey(ch)){
                maps.put(ch, maps.get(ch) + 1);
            }else {
                maps.put(ch, 1);
            }
        }
        for (char ch2 : b.toCharArray()){
            if (maps.containsKey(ch2)){
                if (maps.get(ch2) == 0){
                    return false;
                }
                maps.put(ch2, maps.get(ch2) - 1);
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        OneIsPermutationOfOthers oo = new OneIsPermutationOfOthers();
        String a = "abcde";
        String b = "adeci";
        if (oo.isPermutation(a, b)){
            System.out.println("String " + a + " is a Permutation of " + b);
        }else {
            System.out.println("String " + a + " is not a Permutation of " + b);
        }
    }
}
