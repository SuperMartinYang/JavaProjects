package com.list;

import java.util.HashMap;
import java.util.Iterator;

public class Palindrome_permutation{
    public boolean isPP(String test){
        // 1st. Array also fit.
        // 2nd. take two iteration into one
        // 3rd. Use One single Integer (4 bytes = 32 bits, enough for 26 characters) instead of array
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : test.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        int cnt = 0;
        while (it.hasNext()){
            if (it.next() % 2 == 1) {
                if (cnt == 1)
                    return false;
                else
                    cnt++;
            }
        }
            return true;
    }
}