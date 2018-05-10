package com.dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Permutations_without_Dups {
    public static void solver(String s, List<ArrayList<Character>> res, ArrayList<Character> tmp, int idx){
        res.add(new ArrayList<>(tmp));
        for (int i = idx; i < s.length(); i++){
            tmp.add(s.charAt(i));
            solver(s, res, tmp, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
    public static void main(){
        String s = "1123998";
        List<ArrayList<Character>> res = new ArrayList<>();
        solver(s, res, new ArrayList<>(), 0);
        Iterator it = res.iterator();
        while (it.hasNext()){
            ArrayList<Character> t = (ArrayList<Character>) it.next();
            System.out.print("[ ");
            for (int i = 0; i < t.size(); i ++){
                System.out.println(t.get(i));
            }
            System.out.print(" ]\n");
        }
    }
}
