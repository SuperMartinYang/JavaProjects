package com.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Permutations_with_Dups {
    public static void solver(char[] arr, List<ArrayList<Character>> res, List<Character> tmp, int idx){
        res.add(new ArrayList<>(tmp));
        for (int i = idx; i < arr.length; i++){
            if (i != 0 && arr[i] == arr[i - 1])
                continue;
            tmp.add(arr[i]);
            solver(arr, res, tmp, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
    public static void main(String[] args){
        String s = "13782";
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        List<ArrayList<Character>> res = new ArrayList<>();
        solver(arr, res, new ArrayList<>(), 0);
        Iterator it = res.iterator();
        while (it.hasNext()){
            ArrayList<Character> t = (ArrayList<Character>) it.next();
            System.out.print("[ ");
            for (int i = 0; i < t.size(); i ++){
                System.out.print(t.get(i) + " ");
            }
            System.out.print(" ]\n");
        }
    }
}
