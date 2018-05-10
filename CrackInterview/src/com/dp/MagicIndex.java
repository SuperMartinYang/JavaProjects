package com.dp;

public class MagicIndex {
    public static int solver(int[] arr){
        int lo = 0, hi = arr.length;
        while (lo + 1 < hi){
            int mid = (hi - lo) / 2 + lo;
            if (arr[mid] == mid)
                return mid;
            else if (arr[mid] > mid)
                hi = mid;
            else
                lo = mid;
        }
        if (arr[lo] == lo)
            return lo;
        if (arr[hi] == hi)
            return hi;
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {-1,1,2,4,7,8,10};
        System.out.println(solver(arr));
    }
}
