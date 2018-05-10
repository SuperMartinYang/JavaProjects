package com.arr;

public class Find_the_celebrity {
    public int findCelebrity(int n){
        int [] res = new int[n];
        for (int i = 1; i <= n; i ++){
            res[i - 1] = i;
        }
        int k = res.length - 1;
        while (k > 0){
            int j = k;
            int i = 0;
            for (; i < res.length; i ++){
                if (i == j)
                    continue;
                if (knows(res[j], i) || !knows(i, res[j]))
                    break;
            }
            if (i == res.length)
                return res[j];
            k --;
        }
        return -1;
    }
    private boolean knows(int A, int B){
        return true;
    }
}
