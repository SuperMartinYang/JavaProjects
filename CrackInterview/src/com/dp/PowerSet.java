package com.dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PowerSet {
    public static void solver( List<ArrayList<Integer>> res, List<Integer> oriSet, List<Integer> tmp, int index){
        res.add(new ArrayList<>(tmp));
        for (int i = index; i < oriSet.size(); i ++){
            tmp.add(oriSet.get(i));
            solver(res, oriSet, tmp, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        List<ArrayList<Integer>> result = new ArrayList<>();
        solver(result, l, new ArrayList<>(), 0);
//        System.out.println(result);
        Iterator i = result.iterator();
        while (i.hasNext()){
            ArrayList<Integer> temp = (ArrayList<Integer>) i.next();
            System.out.print("[ ");
            for (int j = 0; j < temp.size(); j ++)
                System.out.print(" " + temp.get(j) + " ");
            System.out.print(" ]\n");
        }
    }
}
