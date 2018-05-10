package com.dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Parens {
    public static void solver(List<String> res, String tmp, int max, int left, int right){
        if (tmp.length() == 2 * max) {
            res.add(tmp);
            return;
        }

        if (left < max) {
            solver(res, tmp + "(", max, left + 1, right);
        }
        if (right < left) {
            solver(res, tmp + ")", max, left, right + 1);
        }
    }
    public static void main(String[] args){
        int n = 3;
        List<String> res = new ArrayList<>();
        solver(res, "", n, 0, 0);
        Random r = new Random();
        System.out.println(r.nextInt());
        Iterator it = res.iterator();
        while (it.hasNext()){
            String tmpS = (String) it.next();
            System.out.println(tmpS);
        }

    }
}
