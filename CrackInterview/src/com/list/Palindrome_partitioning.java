package com.list;

import java.util.ArrayList;
import java.util.List;

class Palindrome_partitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, 0);
        return list;
    }
    private void backtrack(List<List<String>> list, List<String> tmpList, String s, int start){
        if (start == s.length()){
            list.add(new ArrayList<>(tmpList));
        }
        for (int i = start + 1; i < s.length() + 1; i ++){
            if (isPalindrome(s.substring(start, i))){
                tmpList.add(s.substring(start,i));
                backtrack(list, tmpList, s, i);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String tmp) {
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
